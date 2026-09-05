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
 * UNTDID 7143 item type identification codes.
 * <p>
 * Used by BT-158-1. EN 16931 uses this code list as a full list.
 * <p>
 * Source of truth: sheet <code>Item</code> of the EN 16931 code list workbook. The implemented
 * version of that workbook is {@link EN16931CodeLists#CODE_LIST_VERSION}, and the registry it comes
 * from is named in {@link EN16931CodeLists}.
 *
 * @author Philip Helger
 */
@CodingStyleguideUnaware
public enum EEN16931ItemTypeCode implements IHasID <String>, IHasDisplayName
{
  /** <code>AA</code> - Product version number */
  AA ("AA", "Product version number"),
  /** <code>AB</code> - Assembly */
  AB ("AB", "Assembly"),
  /** <code>AC</code> - HIBC (Health Industry Bar Code) */
  AC ("AC", "HIBC (Health Industry Bar Code)"),
  /** <code>AD</code> - Cold roll number */
  AD ("AD", "Cold roll number"),
  /** <code>AE</code> - Hot roll number */
  AE ("AE", "Hot roll number"),
  /** <code>AF</code> - Slab number */
  AF ("AF", "Slab number"),
  /** <code>AG</code> - Software revision number */
  AG ("AG", "Software revision number"),
  /** <code>AH</code> - UPC (Universal Product Code) Consumer package code (1-5-5) */
  AH ("AH", "UPC (Universal Product Code) Consumer package code (1-5-5)"),
  /** <code>AI</code> - UPC (Universal Product Code) Consumer package code (1-5-5- */
  AI ("AI", "UPC (Universal Product Code) Consumer package code (1-5-5-"),
  /** <code>AJ</code> - Sample number */
  AJ ("AJ", "Sample number"),
  /** <code>AK</code> - Pack number */
  AK ("AK", "Pack number"),
  /** <code>AL</code> - UPC (Universal Product Code) Shipping container code (1-2- */
  AL ("AL", "UPC (Universal Product Code) Shipping container code (1-2-"),
  /** <code>AM</code> - UPC (Universal Product Code)/EAN (European article number) */
  AM ("AM", "UPC (Universal Product Code)/EAN (European article number)"),
  /** <code>AN</code> - UPC (Universal Product Code) suffix */
  AN ("AN", "UPC (Universal Product Code) suffix"),
  /** <code>AO</code> - State label code */
  AO ("AO", "State label code"),
  /** <code>AP</code> - Heat number */
  AP ("AP", "Heat number"),
  /** <code>AQ</code> - Coupon number */
  AQ ("AQ", "Coupon number"),
  /** <code>AR</code> - Resource number */
  AR ("AR", "Resource number"),
  /** <code>AS</code> - Work task number */
  AS ("AS", "Work task number"),
  /** <code>AT</code> - Price look up number */
  AT ("AT", "Price look up number"),
  /** <code>AU</code> - NSN (North Atlantic Treaty Organization Stock Number) */
  AU ("AU", "NSN (North Atlantic Treaty Organization Stock Number)"),
  /** <code>AV</code> - Refined product code */
  AV ("AV", "Refined product code"),
  /** <code>AW</code> - Exhibit */
  AW ("AW", "Exhibit"),
  /** <code>AX</code> - End item */
  AX ("AX", "End item"),
  /** <code>AY</code> - Federal supply classification */
  AY ("AY", "Federal supply classification"),
  /** <code>AZ</code> - Engineering data list */
  AZ ("AZ", "Engineering data list"),
  /** <code>BA</code> - Milestone event number */
  BA ("BA", "Milestone event number"),
  /** <code>BB</code> - Lot number */
  BB ("BB", "Lot number"),
  /** <code>BC</code> - National drug code 4-4-2 format */
  BC ("BC", "National drug code 4-4-2 format"),
  /** <code>BD</code> - National drug code 5-3-2 format */
  BD ("BD", "National drug code 5-3-2 format"),
  /** <code>BE</code> - National drug code 5-4-1 format */
  BE ("BE", "National drug code 5-4-1 format"),
  /** <code>BF</code> - National drug code 5-4-2 format */
  BF ("BF", "National drug code 5-4-2 format"),
  /** <code>BG</code> - National drug code */
  BG ("BG", "National drug code"),
  /** <code>BH</code> - Part number */
  BH ("BH", "Part number"),
  /** <code>BI</code> - Local Stock Number (LSN) */
  BI ("BI", "Local Stock Number (LSN)"),
  /** <code>BJ</code> - Next higher assembly number */
  BJ ("BJ", "Next higher assembly number"),
  /** <code>BK</code> - Data category */
  BK ("BK", "Data category"),
  /** <code>BL</code> - Control number */
  BL ("BL", "Control number"),
  /** <code>BM</code> - Special material identification code */
  BM ("BM", "Special material identification code"),
  /** <code>BN</code> - Locally assigned control number */
  BN ("BN", "Locally assigned control number"),
  /** <code>BO</code> - Buyer's colour */
  BO ("BO", "Buyer's colour"),
  /** <code>BP</code> - Buyer's part number */
  BP ("BP", "Buyer's part number"),
  /** <code>BQ</code> - Variable measure product code */
  BQ ("BQ", "Variable measure product code"),
  /** <code>BR</code> - Financial phase */
  BR ("BR", "Financial phase"),
  /** <code>BS</code> - Contract breakdown */
  BS ("BS", "Contract breakdown"),
  /** <code>BT</code> - Technical phase */
  BT ("BT", "Technical phase"),
  /** <code>BU</code> - Dye lot number */
  BU ("BU", "Dye lot number"),
  /** <code>BV</code> - Daily statement of activities */
  BV ("BV", "Daily statement of activities"),
  /** <code>BW</code> - Periodical statement of activities within a bilaterally */
  BW ("BW", "Periodical statement of activities within a bilaterally"),
  /** <code>BX</code> - Calendar week statement of activities */
  BX ("BX", "Calendar week statement of activities"),
  /** <code>BY</code> - Calendar month statement of activities */
  BY ("BY", "Calendar month statement of activities"),
  /** <code>BZ</code> - Original equipment number */
  BZ ("BZ", "Original equipment number"),
  /** <code>CC</code> - Industry commodity code */
  CC ("CC", "Industry commodity code"),
  /** <code>CG</code> - Commodity grouping */
  CG ("CG", "Commodity grouping"),
  /** <code>CL</code> - Colour number */
  CL ("CL", "Colour number"),
  /** <code>CR</code> - Contract number */
  CR ("CR", "Contract number"),
  /** <code>CV</code> - Customs article number */
  CV ("CV", "Customs article number"),
  /** <code>DR</code> - Drawing revision number */
  DR ("DR", "Drawing revision number"),
  /** <code>DW</code> - Drawing */
  DW ("DW", "Drawing"),
  /** <code>EC</code> - Engineering change level */
  EC ("EC", "Engineering change level"),
  /** <code>EF</code> - Material code */
  EF ("EF", "Material code"),
  /** <code>EMD</code> - EMDN (European Medical Device Nomenclature) */
  EMD ("EMD", "EMDN (European Medical Device Nomenclature)"),
  /** <code>EN</code> - International Article Numbering Association (EAN) */
  EN ("EN", "International Article Numbering Association (EAN)"),
  /** <code>FS</code> - Fish species */
  FS ("FS", "Fish species"),
  /** <code>GB</code> - Buyer's internal product group code */
  GB ("GB", "Buyer's internal product group code"),
  /** <code>GMN</code> - Global model number */
  GMN ("GMN", "Global model number"),
  /** <code>GN</code> - National product group code */
  GN ("GN", "National product group code"),
  /** <code>GS</code> - General specification number */
  GS ("GS", "General specification number"),
  /** <code>HS</code> - Harmonised system */
  HS ("HS", "Harmonised system"),
  /** <code>IB</code> - ISBN (International Standard Book Number) */
  IB ("IB", "ISBN (International Standard Book Number)"),
  /** <code>IN</code> - Buyer's item number */
  IN ("IN", "Buyer's item number"),
  /** <code>IS</code> - ISSN (International Standard Serial Number) */
  IS ("IS", "ISSN (International Standard Serial Number)"),
  /** <code>IT</code> - Buyer's style number */
  IT ("IT", "Buyer's style number"),
  /** <code>IZ</code> - Buyer's size code */
  IZ ("IZ", "Buyer's size code"),
  /** <code>MA</code> - Machine number */
  MA ("MA", "Machine number"),
  /** <code>MF</code> - Manufacturer's (producer's) article number */
  MF ("MF", "Manufacturer's (producer's) article number"),
  /** <code>MN</code> - Model number */
  MN ("MN", "Model number"),
  /** <code>MP</code> - Product/service identification number */
  MP ("MP", "Product/service identification number"),
  /** <code>NB</code> - Batch number */
  NB ("NB", "Batch number"),
  /** <code>ON</code> - Customer order number */
  ON ("ON", "Customer order number"),
  /** <code>PD</code> - Part number description */
  PD ("PD", "Part number description"),
  /** <code>PL</code> - Purchaser's order line number */
  PL ("PL", "Purchaser's order line number"),
  /** <code>PO</code> - Purchase order number */
  PO ("PO", "Purchase order number"),
  /** <code>PPI</code> - Phytosanitary Passport identifier */
  PPI ("PPI", "Phytosanitary Passport identifier"),
  /** <code>PV</code> - Promotional variant number */
  PV ("PV", "Promotional variant number"),
  /** <code>QS</code> - Buyer's qualifier for size */
  QS ("QS", "Buyer's qualifier for size"),
  /** <code>RC</code> - Returnable container number */
  RC ("RC", "Returnable container number"),
  /** <code>RN</code> - Release number */
  RN ("RN", "Release number"),
  /** <code>RU</code> - Run number */
  RU ("RU", "Run number"),
  /** <code>RY</code> - Record keeping of model year */
  RY ("RY", "Record keeping of model year"),
  /** <code>SA</code> - Supplier's article number */
  SA ("SA", "Supplier's article number"),
  /** <code>SG</code> - Standard group of products (mixed assortment) */
  SG ("SG", "Standard group of products (mixed assortment)"),
  /** <code>SK</code> - SKU (Stock keeping unit) */
  SK ("SK", "SKU (Stock keeping unit)"),
  /** <code>SN</code> - Serial number */
  SN ("SN", "Serial number"),
  /** <code>SRS</code> - RSK number */
  SRS ("SRS", "RSK number"),
  /** <code>SRT</code> - IFLS (Institut Francais du Libre Service) 5 digit product */
  SRT ("SRT", "IFLS (Institut Francais du Libre Service) 5 digit product"),
  /** <code>SRU</code> - IFLS (Institut Francais du Libre Service) 9 digit product */
  SRU ("SRU", "IFLS (Institut Francais du Libre Service) 9 digit product"),
  /** <code>SRV</code> - GS1 Global Trade Item Number */
  SRV ("SRV", "GS1 Global Trade Item Number"),
  /** <code>SRW</code> - EDIS (Energy Data Identification System) */
  SRW ("SRW", "EDIS (Energy Data Identification System)"),
  /** <code>SRX</code> - Slaughter number */
  SRX ("SRX", "Slaughter number"),
  /** <code>SRY</code> - Official animal number */
  SRY ("SRY", "Official animal number"),
  /** <code>SRZ</code> - Harmonized tariff schedule */
  SRZ ("SRZ", "Harmonized tariff schedule"),
  /** <code>SS</code> - Supplier's supplier article number */
  SS ("SS", "Supplier's supplier article number"),
  /** <code>SSA</code> - 46 Level DOT Code */
  SSA ("SSA", "46 Level DOT Code"),
  /** <code>SSB</code> - Airline Tariff 6D */
  SSB ("SSB", "Airline Tariff 6D"),
  /** <code>SSC</code> - Title 49 Code of Federal Regulations */
  SSC ("SSC", "Title 49 Code of Federal Regulations"),
  /** <code>SSD</code> - International Civil Aviation Administration code */
  SSD ("SSD", "International Civil Aviation Administration code"),
  /** <code>SSE</code> - Hazardous Materials ID DOT */
  SSE ("SSE", "Hazardous Materials ID DOT"),
  /** <code>SSF</code> - Endorsement */
  SSF ("SSF", "Endorsement"),
  /** <code>SSG</code> - Air Force Regulation 71-4 */
  SSG ("SSG", "Air Force Regulation 71-4"),
  /** <code>SSH</code> - Breed */
  SSH ("SSH", "Breed"),
  /** <code>SSI</code> - Chemical Abstract Service (CAS) registry number */
  SSI ("SSI", "Chemical Abstract Service (CAS) registry number"),
  /** <code>SSJ</code> - Engine model designation */
  SSJ ("SSJ", "Engine model designation"),
  /** <code>SSK</code> - Institutional Meat Purchase Specifications (IMPS) Number */
  SSK ("SSK", "Institutional Meat Purchase Specifications (IMPS) Number"),
  /** <code>SSL</code> - Price Look-Up code (PLU) */
  SSL ("SSL", "Price Look-Up code (PLU)"),
  /** <code>SSM</code> - International Maritime Organization (IMO) Code */
  SSM ("SSM", "International Maritime Organization (IMO) Code"),
  /** <code>SSN</code> - Bureau of Explosives 600-A (rail) */
  SSN ("SSN", "Bureau of Explosives 600-A (rail)"),
  /** <code>SSO</code> - United Nations Dangerous Goods List */
  SSO ("SSO", "United Nations Dangerous Goods List"),
  /** <code>SSP</code> - International Code of Botanical Nomenclature (ICBN) */
  SSP ("SSP", "International Code of Botanical Nomenclature (ICBN)"),
  /** <code>SSQ</code> - International Code of Zoological Nomenclature (ICZN) */
  SSQ ("SSQ", "International Code of Zoological Nomenclature (ICZN)"),
  /** <code>SSR</code> - International Code of Nomenclature for Cultivated Plants */
  SSR ("SSR", "International Code of Nomenclature for Cultivated Plants"),
  /** <code>SSS</code> - Distributor’s article identifier */
  SSS ("SSS", "Distributor’s article identifier"),
  /** <code>SST</code> - Norwegian Classification system ENVA */
  SST ("SST", "Norwegian Classification system ENVA"),
  /** <code>SSU</code> - Supplier assigned classification */
  SSU ("SSU", "Supplier assigned classification"),
  /** <code>SSV</code> - Mexican classification system AMECE */
  SSV ("SSV", "Mexican classification system AMECE"),
  /** <code>SSW</code> - German classification system CCG */
  SSW ("SSW", "German classification system CCG"),
  /** <code>SSX</code> - Finnish classification system EANFIN */
  SSX ("SSX", "Finnish classification system EANFIN"),
  /** <code>SSY</code> - Canadian classification system ICC */
  SSY ("SSY", "Canadian classification system ICC"),
  /** <code>SSZ</code> - French classification system IFLS5 */
  SSZ ("SSZ", "French classification system IFLS5"),
  /** <code>ST</code> - Style number */
  ST ("ST", "Style number"),
  /** <code>STA</code> - Dutch classification system CBL */
  STA ("STA", "Dutch classification system CBL"),
  /** <code>STB</code> - Japanese classification system JICFS */
  STB ("STB", "Japanese classification system JICFS"),
  /** <code>STC</code> - European Union dairy subsidy eligibility classification */
  STC ("STC", "European Union dairy subsidy eligibility classification"),
  /** <code>STD</code> - GS1 Spain classification system */
  STD ("STD", "GS1 Spain classification system"),
  /** <code>STE</code> - GS1 Poland classification system */
  STE ("STE", "GS1 Poland classification system"),
  /** <code>STF</code> - Federal Agency on Technical Regulating and Metrology of the */
  STF ("STF", "Federal Agency on Technical Regulating and Metrology of the"),
  /** <code>STG</code> - Efficient Consumer Response (ECR) Austria classification */
  STG ("STG", "Efficient Consumer Response (ECR) Austria classification"),
  /** <code>STH</code> - GS1 Italy classification system */
  STH ("STH", "GS1 Italy classification system"),
  /** <code>STI</code> - CPV (Common Procurement Vocabulary) */
  STI ("STI", "CPV (Common Procurement Vocabulary)"),
  /** <code>STJ</code> - IFDA (International Foodservice Distributors Association) */
  STJ ("STJ", "IFDA (International Foodservice Distributors Association)"),
  /** <code>STK</code> - AHFS (American Hospital Formulary Service) pharmacologic - */
  STK ("STK", "AHFS (American Hospital Formulary Service) pharmacologic -"),
  /** <code>STL</code> - ATC (Anatomical Therapeutic Chemical) classification system */
  STL ("STL", "ATC (Anatomical Therapeutic Chemical) classification system"),
  /** <code>STM</code> - CLADIMED (Classification des Dispositifs Médicaux) */
  STM ("STM", "CLADIMED (Classification des Dispositifs Médicaux)"),
  /** <code>STN</code> - CMDR (Canadian Medical Device Regulations) classification */
  STN ("STN", "CMDR (Canadian Medical Device Regulations) classification"),
  /** <code>STO</code> - CNDM (Classificazione Nazionale dei Dispositivi Medici) */
  STO ("STO", "CNDM (Classificazione Nazionale dei Dispositivi Medici)"),
  /** <code>STP</code> - UK DM&amp;D (Dictionary of Medicines &amp; Devices) standard coding */
  STP ("STP", "UK DM&D (Dictionary of Medicines & Devices) standard coding"),
  /** <code>STQ</code> - eCl&#64;ss */
  STQ ("STQ", "eCl@ss"),
  /** <code>STR</code> - EDMA (European Diagnostic Manufacturers Association) */
  STR ("STR", "EDMA (European Diagnostic Manufacturers Association)"),
  /** <code>STS</code> - EGAR (European Generic Article Register) */
  STS ("STS", "EGAR (European Generic Article Register)"),
  /** <code>STT</code> - GMDN (Global Medical Devices Nomenclature) */
  STT ("STT", "GMDN (Global Medical Devices Nomenclature)"),
  /** <code>STU</code> - GPI (Generic Product Identifier) */
  STU ("STU", "GPI (Generic Product Identifier)"),
  /** <code>STV</code> - HCPCS (Healthcare Common Procedure Coding System) */
  STV ("STV", "HCPCS (Healthcare Common Procedure Coding System)"),
  /** <code>STW</code> - ICPS (International Classification for Patient Safety) */
  STW ("STW", "ICPS (International Classification for Patient Safety)"),
  /** <code>STX</code> - MedDRA (Medical Dictionary for Regulatory Activities) */
  STX ("STX", "MedDRA (Medical Dictionary for Regulatory Activities)"),
  /** <code>STY</code> - Medical Columbus */
  STY ("STY", "Medical Columbus"),
  /** <code>STZ</code> - NAPCS (North American Product Classification System) */
  STZ ("STZ", "NAPCS (North American Product Classification System)"),
  /** <code>SUA</code> - NHS (National Health Services) eClass */
  SUA ("SUA", "NHS (National Health Services) eClass"),
  /** <code>SUB</code> - US FDA (Food and Drug Administration) Product Code */
  SUB ("SUB", "US FDA (Food and Drug Administration) Product Code"),
  /** <code>SUC</code> - SNOMED CT (Systematized Nomenclature of Medicine-Clinical */
  SUC ("SUC", "SNOMED CT (Systematized Nomenclature of Medicine-Clinical"),
  /** <code>SUD</code> - UMDNS (Universal Medical Device Nomenclature System) */
  SUD ("SUD", "UMDNS (Universal Medical Device Nomenclature System)"),
  /** <code>SUE</code> - GS1 Global Returnable Asset Identifier, non-serialised */
  SUE ("SUE", "GS1 Global Returnable Asset Identifier, non-serialised"),
  /** <code>SUF</code> - IMEI */
  SUF ("SUF", "IMEI"),
  /** <code>SUG</code> - Waste Type (EMSA) */
  SUG ("SUG", "Waste Type (EMSA)"),
  /** <code>SUH</code> - Ship's store classification type */
  SUH ("SUH", "Ship's store classification type"),
  /** <code>SUI</code> - Emergency fire code */
  SUI ("SUI", "Emergency fire code"),
  /** <code>SUJ</code> - Emergency spillage code */
  SUJ ("SUJ", "Emergency spillage code"),
  /** <code>SUK</code> - IMDG packing group */
  SUK ("SUK", "IMDG packing group"),
  /** <code>SUL</code> - MARPOL Code IBC */
  SUL ("SUL", "MARPOL Code IBC"),
  /** <code>SUM</code> - IMDG subsidiary risk class */
  SUM ("SUM", "IMDG subsidiary risk class"),
  /** <code>TG</code> - Transport group number */
  TG ("TG", "Transport group number"),
  /** <code>TSN</code> - Taxonomic Serial Number */
  TSN ("TSN", "Taxonomic Serial Number"),
  /** <code>TSO</code> - IMDG main hazard class */
  TSO ("TSO", "IMDG main hazard class"),
  /** <code>TSP</code> - EU Combined Nomenclature */
  TSP ("TSP", "EU Combined Nomenclature"),
  /** <code>TSQ</code> - Therapeutic classification number */
  TSQ ("TSQ", "Therapeutic classification number"),
  /** <code>TSR</code> - European Waste Catalogue */
  TSR ("TSR", "European Waste Catalogue"),
  /** <code>TSS</code> - Price grouping code */
  TSS ("TSS", "Price grouping code"),
  /** <code>TST</code> - UNSPSC */
  TST ("TST", "UNSPSC"),
  /** <code>TSU</code> - EU RoHS Directive */
  TSU ("TSU", "EU RoHS Directive"),
  /** <code>UA</code> - Ultimate customer's article number */
  UA ("UA", "Ultimate customer's article number"),
  /** <code>UP</code> - UPC (Universal product code) */
  UP ("UP", "UPC (Universal product code)"),
  /** <code>VN</code> - Vendor item number */
  VN ("VN", "Vendor item number"),
  /** <code>VP</code> - Vendor's (seller's) part number */
  VP ("VP", "Vendor's (seller's) part number"),
  /** <code>VS</code> - Vendor's supplemental item number */
  VS ("VS", "Vendor's supplemental item number"),
  /** <code>VX</code> - Vendor specification number */
  VX ("VX", "Vendor specification number"),
  /** <code>ZZZ</code> - Mutually defined */
  ZZZ ("ZZZ", "Mutually defined");

  private static final ICommonsMap <String, EEN16931ItemTypeCode> MAP_BY_ID = new CommonsHashMap <> ();

  static
  {
    for (final EEN16931ItemTypeCode e : values ())
      MAP_BY_ID.put (e.m_sID, e);
  }

  private final String m_sID;
  private final String m_sDisplayName;

  EEN16931ItemTypeCode (@NonNull @Nonempty final String sID,
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
  public static EEN16931ItemTypeCode getFromIDOrNull (@Nullable final String sID)
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
