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

import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.Set;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import com.helger.annotation.concurrent.Immutable;
import com.helger.annotation.style.CodingStyleguideUnaware;
import com.helger.annotation.style.ReturnsImmutableObject;
import com.helger.base.string.StringHelper;
import com.helger.collection.commons.CommonsHashMap;
import com.helger.collection.commons.CommonsLinkedHashSet;
import com.helger.collection.commons.ICommonsMap;
import com.helger.collection.commons.ICommonsOrderedSet;
import com.helger.datetime.helper.PDTFactory;

/**
 * The subsets of the UNTDID code lists that EN 16931 uses, and the mappings between the code lists
 * that the UBL and the CII syntax binding of the same business term refer to.
 * <p>
 * Source of truth for all values in this class:
 * <a href=
 * "https://ec.europa.eu/digital-building-blocks/sites/spaces/DIGITAL/pages/467108974/Registry+of+supporting+artefacts+to+implement+EN16931#RegistryofsupportingartefactstoimplementEN16931-CEN/TC434EN16931">Registry
 * of supporting artefacts to implement EN 16931</a>, workbook
 * <code>EN16931 code lists values {@value #CODE_LIST_VERSION}</code>.
 * <p>
 * The code lists are versioned <b>by date and not by EN 16931 edition</b>, so the 2017 and the 2026
 * edition share them. There is no 2017 to 2026 delta in these lists.
 *
 * @author Philip Helger
 */
@Immutable
public final class EN16931CodeLists
{
  @NonNull
  @ReturnsImmutableObject
  private static Set <String> _getAllTypeCodes (@NonNull final EEN16931InvoiceTypeCodeRole eRole)
  {
    final ICommonsOrderedSet <String> ret = new CommonsLinkedHashSet <> ();
    for (final EEN16931InvoiceTypeCode e : EEN16931InvoiceTypeCode.values ())
      if (e.getRole () == eRole)
        ret.add (e.getID ());
    return Collections.unmodifiableSet (ret);
  }

  /**
   * The version of the EN 16931 code list workbook that this class implements. Consumers can report
   * this value to state what they are based on.
   */
  public static final String CODE_LIST_VERSION = "v17b";

  /** The date from which {@link #CODE_LIST_VERSION} is to be used */
  public static final LocalDate CODE_LIST_EFFECTIVE_DATE = PDTFactory.createLocalDate (2026, Month.MAY, 15);

  // BT-3 Invoice type code, UNTDID 1001, as a subset of 62 codes each classified as either an
  // Invoice or a Credit Note. No code appears in both roles.
  //
  // Both sets are derived from EEN16931InvoiceTypeCode, so the classification exists exactly once.
  //
  // Note: the EN 16931 validation artefacts additionally accept "81" on an Invoice, whereas every
  // version of the code list has it as a Credit Note only. The code list wins here.

  /** BT-3 Invoice type codes of UNTDID 1001 that identify an Invoice - 49 codes */
  @CodingStyleguideUnaware
  public static final Set <String> INVOICE_TYPE_CODES = _getAllTypeCodes (EEN16931InvoiceTypeCodeRole.INVOICE);

  /** BT-3 Invoice type codes of UNTDID 1001 that identify a Credit Note - 13 codes */
  @CodingStyleguideUnaware
  public static final Set <String> CREDIT_NOTE_TYPE_CODES = _getAllTypeCodes (EEN16931InvoiceTypeCodeRole.CREDIT_NOTE);

  /** BT-17 Tender or lot reference - the UNTDID 1001 code of an originator document reference */
  public static final String DOCUMENT_TYPE_CODE_ORIGINATOR_DOCUMENT = "50";

  /** BT-18 Invoiced object identifier - the UNTDID 1001 code of an object document reference */
  public static final String DOCUMENT_TYPE_CODE_OBJECT_DOCUMENT = "130";

  /** BG-24 Additional supporting documents - the UNTDID 1001 code of a supporting document */
  public static final String DOCUMENT_TYPE_CODE_SUPPORTING_DOCUMENT = "916";

  /**
   * BT-122-1-1 - the identifier of the UNTDID 1001 code list itself, written as the list identifier
   * of a supporting document type code.
   *
   * @since 1.0.1
   */
  public static final String DOCUMENT_TYPE_CODE_LIST_ID = "1001";

  /**
   * BT-177-1 and BT-193-1 - the identifier of the UNTDID 5153 code list, written as the list
   * identifier of an allowance or charge reason code. Its presence is the only thing that
   * distinguishes the tax codes BT-177 and BT-193 from the reason codes BT-105 and BT-145, which
   * come from UNTDID 7161.
   *
   * @since 1.0.1
   */
  public static final String NON_VAT_TAX_CODE_LIST_ID = "5153";

