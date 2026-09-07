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
package com.helger.en16931.basics.codelist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.time.Month;

import org.junit.Test;

import com.helger.datetime.helper.PDTFactory;

/**
 * Test class for class {@link EN16931CodeLists}.
 *
 * @author Philip Helger
 */
public final class EN16931CodeListsTest
{
  @Test
  public void testCodeListVersion ()
  {
    assertEquals ("v17b", EN16931CodeLists.CODE_LIST_VERSION);
    assertEquals (PDTFactory.createLocalDate (2026, Month.MAY, 15), EN16931CodeLists.CODE_LIST_EFFECTIVE_DATE);
  }

  @Test
  public void testInvoiceTypeCodeCount ()
  {
    // Workbook "EN16931 code lists values v17b", sheet "1001": 62 codes, 49 Invoice and 13 Credit
    // Note. If one of these numbers changes, a new version of the workbook was transcribed.
    assertEquals (49, EN16931CodeLists.INVOICE_TYPE_CODES.size ());
    assertEquals (13, EN16931CodeLists.CREDIT_NOTE_TYPE_CODES.size ());
    assertEquals (62, EN16931CodeLists.INVOICE_TYPE_CODES.size () + EN16931CodeLists.CREDIT_NOTE_TYPE_CODES.size ());

    // No code appears in both roles
    for (final String sCode : EN16931CodeLists.INVOICE_TYPE_CODES)
      assertFalse ("Code '" + sCode + "' is in both roles",
                   EN16931CodeLists.CREDIT_NOTE_TYPE_CODES.contains (sCode));
  }

  @Test
  public void testInvoiceTypeCodeClassification ()
  {
    assertTrue (EN16931CodeLists.isInvoiceTypeCode ("380"));
    assertFalse (EN16931CodeLists.isCreditNoteTypeCode ("380"));

    assertTrue (EN16931CodeLists.isCreditNoteTypeCode ("381"));
    assertFalse (EN16931CodeLists.isInvoiceTypeCode ("381"));

    // "81" is a Credit Note in every version of the code list, even though the EN 16931 validation
    // artefacts additionally accept it on an Invoice. The code list wins.
    assertTrue (EN16931CodeLists.isCreditNoteTypeCode ("81"));
    assertFalse (EN16931CodeLists.isInvoiceTypeCode ("81"));

    // Added in v15 of the code list (used from 2025-05-15)
    assertTrue (EN16931CodeLists.isInvoiceTypeCode ("471"));
    assertTrue (EN16931CodeLists.isInvoiceTypeCode ("472"));
    assertTrue (EN16931CodeLists.isInvoiceTypeCode ("473"));
    assertTrue (EN16931CodeLists.isInvoiceTypeCode ("500"));
    assertTrue (EN16931CodeLists.isInvoiceTypeCode ("501"));
    assertTrue (EN16931CodeLists.isCreditNoteTypeCode ("502"));
    assertTrue (EN16931CodeLists.isCreditNoteTypeCode ("503"));

    // Surrounding whitespace is tolerated
    assertTrue (EN16931CodeLists.isInvoiceTypeCode (" 380 "));
    assertTrue (EN16931CodeLists.isCreditNoteTypeCode (" 381 "));

    // Unknown and absent
    assertFalse (EN16931CodeLists.isInvoiceTypeCode ("999"));
    assertFalse (EN16931CodeLists.isCreditNoteTypeCode ("999"));
    assertFalse (EN16931CodeLists.isInvoiceTypeCode (""));
    assertFalse (EN16931CodeLists.isInvoiceTypeCode (null));
    assertFalse (EN16931CodeLists.isCreditNoteTypeCode (null));
  }

