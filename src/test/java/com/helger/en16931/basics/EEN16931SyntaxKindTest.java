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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.File;

import javax.xml.namespace.QName;

import org.junit.Test;
import org.w3c.dom.Document;

import com.helger.xml.serialize.read.DOMReader;

/**
 * Test class for the enums {@link EEN16931SyntaxKind} and {@link EEN16931DocumentType} and for the
 * constants of {@link CEN16931Syntax}.
 *
 * @author Philip Helger
 */
public final class EEN16931SyntaxKindTest
{
  private static final String CII_DIR = "src/test/resources/external/cii/";
  private static final String UBL_DIR = "src/test/resources/external/ubl/";

  @Test
  public void testSyntaxKind ()
  {
    for (final EEN16931SyntaxKind e : EEN16931SyntaxKind.values ())
    {
      assertTrue (e.getID ().length () > 0);
      assertTrue (e.getDisplayName ().length () > 0);
      assertSame (e, EEN16931SyntaxKind.getFromIDOrNull (e.getID ()));
      assertSame (e, EEN16931SyntaxKind.getFromRootElementNameOrNull (e.getRootElementName ()));
    }
    assertNull (EEN16931SyntaxKind.getFromIDOrNull ("bogus"));
    assertNull (EEN16931SyntaxKind.getFromIDOrNull (null));
    assertNull (EEN16931SyntaxKind.getFromRootElementNameOrNull (new QName ("urn:whatever", "Invoice")));
    assertNull (EEN16931SyntaxKind.getFromRootElementNameOrNull (null));
  }

  @Test
  public void testGetFromNode ()
  {
    final Document aUBLInvoice = DOMReader.readXMLDOM (new File (UBL_DIR, "ubl-2017-invoice.xml"));
    final Document aUBLCreditNote = DOMReader.readXMLDOM (new File (UBL_DIR, "ubl-2026-creditnote.xml"));
    final Document aCII = DOMReader.readXMLDOM (new File (CII_DIR, "cii-2017-invoice.xml"));
    assertNotNull (aUBLInvoice);
    assertNotNull (aUBLCreditNote);
    assertNotNull (aCII);

    assertSame (EEN16931SyntaxKind.UBL_INVOICE, EEN16931SyntaxKind.getFromNodeOrNull (aUBLInvoice));
    assertSame (EEN16931SyntaxKind.UBL_CREDIT_NOTE, EEN16931SyntaxKind.getFromNodeOrNull (aUBLCreditNote));
    assertSame (EEN16931SyntaxKind.CII, EEN16931SyntaxKind.getFromNodeOrNull (aCII));

    // The document element works as well as the document
    assertSame (EEN16931SyntaxKind.UBL_INVOICE,
                EEN16931SyntaxKind.getFromNodeOrNull (aUBLInvoice.getDocumentElement ()));
    assertSame (EEN16931SyntaxKind.CII, EEN16931SyntaxKind.getFromNodeOrNull (aCII.getDocumentElement ()));

    // The syntax kind does not depend on the edition
    final Document aCII2026 = DOMReader.readXMLDOM (new File (CII_DIR, "cii-2026-invoice.xml"));
    assertNotNull (aCII2026);
    assertSame (EEN16931SyntaxKind.CII, EEN16931SyntaxKind.getFromNodeOrNull (aCII2026));

    // Neither UBL nor CII
    final Document aUnknown = DOMReader.readXMLDOM (new File ("src/test/resources/external/unknown-syntax.xml"));
    assertNotNull (aUnknown);
    assertNull (EEN16931SyntaxKind.getFromNodeOrNull (aUnknown));

    // A node that is neither a Document nor an Element
    assertNull (EEN16931SyntaxKind.getFromNodeOrNull (aCII.createTextNode ("no element")));
    assertNull (EEN16931SyntaxKind.getFromNodeOrNull (null));
  }

  @Test
  public void testDocumentType ()
  {
    for (final EEN16931DocumentType e : EEN16931DocumentType.values ())
    {
      assertTrue (e.getID ().length () > 0);
      assertTrue (e.getDisplayName ().length () > 0);
      assertTrue (e.getSyntaxVersion ().length () > 0);
      assertSame (e, EEN16931DocumentType.getFromIDOrNull (e.getID ()));
      assertSame (e,
                  EEN16931DocumentType.getFromSyntaxKindAndVersionOrNull (e.getSyntaxKind (), e.getSyntaxVersion ()));
    }
    // The syntax version is matched case insensitive
    assertSame (EEN16931DocumentType.CII_D16B,
                EEN16931DocumentType.getFromSyntaxKindAndVersionOrNull (EEN16931SyntaxKind.CII, "d16b"));

    assertNull (EEN16931DocumentType.getFromIDOrNull ("bogus"));
    assertNull (EEN16931DocumentType.getFromIDOrNull (null));
    assertNull (EEN16931DocumentType.getFromSyntaxKindAndVersionOrNull (EEN16931SyntaxKind.CII, "D99Z"));
    assertNull (EEN16931DocumentType.getFromSyntaxKindAndVersionOrNull (null, "D16B"));
    assertNull (EEN16931DocumentType.getFromSyntaxKindAndVersionOrNull (EEN16931SyntaxKind.CII, null));
  }

