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

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import com.helger.annotation.Nonempty;
import com.helger.annotation.style.CodingStyleguideUnaware;
import com.helger.base.id.IHasID;
import com.helger.base.name.IHasDisplayName;
import com.helger.collection.commons.CommonsHashMap;
import com.helger.collection.commons.ICommonsMap;

/**
 * UNTDID 1001 document type codes.
 * <p>
 * Used by BT-3. EN 16931 uses this code list as a subset.
 * <p>
 * Every code is either an Invoice or a Credit Note - no code appears in both roles.
 * <p>
 * Note that the EN 16931 validation artefacts additionally accept <code>81</code> on an Invoice,
 * whereas every version of the code list has it as a Credit Note only. The code list wins here.
 * <p>
 * Source of truth: sheet <code>1001</code> of the EN 16931 code list workbook. The implemented
 * version of that workbook is {@link EN16931CodeLists#CODE_LIST_VERSION}, and the registry it comes
 * from is named in {@link EN16931CodeLists}.
 *
 * @author Philip Helger
 */
@CodingStyleguideUnaware
public enum EEN16931InvoiceTypeCode implements IHasID <String>, IHasDisplayName
{
  /** <code>71</code> - Request for payment (Invoice) */
  _71 ("71", "Request for payment", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>80</code> - Debit note related to goods or services (Invoice) */
  _80 ("80", "Debit note related to goods or services", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>81</code> - Credit note related to goods or services (Credit Note) */
  _81 ("81", "Credit note related to goods or services", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE),
  /** <code>82</code> - Metered services invoice (Invoice) */
  _82 ("82", "Metered services invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>83</code> - Credit note related to financial adjustments (Credit Note) */
  _83 ("83", "Credit note related to financial adjustments", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE),
  /** <code>84</code> - Debit note related to financial adjustments (Invoice) */
  _84 ("84", "Debit note related to financial adjustments", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>102</code> - Tax notification (Invoice) */
  _102 ("102", "Tax notification", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>130</code> - Invoicing data sheet (Invoice) */
  _130 ("130", "Invoicing data sheet", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>202</code> - Direct payment valuation (Invoice) */
  _202 ("202", "Direct payment valuation", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>203</code> - Provisional payment valuation (Invoice) */
  _203 ("203", "Provisional payment valuation", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>204</code> - Payment valuation (Invoice) */
  _204 ("204", "Payment valuation", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>211</code> - Interim application for payment (Invoice) */
  _211 ("211", "Interim application for payment", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>218</code> - Final payment request based on completion of work (Invoice) */
  _218 ("218", "Final payment request based on completion of work", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>219</code> - Payment request for completed units (Invoice) */
  _219 ("219", "Payment request for completed units", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>261</code> - Self billed credit note (Credit Note) */
  _261 ("261", "Self billed credit note", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE),
  /** <code>262</code> - Consolidated credit note - goods and services (Credit Note) */
  _262 ("262", "Consolidated credit note - goods and services", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE),
  /** <code>295</code> - Price variation invoice (Invoice) */
  _295 ("295", "Price variation invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>296</code> - Credit note for price variation (Credit Note) */
  _296 ("296", "Credit note for price variation", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE),
  /** <code>308</code> - Delcredere credit note (Credit Note) */
  _308 ("308", "Delcredere credit note", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE),
  /** <code>325</code> - Proforma invoice (Invoice) */
  _325 ("325", "Proforma invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>326</code> - Partial invoice (Invoice) */
  _326 ("326", "Partial invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>331</code> - Commercial invoice which includes a packing list (Invoice) */
  _331 ("331", "Commercial invoice which includes a packing list", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>380</code> - Commercial invoice (Invoice) */
  _380 ("380", "Commercial invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>381</code> - Credit note (Credit Note) */
  _381 ("381", "Credit note", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE),
  /** <code>382</code> - Commission note (Invoice) */
  _382 ("382", "Commission note", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>383</code> - Debit note (Invoice) */
  _383 ("383", "Debit note", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>384</code> - Corrected invoice (Invoice) */
  _384 ("384", "Corrected invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>385</code> - Consolidated invoice (Invoice) */
  _385 ("385", "Consolidated invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>386</code> - Prepayment invoice (Invoice) */
  _386 ("386", "Prepayment invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>387</code> - Hire invoice (Invoice) */
  _387 ("387", "Hire invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>388</code> - Tax invoice (Invoice) */
  _388 ("388", "Tax invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>389</code> - Self-billed invoice (Invoice) */
  _389 ("389", "Self-billed invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>390</code> - Delcredere invoice (Invoice) */
  _390 ("390", "Delcredere invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>393</code> - Factored invoice (Invoice) */
  _393 ("393", "Factored invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>394</code> - Lease invoice (Invoice) */
  _394 ("394", "Lease invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>395</code> - Consignment invoice (Invoice) */
  _395 ("395", "Consignment invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>396</code> - Factored credit note (Credit Note) */
  _396 ("396", "Factored credit note", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE),
  /** <code>420</code> - Optical Character Reading (OCR) payment credit note (Credit Note) */
  _420 ("420", "Optical Character Reading (OCR) payment credit note", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE),
  /** <code>456</code> - Debit advice (Invoice) */
  _456 ("456", "Debit advice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>457</code> - Reversal of debit (Invoice) */
  _457 ("457", "Reversal of debit", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>458</code> - Reversal of credit (Credit Note) */
  _458 ("458", "Reversal of credit", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE),
  /** <code>471</code> - Self-billed corrective invoice, invoice type, Corrected (Invoice) */
  _471 ("471", "Self-billed corrective invoice, invoice type, Corrected", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>472</code> - Factored Corrective Invoice, invoice type, Corrected (Invoice) */
  _472 ("472", "Factored Corrective Invoice, invoice type, Corrected", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>473</code> - Self billed Factored corrective invoice, invoice type, Corrected (Invoice) */
  _473 ("473", "Self billed Factored corrective invoice, invoice type, Corrected", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>500</code> - Self Prepayment invoice, invoice type, Original (Invoice) */
  _500 ("500", "Self Prepayment invoice, invoice type, Original", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>501</code> - Self billed factored invoice, invoice type, Original (Invoice) */
  _501 ("501", "Self billed factored invoice, invoice type, Original", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>502</code> - Self billet factored Credit Note, Credit note type, Corrected (Credit Note) */
  _502 ("502", "Self billet factored Credit Note, Credit note type, Corrected", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE),
  /** <code>503</code> - Prepayment credit note, credit note type, Corrected (Credit Note) */
  _503 ("503", "Prepayment credit note, credit note type, Corrected", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE),
  /** <code>527</code> - Self billed debit note (Invoice) */
  _527 ("527", "Self billed debit note", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>532</code> - Forwarder's credit note (Credit Note) */
  _532 ("532", "Forwarder's credit note", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE),
  /** <code>553</code> - Forwarder's invoice discrepancy report (Invoice) */
  _553 ("553", "Forwarder's invoice discrepancy report", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>575</code> - Insurer's invoice (Invoice) */
  _575 ("575", "Insurer's invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>623</code> - Forwarder's invoice (Invoice) */
  _623 ("623", "Forwarder's invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>633</code> - Port charges documents (Invoice) */
  _633 ("633", "Port charges documents", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>751</code> - Invoice information for accounting purposes (Invoice) */
  _751 ("751", "Invoice information for accounting purposes", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>780</code> - Freight invoice (Invoice) */
  _780 ("780", "Freight invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>817</code> - Claim notification (Invoice) */
  _817 ("817", "Claim notification", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>870</code> - Consular invoice (Invoice) */
  _870 ("870", "Consular invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>875</code> - Partial construction invoice (Invoice) */
  _875 ("875", "Partial construction invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>876</code> - Partial final construction invoice (Invoice) */
  _876 ("876", "Partial final construction invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>877</code> - Final construction invoice (Invoice) */
  _877 ("877", "Final construction invoice", EEN16931InvoiceTypeCodeRole.INVOICE),
  /** <code>935</code> - Customs invoice (Invoice) */
  _935 ("935", "Customs invoice", EEN16931InvoiceTypeCodeRole.INVOICE);

  private static final ICommonsMap <String, EEN16931InvoiceTypeCode> MAP_BY_ID = new CommonsHashMap <> ();

  static
  {
    for (final EEN16931InvoiceTypeCode e : values ())
      MAP_BY_ID.put (e.m_sID, e);
  }

  private final String m_sID;
  private final String m_sDisplayName;
  private final EEN16931InvoiceTypeCodeRole m_eRole;

  EEN16931InvoiceTypeCode (@NonNull @Nonempty final String sID,
                           @NonNull @Nonempty final String sDisplayName,
                           @NonNull final EEN16931InvoiceTypeCodeRole eRole)
  {
    m_sID = sID;
    m_sDisplayName = sDisplayName;
    m_eRole = eRole;
  }

  /**
   * @return The code as defined by the code list. Neither <code>null</code> nor empty.
   */
  @NonNull
  @Nonempty
  public String getID ()
  {
    return m_sID;
  }

  /**
   * @return The name of the code as defined by the code list. Neither <code>null</code> nor empty.
   */
  @NonNull
  @Nonempty
  public String getDisplayName ()
  {
    return m_sDisplayName;
  }

  /**
   * @return Whether EN 16931 interprets this code as an Invoice or as a Credit Note. Never
   *         <code>null</code>.
   */
  @NonNull
  public EEN16931InvoiceTypeCodeRole getRole ()
  {
    return m_eRole;
  }

  /**
   * Find the code list entry with the provided code.
   *
   * @param sID
   *        The code to search. May be <code>null</code>.
   * @return <code>null</code> if the code list contains no such code.
   */
  @Nullable
  public static EEN16931InvoiceTypeCode getFromIDOrNull (@Nullable final String sID)
  {
    return MAP_BY_ID.get (sID);
  }

  /**
   * Check if the provided code is part of this code list.
   *
   * @param sID
   *        The code to check. May be <code>null</code>.
   * @return <code>true</code> if the code list contains the code.
   */
  public static boolean containsID (@Nullable final String sID)
  {
    return MAP_BY_ID.containsKey (sID);
  }
}
