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
 * UNTDID 7161 charge codes.
 * <p>
 * Used by BT-105 and BT-145. EN 16931 uses this code list as a full list.
 * <p>
 * Source of truth: sheet <code>Charge</code> of the EN 16931 code list workbook. The implemented
 * version of that workbook is {@link EN16931CodeLists#CODE_LIST_VERSION}, and the registry it comes
 * from is named in {@link EN16931CodeLists}.
 *
 * @author Philip Helger
 */
@CodingStyleguideUnaware
public enum EEN16931ChargeReasonCode implements IHasID <String>, IHasDisplayName
{
  /** <code>AA</code> - Advertising */
  AA ("AA", "Advertising"),
  /** <code>AAA</code> - Telecommunication */
  AAA ("AAA", "Telecommunication"),
  /** <code>AAC</code> - Technical modification */
  AAC ("AAC", "Technical modification"),
  /** <code>AAD</code> - Job-order production */
  AAD ("AAD", "Job-order production"),
  /** <code>AAE</code> - Outlays */
  AAE ("AAE", "Outlays"),
  /** <code>AAF</code> - Off-premises */
  AAF ("AAF", "Off-premises"),
  /** <code>AAH</code> - Additional processing */
  AAH ("AAH", "Additional processing"),
  /** <code>AAI</code> - Attesting */
  AAI ("AAI", "Attesting"),
  /** <code>AAS</code> - Acceptance */
  AAS ("AAS", "Acceptance"),
  /** <code>AAT</code> - Rush delivery */
  AAT ("AAT", "Rush delivery"),
  /** <code>AAV</code> - Special construction */
  AAV ("AAV", "Special construction"),
  /** <code>AAY</code> - Airport facilities */
  AAY ("AAY", "Airport facilities"),
  /** <code>AAZ</code> - Concession */
  AAZ ("AAZ", "Concession"),
  /** <code>ABA</code> - Compulsory storage */
  ABA ("ABA", "Compulsory storage"),
  /** <code>ABB</code> - Fuel removal */
  ABB ("ABB", "Fuel removal"),
  /** <code>ABC</code> - Into plane */
  ABC ("ABC", "Into plane"),
  /** <code>ABD</code> - Overtime */
  ABD ("ABD", "Overtime"),
  /** <code>ABF</code> - Tooling */
  ABF ("ABF", "Tooling"),
  /** <code>ABK</code> - Miscellaneous */
  ABK ("ABK", "Miscellaneous"),
  /** <code>ABL</code> - Additional packaging */
  ABL ("ABL", "Additional packaging"),
  /** <code>ABN</code> - Dunnage */
  ABN ("ABN", "Dunnage"),
  /** <code>ABR</code> - Containerisation */
  ABR ("ABR", "Containerisation"),
  /** <code>ABS</code> - Carton packing */
  ABS ("ABS", "Carton packing"),
  /** <code>ABT</code> - Hessian wrapped */
  ABT ("ABT", "Hessian wrapped"),
  /** <code>ABU</code> - Polyethylene wrap packing */
  ABU ("ABU", "Polyethylene wrap packing"),
  /** <code>ACF</code> - Miscellaneous treatment */
  ACF ("ACF", "Miscellaneous treatment"),
  /** <code>ACG</code> - Enamelling treatment */
  ACG ("ACG", "Enamelling treatment"),
  /** <code>ACH</code> - Heat treatment */
  ACH ("ACH", "Heat treatment"),
  /** <code>ACI</code> - Plating treatment */
  ACI ("ACI", "Plating treatment"),
  /** <code>ACJ</code> - Painting */
  ACJ ("ACJ", "Painting"),
  /** <code>ACK</code> - Polishing */
  ACK ("ACK", "Polishing"),
  /** <code>ACL</code> - Priming */
  ACL ("ACL", "Priming"),
  /** <code>ACM</code> - Preservation treatment */
  ACM ("ACM", "Preservation treatment"),
  /** <code>ACS</code> - Fitting */
  ACS ("ACS", "Fitting"),
  /** <code>ADC</code> - Consolidation */
  ADC ("ADC", "Consolidation"),
  /** <code>ADE</code> - Bill of lading */
  ADE ("ADE", "Bill of lading"),
  /** <code>ADJ</code> - Airbag */
  ADJ ("ADJ", "Airbag"),
  /** <code>ADK</code> - Transfer */
  ADK ("ADK", "Transfer"),
  /** <code>ADL</code> - Slipsheet */
  ADL ("ADL", "Slipsheet"),
  /** <code>ADM</code> - Binding */
  ADM ("ADM", "Binding"),
  /** <code>ADN</code> - Repair or replacement of broken returnable package */
  ADN ("ADN", "Repair or replacement of broken returnable package"),
  /** <code>ADO</code> - Efficient logistics */
  ADO ("ADO", "Efficient logistics"),
  /** <code>ADP</code> - Merchandising */
  ADP ("ADP", "Merchandising"),
  /** <code>ADQ</code> - Product mix */
  ADQ ("ADQ", "Product mix"),
  /** <code>ADR</code> - Other services */
  ADR ("ADR", "Other services"),
  /** <code>ADT</code> - Pick-up */
  ADT ("ADT", "Pick-up"),
  /** <code>ADW</code> - Chronic illness */
  ADW ("ADW", "Chronic illness"),
  /** <code>ADY</code> - New product introduction */
  ADY ("ADY", "New product introduction"),
  /** <code>ADZ</code> - Direct delivery */
  ADZ ("ADZ", "Direct delivery"),
  /** <code>AEA</code> - Diversion */
  AEA ("AEA", "Diversion"),
  /** <code>AEB</code> - Disconnect */
  AEB ("AEB", "Disconnect"),
  /** <code>AEC</code> - Distribution */
  AEC ("AEC", "Distribution"),
  /** <code>AED</code> - Handling of hazardous cargo */
  AED ("AED", "Handling of hazardous cargo"),
  /** <code>AEF</code> - Rents and leases */
  AEF ("AEF", "Rents and leases"),
  /** <code>AEH</code> - Location differential */
  AEH ("AEH", "Location differential"),
  /** <code>AEI</code> - Aircraft refueling */
  AEI ("AEI", "Aircraft refueling"),
  /** <code>AEJ</code> - Fuel shipped into storage */
  AEJ ("AEJ", "Fuel shipped into storage"),
  /** <code>AEK</code> - Cash on delivery */
  AEK ("AEK", "Cash on delivery"),
  /** <code>AEL</code> - Small order processing service */
  AEL ("AEL", "Small order processing service"),
  /** <code>AEM</code> - Clerical or administrative services */
  AEM ("AEM", "Clerical or administrative services"),
  /** <code>AEN</code> - Guarantee */
  AEN ("AEN", "Guarantee"),
  /** <code>AEO</code> - Collection and recycling */
  AEO ("AEO", "Collection and recycling"),
  /** <code>AEP</code> - Copyright fee collection */
  AEP ("AEP", "Copyright fee collection"),
  /** <code>AES</code> - Veterinary inspection service */
  AES ("AES", "Veterinary inspection service"),
  /** <code>AET</code> - Pensioner service */
  AET ("AET", "Pensioner service"),
  /** <code>AEU</code> - Medicine free pass holder */
  AEU ("AEU", "Medicine free pass holder"),
  /** <code>AEV</code> - Environmental protection service */
  AEV ("AEV", "Environmental protection service"),
  /** <code>AEW</code> - Environmental clean-up service */
  AEW ("AEW", "Environmental clean-up service"),
  /** <code>AEX</code> - National cheque processing service outside account area */
  AEX ("AEX", "National cheque processing service outside account area"),
  /** <code>AEY</code> - National payment service outside account area */
  AEY ("AEY", "National payment service outside account area"),
  /** <code>AEZ</code> - National payment service within account area */
  AEZ ("AEZ", "National payment service within account area"),
  /** <code>AJ</code> - Adjustments */
  AJ ("AJ", "Adjustments"),
  /** <code>AU</code> - Authentication */
  AU ("AU", "Authentication"),
  /** <code>CA</code> - Cataloguing */
  CA ("CA", "Cataloguing"),
  /** <code>CAB</code> - Cartage */
  CAB ("CAB", "Cartage"),
  /** <code>CAD</code> - Certification */
  CAD ("CAD", "Certification"),
  /** <code>CAE</code> - Certificate of conformance */
  CAE ("CAE", "Certificate of conformance"),
  /** <code>CAF</code> - Certificate of origin */
  CAF ("CAF", "Certificate of origin"),
  /** <code>CAI</code> - Cutting */
  CAI ("CAI", "Cutting"),
  /** <code>CAJ</code> - Consular service */
  CAJ ("CAJ", "Consular service"),
  /** <code>CAK</code> - Customer collection */
  CAK ("CAK", "Customer collection"),
  /** <code>CAL</code> - Payroll payment service */
  CAL ("CAL", "Payroll payment service"),
  /** <code>CAM</code> - Cash transportation */
  CAM ("CAM", "Cash transportation"),
  /** <code>CAN</code> - Home banking service */
  CAN ("CAN", "Home banking service"),
  /** <code>CAO</code> - Bilateral agreement service */
  CAO ("CAO", "Bilateral agreement service"),
  /** <code>CAP</code> - Insurance brokerage service */
  CAP ("CAP", "Insurance brokerage service"),
  /** <code>CAQ</code> - Cheque generation */
  CAQ ("CAQ", "Cheque generation"),
  /** <code>CAR</code> - Preferential merchandising location */
  CAR ("CAR", "Preferential merchandising location"),
  /** <code>CAS</code> - Crane */
  CAS ("CAS", "Crane"),
  /** <code>CAT</code> - Special colour service */
  CAT ("CAT", "Special colour service"),
  /** <code>CAU</code> - Sorting */
  CAU ("CAU", "Sorting"),
  /** <code>CAV</code> - Battery collection and recycling */
  CAV ("CAV", "Battery collection and recycling"),
  /** <code>CAW</code> - Product take back fee */
  CAW ("CAW", "Product take back fee"),
  /** <code>CAX</code> - Quality control released */
  CAX ("CAX", "Quality control released"),
  /** <code>CAY</code> - Quality control held */
  CAY ("CAY", "Quality control held"),
  /** <code>CAZ</code> - Quality control embargo */
  CAZ ("CAZ", "Quality control embargo"),
  /** <code>CD</code> - Car loading */
  CD ("CD", "Car loading"),
  /** <code>CG</code> - Cleaning */
  CG ("CG", "Cleaning"),
  /** <code>CS</code> - Cigarette stamping */
  CS ("CS", "Cigarette stamping"),
  /** <code>CT</code> - Count and recount */
  CT ("CT", "Count and recount"),
  /** <code>DAB</code> - Layout/design */
  DAB ("DAB", "Layout/design"),
  /** <code>DAC</code> - Assortment allowance */
  DAC ("DAC", "Assortment allowance"),
  /** <code>DAD</code> - Driver assigned unloading */
  DAD ("DAD", "Driver assigned unloading"),
  /** <code>DAF</code> - Debtor bound */
  DAF ("DAF", "Debtor bound"),
  /** <code>DAG</code> - Dealer allowance */
  DAG ("DAG", "Dealer allowance"),
  /** <code>DAH</code> - Allowance transferable to the consumer */
  DAH ("DAH", "Allowance transferable to the consumer"),
  /** <code>DAI</code> - Growth of business */
  DAI ("DAI", "Growth of business"),
  /** <code>DAJ</code> - Introduction allowance */
  DAJ ("DAJ", "Introduction allowance"),
  /** <code>DAK</code> - Multi-buy promotion */
  DAK ("DAK", "Multi-buy promotion"),
  /** <code>DAL</code> - Partnership */
  DAL ("DAL", "Partnership"),
  /** <code>DAM</code> - Return handling */
  DAM ("DAM", "Return handling"),
  /** <code>DAN</code> - Minimum order not fulfilled charge */
  DAN ("DAN", "Minimum order not fulfilled charge"),
  /** <code>DAO</code> - Point of sales threshold allowance */
  DAO ("DAO", "Point of sales threshold allowance"),
  /** <code>DAP</code> - Wholesaling discount */
  DAP ("DAP", "Wholesaling discount"),
  /** <code>DAQ</code> - Documentary credits transfer commission */
  DAQ ("DAQ", "Documentary credits transfer commission"),
  /** <code>DL</code> - Delivery */
  DL ("DL", "Delivery"),
  /** <code>EG</code> - Engraving */
  EG ("EG", "Engraving"),
  /** <code>EP</code> - Expediting */
  EP ("EP", "Expediting"),
  /** <code>ER</code> - Exchange rate guarantee */
  ER ("ER", "Exchange rate guarantee"),
  /** <code>FAA</code> - Fabrication */
  FAA ("FAA", "Fabrication"),
  /** <code>FAB</code> - Freight equalization */
  FAB ("FAB", "Freight equalization"),
  /** <code>FAC</code> - Freight extraordinary handling */
  FAC ("FAC", "Freight extraordinary handling"),
  /** <code>FC</code> - Freight service */
  FC ("FC", "Freight service"),
  /** <code>FH</code> - Filling/handling */
  FH ("FH", "Filling/handling"),
  /** <code>FI</code> - Financing */
  FI ("FI", "Financing"),
  /** <code>GAA</code> - Grinding */
  GAA ("GAA", "Grinding"),
  /** <code>HAA</code> - Hose */
  HAA ("HAA", "Hose"),
  /** <code>HD</code> - Handling */
  HD ("HD", "Handling"),
  /** <code>HH</code> - Hoisting and hauling */
  HH ("HH", "Hoisting and hauling"),
  /** <code>IAA</code> - Installation */
  IAA ("IAA", "Installation"),
  /** <code>IAB</code> - Installation and warranty */
  IAB ("IAB", "Installation and warranty"),
  /** <code>ID</code> - Inside delivery */
  ID ("ID", "Inside delivery"),
  /** <code>IF</code> - Inspection */
  IF ("IF", "Inspection"),
  /** <code>IR</code> - Installation and training */
  IR ("IR", "Installation and training"),
  /** <code>IS</code> - Invoicing */
  IS ("IS", "Invoicing"),
  /** <code>KO</code> - Koshering */
  KO ("KO", "Koshering"),
  /** <code>L1</code> - Carrier count */
  L1 ("L1", "Carrier count"),
  /** <code>LA</code> - Labelling */
  LA ("LA", "Labelling"),
  /** <code>LAA</code> - Labour */
  LAA ("LAA", "Labour"),
  /** <code>LAB</code> - Repair and return */
  LAB ("LAB", "Repair and return"),
  /** <code>LF</code> - Legalisation */
  LF ("LF", "Legalisation"),
  /** <code>MAE</code> - Mounting */
  MAE ("MAE", "Mounting"),
  /** <code>MI</code> - Mail invoice */
  MI ("MI", "Mail invoice"),
  /** <code>ML</code> - Mail invoice to each location */
  ML ("ML", "Mail invoice to each location"),
  /** <code>NAA</code> - Non-returnable containers */
  NAA ("NAA", "Non-returnable containers"),
  /** <code>OA</code> - Outside cable connectors */
  OA ("OA", "Outside cable connectors"),
  /** <code>PA</code> - Invoice with shipment */
  PA ("PA", "Invoice with shipment"),
  /** <code>PAA</code> - Phosphatizing (steel treatment) */
  PAA ("PAA", "Phosphatizing (steel treatment)"),
  /** <code>PC</code> - Packing */
  PC ("PC", "Packing"),
  /** <code>PL</code> - Palletizing */
  PL ("PL", "Palletizing"),
  /** <code>PRV</code> - Price variation */
  PRV ("PRV", "Price variation"),
  /** <code>RAB</code> - Repacking */
  RAB ("RAB", "Repacking"),
  /** <code>RAC</code> - Repair */
  RAC ("RAC", "Repair"),
  /** <code>RAD</code> - Returnable container */
  RAD ("RAD", "Returnable container"),
  /** <code>RAF</code> - Restocking */
  RAF ("RAF", "Restocking"),
  /** <code>RE</code> - Re-delivery */
  RE ("RE", "Re-delivery"),
  /** <code>RF</code> - Refurbishing */
  RF ("RF", "Refurbishing"),
  /** <code>RH</code> - Rail wagon hire */
  RH ("RH", "Rail wagon hire"),
  /** <code>RV</code> - Loading */
  RV ("RV", "Loading"),
  /** <code>SA</code> - Salvaging */
  SA ("SA", "Salvaging"),
  /** <code>SAA</code> - Shipping and handling */
  SAA ("SAA", "Shipping and handling"),
  /** <code>SAD</code> - Special packaging */
  SAD ("SAD", "Special packaging"),
  /** <code>SAE</code> - Stamping */
  SAE ("SAE", "Stamping"),
  /** <code>SAI</code> - Consignee unload */
  SAI ("SAI", "Consignee unload"),
  /** <code>SG</code> - Shrink-wrap */
  SG ("SG", "Shrink-wrap"),
  /** <code>SH</code> - Special handling */
  SH ("SH", "Special handling"),
  /** <code>SM</code> - Special finish */
  SM ("SM", "Special finish"),
  /** <code>SU</code> - Set-up */
  SU ("SU", "Set-up"),
  /** <code>TAB</code> - Tank renting */
  TAB ("TAB", "Tank renting"),
  /** <code>TAC</code> - Testing */
  TAC ("TAC", "Testing"),
  /** <code>TT</code> - Transportation - third party billing */
  TT ("TT", "Transportation - third party billing"),
  /** <code>TV</code> - Transportation by vendor */
  TV ("TV", "Transportation by vendor"),
  /** <code>V1</code> - Drop yard */
  V1 ("V1", "Drop yard"),
  /** <code>V2</code> - Drop dock */
  V2 ("V2", "Drop dock"),
  /** <code>WH</code> - Warehousing */
  WH ("WH", "Warehousing"),
  /** <code>XAA</code> - Combine all same day shipment */
  XAA ("XAA", "Combine all same day shipment"),
  /** <code>YY</code> - Split pick-up */
  YY ("YY", "Split pick-up"),
  /** <code>ZZZ</code> - Mutually defined */
  ZZZ ("ZZZ", "Mutually defined");

  private static final ICommonsMap <String, EEN16931ChargeReasonCode> MAP_BY_ID = new CommonsHashMap <> ();

  static
  {
    for (final EEN16931ChargeReasonCode e : values ())
      MAP_BY_ID.put (e.m_sID, e);
  }

  private final String m_sID;
  private final String m_sDisplayName;

  EEN16931ChargeReasonCode (@NonNull @Nonempty final String sID,
                            @NonNull @Nonempty final String sDisplayName)
  {
    m_sID = sID;
    m_sDisplayName = sDisplayName;
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
   * Find the code list entry with the provided code.
   *
   * @param sID
   *        The code to search. May be <code>null</code>.
   * @return <code>null</code> if the code list contains no such code.
   */
  @Nullable
  public static EEN16931ChargeReasonCode getFromIDOrNull (@Nullable final String sID)
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