  /**
   * The literal that both syntax bindings prescribe wherever a syntax element is mandatory but the
   * business term behind it is absent.
   * <p>
   * The UBL binding uses it for BT-13 when only BT-14 is present, and for the line reference terms
   * BT-132, BT-190, BT-192, BT-199 and BT-201, whose <code>cbc:LineID</code> is mandatory in the
   * enclosing UBL element. The CII binding uses it for BT-11-1, which is mandatory as soon as
   * <code>ram:SpecifiedProcuringProject</code> exists. A converter reading such a document must
   * treat the value as "not present" rather than carry it over, because the target element is
   * genuinely optional there.
   *
   * @since 1.0.1
   */
  public static final String MISSING_VALUE_PLACEHOLDER = "None";

  /**
   * BT-90-1 - the scheme identifier of the bank assigned creditor identifier BT-90.
   * <p>
   * In UBL, BT-90 shares the element <code>cac:PartyIdentification/cbc:ID</code> with the party
   * identifiers BT-29, BT-46 and BT-60, and this scheme identifier is the only thing that tells
   * them apart. A party identifier scheme must be an ISO 6523 ICD code, so an identifier carrying
   * this value must never be read or written as one. In CII the two have separate elements -
   * <code>ram:CreditorReferenceID</code> against <code>ram:ID</code> and <code>ram:GlobalID</code> -
   * and no scheme identifier is written at all.
   *
   * @since 1.0.1
   */
  public static final String CREDITOR_REFERENCE_SCHEME_ID = "SEPA";

  // BT-8 Value added tax point date code.
  // CII uses UNTDID 2475, the UBL syntax binding uses UNTDID 2005. Only the three codes of
  // EEN16931DueDateTypeCode differ; every other code is used unchanged in both syntaxes.
  // Both directions are derived from that single enum, so the two cannot drift apart.
  private static final ICommonsMap <String, String> DUE_DATE_TYPE_CODE_CII_TO_UBL = new CommonsHashMap <> ();
  private static final ICommonsMap <String, String> DUE_DATE_TYPE_CODE_UBL_TO_CII = new CommonsHashMap <> ();

  // BT-31/BT-48/BT-63 Tax scheme identifier.
  // The UBL syntax binding uses UNECE 5153, the CII syntax binding uses UNECE 1153, and EN 16931
  // uses a single entry of each - see EEN16931TaxSchemeCode. As with BT-8, both directions are
  // derived from that one enum so the two cannot drift apart.
  private static final ICommonsMap <String, String> TAX_SCHEME_CODE_CII_TO_UBL = new CommonsHashMap <> ();
  private static final ICommonsMap <String, String> TAX_SCHEME_CODE_UBL_TO_CII = new CommonsHashMap <> ();

  static
  {
    for (final EEN16931DueDateTypeCode e : EEN16931DueDateTypeCode.values ())
    {
      DUE_DATE_TYPE_CODE_CII_TO_UBL.put (e.getCIICode (), e.getUBLCode ());
      DUE_DATE_TYPE_CODE_UBL_TO_CII.put (e.getUBLCode (), e.getCIICode ());
    }

    for (final EEN16931TaxSchemeCode e : EEN16931TaxSchemeCode.values ())
    {
      TAX_SCHEME_CODE_CII_TO_UBL.put (e.getCIICode (), e.getUBLCode ());
      TAX_SCHEME_CODE_UBL_TO_CII.put (e.getUBLCode (), e.getCIICode ());
    }
  }

  /**
   * Check if the provided BT-3 value identifies an Invoice. Surrounding whitespace is tolerated.
   *
   * @param s
   *        The BT-3 Invoice type code to check. May be <code>null</code>.
   * @return <code>true</code> if the code is part of {@link #INVOICE_TYPE_CODES}.
   */
  public static boolean isInvoiceTypeCode (@Nullable final String s)
  {
    return INVOICE_TYPE_CODES.contains (StringHelper.trim (s));
  }

  /**
   * Check if the provided BT-3 value identifies a Credit Note. Surrounding whitespace is tolerated.
   *
   * @param s
   *        The BT-3 Invoice type code to check. May be <code>null</code>.
   * @return <code>true</code> if the code is part of {@link #CREDIT_NOTE_TYPE_CODES}.
   */
  public static boolean isCreditNoteTypeCode (@Nullable final String s)
  {
    return CREDIT_NOTE_TYPE_CODES.contains (StringHelper.trim (s));
  }

  /**
   * Map a BT-8 value from the CII code list (UNTDID 2475) to the UBL code list (UNTDID 2005). This
   * is the exact inverse of {@link #mapDueDateTypeCodeUBLToCII(String)}.
   *
   * @param s
   *        The CII BT-8 value. May be <code>null</code>.
   * @return The UBL BT-8 value, or the unchanged input if the code is identical in both code lists.
   */
  @Nullable
  public static String mapDueDateTypeCodeCIIToUBL (@Nullable final String s)
  {
    return DUE_DATE_TYPE_CODE_CII_TO_UBL.getOrDefault (s, s);
  }

