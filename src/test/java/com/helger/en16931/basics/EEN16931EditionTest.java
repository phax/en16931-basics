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

import org.junit.Test;
import org.w3c.dom.Document;

import com.helger.xml.serialize.read.DOMReader;

/**
 * Test class for class {@link EEN16931Edition}.
 *
 * @author Philip Helger
 */
public final class EEN16931EditionTest
{
  private static final String CII_DIR = "src/test/resources/external/cii/";
  private static final String UBL_DIR = "src/test/resources/external/ubl/";

  @Test
  public void testBasic ()
  {
    for (final EEN16931Edition e : EEN16931Edition.values ())
    {
      assertTrue (e.getID ().length () > 0);
      assertTrue (e.getDisplayName ().length () > 0);
      assertTrue (e.getSpecificationIdentifier ().startsWith ("urn:cen.eu:en16931:"));
      assertSame (e, EEN16931Edition.getFromIDOrNull (e.getID ()));
      assertSame (e, EEN16931Edition.getFromSpecificationIdentifierOrNull (e.getSpecificationIdentifier ()));
    }
    assertEquals ("2017", EEN16931Edition.EN2017.getID ());
    assertEquals ("2026", EEN16931Edition.EN2026.getID ());
    assertEquals ("urn:cen.eu:en16931:2017", EEN16931Edition.EN2017.getSpecificationIdentifier ());
    assertEquals ("urn:cen.eu:en16931:2026", EEN16931Edition.EN2026.getSpecificationIdentifier ());

    assertNull (EEN16931Edition.getFromIDOrNull ("2099"));
    assertNull (EEN16931Edition.getFromIDOrNull (""));
    assertNull (EEN16931Edition.getFromIDOrNull (null));
  }

  @Test
  public void testDocumentType ()
  {
    // Every edition prescribes a document type for every syntax kind
    for (final EEN16931Edition e : EEN16931Edition.values ())
      for (final EEN16931SyntaxKind eSyntaxKind : EEN16931SyntaxKind.values ())
      {
        final EEN16931DocumentType eDocType = e.getDocumentType (eSyntaxKind);
        assertNotNull (eDocType);
        assertSame (eSyntaxKind, eDocType.getSyntaxKind ());
        assertSame (e, eDocType.getEdition ());
      }

    // EN 16931:2017 is CII D16B and UBL 2.1
    assertSame (EEN16931DocumentType.CII_D16B, EEN16931Edition.EN2017.getDocumentType (EEN16931SyntaxKind.CII));
    assertSame (EEN16931DocumentType.UBL21_INVOICE,
                EEN16931Edition.EN2017.getDocumentType (EEN16931SyntaxKind.UBL_INVOICE));
    assertSame (EEN16931DocumentType.UBL21_CREDIT_NOTE,
                EEN16931Edition.EN2017.getDocumentType (EEN16931SyntaxKind.UBL_CREDIT_NOTE));
    assertEquals ("D16B", EEN16931Edition.EN2017.getCIISyntaxVersion ());
    assertEquals ("2.1", EEN16931Edition.EN2017.getUBLSyntaxVersion ());

    // EN 16931:2026 is CII D25A and UBL 2.5
    assertSame (EEN16931DocumentType.CII_D25A, EEN16931Edition.EN2026.getDocumentType (EEN16931SyntaxKind.CII));
    assertSame (EEN16931DocumentType.UBL25_INVOICE,
                EEN16931Edition.EN2026.getDocumentType (EEN16931SyntaxKind.UBL_INVOICE));
    assertSame (EEN16931DocumentType.UBL25_CREDIT_NOTE,
                EEN16931Edition.EN2026.getDocumentType (EEN16931SyntaxKind.UBL_CREDIT_NOTE));
    assertEquals ("D25A", EEN16931Edition.EN2026.getCIISyntaxVersion ());
    assertEquals ("2.5", EEN16931Edition.EN2026.getUBLSyntaxVersion ());

    // The UBL version is the same for the Invoice and for the Credit Note
    for (final EEN16931Edition e : EEN16931Edition.values ())
      assertEquals (e.getDocumentType (EEN16931SyntaxKind.UBL_INVOICE).getSyntaxVersion (),
                    e.getDocumentType (EEN16931SyntaxKind.UBL_CREDIT_NOTE).getSyntaxVersion ());
  }

