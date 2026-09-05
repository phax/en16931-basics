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

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.helger.annotation.Nonempty;
import com.helger.base.id.IHasID;
import com.helger.base.lang.EnumHelper;
import com.helger.base.name.IHasDisplayName;
import com.helger.base.string.StringHelper;
import com.helger.xml.XMLHelper;
import com.helger.xml.serialize.read.DOMReader;

/**
 * The edition of the EN 16931 semantic data model a document conforms to. Each edition prescribes
 * exactly one CII release and one UBL version:
 * <ul>
 * <li>{@link #EN2017} - CII D16B and UBL 2.1</li>
 * <li>{@link #EN2026} - CII D25A and UBL 2.5</li>
 * </ul>
 * The edition cannot be told from the XML namespaces, because all CII releases use identical
 * namespace URIs and so do all UBL versions - see {@link CEN16931Syntax}. It cannot be told from
 * the XML Schema either, because a CII D16B instance also validates against the CII D25A XSD. The
 * only reliable discriminator is BT-24 (Specification identifier), which is mandatory in every
 * EN 16931 document.
 *
 * @author Philip Helger
 */
public enum EEN16931Edition implements IHasID <String>, IHasDisplayName
{
  /** EN 16931-1:2017 including A1:2019 and A2:2020 - CII D16B and UBL 2.1 */
  EN2017 ("2017", "EN 16931:2017", "urn:cen.eu:en16931:2017"),
  /** The 2026 revision of EN 16931-1 - CII D25A and UBL 2.5 */
  EN2026 ("2026", "EN 16931:2026", "urn:cen.eu:en16931:2026");

  private final String m_sID;
  private final String m_sDisplayName;
  private final String m_sSpecificationIdentifier;

  EEN16931Edition (@NonNull @Nonempty final String sID,
                   @NonNull @Nonempty final String sDisplayName,
                   @NonNull @Nonempty final String sSpecificationIdentifier)
  {
    m_sID = sID;
    m_sDisplayName = sDisplayName;
    m_sSpecificationIdentifier = sSpecificationIdentifier;
  }

  /**
   * @return The short identifier of this edition, e.g. <code>2017</code>. Neither
   *         <code>null</code> nor empty.
   */
  @NonNull
  @Nonempty
  public String getID ()
  {
    return m_sID;
  }

  @NonNull
  @Nonempty
  public String getDisplayName ()
  {
    return m_sDisplayName;
  }

  /**
   * @return The BT-24 specification identifier of this edition, e.g.
   *         <code>urn:cen.eu:en16931:2017</code>. Neither <code>null</code> nor empty.
   */
  @NonNull
  @Nonempty
  public String getSpecificationIdentifier ()
  {
    return m_sSpecificationIdentifier;
  }

  @Nullable
  public static EEN16931Edition getFromIDOrNull (@Nullable final String sID)
  {
    return EnumHelper.getFromIDOrNull (EEN16931Edition.class, sID);
  }

  /**
   * Find the edition matching the provided BT-24 value. The value is matched by prefix, because
   * customizations append their own identifier, as in
   * <code>urn:cen.eu:en16931:2017#compliant#urn:xeinkauf.de:kosit:xrechnung_3.0</code>.
   *
   * @param sSpecificationIdentifier
   *        The BT-24 value. May be <code>null</code>.
   * @return <code>null</code> if the value matches no known edition.
   */
  @Nullable
  public static EEN16931Edition getFromSpecificationIdentifierOrNull (@Nullable final String sSpecificationIdentifier)
  {
    final String sTrimmed = StringHelper.trim (sSpecificationIdentifier);
    if (StringHelper.isNotEmpty (sTrimmed))
      for (final EEN16931Edition e : values ())
        if (sTrimmed.startsWith (e.m_sSpecificationIdentifier))
          return e;
    return null;
  }

