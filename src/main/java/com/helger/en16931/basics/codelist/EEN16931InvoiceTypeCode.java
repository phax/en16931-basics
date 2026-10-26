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

import java.util.Locale;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import com.helger.annotation.Nonempty;
import com.helger.annotation.misc.Translatable;
import com.helger.annotation.style.CodingStyleguideUnaware;
import com.helger.base.enforce.ValueEnforcer;
import com.helger.base.id.IHasID;
import com.helger.base.name.IHasDisplayName;
import com.helger.collection.commons.CommonsHashMap;
import com.helger.collection.commons.ICommonsMap;
import com.helger.text.IMultilingualText;
import com.helger.text.display.IHasDisplayText;
import com.helger.text.resolve.DefaultTextResolver;
import com.helger.text.util.TextHelper;

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
@Translatable
@CodingStyleguideUnaware
public enum EEN16931InvoiceTypeCode implements IHasID <String>, IHasDisplayName, IHasDisplayText
{
  /** <code>71</code> - Request for payment (Invoice) */
  _71 ("71", EEN16931InvoiceTypeCodeRole.INVOICE, "Request for payment", "Zahlungsaufforderung"),
  /** <code>80</code> - Debit note related to goods or services (Invoice) */
  _80 ("80",
       EEN16931InvoiceTypeCodeRole.INVOICE,
       "Debit note related to goods or services",
       "Belastungsanzeige für Waren oder Dienstleistungen"),
  /** <code>81</code> - Credit note related to goods or services (Credit Note) */
  _81 ("81",
       EEN16931InvoiceTypeCodeRole.CREDIT_NOTE,
       "Credit note related to goods or services",
       "Gutschriftanzeige für Waren oder Dienstleistungen"),
  /** <code>82</code> - Metered services invoice (Invoice) */
  _82 ("82",
       EEN16931InvoiceTypeCodeRole.INVOICE,
       "Metered services invoice",
       "Rechnung für gemessene Dienstleistungen"),
  /** <code>83</code> - Credit note related to financial adjustments (Credit Note) */
  _83 ("83",
       EEN16931InvoiceTypeCodeRole.CREDIT_NOTE,
       "Credit note related to financial adjustments",
       "Gutschriftanzeige für finanzielle Anpassungen"),
  /** <code>84</code> - Debit note related to financial adjustments (Invoice) */
  _84 ("84",
       EEN16931InvoiceTypeCodeRole.INVOICE,
       "Debit note related to financial adjustments",
       "Belastungsanzeige für finanzielle Anpassungen"),
  /** <code>102</code> - Tax notification (Invoice) */
  _102 ("102", EEN16931InvoiceTypeCodeRole.INVOICE, "Tax notification", "Steuerbenachrichtigung"),
  /** <code>130</code> - Invoicing data sheet (Invoice) */
  _130 ("130", EEN16931InvoiceTypeCodeRole.INVOICE, "Invoicing data sheet", "Rechnungsdatenblatt"),
  /** <code>202</code> - Direct payment valuation (Invoice) */
  _202 ("202", EEN16931InvoiceTypeCodeRole.INVOICE, "Direct payment valuation", "Bewertung einer Direktzahlung"),
  /** <code>203</code> - Provisional payment valuation (Invoice) */
  _203 ("203",
        EEN16931InvoiceTypeCodeRole.INVOICE,
        "Provisional payment valuation",
        "Bewertung einer vorläufigen Zahlung"),
  /** <code>204</code> - Payment valuation (Invoice) */
  _204 ("204", EEN16931InvoiceTypeCodeRole.INVOICE, "Payment valuation", "Zahlungsbewertung"),
  /** <code>211</code> - Interim application for payment (Invoice) */
  _211 ("211", EEN16931InvoiceTypeCodeRole.INVOICE, "Interim application for payment", "Antrag auf Abschlagszahlung"),
  /** <code>218</code> - Final payment request based on completion of work (Invoice) */
  _218 ("218",
        EEN16931InvoiceTypeCodeRole.INVOICE,
        "Final payment request based on completion of work",
        "Schlusszahlungsanforderung nach Abschluss der Arbeiten"),
  /** <code>219</code> - Payment request for completed units (Invoice) */
  _219 ("219",
        EEN16931InvoiceTypeCodeRole.INVOICE,
        "Payment request for completed units",
        "Zahlungsanforderung für fertiggestellte Einheiten"),
  /** <code>261</code> - Self billed credit note (Credit Note) */
  _261 ("261", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE, "Self billed credit note", "Selbst ausgestellte Gutschrift"),
  /** <code>262</code> - Consolidated credit note - goods and services (Credit Note) */
  _262 ("262",
        EEN16931InvoiceTypeCodeRole.CREDIT_NOTE,
        "Consolidated credit note - goods and services",
        "Sammelgutschrift für Waren und Dienstleistungen"),
  /** <code>295</code> - Price variation invoice (Invoice) */
  _295 ("295", EEN16931InvoiceTypeCodeRole.INVOICE, "Price variation invoice", "Rechnung über Preisänderung"),
  /** <code>296</code> - Credit note for price variation (Credit Note) */
  _296 ("296",
        EEN16931InvoiceTypeCodeRole.CREDIT_NOTE,
        "Credit note for price variation",
        "Gutschrift für Preisänderung"),
  /** <code>308</code> - Delcredere credit note (Credit Note) */
  _308 ("308", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE, "Delcredere credit note", "Delkredere-Gutschrift"),
  /** <code>325</code> - Proforma invoice (Invoice) */
  _325 ("325", EEN16931InvoiceTypeCodeRole.INVOICE, "Proforma invoice", "Proforma-Rechnung"),
  /** <code>326</code> - Partial invoice (Invoice) */
  _326 ("326", EEN16931InvoiceTypeCodeRole.INVOICE, "Partial invoice", "Teilrechnung"),
  /** <code>331</code> - Commercial invoice which includes a packing list (Invoice) */
  _331 ("331",
        EEN16931InvoiceTypeCodeRole.INVOICE,
        "Commercial invoice which includes a packing list",
        "Handelsrechnung mit Packliste"),
  /** <code>380</code> - Commercial invoice (Invoice) */
  _380 ("380", EEN16931InvoiceTypeCodeRole.INVOICE, "Commercial invoice", "Handelsrechnung"),
  /** <code>381</code> - Credit note (Credit Note) */
  _381 ("381", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE, "Credit note", "Gutschrift"),
  /** <code>382</code> - Commission note (Invoice) */
  _382 ("382", EEN16931InvoiceTypeCodeRole.INVOICE, "Commission note", "Provisionsabrechnung"),
  /** <code>383</code> - Debit note (Invoice) */
  _383 ("383", EEN16931InvoiceTypeCodeRole.INVOICE, "Debit note", "Belastungsanzeige"),
  /** <code>384</code> - Corrected invoice (Invoice) */
  _384 ("384", EEN16931InvoiceTypeCodeRole.INVOICE, "Corrected invoice", "Korrekturrechnung"),
  /** <code>385</code> - Consolidated invoice (Invoice) */
  _385 ("385", EEN16931InvoiceTypeCodeRole.INVOICE, "Consolidated invoice", "Sammelrechnung"),
  /** <code>386</code> - Prepayment invoice (Invoice) */
  _386 ("386", EEN16931InvoiceTypeCodeRole.INVOICE, "Prepayment invoice", "Vorauszahlungsrechnung"),
  /** <code>387</code> - Hire invoice (Invoice) */
  _387 ("387", EEN16931InvoiceTypeCodeRole.INVOICE, "Hire invoice", "Mietrechnung"),
  /** <code>388</code> - Tax invoice (Invoice) */
  _388 ("388", EEN16931InvoiceTypeCodeRole.INVOICE, "Tax invoice", "Steuerrechnung"),
  /** <code>389</code> - Self-billed invoice (Invoice) */
  _389 ("389", EEN16931InvoiceTypeCodeRole.INVOICE, "Self-billed invoice", "Selbst ausgestellte Rechnung"),
  /** <code>390</code> - Delcredere invoice (Invoice) */
  _390 ("390", EEN16931InvoiceTypeCodeRole.INVOICE, "Delcredere invoice", "Delkredere-Rechnung"),
  /** <code>393</code> - Factored invoice (Invoice) */
  _393 ("393", EEN16931InvoiceTypeCodeRole.INVOICE, "Factored invoice", "Factoring-Rechnung"),
  /** <code>394</code> - Lease invoice (Invoice) */
  _394 ("394", EEN16931InvoiceTypeCodeRole.INVOICE, "Lease invoice", "Leasingrechnung"),
  /** <code>395</code> - Consignment invoice (Invoice) */
  _395 ("395", EEN16931InvoiceTypeCodeRole.INVOICE, "Consignment invoice", "Konsignationsrechnung"),
  /** <code>396</code> - Factored credit note (Credit Note) */
  _396 ("396", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE, "Factored credit note", "Factoring-Gutschrift"),
  /** <code>420</code> - Optical Character Reading (OCR) payment credit note (Credit Note) */
  _420 ("420",
        EEN16931InvoiceTypeCodeRole.CREDIT_NOTE,
        "Optical Character Reading (OCR) payment credit note",
        "OCR-Zahlungsgutschrift (Optical Character Reading)"),
  /** <code>456</code> - Debit advice (Invoice) */
  _456 ("456", EEN16931InvoiceTypeCodeRole.INVOICE, "Debit advice", "Lastschriftanzeige"),
  /** <code>457</code> - Reversal of debit (Invoice) */
  _457 ("457", EEN16931InvoiceTypeCodeRole.INVOICE, "Reversal of debit", "Stornierung einer Belastung"),
  /** <code>458</code> - Reversal of credit (Credit Note) */
  _458 ("458", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE, "Reversal of credit", "Stornierung einer Gutschrift"),
  /** <code>471</code> - Self-billed corrective invoice, invoice type, Corrected (Invoice) */
  _471 ("471",
        EEN16931InvoiceTypeCodeRole.INVOICE,
        "Self-billed corrective invoice, invoice type, Corrected",
        "Selbst ausgestellte Korrekturrechnung, Rechnungsart: korrigiert"),
  /** <code>472</code> - Factored Corrective Invoice, invoice type, Corrected (Invoice) */
  _472 ("472",
        EEN16931InvoiceTypeCodeRole.INVOICE,
        "Factored Corrective Invoice, invoice type, Corrected",
        "Factoring-Korrekturrechnung, Rechnungsart: korrigiert"),
  /**
   * <code>473</code> - Self billed Factored corrective invoice, invoice type, Corrected (Invoice)
   */
  _473 ("473",
        EEN16931InvoiceTypeCodeRole.INVOICE,
        "Self billed Factored corrective invoice, invoice type, Corrected",
        "Selbst ausgestellte Factoring-Korrekturrechnung, Rechnungsart: korrigiert"),
  /** <code>500</code> - Self Prepayment invoice, invoice type, Original (Invoice) */
  _500 ("500",
        EEN16931InvoiceTypeCodeRole.INVOICE,
        "Self Prepayment invoice, invoice type, Original",
        "Selbst ausgestellte Vorauszahlungsrechnung, Rechnungsart: Original"),
  /** <code>501</code> - Self billed factored invoice, invoice type, Original (Invoice) */
  _501 ("501",
        EEN16931InvoiceTypeCodeRole.INVOICE,
        "Self billed factored invoice, invoice type, Original",
        "Selbst ausgestellte Factoring-Rechnung, Rechnungsart: Original"),
  /**
   * <code>502</code> - Self billet factored Credit Note, Credit note type, Corrected (Credit Note)
   */
  _502 ("502",
        EEN16931InvoiceTypeCodeRole.CREDIT_NOTE,
        "Self billet factored Credit Note, Credit note type, Corrected",
        "Selbst ausgestellte Factoring-Gutschrift, Gutschriftart: korrigiert"),
  /** <code>503</code> - Prepayment credit note, credit note type, Corrected (Credit Note) */
  _503 ("503",
        EEN16931InvoiceTypeCodeRole.CREDIT_NOTE,
        "Prepayment credit note, credit note type, Corrected",
        "Vorauszahlungsgutschrift, Gutschriftart: korrigiert"),
  /** <code>527</code> - Self billed debit note (Invoice) */
  _527 ("527", EEN16931InvoiceTypeCodeRole.INVOICE, "Self billed debit note", "Selbst ausgestellte Belastungsanzeige"),
  /** <code>532</code> - Forwarder's credit note (Credit Note) */
  _532 ("532", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE, "Forwarder's credit note", "Gutschrift des Spediteurs"),
  /** <code>553</code> - Forwarder's invoice discrepancy report (Invoice) */
  _553 ("553",
        EEN16931InvoiceTypeCodeRole.INVOICE,
        "Forwarder's invoice discrepancy report",
        "Abweichungsbericht zur Spediteurrechnung"),
  /** <code>575</code> - Insurer's invoice (Invoice) */
  _575 ("575", EEN16931InvoiceTypeCodeRole.INVOICE, "Insurer's invoice", "Rechnung des Versicherers"),
  /** <code>623</code> - Forwarder's invoice (Invoice) */
  _623 ("623", EEN16931InvoiceTypeCodeRole.INVOICE, "Forwarder's invoice", "Spediteurrechnung"),
  /** <code>633</code> - Port charges documents (Invoice) */
  _633 ("633", EEN16931InvoiceTypeCodeRole.INVOICE, "Port charges documents", "Hafengebührenbelege"),
  /** <code>751</code> - Invoice information for accounting purposes (Invoice) */
  _751 ("751",
        EEN16931InvoiceTypeCodeRole.INVOICE,
        "Invoice information for accounting purposes",
        "Rechnungsinformation für Buchhaltungszwecke"),
  /** <code>780</code> - Freight invoice (Invoice) */
  _780 ("780", EEN16931InvoiceTypeCodeRole.INVOICE, "Freight invoice", "Frachtrechnung"),
  /** <code>817</code> - Claim notification (Invoice) */
  _817 ("817", EEN16931InvoiceTypeCodeRole.INVOICE, "Claim notification", "Schadenmeldung"),
  /** <code>870</code> - Consular invoice (Invoice) */
  _870 ("870", EEN16931InvoiceTypeCodeRole.INVOICE, "Consular invoice", "Konsulatsfaktura"),
  /** <code>875</code> - Partial construction invoice (Invoice) */
  _875 ("875", EEN16931InvoiceTypeCodeRole.INVOICE, "Partial construction invoice", "Teilrechnung für Bauleistungen"),
  /** <code>876</code> - Partial final construction invoice (Invoice) */
  _876 ("876",
        EEN16931InvoiceTypeCodeRole.INVOICE,
        "Partial final construction invoice",
        "Teilschlussrechnung für Bauleistungen"),
  /** <code>877</code> - Final construction invoice (Invoice) */
  _877 ("877", EEN16931InvoiceTypeCodeRole.INVOICE, "Final construction invoice", "Schlussrechnung für Bauleistungen"),
  /** <code>935</code> - Customs invoice (Invoice) */
  _935 ("935", EEN16931InvoiceTypeCodeRole.INVOICE, "Customs invoice", "Zollrechnung");