  @Test
  public void testEditionAndSyntaxKind ()
  {
    for (final EEN16931DocumentType e : EEN16931DocumentType.values ())
      assertSame (e, EEN16931DocumentType.getFromEditionAndSyntaxKindOrNull (e.getEdition (), e.getSyntaxKind ()));

    // Every combination of an edition and a syntax kind exists exactly once
    assertEquals (EEN16931Edition.values ().length * EEN16931SyntaxKind.values ().length,
                  EEN16931DocumentType.values ().length);

    assertSame (EEN16931DocumentType.UBL21_INVOICE,
                EEN16931DocumentType.getFromEditionAndSyntaxKindOrNull (EEN16931Edition.EN2017,
                                                                        EEN16931SyntaxKind.UBL_INVOICE));
    assertSame (EEN16931DocumentType.UBL21_CREDIT_NOTE,
                EEN16931DocumentType.getFromEditionAndSyntaxKindOrNull (EEN16931Edition.EN2017,
                                                                        EEN16931SyntaxKind.UBL_CREDIT_NOTE));
    assertSame (EEN16931DocumentType.CII_D16B,
                EEN16931DocumentType.getFromEditionAndSyntaxKindOrNull (EEN16931Edition.EN2017,
                                                                        EEN16931SyntaxKind.CII));
    assertSame (EEN16931DocumentType.UBL25_INVOICE,
                EEN16931DocumentType.getFromEditionAndSyntaxKindOrNull (EEN16931Edition.EN2026,
                                                                        EEN16931SyntaxKind.UBL_INVOICE));
    assertSame (EEN16931DocumentType.UBL25_CREDIT_NOTE,
                EEN16931DocumentType.getFromEditionAndSyntaxKindOrNull (EEN16931Edition.EN2026,
                                                                        EEN16931SyntaxKind.UBL_CREDIT_NOTE));
    assertSame (EEN16931DocumentType.CII_D25A,
                EEN16931DocumentType.getFromEditionAndSyntaxKindOrNull (EEN16931Edition.EN2026,
                                                                        EEN16931SyntaxKind.CII));

    assertNull (EEN16931DocumentType.getFromEditionAndSyntaxKindOrNull (null, EEN16931SyntaxKind.CII));
    assertNull (EEN16931DocumentType.getFromEditionAndSyntaxKindOrNull (EEN16931Edition.EN2017, null));
  }

  @Test
  public void testSyntaxConstants ()
  {
    assertEquals (CEN16931Syntax.NS_URI_UBL_INVOICE, CEN16931Syntax.QNAME_UBL_INVOICE.getNamespaceURI ());
    assertEquals ("Invoice", CEN16931Syntax.QNAME_UBL_INVOICE.getLocalPart ());
    assertEquals (CEN16931Syntax.NS_URI_UBL_CREDIT_NOTE, CEN16931Syntax.QNAME_UBL_CREDIT_NOTE.getNamespaceURI ());
    assertEquals ("CreditNote", CEN16931Syntax.QNAME_UBL_CREDIT_NOTE.getLocalPart ());
    assertEquals (CEN16931Syntax.NS_URI_CII_RSM, CEN16931Syntax.QNAME_CII.getNamespaceURI ());
    assertEquals ("CrossIndustryInvoice", CEN16931Syntax.QNAME_CII.getLocalPart ());

    // These are the values of ph-cii and ph-ubl, spelled out to stay free of both.
    // A change here means the syntax bindings changed - which they never did.
    assertEquals ("urn:oasis:names:specification:ubl:schema:xsd:Invoice-2", CEN16931Syntax.NS_URI_UBL_INVOICE);
    assertEquals ("urn:oasis:names:specification:ubl:schema:xsd:CreditNote-2", CEN16931Syntax.NS_URI_UBL_CREDIT_NOTE);
    assertEquals ("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2",
                  CEN16931Syntax.NS_URI_UBL_CBC);
    assertEquals ("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2",
                  CEN16931Syntax.NS_URI_UBL_CAC);
    assertEquals ("urn:un:unece:uncefact:data:standard:CrossIndustryInvoice:100", CEN16931Syntax.NS_URI_CII_RSM);
    assertEquals ("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100",
                  CEN16931Syntax.NS_URI_CII_RAM);
    assertEquals ("urn:un:unece:uncefact:data:standard:UnqualifiedDataType:100", CEN16931Syntax.NS_URI_CII_UDT);
    assertEquals ("urn:un:unece:uncefact:data:standard:QualifiedDataType:100", CEN16931Syntax.NS_URI_CII_QDT);
  }
}