  @Nullable
  private static String _getSpecificationIdentifierCII (@NonNull final Element aRoot)
  {
    // rsm:ExchangedDocumentContext/ram:GuidelineSpecifiedDocumentContextParameter/ram:ID
    final Element aContext = XMLHelper.getFirstChildElementOfName (aRoot,
                                                                  CEN16931Syntax.NS_URI_CII_RSM,
                                                                  "ExchangedDocumentContext");
    if (aContext == null)
      return null;

    final Element aGuideline = XMLHelper.getFirstChildElementOfName (aContext,
                                                                    CEN16931Syntax.NS_URI_CII_RAM,
                                                                    "GuidelineSpecifiedDocumentContextParameter");
    if (aGuideline == null)
      return null;

    final Element aID = XMLHelper.getFirstChildElementOfName (aGuideline, CEN16931Syntax.NS_URI_CII_RAM, "ID");
    return aID == null ? null : StringHelper.trim (aID.getTextContent ());
  }

  @Nullable
  private static String _getSpecificationIdentifierUBL (@NonNull final Element aRoot)
  {
    // cbc:CustomizationID
    final Element aCustomizationID = XMLHelper.getFirstChildElementOfName (aRoot,
                                                                          CEN16931Syntax.NS_URI_UBL_CBC,
                                                                          "CustomizationID");
    return aCustomizationID == null ? null : StringHelper.trim (aCustomizationID.getTextContent ());
  }

  /**
   * Extract the BT-24 value from a UBL or CII document. The syntax kind is derived from the
   * document element, and BT-24 is read from <code>cbc:CustomizationID</code> for UBL and from
   * <code>rsm:ExchangedDocumentContext/ram:GuidelineSpecifiedDocumentContextParameter/ram:ID</code>
   * for CII.
   * <p>
   * This deliberately walks the DOM instead of unmarshalling, because the correct JAXB model is
   * exactly what is not known yet.
   *
   * @param aNode
   *        The document or its document element. May be <code>null</code>.
   * @return <code>null</code> if the document element belongs to no known syntax kind, or if BT-24
   *         is not present.
   */
  @Nullable
  public static String getSpecificationIdentifier (@Nullable final Node aNode)
  {
    if (aNode == null)
      return null;

    final Element aRoot = aNode instanceof final Document aDoc ? aDoc.getDocumentElement ()
                                                               : aNode instanceof final Element aElement ? aElement
                                                                                                         : null;
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
   * Extract the BT-24 value from a UBL or CII file.
   *
   * @param aFile
   *        The file to inspect. May be <code>null</code>.
   * @return <code>null</code> if the file cannot be read, is not well formed XML, belongs to no
   *         known syntax kind, or has no BT-24.
   */
  @Nullable
  public static String getSpecificationIdentifier (@Nullable final File aFile)
  {
    // DOMReader.readXMLDOM throws on a non existing file
    if (aFile == null || !aFile.isFile ())
      return null;

    // Only a DOM peek - the correct JAXB model is exactly what is not known yet
    final Document aDoc = DOMReader.readXMLDOM (aFile);
    return aDoc == null ? null : getSpecificationIdentifier (aDoc);
  }

  /**
   * Determine the EN 16931 edition of a UBL or CII document from its BT-24 value.
   *
   * @param aNode
   *        The document or its document element. May be <code>null</code>.
   * @return <code>null</code> if BT-24 is absent or matches no known edition.
   */
  @Nullable
  public static EEN16931Edition detect (@Nullable final Node aNode)
  {
    return getFromSpecificationIdentifierOrNull (getSpecificationIdentifier (aNode));
  }

  /**
   * Determine the EN 16931 edition of a UBL or CII file from its BT-24 value.
   *
   * @param aFile
   *        The file to inspect. May be <code>null</code>.
   * @return <code>null</code> if the file is not well formed XML, or BT-24 is absent or matches no
   *         known edition.
   */
  @Nullable
  public static EEN16931Edition detect (@Nullable final File aFile)
  {
    return getFromSpecificationIdentifierOrNull (getSpecificationIdentifier (aFile));
  }
}