  private static final ICommonsMap <String, EEN16931InvoiceTypeCode> MAP_BY_ID = new CommonsHashMap <> ();

  static
  {
    for (final EEN16931InvoiceTypeCode e : values ())
      MAP_BY_ID.put (e.m_sID, e);
  }

  private final String m_sID;
  private final String m_sDisplayName;
  private final IMultilingualText m_aTP;
  private final EEN16931InvoiceTypeCodeRole m_eRole;

  EEN16931InvoiceTypeCode (@NonNull @Nonempty final String sID,
                           @NonNull final EEN16931InvoiceTypeCodeRole eRole,
                           @NonNull @Nonempty final String sDisplayName,
                           @NonNull @Nonempty final String sDisplayNameDE)
  {
    m_sID = sID;
    m_sDisplayName = sDisplayName;
    m_aTP = TextHelper.create_DE_EN (sDisplayNameDE, sDisplayName);
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
   * Get the name of the code in the language of the passed locale. English is the fall back
   * language.
   *
   * @param aContentLocale
   *        The locale to use. May not be <code>null</code>.
   * @return The name in the requested language or the English name. Neither <code>null</code> nor
   *         empty.
   */
  @NonNull
  @Nonempty
  public String getDisplayText (@NonNull final Locale aContentLocale)
  {
    ValueEnforcer.notNull (aContentLocale, "ContentLocale");
    final String ret = DefaultTextResolver.getTextStatic (this, m_aTP, aContentLocale);
    return ret != null ? ret : m_sDisplayName;
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