  @Test
  public void testDetectDocumentType ()
  {
    // The two together tell what a document actually is - the syntax kind from the document
    // element, the syntax version from the edition behind BT-24
    final Document aDoc = DOMReader.readXMLDOM (new File (UBL_DIR, "ubl-2026-creditnote.xml"));
    assertNotNull (aDoc);

    final EEN16931SyntaxKind eSyntaxKind = EEN16931SyntaxKind.getFromNodeOrNull (aDoc);
    final EEN16931Edition eEdition = EEN16931Edition.detect (aDoc);
    assertSame (EEN16931SyntaxKind.UBL_CREDIT_NOTE, eSyntaxKind);
    assertSame (EEN16931Edition.EN2026, eEdition);
    assertSame (EEN16931DocumentType.UBL25_CREDIT_NOTE, eEdition.getDocumentType (eSyntaxKind));
  }

  @Test
  public void testGetFromSpecificationIdentifier ()
  {
    // Plain
    assertSame (EEN16931Edition.EN2017,
                EEN16931Edition.getFromSpecificationIdentifierOrNull ("urn:cen.eu:en16931:2017"));
    assertSame (EEN16931Edition.EN2026,
                EEN16931Edition.getFromSpecificationIdentifierOrNull ("urn:cen.eu:en16931:2026"));

    // With a customization suffix, as used by XRechnung and by Peppol
    assertSame (EEN16931Edition.EN2017,
                EEN16931Edition.getFromSpecificationIdentifierOrNull ("urn:cen.eu:en16931:2017#compliant#urn:xeinkauf.de:kosit:xrechnung_3.0"));
    assertSame (EEN16931Edition.EN2017,
                EEN16931Edition.getFromSpecificationIdentifierOrNull ("urn:cen.eu:en16931:2017#compliant#urn:fdc:peppol.eu:2017:poacc:billing:3.0"));
    assertSame (EEN16931Edition.EN2026,
                EEN16931Edition.getFromSpecificationIdentifierOrNull ("urn:cen.eu:en16931:2026#compliant#urn:example:profile"));

    // Surrounding whitespace is tolerated
    assertSame (EEN16931Edition.EN2026,
                EEN16931Edition.getFromSpecificationIdentifierOrNull ("  urn:cen.eu:en16931:2026  "));

    // Unknown or missing
    assertNull (EEN16931Edition.getFromSpecificationIdentifierOrNull ("urn:cen.eu:en16931:2099"));
    assertNull (EEN16931Edition.getFromSpecificationIdentifierOrNull ("urn:ferd:CrossIndustryDocument:invoice:1p0:comfort"));
    assertNull (EEN16931Edition.getFromSpecificationIdentifierOrNull ("something else"));
    assertNull (EEN16931Edition.getFromSpecificationIdentifierOrNull (""));
    assertNull (EEN16931Edition.getFromSpecificationIdentifierOrNull (null));
  }

