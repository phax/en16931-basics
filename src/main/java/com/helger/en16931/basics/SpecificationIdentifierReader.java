/*
 * Copyright (C) 2026 Philip Helger
 * http://www.helger.com
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.en16931.basics;

import java.io.File;

import javax.xml.namespace.QName;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.helger.annotation.concurrent.Immutable;
import com.helger.annotation.concurrent.NotThreadSafe;
import com.helger.base.string.StringHelper;
import com.helger.io.resource.IReadableResource;
import com.helger.xml.XMLHelper;
import com.helger.xml.sax.InputSourceFactory;
import com.helger.xml.serialize.read.SAXReader;
import com.helger.xml.serialize.read.SAXReaderSettings;
import com.helger.xml.serialize.read.XMLLoggingExceptionCallback;

/**
 * Extract BT-24 (Specification identifier) from a UBL or a CII document. BT-24 is the only reliable
 * discriminator of the EN 16931 edition - see {@link EEN16931Edition}.
 * <p>
 * Two ways of reading are offered:
 * <ul>
 * <li>from an existing DOM tree, for callers that have the document in memory anyway</li>
 * <li>from an external source via SAX, which is what {@link EEN16931Edition#detect(File)} uses.
 * BT-24 sits close to the start of the document in both syntaxes, so the parser is stopped as soon
 * as the value is known and the remainder of the document is never read at all.</li>
 * </ul>
 * Because the SAX variant stops early, XML that is not well formed <b>behind</b> BT-24 stays
 * unnoticed - determining the edition does not imply that the document is valid in any way.
 * <p>
 * Neither variant unmarshals, because the correct JAXB model is exactly what is not known yet.
 *
 * @author Philip Helger
 */
@Immutable
public final class SpecificationIdentifierReader
{
  /** UBL: BT-24 is the direct child <code>cbc:CustomizationID</code> of the document element */
  private static final String ELEMENT_UBL_CUSTOMIZATION_ID = "CustomizationID";
  /** CII: BG-2 <code>rsm:ExchangedDocumentContext</code>, the first child of the document element */
  private static final String ELEMENT_CII_EXCHANGED_DOCUMENT_CONTEXT = "ExchangedDocumentContext";
  /** CII: <code>ram:GuidelineSpecifiedDocumentContextParameter</code> inside BG-2 */
  private static final String ELEMENT_CII_GUIDELINE = "GuidelineSpecifiedDocumentContextParameter";
  /** CII: BT-24 is the <code>ram:ID</code> of the guideline parameter */
  private static final String ELEMENT_CII_ID = "ID";

  /**
   * Thrown by the content handler to stop the parser once BT-24 is known, or once it is certain
   * that it cannot follow any more. It is control flow and not an error, hence it carries no stack
   * trace.
   */
  private static final class StopParsingException extends SAXException
  {
    @Override
    public synchronized Throwable fillInStackTrace ()
    {
      return this;
    }
  }

  /**
   * Swallows {@link StopParsingException}, so that the intended abort is not logged as a parsing
   * error. Everything else is logged as usual.
   */
  private static final class StopAwareExceptionCallback extends XMLLoggingExceptionCallback
  {
    @Override
    public void onException (@Nullable final Throwable t)
    {
      if (!(t instanceof StopParsingException))
        super.onException (t);
    }
  }

  /**
   * The SAX content handler that picks BT-24 out of the element path of the respective syntax. The
   * paths are fixed and shallow, so plain depth counting is enough and no element stack is needed.
   */
  @NotThreadSafe
  private static final class SpecificationIdentifierHandler extends DefaultHandler
  {
    private int m_nDepth = 0;
    private EEN16931SyntaxKind m_eSyntaxKind;
    private boolean m_bInCIIContext = false;
    private boolean m_bInCIIGuideline = false;
    private StringBuilder m_aValue;
    private int m_nValueDepth = 0;
    private String m_sSpecificationIdentifier;