  @Test
  public void testDueDateTypeCodeIsAnInversePair ()
  {
    // The three codes that differ between UNTDID 2475 (CII) and UNTDID 2005 (UBL)
    assertEquals ("3", EN16931CodeLists.mapDueDateTypeCodeCIIToUBL ("5"));
    assertEquals ("35", EN16931CodeLists.mapDueDateTypeCodeCIIToUBL ("29"));
    assertEquals ("432", EN16931CodeLists.mapDueDateTypeCodeCIIToUBL ("72"));

    assertEquals ("5", EN16931CodeLists.mapDueDateTypeCodeUBLToCII ("3"));
    assertEquals ("29", EN16931CodeLists.mapDueDateTypeCodeUBLToCII ("35"));
    assertEquals ("72", EN16931CodeLists.mapDueDateTypeCodeUBLToCII ("432"));

    // Round trip in both directions for all three mappings
    for (final String sCII : new String [] { "5", "29", "72" })
      assertEquals (sCII,
                    EN16931CodeLists.mapDueDateTypeCodeUBLToCII (EN16931CodeLists.mapDueDateTypeCodeCIIToUBL (sCII)));
    for (final String sUBL : new String [] { "3", "35", "432" })
      assertEquals (sUBL,
                    EN16931CodeLists.mapDueDateTypeCodeCIIToUBL (EN16931CodeLists.mapDueDateTypeCodeUBLToCII (sUBL)));
  }

  @Test
  public void testDueDateTypeCodePassesEverythingElseThrough ()
  {
    for (final String s : new String [] { "3", "35", "432", "1", "999", "" })
      assertEquals (s, EN16931CodeLists.mapDueDateTypeCodeCIIToUBL (s));
    for (final String s : new String [] { "5", "29", "72", "1", "999", "" })
      assertEquals (s, EN16931CodeLists.mapDueDateTypeCodeUBLToCII (s));

    assertNull (EN16931CodeLists.mapDueDateTypeCodeCIIToUBL (null));
    assertNull (EN16931CodeLists.mapDueDateTypeCodeUBLToCII (null));
  }

  @Test
  public void testTaxSchemeCodeIsAnInversePair ()
  {
    // BT-31/BT-48/BT-63 VAT identifier
    assertEquals ("VAT", EN16931CodeLists.mapTaxSchemeCodeCIIToUBL ("VA"));
    assertEquals ("VA", EN16931CodeLists.mapTaxSchemeCodeUBLToCII ("VAT"));

    // BT-32 national tax registration identifier
    assertEquals ("LOC", EN16931CodeLists.mapTaxSchemeCodeCIIToUBL ("FC"));
    assertEquals ("FC", EN16931CodeLists.mapTaxSchemeCodeUBLToCII ("LOC"));

    // Round trip in both directions for every entry of the code list
    for (final EEN16931TaxSchemeCode e : EEN16931TaxSchemeCode.values ())
    {
      assertEquals (e.getUBLCode (), EN16931CodeLists.mapTaxSchemeCodeCIIToUBL (e.getCIICode ()));
      assertEquals (e.getCIICode (), EN16931CodeLists.mapTaxSchemeCodeUBLToCII (e.getUBLCode ()));
      assertEquals (e.getCIICode (),
                    EN16931CodeLists.mapTaxSchemeCodeUBLToCII (EN16931CodeLists.mapTaxSchemeCodeCIIToUBL (e.getCIICode ())));
      assertEquals (e.getUBLCode (),
                    EN16931CodeLists.mapTaxSchemeCodeCIIToUBL (EN16931CodeLists.mapTaxSchemeCodeUBLToCII (e.getUBLCode ())));
    }
  }

  @Test
  public void testTaxSchemeCodePassesEverythingElseThrough ()
  {
    for (final String s : new String [] { "AAD", "999", "" })
    {
      assertEquals (s, EN16931CodeLists.mapTaxSchemeCodeCIIToUBL (s));
      assertEquals (s, EN16931CodeLists.mapTaxSchemeCodeUBLToCII (s));
    }

    assertNull (EN16931CodeLists.mapTaxSchemeCodeCIIToUBL (null));
    assertNull (EN16931CodeLists.mapTaxSchemeCodeUBLToCII (null));
  }