  /**
   * Map a BT-8 value from the UBL code list (UNTDID 2005) to the CII code list (UNTDID 2475). This
   * is the exact inverse of {@link #mapDueDateTypeCodeCIIToUBL(String)}.
   *
   * @param s
   *        The UBL BT-8 value. May be <code>null</code>.
   * @return The CII BT-8 value, or the unchanged input if the code is identical in both code lists.
   */
  @Nullable
  public static String mapDueDateTypeCodeUBLToCII (@Nullable final String s)
  {
    return DUE_DATE_TYPE_CODE_UBL_TO_CII.getOrDefault (s, s);
  }

  /**
   * Map a BT-31/BT-48/BT-63 tax scheme identifier from the CII code list (UNECE 1153) to the UBL
   * code list (UNECE 5153), so CII <code>VA</code> becomes UBL <code>VAT</code>. This is the exact
   * inverse of {@link #mapTaxSchemeCodeUBLToCII(String)}.
   *
   * @param s
   *        The CII tax scheme identifier. May be <code>null</code>.
   * @return The UBL tax scheme identifier, or the unchanged input if the code is identical in both
   *         code lists.
   */
  @Nullable
  public static String mapTaxSchemeCodeCIIToUBL (@Nullable final String s)
  {
    return TAX_SCHEME_CODE_CII_TO_UBL.getOrDefault (s, s);
  }

  /**
   * Map a BT-31/BT-48/BT-63 tax scheme identifier from the UBL code list (UNECE 5153) to the CII
   * code list (UNECE 1153), so UBL <code>VAT</code> becomes CII <code>VA</code>. This is the exact
   * inverse of {@link #mapTaxSchemeCodeCIIToUBL(String)}.
   *
   * @param s
   *        The UBL tax scheme identifier. May be <code>null</code>.
   * @return The CII tax scheme identifier, or the unchanged input if the code is identical in both
   *         code lists.
   */
  @Nullable
  public static String mapTaxSchemeCodeUBLToCII (@Nullable final String s)
  {
    return TAX_SCHEME_CODE_UBL_TO_CII.getOrDefault (s, s);
  }

  /**
   * Check if the provided BT-81 value of UNTDID 4461 denotes a credit transfer.
   *
   * @param s
   *        The BT-81 Payment means type code to check. May be <code>null</code>.
   * @return <code>true</code> if it is a credit transfer.
   */
  public static boolean isPaymentMeansCodeCreditTransfer (@Nullable final String s)
  {
    // the EN 16931 XSLT only checks for 30 and 58
    // in ebinterface-ubl-mapping this is 30, 31, 42 and 58
    // 30 = Credit transfer
    // 31 = Debit transfer
    // 42 = Payment to bank account
    // 58 = SEPA credit transfer
    return "30".equals (s) || "42".equals (s) || "58".equals (s);
  }

  /**
   * Check if the provided BT-81 value of UNTDID 4461 denotes a payment card.
   *
   * @param s
   *        The BT-81 Payment means type code to check. May be <code>null</code>.
   * @return <code>true</code> if it is a payment card.
   */
  public static boolean isPaymentMeansCodePaymentCard (@Nullable final String s)
  {
    // 48 = Bank card
    return "48".equals (s);
  }

  /**
   * Check if the provided BT-81 value of UNTDID 4461 denotes a direct debit.
   *
   * @param s
   *        The BT-81 Payment means type code to check. May be <code>null</code>.
   * @return <code>true</code> if it is a direct debit.
   */
  public static boolean isPaymentMeansCodeDirectDebit (@Nullable final String s)
  {
    // 49 = Direct debit (non-SEPA)
    // 59 = SEPA direct debit
    return "49".equals (s) || "59".equals (s);
  }

  /**
   * Check if the provided document type code is the one of BT-17.
   *
   * @param s
   *        The UNTDID 1001 document type code to check. May be <code>null</code>.
   * @return <code>true</code> if it is {@link #DOCUMENT_TYPE_CODE_ORIGINATOR_DOCUMENT}.
   */
  public static boolean isOriginatorDocumentReferenceTypeCode (@Nullable final String s)
  {
    // BT-17
    return DOCUMENT_TYPE_CODE_ORIGINATOR_DOCUMENT.equals (s);
  }

  /**
   * Check if the provided document type code carries a business term and may therefore be copied to
   * the other syntax. The BG-24 code {@link #DOCUMENT_TYPE_CODE_SUPPORTING_DOCUMENT} deliberately
   * does not, because it is implied by the element it appears in.
   *
   * @param s
   *        The UNTDID 1001 document type code to check. May be <code>null</code>.
   * @return <code>true</code> if it is the code of BT-17 or of BT-18.
   */
  public static boolean isValidDocumentReferenceTypeCode (@Nullable final String s)
  {
    // BT-17 or BT-18
    // Value 916 from BT-122 should not lead to a DocumentTypeCode
    return isOriginatorDocumentReferenceTypeCode (s) || DOCUMENT_TYPE_CODE_OBJECT_DOCUMENT.equals (s);
  }

  private EN16931CodeLists ()
  {}
}