    @Override
    public void startElement (@Nullable final String sNSURI,
                              @NonNull final String sLocalName,
                              @NonNull final String sQName,
                              @NonNull final Attributes aAttrs) throws SAXException
    {
      m_nDepth++;
      switch (m_nDepth)
      {
        case 1:
          m_eSyntaxKind = EEN16931SyntaxKind.getFromRootElementNameOrNull (new QName (StringHelper.getNotNull (sNSURI),
                                                                                      sLocalName));
          if (m_eSyntaxKind == null)
          {
            // A document element of no known syntax kind - nothing to look for
            throw STOP_PARSING;
          }
          break;
        case 2:
          if (m_eSyntaxKind == EEN16931SyntaxKind.CII)
            m_bInCIIContext = CEN16931Syntax.NS_URI_CII_RSM.equals (sNSURI) &&
                              ELEMENT_CII_EXCHANGED_DOCUMENT_CONTEXT.equals (sLocalName);
          else
            if (CEN16931Syntax.NS_URI_UBL_CBC.equals (sNSURI) && ELEMENT_UBL_CUSTOMIZATION_ID.equals (sLocalName))
            {
              m_aValue = new StringBuilder ();
              m_nValueDepth = m_nDepth;
            }
          break;
        case 3:
          if (m_bInCIIContext)
            m_bInCIIGuideline = CEN16931Syntax.NS_URI_CII_RAM.equals (sNSURI) &&
                                ELEMENT_CII_GUIDELINE.equals (sLocalName);
          break;
        case 4:
          if (m_bInCIIGuideline &&
              CEN16931Syntax.NS_URI_CII_RAM.equals (sNSURI) &&
              ELEMENT_CII_ID.equals (sLocalName))
          {
            m_aValue = new StringBuilder ();
            m_nValueDepth = m_nDepth;
          }
          break;
        default:
          break;
      }
    }

    @Override
    public void characters (final char @NonNull [] aChars, final int nStart, final int nLength)
    {
      if (m_aValue != null)
        m_aValue.append (aChars, nStart, nLength);
    }

    @Override
    public void endElement (@Nullable final String sNSURI,
                            @NonNull final String sLocalName,
                            @NonNull final String sQName) throws SAXException
    {
      if (m_aValue != null && m_nDepth == m_nValueDepth)
      {
        m_sSpecificationIdentifier = StringHelper.trim (m_aValue.toString ());
        m_aValue = null;
        throw STOP_PARSING;
      }
      if (m_nDepth == 2 && m_bInCIIContext)
      {
        // BG-2 is closed without a BT-24 inside - it cannot follow any more
        throw STOP_PARSING;
      }
      m_nDepth--;
    }

    @Nullable
    public String getSpecificationIdentifier ()
    {
      return m_sSpecificationIdentifier;
    }
  }

  private static final StopParsingException STOP_PARSING = new StopParsingException ();
  private static final StopAwareExceptionCallback EXCEPTION_CALLBACK = new StopAwareExceptionCallback ();

  private SpecificationIdentifierReader ()
  {}

  @Nullable
  private static String _getSpecificationIdentifierCII (@NonNull final Element aRoot)
  {
    // rsm:ExchangedDocumentContext/ram:GuidelineSpecifiedDocumentContextParameter/ram:ID
    final Element aContext = XMLHelper.getFirstChildElementOfName (aRoot,
                                                                  CEN16931Syntax.NS_URI_CII_RSM,
                                                                  ELEMENT_CII_EXCHANGED_DOCUMENT_CONTEXT);
    if (aContext == null)
      return null;

    final Element aGuideline = XMLHelper.getFirstChildElementOfName (aContext,
                                                                    CEN16931Syntax.NS_URI_CII_RAM,
                                                                    ELEMENT_CII_GUIDELINE);
    if (aGuideline == null)
      return null;

    final Element aID = XMLHelper.getFirstChildElementOfName (aGuideline,
                                                              CEN16931Syntax.NS_URI_CII_RAM,
                                                              ELEMENT_CII_ID);
    return aID == null ? null : StringHelper.trim (aID.getTextContent ());
  }

