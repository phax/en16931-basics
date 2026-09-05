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

import java.io.File;

import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import com.helger.io.resource.ClassPathResource;
import com.helger.io.resource.IReadableResource;
import com.helger.xml.sax.InputSourceFactory;
import com.helger.xml.serialize.read.DOMReader;

/**
 * Test class for class {@link SpecificationIdentifierReader}.
 *
 * @author Philip Helger
 */
public final class SpecificationIdentifierReaderTest
{
  private static final String BASE_DIR = "src/test/resources/external/";

  @Test
  public void testReadFileCII ()
  {
    assertEquals ("urn:cen.eu:en16931:2017",
                  SpecificationIdentifierReader.getSpecificationIdentifier (new File (BASE_DIR,
                                                                                      "cii/cii-2017-invoice.xml")));
    assertEquals ("urn:cen.eu:en16931:2017#compliant#urn:xeinkauf.de:kosit:xrechnung_3.0",
                  SpecificationIdentifierReader.getSpecificationIdentifier (new File (BASE_DIR,
                                                                                      "cii/cii-2017-xrechnung-invoice.xml")));
    assertEquals ("urn:cen.eu:en16931:2026",
                  SpecificationIdentifierReader.getSpecificationIdentifier (new File (BASE_DIR,
                                                                                      "cii/cii-2026-invoice.xml")));
    assertEquals ("urn:ferd:CrossIndustryDocument:invoice:1p0:comfort",
                  SpecificationIdentifierReader.getSpecificationIdentifier (new File (BASE_DIR,
                                                                                      "cii/cii-legacy-zugferd-invoice.xml")));
    // BG-2 is missing altogether
    assertNull (SpecificationIdentifierReader.getSpecificationIdentifier (new File (BASE_DIR,
                                                                                    "cii/cii-without-bt24-invoice.xml")));
  }

  @Test
  public void testReadFileUBL ()
  {
    assertEquals ("urn:cen.eu:en16931:2017",
                  SpecificationIdentifierReader.getSpecificationIdentifier (new File (BASE_DIR,
                                                                                      "ubl/ubl-2017-invoice.xml")));
    assertEquals ("urn:cen.eu:en16931:2017#compliant#urn:fdc:peppol.eu:2017:poacc:billing:3.0",
                  SpecificationIdentifierReader.getSpecificationIdentifier (new File (BASE_DIR,
                                                                                      "ubl/ubl-2017-peppol-invoice.xml")));
    assertEquals ("urn:cen.eu:en16931:2026",
                  SpecificationIdentifierReader.getSpecificationIdentifier (new File (BASE_DIR,
                                                                                      "ubl/ubl-2026-creditnote.xml")));
    assertNull (SpecificationIdentifierReader.getSpecificationIdentifier (new File (BASE_DIR,
                                                                                    "ubl/ubl-without-bt24-invoice.xml")));
  }

  @Test
  public void testSAXAndDOMAgree ()
  {
    for (final String sFilename : new String [] { "cii/cii-2017-invoice.xml",
                                                  "cii/cii-2017-xrechnung-invoice.xml",
                                                  "cii/cii-2026-invoice.xml",
                                                  "cii/cii-legacy-zugferd-invoice.xml",
                                                  "cii/cii-without-bt24-invoice.xml",
                                                  "ubl/ubl-2017-invoice.xml",
                                                  "ubl/ubl-2017-peppol-invoice.xml",
                                                  "ubl/ubl-2026-creditnote.xml",
                                                  "ubl/ubl-without-bt24-invoice.xml",
                                                  "unknown-syntax.xml" })
    {
      final File aFile = new File (BASE_DIR, sFilename);
      final Document aDoc = DOMReader.readXMLDOM (aFile);
      assertNotNull (sFilename, aDoc);
      assertEquals (sFilename,
                    SpecificationIdentifierReader.getSpecificationIdentifier (aDoc),
                    SpecificationIdentifierReader.getSpecificationIdentifier (aFile));
    }
  }

  @Test
  public void testReadResource ()
  {
    final IReadableResource aRes = new ClassPathResource ("external/ubl/ubl-2017-invoice.xml");
    assertEquals ("urn:cen.eu:en16931:2017", SpecificationIdentifierReader.getSpecificationIdentifier (aRes));

    assertNull (SpecificationIdentifierReader.getSpecificationIdentifier (new ClassPathResource ("external/does-not-exist.xml")));
    assertNull (SpecificationIdentifierReader.getSpecificationIdentifier ((IReadableResource) null));
  }

  @Test
  public void testReadInputSource ()
  {
    final String sXML = "<Invoice xmlns='urn:oasis:names:specification:ubl:schema:xsd:Invoice-2'" +
                        " xmlns:cbc='urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2'>" +
                        "<cbc:CustomizationID>  urn:cen.eu:en16931:2026  </cbc:CustomizationID>" +
                        "</Invoice>";
    // Surrounding whitespace is trimmed
    assertEquals ("urn:cen.eu:en16931:2026",
                  SpecificationIdentifierReader.getSpecificationIdentifier (InputSourceFactory.create (sXML)));
    assertNull (SpecificationIdentifierReader.getSpecificationIdentifier ((InputSource) null));
  }

  @Test
  public void testStopsBehindBT24 ()
  {
    // Everything behind BT-24 is never read, so the broken tail stays unnoticed
    final String sXML = "<Invoice xmlns='urn:oasis:names:specification:ubl:schema:xsd:Invoice-2'" +
                        " xmlns:cbc='urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2'>" +
                        "<cbc:CustomizationID>urn:cen.eu:en16931:2017</cbc:CustomizationID>" +
                        "<cbc:ID>this is not well formed";
    assertEquals ("urn:cen.eu:en16931:2017",
                  SpecificationIdentifierReader.getSpecificationIdentifier (InputSourceFactory.create (sXML)));
  }

  @Test
  public void testUndeterminable ()
  {
    // A document element of no known syntax kind - the BT-24 lookalike is not even looked at
    assertNull (SpecificationIdentifierReader.getSpecificationIdentifier (new File (BASE_DIR, "unknown-syntax.xml")));
    // Well formed XML that is neither UBL nor CII
    assertNull (SpecificationIdentifierReader.getSpecificationIdentifier (new File ("pom.xml")));
    // Not existing
    assertNull (SpecificationIdentifierReader.getSpecificationIdentifier (new File ("does-not-exist.xml")));
    assertNull (SpecificationIdentifierReader.getSpecificationIdentifier ((File) null));
    assertNull (SpecificationIdentifierReader.getSpecificationIdentifier ((org.w3c.dom.Node) null));
  }
}