  @Test
  public void testPaymentMeansCode ()
  {
    // 30 = Credit transfer, 42 = Payment to bank account, 58 = SEPA credit transfer
    assertTrue (EN16931CodeLists.isPaymentMeansCodeCreditTransfer ("30"));
    assertTrue (EN16931CodeLists.isPaymentMeansCodeCreditTransfer ("42"));
    assertTrue (EN16931CodeLists.isPaymentMeansCodeCreditTransfer ("58"));
    assertFalse (EN16931CodeLists.isPaymentMeansCodeCreditTransfer ("48"));
    assertFalse (EN16931CodeLists.isPaymentMeansCodeCreditTransfer (null));

    // 48 = Bank card
    assertTrue (EN16931CodeLists.isPaymentMeansCodePaymentCard ("48"));
    assertFalse (EN16931CodeLists.isPaymentMeansCodePaymentCard ("30"));
    assertFalse (EN16931CodeLists.isPaymentMeansCodePaymentCard (null));

    // 49 = Direct debit, 59 = SEPA direct debit
    assertTrue (EN16931CodeLists.isPaymentMeansCodeDirectDebit ("49"));
    assertTrue (EN16931CodeLists.isPaymentMeansCodeDirectDebit ("59"));
    assertFalse (EN16931CodeLists.isPaymentMeansCodeDirectDebit ("58"));
    assertFalse (EN16931CodeLists.isPaymentMeansCodeDirectDebit (null));

    // The three groups are disjoint
    for (final String s : new String [] { "30", "42", "58", "48", "49", "59" })
    {
      int nMatches = 0;
      if (EN16931CodeLists.isPaymentMeansCodeCreditTransfer (s))
        nMatches++;
      if (EN16931CodeLists.isPaymentMeansCodePaymentCard (s))
        nMatches++;
      if (EN16931CodeLists.isPaymentMeansCodeDirectDebit (s))
        nMatches++;
      assertEquals ("Code '" + s + "' matches more than one group", 1, nMatches);
    }
  }

  @Test
  public void testDocumentReferenceTypeCode ()
  {
    assertEquals ("50", EN16931CodeLists.DOCUMENT_TYPE_CODE_ORIGINATOR_DOCUMENT);
    assertEquals ("130", EN16931CodeLists.DOCUMENT_TYPE_CODE_OBJECT_DOCUMENT);
    assertEquals ("916", EN16931CodeLists.DOCUMENT_TYPE_CODE_SUPPORTING_DOCUMENT);
    assertEquals ("1001", EN16931CodeLists.DOCUMENT_TYPE_CODE_LIST_ID);
    assertEquals ("5153", EN16931CodeLists.NON_VAT_TAX_CODE_LIST_ID);
    assertEquals ("SEPA", EN16931CodeLists.CREDITOR_REFERENCE_SCHEME_ID);
    assertEquals ("None", EN16931CodeLists.MISSING_VALUE_PLACEHOLDER);

    // BT-17
    assertTrue (EN16931CodeLists.isOriginatorDocumentReferenceTypeCode ("50"));
    assertFalse (EN16931CodeLists.isOriginatorDocumentReferenceTypeCode ("130"));
    assertFalse (EN16931CodeLists.isOriginatorDocumentReferenceTypeCode (null));

    // BT-17 or BT-18
    assertTrue (EN16931CodeLists.isValidDocumentReferenceTypeCode ("50"));
    assertTrue (EN16931CodeLists.isValidDocumentReferenceTypeCode ("130"));
    // 916 is BG-24 and must not become a DocumentTypeCode
    assertFalse (EN16931CodeLists.isValidDocumentReferenceTypeCode ("916"));
    assertFalse (EN16931CodeLists.isValidDocumentReferenceTypeCode ("999"));
    assertFalse (EN16931CodeLists.isValidDocumentReferenceTypeCode (null));
  }
}