  @Nullable
  private static String _getSpecificationIdentifierUBL (@NonNull final Element aRoot)
  {
    // cbc:CustomizationID
    final Element aCustomizationID = XMLHelper.getFirstChildElementOfName (aRoot,
                                                                          CEN16931Syntax.NS_URI_UBL_CBC,
                                                                          ELEMENT_UBL_CUSTOMIZATION_ID);
    return aCustomizationID == null ? null : StringHelper.trim (aCustomizationID.getTextContent ());
  }

  /**
   * Extract the BT-24 value from an existing DOM tree. The syntax kind is derived from the document
   * element, and BT-24 is read from <code>cbc:CustomizationID</code> for UBL and from
   * <code>rsm:ExchangedDocumentContext/ram:GuidelineSpecifiedDocumentContextParameter/ram:ID</code>
   * for CII.
   *
   * @param aNode
   *        The document or its document element. May be <code>null</code>.
   * @return <code>null</code> if the document element belongs to no known syntax kind, or if BT-24
   *         is not present.
   */
  @Nullable
  public static String getSpecificationIdentifier (@Nullable final Node aNode)
  {
    final Element aRoot = EEN16931SyntaxKind.getRootElementOrNull (aNode);
    if (aRoot == null)
      return null;

    final EEN16931SyntaxKind eSyntaxKind = EEN16931SyntaxKind.getFromRootElementNameOrNull (XMLHelper.getQName (aRoot));
    if (eSyntaxKind == null)
      return null;

    return switch (eSyntaxKind)
    {
      case UBL_INVOICE, UBL_CREDIT_NOTE -> _getSpecificationIdentifierUBL (aRoot);
      case CII -> _getSpecificationIdentifierCII (aRoot);
    };
  }

  /**
   * Extract the BT-24 value from an arbitrary XML source via SAX. The parser is stopped as soon as
   * BT-24 is known, so the bulk of the document is never read.
   *
   * @param aIS
   *        The input source to read from. It is closed by this method. May be <code>null</code>.
   * @return <code>null</code> if the source cannot be read, is not well formed XML up to BT-24,
   *         belongs to no known syntax kind, or has no BT-24.
   */
  @Nullable
  public static String getSpecificationIdentifier (@Nullable final InputSource aIS)
  {
    if (aIS == null)
      return null;

    final SpecificationIdentifierHandler aHandler = new SpecificationIdentifierHandler ();
    final SAXReaderSettings aSettings = new SAXReaderSettings ().setContentHandler (aHandler);
    aSettings.exceptionCallbacks ().set (EXCEPTION_CALLBACK);
    // The return value is irrelevant - stopping the parser deliberately counts as a failure
    SAXReader.readXMLSAX (aIS, aSettings);
    return aHandler.getSpecificationIdentifier ();
  }

  /**
   * Extract the BT-24 value from a UBL or CII file via SAX.
   *
   * @param aFile
   *        The file to inspect. May be <code>null</code>.
   * @return <code>null</code> if the file cannot be read, is not well formed XML up to BT-24,
   *         belongs to no known syntax kind, or has no BT-24.
   */
  @Nullable
  public static String getSpecificationIdentifier (@Nullable final File aFile)
  {
    // InputSourceFactory logs a warning for a non existing file
    if (aFile == null || !aFile.isFile ())
      return null;

    return getSpecificationIdentifier (InputSourceFactory.create (aFile));
  }

  /**
   * Extract the BT-24 value from a UBL or CII resource via SAX.
   *
   * @param aResource
   *        The resource to inspect. May be <code>null</code>.
   * @return <code>null</code> if the resource cannot be read, is not well formed XML up to BT-24,
   *         belongs to no known syntax kind, or has no BT-24.
   */
  @Nullable
  public static String getSpecificationIdentifier (@Nullable final IReadableResource aResource)
  {
    if (aResource == null || !aResource.exists ())
      return null;

    return getSpecificationIdentifier (InputSourceFactory.create (aResource));
  }
}