  @Test
  public void testDetectCII ()
  {
    assertEquals ("urn:cen.eu:en16931:2017",
                  EEN16931Edition.getSpecificationIdentifier (new File (CII_DIR, "cii-2017-invoice.xml")));
    assertSame (EEN16931Edition.EN2017, EEN16931Edition.detect (new File (CII_DIR, "cii-2017-invoice.xml")));
    assertSame (EEN16931Edition.EN2017, EEN16931Edition.detect (new File (CII_DIR, "cii-2017-xrechnung-invoice.xml")));
    assertSame (EEN16931Edition.EN2026, EEN16931Edition.detect (new File (CII_DIR, "cii-2026-invoice.xml")));

    // The document element is the same in both editions - only BT-24 tells them apart
    final Document aDoc2017 = DOMReader.readXMLDOM (new File (CII_DIR, "cii-2017-invoice.xml"));
    final Document aDoc2026 = DOMReader.readXMLDOM (new File (CII_DIR, "cii-2026-invoice.xml"));
    assertNotNull (aDoc2017);
    assertNotNull (aDoc2026);
    assertEquals (aDoc2017.getDocumentElement ().getNamespaceURI (),
                  aDoc2026.getDocumentElement ().getNamespaceURI ());
    assertSame (EEN16931Edition.EN2017, EEN16931Edition.detect (aDoc2017));
    assertSame (EEN16931Edition.EN2026, EEN16931Edition.detect (aDoc2026));

    // The document element works as well as the document
    assertSame (EEN16931Edition.EN2017, EEN16931Edition.detect (aDoc2017.getDocumentElement ()));
  }

  @Test
  public void testDetectUBL ()
  {
    assertEquals ("urn:cen.eu:en16931:2017",
                  EEN16931Edition.getSpecificationIdentifier (new File (UBL_DIR, "ubl-2017-invoice.xml")));
    assertSame (EEN16931Edition.EN2017, EEN16931Edition.detect (new File (UBL_DIR, "ubl-2017-invoice.xml")));
    assertSame (EEN16931Edition.EN2017, EEN16931Edition.detect (new File (UBL_DIR, "ubl-2017-peppol-invoice.xml")));
    // Credit Note as well as Invoice
    assertSame (EEN16931Edition.EN2026, EEN16931Edition.detect (new File (UBL_DIR, "ubl-2026-creditnote.xml")));

    final Document aDoc = DOMReader.readXMLDOM (new File (UBL_DIR, "ubl-2017-invoice.xml"));
    assertNotNull (aDoc);
    assertSame (EEN16931Edition.EN2017, EEN16931Edition.detect (aDoc));
    assertSame (EEN16931Edition.EN2017, EEN16931Edition.detect (aDoc.getDocumentElement ()));
  }

  @Test
  public void testDetectUndeterminable ()
  {
    // BT-24 is present but is not an EN 16931 identifier
    assertEquals ("urn:ferd:CrossIndustryDocument:invoice:1p0:comfort",
                  EEN16931Edition.getSpecificationIdentifier (new File (CII_DIR, "cii-legacy-zugferd-invoice.xml")));
    assertNull (EEN16931Edition.detect (new File (CII_DIR, "cii-legacy-zugferd-invoice.xml")));

    // BT-24 is absent
    assertNull (EEN16931Edition.getSpecificationIdentifier (new File (CII_DIR, "cii-without-bt24-invoice.xml")));
    assertNull (EEN16931Edition.detect (new File (CII_DIR, "cii-without-bt24-invoice.xml")));
    assertNull (EEN16931Edition.getSpecificationIdentifier (new File (UBL_DIR, "ubl-without-bt24-invoice.xml")));
    assertNull (EEN16931Edition.detect (new File (UBL_DIR, "ubl-without-bt24-invoice.xml")));

    // A document element of no known syntax kind - the BT-24 lookalike is not even looked at
    assertNull (EEN16931Edition.getSpecificationIdentifier (new File ("src/test/resources/external/unknown-syntax.xml")));

    // No document at all
    assertNull (EEN16931Edition.detect ((File) null));
    assertNull (EEN16931Edition.detect ((org.w3c.dom.Node) null));
    // Not XML that we know
    assertNull (EEN16931Edition.detect (new File ("pom.xml")));
    // Not existing - DOMReader.readXMLDOM would throw
    assertNull (EEN16931Edition.detect (new File ("does-not-exist.xml")));
  }
}
