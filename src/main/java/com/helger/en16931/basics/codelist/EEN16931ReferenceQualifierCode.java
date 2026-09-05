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
 * UNTDID 1153 reference code qualifiers.
 * <p>
 * Used by BT-18-1 and BT-128-1. EN 16931 uses this code list as a full list.
 * <p>
 * Source of truth: sheet <code>1153</code> of the EN 16931 code list workbook. The implemented
 * version of that workbook is {@link EN16931CodeLists#CODE_LIST_VERSION}, and the registry it comes
 * from is named in {@link EN16931CodeLists}.
 *
 * @author Philip Helger
 */
@CodingStyleguideUnaware
public enum EEN16931ReferenceQualifierCode implements IHasID <String>, IHasDisplayName
{
  /** <code>AAA</code> - Order acknowledgement document identifier */
  AAA ("AAA", "Order acknowledgement document identifier"),
  /** <code>AAB</code> - Proforma invoice document identifier */
  AAB ("AAB", "Proforma invoice document identifier"),
  /** <code>AAC</code> - Documentary credit identifier */
  AAC ("AAC", "Documentary credit identifier"),
  /** <code>AAD</code> - Contract document addendum identifier */
  AAD ("AAD", "Contract document addendum identifier"),
  /** <code>AAE</code> - Goods declaration number */
  AAE ("AAE", "Goods declaration number"),
  /** <code>AAF</code> - Debit card number */
  AAF ("AAF", "Debit card number"),
  /** <code>AAG</code> - Offer number */
  AAG ("AAG", "Offer number"),
  /** <code>AAH</code> - Bank's batch interbank transaction reference number */
  AAH ("AAH", "Bank's batch interbank transaction reference number"),
  /** <code>AAI</code> - Bank's individual interbank transaction reference number */
  AAI ("AAI", "Bank's individual interbank transaction reference number"),
  /** <code>AAJ</code> - Delivery order number */
  AAJ ("AAJ", "Delivery order number"),
  /** <code>AAK</code> - Despatch advice number */
  AAK ("AAK", "Despatch advice number"),
  /** <code>AAL</code> - Drawing number */
  AAL ("AAL", "Drawing number"),
  /** <code>AAM</code> - Waybill number */
  AAM ("AAM", "Waybill number"),
  /** <code>AAN</code> - Delivery schedule number */
  AAN ("AAN", "Delivery schedule number"),
  /** <code>AAO</code> - Consignment identifier, consignee assigned */
  AAO ("AAO", "Consignment identifier, consignee assigned"),
  /** <code>AAP</code> - Partial shipment identifier */
  AAP ("AAP", "Partial shipment identifier"),
  /** <code>AAQ</code> - Transport equipment identifier */
  AAQ ("AAQ", "Transport equipment identifier"),
  /** <code>AAR</code> - Municipality assigned business registry number */
  AAR ("AAR", "Municipality assigned business registry number"),
  /** <code>AAS</code> - Transport contract document identifier */
  AAS ("AAS", "Transport contract document identifier"),
  /** <code>AAT</code> - Master label number */
  AAT ("AAT", "Master label number"),
  /** <code>AAU</code> - Despatch note document identifier */
  AAU ("AAU", "Despatch note document identifier"),
  /** <code>AAV</code> - Enquiry number */
  AAV ("AAV", "Enquiry number"),
  /** <code>AAW</code> - Docket number */
  AAW ("AAW", "Docket number"),
  /** <code>AAX</code> - Civil action number */
  AAX ("AAX", "Civil action number"),
  /** <code>AAY</code> - Carrier's agent reference number */
  AAY ("AAY", "Carrier's agent reference number"),
  /** <code>AAZ</code> - Standard Carrier Alpha Code (SCAC) number */
  AAZ ("AAZ", "Standard Carrier Alpha Code (SCAC) number"),
  /** <code>ABA</code> - Customs valuation decision number */
  ABA ("ABA", "Customs valuation decision number"),
  /** <code>ABB</code> - End use authorization number */
  ABB ("ABB", "End use authorization number"),
  /** <code>ABC</code> - Anti-dumping case number */
  ABC ("ABC", "Anti-dumping case number"),
  /** <code>ABD</code> - Customs tariff number */
  ABD ("ABD", "Customs tariff number"),
  /** <code>ABE</code> - Declarant's reference number */
  ABE ("ABE", "Declarant's reference number"),
  /** <code>ABF</code> - Repair estimate number */
  ABF ("ABF", "Repair estimate number"),
  /** <code>ABG</code> - Customs decision request number */
  ABG ("ABG", "Customs decision request number"),
  /** <code>ABH</code> - Sub-house bill of lading number */
  ABH ("ABH", "Sub-house bill of lading number"),
  /** <code>ABI</code> - Tax payment identifier */
  ABI ("ABI", "Tax payment identifier"),
  /** <code>ABJ</code> - Quota number */
  ABJ ("ABJ", "Quota number"),
  /** <code>ABK</code> - Transit (onward carriage) guarantee (bond) number */
  ABK ("ABK", "Transit (onward carriage) guarantee (bond) number"),
  /** <code>ABL</code> - Customs guarantee number */
  ABL ("ABL", "Customs guarantee number"),
  /** <code>ABM</code> - Replacing part number */
  ABM ("ABM", "Replacing part number"),
  /** <code>ABN</code> - Seller's catalogue number */
  ABN ("ABN", "Seller's catalogue number"),
  /** <code>ABO</code> - Originator's reference */
  ABO ("ABO", "Originator's reference"),
  /** <code>ABP</code> - Declarant's Customs identity number */
  ABP ("ABP", "Declarant's Customs identity number"),
  /** <code>ABQ</code> - Importer reference number */
  ABQ ("ABQ", "Importer reference number"),
  /** <code>ABR</code> - Export clearance instruction reference number */
  ABR ("ABR", "Export clearance instruction reference number"),
  /** <code>ABS</code> - Import clearance instruction reference number */
  ABS ("ABS", "Import clearance instruction reference number"),
  /** <code>ABT</code> - Goods declaration document identifier, Customs */
  ABT ("ABT", "Goods declaration document identifier, Customs"),
  /** <code>ABU</code> - Article number */
  ABU ("ABU", "Article number"),
  /** <code>ABV</code> - Intra-plant routing */
  ABV ("ABV", "Intra-plant routing"),
  /** <code>ABW</code> - Stock keeping unit number */
  ABW ("ABW", "Stock keeping unit number"),
  /** <code>ABX</code> - Text Element Identifier deletion reference */
  ABX ("ABX", "Text Element Identifier deletion reference"),
  /** <code>ABY</code> - Allotment identification (Air) */
  ABY ("ABY", "Allotment identification (Air)"),
  /** <code>ABZ</code> - Vehicle licence number */
  ABZ ("ABZ", "Vehicle licence number"),
  /** <code>AC</code> - Air cargo transfer manifest */
  AC ("AC", "Air cargo transfer manifest"),
  /** <code>ACA</code> - Cargo acceptance order reference number */
  ACA ("ACA", "Cargo acceptance order reference number"),
  /** <code>ACB</code> - US government agency number */
  ACB ("ACB", "US government agency number"),
  /** <code>ACC</code> - Shipping unit identification */
  ACC ("ACC", "Shipping unit identification"),
  /** <code>ACD</code> - Additional reference number */
  ACD ("ACD", "Additional reference number"),
  /** <code>ACE</code> - Related document number */
  ACE ("ACE", "Related document number"),
  /** <code>ACF</code> - Addressee reference */
  ACF ("ACF", "Addressee reference"),
  /** <code>ACG</code> - ATA carnet number */
  ACG ("ACG", "ATA carnet number"),
  /** <code>ACH</code> - Packaging unit identification */
  ACH ("ACH", "Packaging unit identification"),
  /** <code>ACI</code> - Outerpackaging unit identification */
  ACI ("ACI", "Outerpackaging unit identification"),
  /** <code>ACJ</code> - Customer material specification number */
  ACJ ("ACJ", "Customer material specification number"),
  /** <code>ACK</code> - Bank reference */
  ACK ("ACK", "Bank reference"),
  /** <code>ACL</code> - Principal reference number */
  ACL ("ACL", "Principal reference number"),
  /** <code>ACN</code> - Collection advice document identifier */
  ACN ("ACN", "Collection advice document identifier"),
  /** <code>ACO</code> - Iron charge number */
  ACO ("ACO", "Iron charge number"),
  /** <code>ACP</code> - Hot roll number */
  ACP ("ACP", "Hot roll number"),
  /** <code>ACQ</code> - Cold roll number */
  ACQ ("ACQ", "Cold roll number"),
  /** <code>ACR</code> - Railway wagon number */
  ACR ("ACR", "Railway wagon number"),
  /** <code>ACT</code> - Unique claims reference number of the sender */
  ACT ("ACT", "Unique claims reference number of the sender"),
  /** <code>ACU</code> - Loss/event number */
  ACU ("ACU", "Loss/event number"),
  /** <code>ACV</code> - Estimate order reference number */
  ACV ("ACV", "Estimate order reference number"),
  /** <code>ACW</code> - Reference number to previous message */
  ACW ("ACW", "Reference number to previous message"),
  /** <code>ACX</code> - Banker's acceptance */
  ACX ("ACX", "Banker's acceptance"),
  /** <code>ACY</code> - Duty memo number */
  ACY ("ACY", "Duty memo number"),
  /** <code>ACZ</code> - Equipment transport charge number */
  ACZ ("ACZ", "Equipment transport charge number"),
  /** <code>ADA</code> - Buyer's item number */
  ADA ("ADA", "Buyer's item number"),
  /** <code>ADB</code> - Matured certificate of deposit */
  ADB ("ADB", "Matured certificate of deposit"),
  /** <code>ADC</code> - Loan */
  ADC ("ADC", "Loan"),
  /** <code>ADD</code> - Analysis number/test number */
  ADD ("ADD", "Analysis number/test number"),
  /** <code>ADE</code> - Account number */
  ADE ("ADE", "Account number"),
  /** <code>ADF</code> - Treaty number */
  ADF ("ADF", "Treaty number"),
  /** <code>ADG</code> - Catastrophe number */
  ADG ("ADG", "Catastrophe number"),
  /** <code>ADI</code> - Bureau signing (statement reference) */
  ADI ("ADI", "Bureau signing (statement reference)"),
  /** <code>ADJ</code> - Company / syndicate reference 1 */
  ADJ ("ADJ", "Company / syndicate reference 1"),
  /** <code>ADK</code> - Company / syndicate reference 2 */
  ADK ("ADK", "Company / syndicate reference 2"),
  /** <code>ADL</code> - Ordering customer consignment reference number */
  ADL ("ADL", "Ordering customer consignment reference number"),
  /** <code>ADM</code> - Shipowner's authorization number */
  ADM ("ADM", "Shipowner's authorization number"),
  /** <code>ADN</code> - Inland transport order number */
  ADN ("ADN", "Inland transport order number"),
  /** <code>ADO</code> - Container work order reference number */
  ADO ("ADO", "Container work order reference number"),
  /** <code>ADP</code> - Statement number */
  ADP ("ADP", "Statement number"),
  /** <code>ADQ</code> - Unique market reference */
  ADQ ("ADQ", "Unique market reference"),
  /** <code>ADT</code> - Group accounting */
  ADT ("ADT", "Group accounting"),
  /** <code>ADU</code> - Broker reference 1 */
  ADU ("ADU", "Broker reference 1"),
  /** <code>ADV</code> - Broker reference 2 */
  ADV ("ADV", "Broker reference 2"),
  /** <code>ADW</code> - Lloyd's claims office reference */
  ADW ("ADW", "Lloyd's claims office reference"),
  /** <code>ADX</code> - Secure delivery terms and conditions agreement reference */
  ADX ("ADX", "Secure delivery terms and conditions agreement reference"),
  /** <code>ADY</code> - Report number */
  ADY ("ADY", "Report number"),
  /** <code>ADZ</code> - Trader account number */
  ADZ ("ADZ", "Trader account number"),
  /** <code>AE</code> - Authorization for expense (AFE) number */
  AE ("AE", "Authorization for expense (AFE) number"),
  /** <code>AEA</code> - Government agency reference number */
  AEA ("AEA", "Government agency reference number"),
  /** <code>AEB</code> - Assembly number */
  AEB ("AEB", "Assembly number"),
  /** <code>AEC</code> - Symbol number */
  AEC ("AEC", "Symbol number"),
  /** <code>AED</code> - Commodity number */
  AED ("AED", "Commodity number"),
  /** <code>AEE</code> - Eur 1 certificate number */
  AEE ("AEE", "Eur 1 certificate number"),
  /** <code>AEF</code> - Customer process specification number */
  AEF ("AEF", "Customer process specification number"),
  /** <code>AEG</code> - Customer specification number */
  AEG ("AEG", "Customer specification number"),
  /** <code>AEH</code> - Applicable instructions or standards */
  AEH ("AEH", "Applicable instructions or standards"),
  /** <code>AEI</code> - Registration number of previous Customs declaration */
  AEI ("AEI", "Registration number of previous Customs declaration"),
  /** <code>AEJ</code> - Post-entry reference */
  AEJ ("AEJ", "Post-entry reference"),
  /** <code>AEK</code> - Payment order number */
  AEK ("AEK", "Payment order number"),
  /** <code>AEL</code> - Delivery number (transport) */
  AEL ("AEL", "Delivery number (transport)"),
  /** <code>AEM</code> - Transport route */
  AEM ("AEM", "Transport route"),
  /** <code>AEN</code> - Customer's unit inventory number */
  AEN ("AEN", "Customer's unit inventory number"),
  /** <code>AEO</code> - Product reservation number */
  AEO ("AEO", "Product reservation number"),
  /** <code>AEP</code> - Project number */
  AEP ("AEP", "Project number"),
  /** <code>AEQ</code> - Drawing list number */
  AEQ ("AEQ", "Drawing list number"),
  /** <code>AER</code> - Project specification number */
  AER ("AER", "Project specification number"),
  /** <code>AES</code> - Primary reference */
  AES ("AES", "Primary reference"),
  /** <code>AET</code> - Request for cancellation number */
  AET ("AET", "Request for cancellation number"),
  /** <code>AEU</code> - Supplier's control number */
  AEU ("AEU", "Supplier's control number"),
  /** <code>AEV</code> - Shipping note number */
  AEV ("AEV", "Shipping note number"),
  /** <code>AEW</code> - Empty container bill number */
  AEW ("AEW", "Empty container bill number"),
  /** <code>AEX</code> - Non-negotiable maritime transport document number */
  AEX ("AEX", "Non-negotiable maritime transport document number"),
  /** <code>AEY</code> - Substitute air waybill number */
  AEY ("AEY", "Substitute air waybill number"),
  /** <code>AEZ</code> - Despatch note (post parcels) number */
  AEZ ("AEZ", "Despatch note (post parcels) number"),
  /** <code>AF</code> - Airlines flight identification number */
  AF ("AF", "Airlines flight identification number"),
  /** <code>AFA</code> - Through bill of lading number */
  AFA ("AFA", "Through bill of lading number"),
  /** <code>AFB</code> - Cargo manifest number */
  AFB ("AFB", "Cargo manifest number"),
  /** <code>AFC</code> - Bordereau number */
  AFC ("AFC", "Bordereau number"),
  /** <code>AFD</code> - Customs item number */
  AFD ("AFD", "Customs item number"),
  /** <code>AFE</code> - Export Control Commodity number (ECCN) */
  AFE ("AFE", "Export Control Commodity number (ECCN)"),
  /** <code>AFF</code> - Marking/label reference */
  AFF ("AFF", "Marking/label reference"),
  /** <code>AFG</code> - Tariff number */
  AFG ("AFG", "Tariff number"),
  /** <code>AFH</code> - Replenishment purchase order number */
  AFH ("AFH", "Replenishment purchase order number"),
  /** <code>AFI</code> - Immediate transportation no. for in bond movement */
  AFI ("AFI", "Immediate transportation no. for in bond movement"),
  /** <code>AFJ</code> - Transportation exportation no. for in bond movement */
  AFJ ("AFJ", "Transportation exportation no. for in bond movement"),
  /** <code>AFK</code> - Immediate exportation no. for in bond movement */
  AFK ("AFK", "Immediate exportation no. for in bond movement"),
  /** <code>AFL</code> - Associated invoices */
  AFL ("AFL", "Associated invoices"),
  /** <code>AFM</code> - Secondary Customs reference */
  AFM ("AFM", "Secondary Customs reference"),
  /** <code>AFN</code> - Account party's reference */
  AFN ("AFN", "Account party's reference"),
  /** <code>AFO</code> - Beneficiary's reference */
  AFO ("AFO", "Beneficiary's reference"),
  /** <code>AFP</code> - Second beneficiary's reference */
  AFP ("AFP", "Second beneficiary's reference"),
  /** <code>AFQ</code> - Applicant's bank reference */
  AFQ ("AFQ", "Applicant's bank reference"),
  /** <code>AFR</code> - Issuing bank's reference */
  AFR ("AFR", "Issuing bank's reference"),
  /** <code>AFS</code> - Beneficiary's bank reference */
  AFS ("AFS", "Beneficiary's bank reference"),
  /** <code>AFT</code> - Direct payment valuation number */
  AFT ("AFT", "Direct payment valuation number"),
  /** <code>AFU</code> - Direct payment valuation request number */
  AFU ("AFU", "Direct payment valuation request number"),
  /** <code>AFV</code> - Quantity valuation number */
  AFV ("AFV", "Quantity valuation number"),
  /** <code>AFW</code> - Quantity valuation request number */
  AFW ("AFW", "Quantity valuation request number"),
  /** <code>AFX</code> - Bill of quantities number */
  AFX ("AFX", "Bill of quantities number"),
  /** <code>AFY</code> - Payment valuation number */
  AFY ("AFY", "Payment valuation number"),
  /** <code>AFZ</code> - Situation number */
  AFZ ("AFZ", "Situation number"),
  /** <code>AGA</code> - Agreement to pay number */
  AGA ("AGA", "Agreement to pay number"),
  /** <code>AGB</code> - Contract party reference number */
  AGB ("AGB", "Contract party reference number"),
  /** <code>AGC</code> - Account party's bank reference */
  AGC ("AGC", "Account party's bank reference"),
  /** <code>AGD</code> - Agent's bank reference */
  AGD ("AGD", "Agent's bank reference"),
  /** <code>AGE</code> - Agent's reference */
  AGE ("AGE", "Agent's reference"),
  /** <code>AGF</code> - Applicant's reference */
  AGF ("AGF", "Applicant's reference"),
  /** <code>AGG</code> - Dispute number */
  AGG ("AGG", "Dispute number"),
  /** <code>AGH</code> - Credit rating agency's reference number */
  AGH ("AGH", "Credit rating agency's reference number"),
  /** <code>AGI</code> - Request number */
  AGI ("AGI", "Request number"),
  /** <code>AGJ</code> - Single transaction sequence number */
  AGJ ("AGJ", "Single transaction sequence number"),
  /** <code>AGK</code> - Application reference number */
  AGK ("AGK", "Application reference number"),
  /** <code>AGL</code> - Delivery verification certificate */
  AGL ("AGL", "Delivery verification certificate"),
  /** <code>AGM</code> - Number of temporary importation document */
  AGM ("AGM", "Number of temporary importation document"),
  /** <code>AGN</code> - Reference number quoted on statement */
  AGN ("AGN", "Reference number quoted on statement"),
  /** <code>AGO</code> - Sender's reference to the original message */
  AGO ("AGO", "Sender's reference to the original message"),
  /** <code>AGP</code> - Company issued equipment ID */
  AGP ("AGP", "Company issued equipment ID"),
  /** <code>AGQ</code> - Domestic flight number */
  AGQ ("AGQ", "Domestic flight number"),
  /** <code>AGR</code> - International flight number */
  AGR ("AGR", "International flight number"),
  /** <code>AGS</code> - Employer identification number of service bureau */
  AGS ("AGS", "Employer identification number of service bureau"),
  /** <code>AGT</code> - Service group identification number */
  AGT ("AGT", "Service group identification number"),
  /** <code>AGU</code> - Member number */
  AGU ("AGU", "Member number"),
  /** <code>AGV</code> - Previous member number */
  AGV ("AGV", "Previous member number"),
  /** <code>AGW</code> - Scheme/plan number */
  AGW ("AGW", "Scheme/plan number"),
  /** <code>AGX</code> - Previous scheme/plan number */
  AGX ("AGX", "Previous scheme/plan number"),
  /** <code>AGY</code> - Receiving party's member identification */
  AGY ("AGY", "Receiving party's member identification"),
  /** <code>AGZ</code> - Payroll number */
  AGZ ("AGZ", "Payroll number"),
  /** <code>AHA</code> - Packaging specification number */
  AHA ("AHA", "Packaging specification number"),
  /** <code>AHB</code> - Authority issued equipment identification */
  AHB ("AHB", "Authority issued equipment identification"),
  /** <code>AHC</code> - Training flight number */
  AHC ("AHC", "Training flight number"),
  /** <code>AHD</code> - Fund code number */
  AHD ("AHD", "Fund code number"),
  /** <code>AHE</code> - Signal code number */
  AHE ("AHE", "Signal code number"),
  /** <code>AHF</code> - Major force program number */
  AHF ("AHF", "Major force program number"),
  /** <code>AHG</code> - Nomination number */
  AHG ("AHG", "Nomination number"),
  /** <code>AHH</code> - Laboratory registration number */
  AHH ("AHH", "Laboratory registration number"),
  /** <code>AHI</code> - Transport contract reference number */
  AHI ("AHI", "Transport contract reference number"),
  /** <code>AHJ</code> - Payee's reference number */
  AHJ ("AHJ", "Payee's reference number"),
  /** <code>AHK</code> - Payer's reference number */
  AHK ("AHK", "Payer's reference number"),
  /** <code>AHL</code> - Creditor's reference number */
  AHL ("AHL", "Creditor's reference number"),
  /** <code>AHM</code> - Debtor's reference number */
  AHM ("AHM", "Debtor's reference number"),
  /** <code>AHN</code> - Joint venture reference number */
  AHN ("AHN", "Joint venture reference number"),
  /** <code>AHO</code> - Chamber of Commerce registration number */
  AHO ("AHO", "Chamber of Commerce registration number"),
  /** <code>AHP</code> - Tax registration number */
  AHP ("AHP", "Tax registration number"),
  /** <code>AHQ</code> - Wool identification number */
  AHQ ("AHQ", "Wool identification number"),
  /** <code>AHR</code> - Wool tax reference number */
  AHR ("AHR", "Wool tax reference number"),
  /** <code>AHS</code> - Meat processing establishment registration number */
  AHS ("AHS", "Meat processing establishment registration number"),
  /** <code>AHT</code> - Quarantine/treatment status reference number */
  AHT ("AHT", "Quarantine/treatment status reference number"),
  /** <code>AHU</code> - Request for quote number */
  AHU ("AHU", "Request for quote number"),
  /** <code>AHV</code> - Manual processing authority number */
  AHV ("AHV", "Manual processing authority number"),
  /** <code>AHX</code> - Rate note number */
  AHX ("AHX", "Rate note number"),
  /** <code>AHY</code> - Freight Forwarder number */
  AHY ("AHY", "Freight Forwarder number"),
  /** <code>AHZ</code> - Customs release code */
  AHZ ("AHZ", "Customs release code"),
  /** <code>AIA</code> - Compliance code number */
  AIA ("AIA", "Compliance code number"),
  /** <code>AIB</code> - Department of transportation bond number */
  AIB ("AIB", "Department of transportation bond number"),
  /** <code>AIC</code> - Export establishment number */
  AIC ("AIC", "Export establishment number"),
  /** <code>AID</code> - Certificate of conformity */
  AID ("AID", "Certificate of conformity"),
  /** <code>AIE</code> - Ministerial certificate of homologation */
  AIE ("AIE", "Ministerial certificate of homologation"),
  /** <code>AIF</code> - Previous delivery instruction number */
  AIF ("AIF", "Previous delivery instruction number"),
  /** <code>AIG</code> - Passport number */
  AIG ("AIG", "Passport number"),
  /** <code>AIH</code> - Common transaction reference number */
  AIH ("AIH", "Common transaction reference number"),
  /** <code>AII</code> - Bank's common transaction reference number */
  AII ("AII", "Bank's common transaction reference number"),
  /** <code>AIJ</code> - Customer's individual transaction reference number */
  AIJ ("AIJ", "Customer's individual transaction reference number"),
  /** <code>AIK</code> - Bank's individual transaction reference number */
  AIK ("AIK", "Bank's individual transaction reference number"),
  /** <code>AIL</code> - Customer's common transaction reference number */
  AIL ("AIL", "Customer's common transaction reference number"),
  /** <code>AIM</code> - Individual transaction reference number */
  AIM ("AIM", "Individual transaction reference number"),
  /** <code>AIN</code> - Product sourcing agreement number */
  AIN ("AIN", "Product sourcing agreement number"),
  /** <code>AIO</code> - Customs transhipment number */
  AIO ("AIO", "Customs transhipment number"),
  /** <code>AIP</code> - Customs preference inquiry number */
  AIP ("AIP", "Customs preference inquiry number"),
  /** <code>AIQ</code> - Packing plant number */
  AIQ ("AIQ", "Packing plant number"),
  /** <code>AIR</code> - Original certificate number */
  AIR ("AIR", "Original certificate number"),
  /** <code>AIS</code> - Processing plant number */
  AIS ("AIS", "Processing plant number"),
  /** <code>AIT</code> - Slaughter plant number */
  AIT ("AIT", "Slaughter plant number"),
  /** <code>AIU</code> - Charge card account number */
  AIU ("AIU", "Charge card account number"),
  /** <code>AIV</code> - Event reference number */
  AIV ("AIV", "Event reference number"),
  /** <code>AIW</code> - Transport section reference number */
  AIW ("AIW", "Transport section reference number"),
  /** <code>AIX</code> - Referred product for mechanical analysis */
  AIX ("AIX", "Referred product for mechanical analysis"),
  /** <code>AIY</code> - Referred product for chemical analysis */
  AIY ("AIY", "Referred product for chemical analysis"),
  /** <code>AIZ</code> - Consolidated invoice number */
  AIZ ("AIZ", "Consolidated invoice number"),
  /** <code>AJA</code> - Part reference indicator in a drawing */
  AJA ("AJA", "Part reference indicator in a drawing"),
  /** <code>AJB</code> - U.S. Code of Federal Regulations (CFR) */
  AJB ("AJB", "U.S. Code of Federal Regulations (CFR)"),
  /** <code>AJC</code> - Purchasing activity clause number */
  AJC ("AJC", "Purchasing activity clause number"),
  /** <code>AJD</code> - U.S. Defense Federal Acquisition Regulation Supplement */
  AJD ("AJD", "U.S. Defense Federal Acquisition Regulation Supplement"),
  /** <code>AJE</code> - Agency clause number */
  AJE ("AJE", "Agency clause number"),
  /** <code>AJF</code> - Circular publication number */
  AJF ("AJF", "Circular publication number"),
  /** <code>AJG</code> - U.S. Federal Acquisition Regulation */
  AJG ("AJG", "U.S. Federal Acquisition Regulation"),
  /** <code>AJH</code> - U.S. General Services Administration Regulation */
  AJH ("AJH", "U.S. General Services Administration Regulation"),
  /** <code>AJI</code> - U.S. Federal Information Resources Management Regulation */
  AJI ("AJI", "U.S. Federal Information Resources Management Regulation"),
  /** <code>AJJ</code> - Paragraph */
  AJJ ("AJJ", "Paragraph"),
  /** <code>AJK</code> - Special instructions number */
  AJK ("AJK", "Special instructions number"),
  /** <code>AJL</code> - Site specific procedures, terms, and conditions number */
  AJL ("AJL", "Site specific procedures, terms, and conditions number"),
  /** <code>AJM</code> - Master solicitation procedures, terms, and conditions */
  AJM ("AJM", "Master solicitation procedures, terms, and conditions"),
  /** <code>AJN</code> - U.S. Department of Veterans Affairs Acquisition Regulation */
  AJN ("AJN", "U.S. Department of Veterans Affairs Acquisition Regulation"),
  /** <code>AJO</code> - Military Interdepartmental Purchase Request (MIPR) number */
  AJO ("AJO", "Military Interdepartmental Purchase Request (MIPR) number"),
  /** <code>AJP</code> - Foreign military sales number */
  AJP ("AJP", "Foreign military sales number"),
  /** <code>AJQ</code> - Defense priorities allocation system priority rating */
  AJQ ("AJQ", "Defense priorities allocation system priority rating"),
  /** <code>AJR</code> - Wage determination number */
  AJR ("AJR", "Wage determination number"),
  /** <code>AJS</code> - Agreement number */
  AJS ("AJS", "Agreement number"),
  /** <code>AJT</code> - Standard Industry Classification (SIC) number */
  AJT ("AJT", "Standard Industry Classification (SIC) number"),
  /** <code>AJU</code> - End item number */
  AJU ("AJU", "End item number"),
  /** <code>AJV</code> - Federal supply schedule item number */
  AJV ("AJV", "Federal supply schedule item number"),
  /** <code>AJW</code> - Technical document number */
  AJW ("AJW", "Technical document number"),
  /** <code>AJX</code> - Technical order number */
  AJX ("AJX", "Technical order number"),
  /** <code>AJY</code> - Suffix */
  AJY ("AJY", "Suffix"),
  /** <code>AJZ</code> - Transportation account number */
  AJZ ("AJZ", "Transportation account number"),
  /** <code>AKA</code> - Container disposition order reference number */
  AKA ("AKA", "Container disposition order reference number"),
  /** <code>AKB</code> - Container prefix */
  AKB ("AKB", "Container prefix"),
  /** <code>AKC</code> - Transport equipment return reference */
  AKC ("AKC", "Transport equipment return reference"),
  /** <code>AKD</code> - Transport equipment survey reference */
  AKD ("AKD", "Transport equipment survey reference"),
  /** <code>AKE</code> - Transport equipment survey report number */
  AKE ("AKE", "Transport equipment survey report number"),
  /** <code>AKF</code> - Transport equipment stuffing order */
  AKF ("AKF", "Transport equipment stuffing order"),
  /** <code>AKG</code> - Vehicle Identification Number (VIN) */
  AKG ("AKG", "Vehicle Identification Number (VIN)"),
  /** <code>AKH</code> - Government bill of lading */
  AKH ("AKH", "Government bill of lading"),
  /** <code>AKI</code> - Ordering customer's second reference number */
  AKI ("AKI", "Ordering customer's second reference number"),
  /** <code>AKJ</code> - Direct debit reference */
  AKJ ("AKJ", "Direct debit reference"),
  /** <code>AKK</code> - Meter reading at the beginning of the delivery */
  AKK ("AKK", "Meter reading at the beginning of the delivery"),
  /** <code>AKL</code> - Meter reading at the end of delivery */
  AKL ("AKL", "Meter reading at the end of delivery"),
  /** <code>AKM</code> - Replenishment purchase order range start number */
  AKM ("AKM", "Replenishment purchase order range start number"),
  /** <code>AKN</code> - Third bank's reference */
  AKN ("AKN", "Third bank's reference"),
  /** <code>AKO</code> - Action authorization number */
  AKO ("AKO", "Action authorization number"),
  /** <code>AKP</code> - Appropriation number */
  AKP ("AKP", "Appropriation number"),
  /** <code>AKQ</code> - Product change authority number */
  AKQ ("AKQ", "Product change authority number"),
  /** <code>AKR</code> - General cargo consignment reference number */
  AKR ("AKR", "General cargo consignment reference number"),
  /** <code>AKS</code> - Catalogue sequence number */
  AKS ("AKS", "Catalogue sequence number"),
  /** <code>AKT</code> - Forwarding order number */
  AKT ("AKT", "Forwarding order number"),
  /** <code>AKU</code> - Transport equipment survey reference number */
  AKU ("AKU", "Transport equipment survey reference number"),
  /** <code>AKV</code> - Lease contract reference */
  AKV ("AKV", "Lease contract reference"),
  /** <code>AKW</code> - Transport costs reference number */
  AKW ("AKW", "Transport costs reference number"),
  /** <code>AKX</code> - Transport equipment stripping order */
  AKX ("AKX", "Transport equipment stripping order"),
  /** <code>AKY</code> - Prior policy number */
  AKY ("AKY", "Prior policy number"),
  /** <code>AKZ</code> - Policy number */
  AKZ ("AKZ", "Policy number"),
  /** <code>ALA</code> - Procurement budget number */
  ALA ("ALA", "Procurement budget number"),
  /** <code>ALB</code> - Domestic inventory management code */
  ALB ("ALB", "Domestic inventory management code"),
  /** <code>ALC</code> - Customer reference number assigned to previous balance of */
  ALC ("ALC", "Customer reference number assigned to previous balance of"),
  /** <code>ALD</code> - Previous credit advice reference number */
  ALD ("ALD", "Previous credit advice reference number"),
  /** <code>ALE</code> - Reporting form number */
  ALE ("ALE", "Reporting form number"),
  /** <code>ALF</code> - Authorization number for exception to dangerous goods */
  ALF ("ALF", "Authorization number for exception to dangerous goods"),
  /** <code>ALG</code> - Dangerous goods security number */
  ALG ("ALG", "Dangerous goods security number"),
  /** <code>ALH</code> - Dangerous goods transport licence number */
  ALH ("ALH", "Dangerous goods transport licence number"),
  /** <code>ALI</code> - Previous rental agreement number */
  ALI ("ALI", "Previous rental agreement number"),
  /** <code>ALJ</code> - Next rental agreement reason number */
  ALJ ("ALJ", "Next rental agreement reason number"),
  /** <code>ALK</code> - Consignee's invoice number */
  ALK ("ALK", "Consignee's invoice number"),
  /** <code>ALL</code> - Message batch number */
  ALL ("ALL", "Message batch number"),
  /** <code>ALM</code> - Previous delivery schedule number */
  ALM ("ALM", "Previous delivery schedule number"),
  /** <code>ALN</code> - Physical inventory recount reference number */
  ALN ("ALN", "Physical inventory recount reference number"),
  /** <code>ALO</code> - Receiving advice number */
  ALO ("ALO", "Receiving advice number"),
  /** <code>ALP</code> - Returnable container reference number */
  ALP ("ALP", "Returnable container reference number"),
  /** <code>ALQ</code> - Returns notice number */
  ALQ ("ALQ", "Returns notice number"),
  /** <code>ALR</code> - Sales forecast number */
  ALR ("ALR", "Sales forecast number"),
  /** <code>ALS</code> - Sales report number */
  ALS ("ALS", "Sales report number"),
  /** <code>ALT</code> - Previous tax control number */
  ALT ("ALT", "Previous tax control number"),
  /** <code>ALU</code> - AGERD (Aerospace Ground Equipment Requirement Data) number */
  ALU ("ALU", "AGERD (Aerospace Ground Equipment Requirement Data) number"),
  /** <code>ALV</code> - Registered capital reference */
  ALV ("ALV", "Registered capital reference"),
  /** <code>ALW</code> - Standard number of inspection document */
  ALW ("ALW", "Standard number of inspection document"),
  /** <code>ALX</code> - Model */
  ALX ("ALX", "Model"),
  /** <code>ALY</code> - Financial management reference */
  ALY ("ALY", "Financial management reference"),
  /** <code>ALZ</code> - NOTIfication for COLlection number (NOTICOL) */
  ALZ ("ALZ", "NOTIfication for COLlection number (NOTICOL)"),
  /** <code>AMA</code> - Previous request for metered reading reference number */
  AMA ("AMA", "Previous request for metered reading reference number"),
  /** <code>AMB</code> - Next rental agreement number */
  AMB ("AMB", "Next rental agreement number"),
  /** <code>AMC</code> - Reference number of a request for metered reading */
  AMC ("AMC", "Reference number of a request for metered reading"),
  /** <code>AMD</code> - Hastening number */
  AMD ("AMD", "Hastening number"),
  /** <code>AME</code> - Repair data request number */
  AME ("AME", "Repair data request number"),
  /** <code>AMF</code> - Consumption data request number */
  AMF ("AMF", "Consumption data request number"),
  /** <code>AMG</code> - Profile number */
  AMG ("AMG", "Profile number"),
  /** <code>AMH</code> - Case number */
  AMH ("AMH", "Case number"),
  /** <code>AMI</code> - Government quality assurance and control level Number */
  AMI ("AMI", "Government quality assurance and control level Number"),
  /** <code>AMJ</code> - Payment plan reference */
  AMJ ("AMJ", "Payment plan reference"),
  /** <code>AMK</code> - Replaced meter unit number */
  AMK ("AMK", "Replaced meter unit number"),
  /** <code>AML</code> - Replenishment purchase order range end number */
  AML ("AML", "Replenishment purchase order range end number"),
  /** <code>AMM</code> - Insurer assigned reference number */
  AMM ("AMM", "Insurer assigned reference number"),
  /** <code>AMN</code> - Canadian excise entry number */
  AMN ("AMN", "Canadian excise entry number"),
  /** <code>AMO</code> - Premium rate table */
  AMO ("AMO", "Premium rate table"),
  /** <code>AMP</code> - Advise through bank's reference */
  AMP ("AMP", "Advise through bank's reference"),
  /** <code>AMQ</code> - US, Department of Transportation bond surety code */
  AMQ ("AMQ", "US, Department of Transportation bond surety code"),
  /** <code>AMR</code> - US, Food and Drug Administration establishment indicator */
  AMR ("AMR", "US, Food and Drug Administration establishment indicator"),
  /** <code>AMS</code> - US, Federal Communications Commission (FCC) import */
  AMS ("AMS", "US, Federal Communications Commission (FCC) import"),
  /** <code>AMT</code> - Goods and Services Tax identification number */
  AMT ("AMT", "Goods and Services Tax identification number"),
  /** <code>AMU</code> - Integrated logistic support cross reference number */
  AMU ("AMU", "Integrated logistic support cross reference number"),
  /** <code>AMV</code> - Department number */
  AMV ("AMV", "Department number"),
  /** <code>AMW</code> - Buyer's catalogue number */
  AMW ("AMW", "Buyer's catalogue number"),
  /** <code>AMX</code> - Financial settlement party's reference number */
  AMX ("AMX", "Financial settlement party's reference number"),
  /** <code>AMY</code> - Standard's version number */
  AMY ("AMY", "Standard's version number"),
  /** <code>AMZ</code> - Pipeline number */
  AMZ ("AMZ", "Pipeline number"),
  /** <code>ANA</code> - Account servicing bank's reference number */
  ANA ("ANA", "Account servicing bank's reference number"),
  /** <code>ANB</code> - Completed units payment request reference */
  ANB ("ANB", "Completed units payment request reference"),
  /** <code>ANC</code> - Payment in advance request reference */
  ANC ("ANC", "Payment in advance request reference"),
  /** <code>AND</code> - Parent file */
  AND ("AND", "Parent file"),
  /** <code>ANE</code> - Sub file */
  ANE ("ANE", "Sub file"),
  /** <code>ANF</code> - CAD file layer convention */
  ANF ("ANF", "CAD file layer convention"),
  /** <code>ANG</code> - Technical regulation */
  ANG ("ANG", "Technical regulation"),
  /** <code>ANH</code> - Plot file */
  ANH ("ANH", "Plot file"),
  /** <code>ANI</code> - File conversion journal */
  ANI ("ANI", "File conversion journal"),
  /** <code>ANJ</code> - Authorization number */
  ANJ ("ANJ", "Authorization number"),
  /** <code>ANK</code> - Reference number assigned by third party */
  ANK ("ANK", "Reference number assigned by third party"),
  /** <code>ANL</code> - Deposit reference number */
  ANL ("ANL", "Deposit reference number"),
  /** <code>ANM</code> - Named bank's reference */
  ANM ("ANM", "Named bank's reference"),
  /** <code>ANN</code> - Drawee's reference */
  ANN ("ANN", "Drawee's reference"),
  /** <code>ANO</code> - Case of need party's reference */
  ANO ("ANO", "Case of need party's reference"),
  /** <code>ANP</code> - Collecting bank's reference */
  ANP ("ANP", "Collecting bank's reference"),
  /** <code>ANQ</code> - Remitting bank's reference */
  ANQ ("ANQ", "Remitting bank's reference"),
  /** <code>ANR</code> - Principal's bank reference */
  ANR ("ANR", "Principal's bank reference"),
  /** <code>ANS</code> - Presenting bank's reference */
  ANS ("ANS", "Presenting bank's reference"),
  /** <code>ANT</code> - Consignee's reference */
  ANT ("ANT", "Consignee's reference"),
  /** <code>ANU</code> - Financial transaction reference number */
  ANU ("ANU", "Financial transaction reference number"),
  /** <code>ANV</code> - Credit reference number */
  ANV ("ANV", "Credit reference number"),
  /** <code>ANW</code> - Receiving bank's authorization number */
  ANW ("ANW", "Receiving bank's authorization number"),
  /** <code>ANX</code> - Clearing reference */
  ANX ("ANX", "Clearing reference"),
  /** <code>ANY</code> - Sending bank's reference number */
  ANY ("ANY", "Sending bank's reference number"),
  /** <code>AOA</code> - Documentary payment reference */
  AOA ("AOA", "Documentary payment reference"),
  /** <code>AOD</code> - Accounting file reference */
  AOD ("AOD", "Accounting file reference"),
  /** <code>AOE</code> - Sender's file reference number */
  AOE ("AOE", "Sender's file reference number"),
  /** <code>AOF</code> - Receiver's file reference number */
  AOF ("AOF", "Receiver's file reference number"),
  /** <code>AOG</code> - Source document internal reference */
  AOG ("AOG", "Source document internal reference"),
  /** <code>AOH</code> - Principal's reference */
  AOH ("AOH", "Principal's reference"),
  /** <code>AOI</code> - Debit reference number */
  AOI ("AOI", "Debit reference number"),
  /** <code>AOJ</code> - Calendar */
  AOJ ("AOJ", "Calendar"),
  /** <code>AOK</code> - Work shift */
  AOK ("AOK", "Work shift"),
  /** <code>AOL</code> - Work breakdown structure */
  AOL ("AOL", "Work breakdown structure"),
  /** <code>AOM</code> - Organisation breakdown structure */
  AOM ("AOM", "Organisation breakdown structure"),
  /** <code>AON</code> - Work task charge number */
  AON ("AON", "Work task charge number"),
  /** <code>AOO</code> - Functional work group */
  AOO ("AOO", "Functional work group"),
  /** <code>AOP</code> - Work team */
  AOP ("AOP", "Work team"),
  /** <code>AOQ</code> - Department */
  AOQ ("AOQ", "Department"),
  /** <code>AOR</code> - Statement of work */
  AOR ("AOR", "Statement of work"),
  /** <code>AOS</code> - Work package */
  AOS ("AOS", "Work package"),
  /** <code>AOT</code> - Planning package */
  AOT ("AOT", "Planning package"),
  /** <code>AOU</code> - Cost account */
  AOU ("AOU", "Cost account"),
  /** <code>AOV</code> - Work order */
  AOV ("AOV", "Work order"),
  /** <code>AOW</code> - Transportation Control Number (TCN) */
  AOW ("AOW", "Transportation Control Number (TCN)"),
  /** <code>AOX</code> - Constraint notation */
  AOX ("AOX", "Constraint notation"),
  /** <code>AOY</code> - ETERMS reference */
  AOY ("AOY", "ETERMS reference"),
  /** <code>AOZ</code> - Implementation version number */
  AOZ ("AOZ", "Implementation version number"),
  /** <code>AP</code> - Accounts receivable number */
  AP ("AP", "Accounts receivable number"),
  /** <code>APA</code> - Incorporated legal reference */
  APA ("APA", "Incorporated legal reference"),
  /** <code>APB</code> - Payment instalment reference number */
  APB ("APB", "Payment instalment reference number"),
  /** <code>APC</code> - Equipment owner reference number */
  APC ("APC", "Equipment owner reference number"),
  /** <code>APD</code> - Cedent's claim number */
  APD ("APD", "Cedent's claim number"),
  /** <code>APE</code> - Reinsurer's claim number */
  APE ("APE", "Reinsurer's claim number"),
  /** <code>APF</code> - Price/sales catalogue response reference number */
  APF ("APF", "Price/sales catalogue response reference number"),
  /** <code>APG</code> - General purpose message reference number */
  APG ("APG", "General purpose message reference number"),
  /** <code>APH</code> - Invoicing data sheet reference number */
  APH ("APH", "Invoicing data sheet reference number"),
  /** <code>API</code> - Inventory report reference number */
  API ("API", "Inventory report reference number"),
  /** <code>APJ</code> - Ceiling formula reference number */
  APJ ("APJ", "Ceiling formula reference number"),
  /** <code>APK</code> - Price variation formula reference number */
  APK ("APK", "Price variation formula reference number"),
  /** <code>APL</code> - Reference to account servicing bank's message */
  APL ("APL", "Reference to account servicing bank's message"),
  /** <code>APM</code> - Party sequence number */
  APM ("APM", "Party sequence number"),
  /** <code>APN</code> - Purchaser's request reference */
  APN ("APN", "Purchaser's request reference"),
  /** <code>APO</code> - Contractor request reference */
  APO ("APO", "Contractor request reference"),
  /** <code>APP</code> - Accident reference number */
  APP ("APP", "Accident reference number"),
  /** <code>APQ</code> - Commercial account summary reference number */
  APQ ("APQ", "Commercial account summary reference number"),
  /** <code>APR</code> - Contract breakdown reference */
  APR ("APR", "Contract breakdown reference"),
  /** <code>APS</code> - Contractor registration number */
  APS ("APS", "Contractor registration number"),
  /** <code>APT</code> - Applicable coefficient identification number */
  APT ("APT", "Applicable coefficient identification number"),
  /** <code>APU</code> - Special budget account number */
  APU ("APU", "Special budget account number"),
  /** <code>APV</code> - Authorisation for repair reference */
  APV ("APV", "Authorisation for repair reference"),
  /** <code>APW</code> - Manufacturer defined repair rates reference */
  APW ("APW", "Manufacturer defined repair rates reference"),
  /** <code>APX</code> - Original submitter log number */
  APX ("APX", "Original submitter log number"),
  /** <code>APY</code> - Original submitter, parent Data Maintenance Request (DMR) */
  APY ("APY", "Original submitter, parent Data Maintenance Request (DMR)"),
  /** <code>APZ</code> - Original submitter, child Data Maintenance Request (DMR) */
  APZ ("APZ", "Original submitter, child Data Maintenance Request (DMR)"),
  /** <code>AQA</code> - Entry point assessment log number */
  AQA ("AQA", "Entry point assessment log number"),
  /** <code>AQB</code> - Entry point assessment log number, parent DMR */
  AQB ("AQB", "Entry point assessment log number, parent DMR"),
  /** <code>AQC</code> - Entry point assessment log number, child DMR */
  AQC ("AQC", "Entry point assessment log number, child DMR"),
  /** <code>AQD</code> - Data structure tag */
  AQD ("AQD", "Data structure tag"),
  /** <code>AQE</code> - Central secretariat log number */
  AQE ("AQE", "Central secretariat log number"),
  /** <code>AQF</code> - Central secretariat log number, parent Data Maintenance */
  AQF ("AQF", "Central secretariat log number, parent Data Maintenance"),
  /** <code>AQG</code> - Central secretariat log number, child Data Maintenance */
  AQG ("AQG", "Central secretariat log number, child Data Maintenance"),
  /** <code>AQH</code> - International assessment log number */
  AQH ("AQH", "International assessment log number"),
  /** <code>AQI</code> - International assessment log number, parent Data */
  AQI ("AQI", "International assessment log number, parent Data"),
  /** <code>AQJ</code> - International assessment log number, child Data Maintenance */
  AQJ ("AQJ", "International assessment log number, child Data Maintenance"),
  /** <code>AQK</code> - Status report number */
  AQK ("AQK", "Status report number"),
  /** <code>AQL</code> - Message design group number */
  AQL ("AQL", "Message design group number"),
  /** <code>AQM</code> - US Customs Service (USCS) entry code */
  AQM ("AQM", "US Customs Service (USCS) entry code"),
  /** <code>AQN</code> - Beginning job sequence number */
  AQN ("AQN", "Beginning job sequence number"),
  /** <code>AQO</code> - Sender's clause number */
  AQO ("AQO", "Sender's clause number"),
  /** <code>AQP</code> - Dun and Bradstreet Canada's 8 digit Standard Industrial */
  AQP ("AQP", "Dun and Bradstreet Canada's 8 digit Standard Industrial"),
  /** <code>AQQ</code> - Activite Principale Exercee (APE) identifier */
  AQQ ("AQQ", "Activite Principale Exercee (APE) identifier"),
  /** <code>AQR</code> - Dun and Bradstreet US 8 digit Standard Industrial */
  AQR ("AQR", "Dun and Bradstreet US 8 digit Standard Industrial"),
  /** <code>AQS</code> - Nomenclature Activity Classification Economy (NACE) */
  AQS ("AQS", "Nomenclature Activity Classification Economy (NACE)"),
  /** <code>AQT</code> - Norme Activite Francaise (NAF) identifier */
  AQT ("AQT", "Norme Activite Francaise (NAF) identifier"),
  /** <code>AQU</code> - Registered contractor activity type */
  AQU ("AQU", "Registered contractor activity type"),
  /** <code>AQV</code> - Statistic Bundes Amt (SBA) identifier */
  AQV ("AQV", "Statistic Bundes Amt (SBA) identifier"),
  /** <code>AQW</code> - State or province assigned entity identification */
  AQW ("AQW", "State or province assigned entity identification"),
  /** <code>AQX</code> - Institute of Security and Future Market Development (ISFMD) */
  AQX ("AQX", "Institute of Security and Future Market Development (ISFMD)"),
  /** <code>AQY</code> - File identification number */
  AQY ("AQY", "File identification number"),
  /** <code>AQZ</code> - Bankruptcy procedure number */
  AQZ ("AQZ", "Bankruptcy procedure number"),
  /** <code>ARA</code> - National government business identification number */
  ARA ("ARA", "National government business identification number"),
  /** <code>ARB</code> - Prior Data Universal Number System (DUNS) number */
  ARB ("ARB", "Prior Data Universal Number System (DUNS) number"),
  /** <code>ARC</code> - Companies Registry Office (CRO) number */
  ARC ("ARC", "Companies Registry Office (CRO) number"),
  /** <code>ARD</code> - Costa Rican judicial number */
  ARD ("ARD", "Costa Rican judicial number"),
  /** <code>ARE</code> - Numero de Identificacion Tributaria (NIT) */
  ARE ("ARE", "Numero de Identificacion Tributaria (NIT)"),
  /** <code>ARF</code> - Patron number */
  ARF ("ARF", "Patron number"),
  /** <code>ARG</code> - Registro Informacion Fiscal (RIF) number */
  ARG ("ARG", "Registro Informacion Fiscal (RIF) number"),
  /** <code>ARH</code> - Registro Unico de Contribuyente (RUC) number */
  ARH ("ARH", "Registro Unico de Contribuyente (RUC) number"),
  /** <code>ARI</code> - Tokyo SHOKO Research (TSR) business identifier */
  ARI ("ARI", "Tokyo SHOKO Research (TSR) business identifier"),
  /** <code>ARJ</code> - Personal identity card number */
  ARJ ("ARJ", "Personal identity card number"),
  /** <code>ARK</code> - Systeme Informatique pour le Repertoire des ENtreprises */
  ARK ("ARK", "Systeme Informatique pour le Repertoire des ENtreprises"),
  /** <code>ARL</code> - Systeme Informatique pour le Repertoire des ETablissements */
  ARL ("ARL", "Systeme Informatique pour le Repertoire des ETablissements"),
  /** <code>ARM</code> - Publication issue number */
  ARM ("ARM", "Publication issue number"),
  /** <code>ARN</code> - Original filing number */
  ARN ("ARN", "Original filing number"),
  /** <code>ARO</code> - Document page identifier */
  ARO ("ARO", "Document page identifier"),
  /** <code>ARP</code> - Public filing registration number */
  ARP ("ARP", "Public filing registration number"),
  /** <code>ARQ</code> - Regiristo Federal de Contribuyentes */
  ARQ ("ARQ", "Regiristo Federal de Contribuyentes"),
  /** <code>ARR</code> - Social security number */
  ARR ("ARR", "Social security number"),
  /** <code>ARS</code> - Document volume number */
  ARS ("ARS", "Document volume number"),
  /** <code>ART</code> - Book number */
  ART ("ART", "Book number"),
  /** <code>ARU</code> - Stock exchange company identifier */
  ARU ("ARU", "Stock exchange company identifier"),
  /** <code>ARV</code> - Imputation account */
  ARV ("ARV", "Imputation account"),
  /** <code>ARW</code> - Financial phase reference */
  ARW ("ARW", "Financial phase reference"),
  /** <code>ARX</code> - Technical phase reference */
  ARX ("ARX", "Technical phase reference"),
  /** <code>ARY</code> - Prior contractor registration number */
  ARY ("ARY", "Prior contractor registration number"),
  /** <code>ARZ</code> - Stock adjustment number */
  ARZ ("ARZ", "Stock adjustment number"),
  /** <code>ASA</code> - Dispensation reference */
  ASA ("ASA", "Dispensation reference"),
  /** <code>ASB</code> - Investment reference number */
  ASB ("ASB", "Investment reference number"),
  /** <code>ASC</code> - Assuming company */
  ASC ("ASC", "Assuming company"),
  /** <code>ASD</code> - Budget chapter */
  ASD ("ASD", "Budget chapter"),
  /** <code>ASE</code> - Duty free products security number */
  ASE ("ASE", "Duty free products security number"),
  /** <code>ASF</code> - Duty free products receipt authorisation number */
  ASF ("ASF", "Duty free products receipt authorisation number"),
  /** <code>ASG</code> - Party information message reference */
  ASG ("ASG", "Party information message reference"),
  /** <code>ASH</code> - Formal statement reference */
  ASH ("ASH", "Formal statement reference"),
  /** <code>ASI</code> - Proof of delivery reference number */
  ASI ("ASI", "Proof of delivery reference number"),
  /** <code>ASJ</code> - Supplier's credit claim reference number */
  ASJ ("ASJ", "Supplier's credit claim reference number"),
  /** <code>ASK</code> - Picture of actual product */
  ASK ("ASK", "Picture of actual product"),
  /** <code>ASL</code> - Picture of a generic product */
  ASL ("ASL", "Picture of a generic product"),
  /** <code>ASM</code> - Trading partner identification number */
  ASM ("ASM", "Trading partner identification number"),
  /** <code>ASN</code> - Prior trading partner identification number */
  ASN ("ASN", "Prior trading partner identification number"),
  /** <code>ASO</code> - Password */
  ASO ("ASO", "Password"),
  /** <code>ASP</code> - Formal report number */
  ASP ("ASP", "Formal report number"),
  /** <code>ASQ</code> - Fund account number */
  ASQ ("ASQ", "Fund account number"),
  /** <code>ASR</code> - Safe custody number */
  ASR ("ASR", "Safe custody number"),
  /** <code>ASS</code> - Master account number */
  ASS ("ASS", "Master account number"),
  /** <code>AST</code> - Group reference number */
  AST ("AST", "Group reference number"),
  /** <code>ASU</code> - Accounting transmission number */
  ASU ("ASU", "Accounting transmission number"),
  /** <code>ASV</code> - Product data file number */
  ASV ("ASV", "Product data file number"),
  /** <code>ASW</code> - Cadastro Geral do Contribuinte (CGC) */
  ASW ("ASW", "Cadastro Geral do Contribuinte (CGC)"),
  /** <code>ASX</code> - Foreign resident identification number */
  ASX ("ASX", "Foreign resident identification number"),
  /** <code>ASY</code> - CD-ROM */
  ASY ("ASY", "CD-ROM"),
  /** <code>ASZ</code> - Physical medium */
  ASZ ("ASZ", "Physical medium"),
  /** <code>ATA</code> - Financial cancellation reference number */
  ATA ("ATA", "Financial cancellation reference number"),
  /** <code>ATB</code> - Purchase for export Customs agreement number */
  ATB ("ATB", "Purchase for export Customs agreement number"),
  /** <code>ATC</code> - Judgment number */
  ATC ("ATC", "Judgment number"),
  /** <code>ATD</code> - Secretariat number */
  ATD ("ATD", "Secretariat number"),
  /** <code>ATE</code> - Previous banking status message reference */
  ATE ("ATE", "Previous banking status message reference"),
  /** <code>ATF</code> - Last received banking status message reference */
  ATF ("ATF", "Last received banking status message reference"),
  /** <code>ATG</code> - Bank's documentary procedure reference */
  ATG ("ATG", "Bank's documentary procedure reference"),
  /** <code>ATH</code> - Customer's documentary procedure reference */
  ATH ("ATH", "Customer's documentary procedure reference"),
  /** <code>ATI</code> - Safe deposit box number */
  ATI ("ATI", "Safe deposit box number"),
  /** <code>ATJ</code> - Receiving Bankgiro number */
  ATJ ("ATJ", "Receiving Bankgiro number"),
  /** <code>ATK</code> - Sending Bankgiro number */
  ATK ("ATK", "Sending Bankgiro number"),
  /** <code>ATL</code> - Bankgiro reference */
  ATL ("ATL", "Bankgiro reference"),
  /** <code>ATM</code> - Guarantee number */
  ATM ("ATM", "Guarantee number"),
  /** <code>ATN</code> - Collection instrument number */
  ATN ("ATN", "Collection instrument number"),
  /** <code>ATO</code> - Converted Postgiro number */
  ATO ("ATO", "Converted Postgiro number"),
  /** <code>ATP</code> - Cost centre alignment number */
  ATP ("ATP", "Cost centre alignment number"),
  /** <code>ATQ</code> - Kamer Van Koophandel (KVK) number */
  ATQ ("ATQ", "Kamer Van Koophandel (KVK) number"),
  /** <code>ATR</code> - Institut Belgo-Luxembourgeois de Codification (IBLC) number */
  ATR ("ATR", "Institut Belgo-Luxembourgeois de Codification (IBLC) number"),
  /** <code>ATS</code> - External object reference */
  ATS ("ATS", "External object reference"),
  /** <code>ATT</code> - Exceptional transport authorisation number */
  ATT ("ATT", "Exceptional transport authorisation number"),
  /** <code>ATU</code> - Clave Unica de Identificacion Tributaria (CUIT) */
  ATU ("ATU", "Clave Unica de Identificacion Tributaria (CUIT)"),
  /** <code>ATV</code> - Registro Unico Tributario (RUT) */
  ATV ("ATV", "Registro Unico Tributario (RUT)"),
  /** <code>ATW</code> - Flat rack container bundle identification number */
  ATW ("ATW", "Flat rack container bundle identification number"),
  /** <code>ATX</code> - Transport equipment acceptance order reference */
  ATX ("ATX", "Transport equipment acceptance order reference"),
  /** <code>ATY</code> - Transport equipment release order reference */
  ATY ("ATY", "Transport equipment release order reference"),
  /** <code>ATZ</code> - Ship's stay reference number */
  ATZ ("ATZ", "Ship's stay reference number"),
  /** <code>AU</code> - Authorization to meet competition number */
  AU ("AU", "Authorization to meet competition number"),
  /** <code>AUA</code> - Place of positioning reference */
  AUA ("AUA", "Place of positioning reference"),
  /** <code>AUB</code> - Party reference */
  AUB ("AUB", "Party reference"),
  /** <code>AUC</code> - Issued prescription identification */
  AUC ("AUC", "Issued prescription identification"),
  /** <code>AUD</code> - Collection reference */
  AUD ("AUD", "Collection reference"),
  /** <code>AUE</code> - Travel service */
  AUE ("AUE", "Travel service"),
  /** <code>AUF</code> - Consignment stock contract */
  AUF ("AUF", "Consignment stock contract"),
  /** <code>AUG</code> - Importer's letter of credit reference */
  AUG ("AUG", "Importer's letter of credit reference"),
  /** <code>AUH</code> - Performed prescription identification */
  AUH ("AUH", "Performed prescription identification"),
  /** <code>AUI</code> - Image reference */
  AUI ("AUI", "Image reference"),
  /** <code>AUJ</code> - Proposed purchase order reference number */
  AUJ ("AUJ", "Proposed purchase order reference number"),
  /** <code>AUK</code> - Application for financial support reference number */
  AUK ("AUK", "Application for financial support reference number"),
  /** <code>AUL</code> - Manufacturing quality agreement number */
  AUL ("AUL", "Manufacturing quality agreement number"),
  /** <code>AUM</code> - Software editor reference */
  AUM ("AUM", "Software editor reference"),
  /** <code>AUN</code> - Software reference */
  AUN ("AUN", "Software reference"),
  /** <code>AUO</code> - Software quality reference */
  AUO ("AUO", "Software quality reference"),
  /** <code>AUP</code> - Consolidated orders' reference */
  AUP ("AUP", "Consolidated orders' reference"),
  /** <code>AUQ</code> - Customs binding ruling number */
  AUQ ("AUQ", "Customs binding ruling number"),
  /** <code>AUR</code> - Customs non-binding ruling number */
  AUR ("AUR", "Customs non-binding ruling number"),
  /** <code>AUS</code> - Delivery route reference */
  AUS ("AUS", "Delivery route reference"),
  /** <code>AUT</code> - Net area supplier reference */
  AUT ("AUT", "Net area supplier reference"),
  /** <code>AUU</code> - Time series reference */
  AUU ("AUU", "Time series reference"),
  /** <code>AUV</code> - Connecting point to central grid */
  AUV ("AUV", "Connecting point to central grid"),
  /** <code>AUW</code> - Marketing plan identification number (MPIN) */
  AUW ("AUW", "Marketing plan identification number (MPIN)"),
  /** <code>AUX</code> - Entity reference number, previous */
  AUX ("AUX", "Entity reference number, previous"),
  /** <code>AUY</code> - International Standard Industrial Classification (ISIC) */
  AUY ("AUY", "International Standard Industrial Classification (ISIC)"),
  /** <code>AUZ</code> - Customs pre-approval ruling number */
  AUZ ("AUZ", "Customs pre-approval ruling number"),
  /** <code>AV</code> - Account payable number */
  AV ("AV", "Account payable number"),
  /** <code>AVA</code> - First financial institution's transaction reference */
  AVA ("AVA", "First financial institution's transaction reference"),
  /** <code>AVB</code> - Product characteristics directory */
  AVB ("AVB", "Product characteristics directory"),
  /** <code>AVC</code> - Supplier's customer reference number */
  AVC ("AVC", "Supplier's customer reference number"),
  /** <code>AVD</code> - Inventory report request number */
  AVD ("AVD", "Inventory report request number"),
  /** <code>AVE</code> - Metering point */
  AVE ("AVE", "Metering point"),
  /** <code>AVF</code> - Passenger reservation number */
  AVF ("AVF", "Passenger reservation number"),
  /** <code>AVG</code> - Slaughterhouse approval number */
  AVG ("AVG", "Slaughterhouse approval number"),
  /** <code>AVH</code> - Meat cutting plant approval number */
  AVH ("AVH", "Meat cutting plant approval number"),
  /** <code>AVI</code> - Customer travel service identifier */
  AVI ("AVI", "Customer travel service identifier"),
  /** <code>AVJ</code> - Export control classification number */
  AVJ ("AVJ", "Export control classification number"),
  /** <code>AVK</code> - Broker reference 3 */
  AVK ("AVK", "Broker reference 3"),
  /** <code>AVL</code> - Consignment information */
  AVL ("AVL", "Consignment information"),
  /** <code>AVM</code> - Goods item information */
  AVM ("AVM", "Goods item information"),
  /** <code>AVN</code> - Dangerous Goods information */
  AVN ("AVN", "Dangerous Goods information"),
  /** <code>AVO</code> - Pilotage services exemption number */
  AVO ("AVO", "Pilotage services exemption number"),
  /** <code>AVP</code> - Person registration number */
  AVP ("AVP", "Person registration number"),
  /** <code>AVQ</code> - Place of packing approval number */
  AVQ ("AVQ", "Place of packing approval number"),
  /** <code>AVR</code> - Original Mandate Reference */
  AVR ("AVR", "Original Mandate Reference"),
  /** <code>AVS</code> - Mandate Reference */
  AVS ("AVS", "Mandate Reference"),
  /** <code>AVT</code> - Reservation station indentifier */
  AVT ("AVT", "Reservation station indentifier"),
  /** <code>AVU</code> - Unique goods shipment identifier */
  AVU ("AVU", "Unique goods shipment identifier"),
  /** <code>AVV</code> - Framework Agreement Number */
  AVV ("AVV", "Framework Agreement Number"),
  /** <code>AVW</code> - Hash value */
  AVW ("AVW", "Hash value"),
  /** <code>AVX</code> - Movement reference number */
  AVX ("AVX", "Movement reference number"),
  /** <code>AVY</code> - Economic Operators Registration and Identification Number */
  AVY ("AVY", "Economic Operators Registration and Identification Number"),
  /** <code>AVZ</code> - Local Reference Number */
  AVZ ("AVZ", "Local Reference Number"),
  /** <code>AWA</code> - Rate code number */
  AWA ("AWA", "Rate code number"),
  /** <code>AWB</code> - Air waybill number */
  AWB ("AWB", "Air waybill number"),
  /** <code>AWC</code> - Documentary credit amendment number */
  AWC ("AWC", "Documentary credit amendment number"),
  /** <code>AWD</code> - Advising bank's reference */
  AWD ("AWD", "Advising bank's reference"),
  /** <code>AWE</code> - Cost centre */
  AWE ("AWE", "Cost centre"),
  /** <code>AWF</code> - Work item quantity determination */
  AWF ("AWF", "Work item quantity determination"),
  /** <code>AWG</code> - Internal data process number */
  AWG ("AWG", "Internal data process number"),
  /** <code>AWH</code> - Category of work reference */
  AWH ("AWH", "Category of work reference"),
  /** <code>AWI</code> - Policy form number */
  AWI ("AWI", "Policy form number"),
  /** <code>AWJ</code> - Net area */
  AWJ ("AWJ", "Net area"),
  /** <code>AWK</code> - Service provider */
  AWK ("AWK", "Service provider"),
  /** <code>AWL</code> - Error position */
  AWL ("AWL", "Error position"),
  /** <code>AWM</code> - Service category reference */
  AWM ("AWM", "Service category reference"),
  /** <code>AWN</code> - Connected location */
  AWN ("AWN", "Connected location"),
  /** <code>AWO</code> - Related party */
  AWO ("AWO", "Related party"),
  /** <code>AWP</code> - Latest accounting entry record reference */
  AWP ("AWP", "Latest accounting entry record reference"),
  /** <code>AWQ</code> - Accounting entry */
  AWQ ("AWQ", "Accounting entry"),
  /** <code>AWR</code> - Document reference, original */
  AWR ("AWR", "Document reference, original"),
  /** <code>AWS</code> - Hygienic Certificate number, national */
  AWS ("AWS", "Hygienic Certificate number, national"),
  /** <code>AWT</code> - Administrative Reference Code */
  AWT ("AWT", "Administrative Reference Code"),
  /** <code>AWU</code> - Pick-up sheet number */
  AWU ("AWU", "Pick-up sheet number"),
  /** <code>AWV</code> - Phone number */
  AWV ("AWV", "Phone number"),
  /** <code>AWW</code> - Buyer's fund number */
  AWW ("AWW", "Buyer's fund number"),
  /** <code>AWX</code> - Company trading account number */
  AWX ("AWX", "Company trading account number"),
  /** <code>AWY</code> - Reserved goods identifier */
  AWY ("AWY", "Reserved goods identifier"),
  /** <code>AWZ</code> - Handling and movement reference number */
  AWZ ("AWZ", "Handling and movement reference number"),
  /** <code>AXA</code> - Instruction to despatch reference number */
  AXA ("AXA", "Instruction to despatch reference number"),
  /** <code>AXB</code> - Instruction for returns number */
  AXB ("AXB", "Instruction for returns number"),
  /** <code>AXC</code> - Metered services consumption report number */
  AXC ("AXC", "Metered services consumption report number"),
  /** <code>AXD</code> - Order status enquiry number */
  AXD ("AXD", "Order status enquiry number"),
  /** <code>AXE</code> - Firm booking reference number */
  AXE ("AXE", "Firm booking reference number"),
  /** <code>AXF</code> - Product inquiry number */
  AXF ("AXF", "Product inquiry number"),
  /** <code>AXG</code> - Split delivery number */
  AXG ("AXG", "Split delivery number"),
  /** <code>AXH</code> - Service relation number */
  AXH ("AXH", "Service relation number"),
  /** <code>AXI</code> - Serial shipping container code */
  AXI ("AXI", "Serial shipping container code"),
  /** <code>AXJ</code> - Test specification number */
  AXJ ("AXJ", "Test specification number"),
  /** <code>AXK</code> - Transport status report number */
  AXK ("AXK", "Transport status report number"),
  /** <code>AXL</code> - Tooling contract number */
  AXL ("AXL", "Tooling contract number"),
  /** <code>AXM</code> - Formula reference number */
  AXM ("AXM", "Formula reference number"),
  /** <code>AXN</code> - Pre-agreement number */
  AXN ("AXN", "Pre-agreement number"),
  /** <code>AXO</code> - Product certification number */
  AXO ("AXO", "Product certification number"),
  /** <code>AXP</code> - Consignment contract number */
  AXP ("AXP", "Consignment contract number"),
  /** <code>AXQ</code> - Product specification reference number */
  AXQ ("AXQ", "Product specification reference number"),
  /** <code>AXR</code> - Payroll deduction advice reference */
  AXR ("AXR", "Payroll deduction advice reference"),
  /** <code>AXS</code> - TRACES party identification */
  AXS ("AXS", "TRACES party identification"),
  /** <code>AXU</code> - Block Stowage Reference */
  AXU ("AXU", "Block Stowage Reference"),
  /** <code>BA</code> - Beginning meter reading actual */
  BA ("BA", "Beginning meter reading actual"),
  /** <code>BC</code> - Buyer's contract number */
  BC ("BC", "Buyer's contract number"),
  /** <code>BD</code> - Bid number */
  BD ("BD", "Bid number"),
  /** <code>BE</code> - Beginning meter reading estimated */
  BE ("BE", "Beginning meter reading estimated"),
  /** <code>BH</code> - House bill of lading number */
  BH ("BH", "House bill of lading number"),
  /** <code>BM</code> - Bill of lading number */
  BM ("BM", "Bill of lading number"),
  /** <code>BN</code> - Consignment identifier, carrier assigned */
  BN ("BN", "Consignment identifier, carrier assigned"),
  /** <code>BO</code> - Blanket order number */
  BO ("BO", "Blanket order number"),
  /** <code>BR</code> - Broker or sales office number */
  BR ("BR", "Broker or sales office number"),
  /** <code>BT</code> - Batch number/lot number */
  BT ("BT", "Batch number/lot number"),
  /** <code>BTP</code> - Battery and accumulator producer registration number */
  BTP ("BTP", "Battery and accumulator producer registration number"),
  /** <code>BW</code> - Blended with number */
  BW ("BW", "Blended with number"),
  /** <code>CAS</code> - IATA Cargo Agent CASS Address number */
  CAS ("CAS", "IATA Cargo Agent CASS Address number"),
  /** <code>CAT</code> - Matching of entries, balanced */
  CAT ("CAT", "Matching of entries, balanced"),
  /** <code>CAU</code> - Entry flagging */
  CAU ("CAU", "Entry flagging"),
  /** <code>CAV</code> - Matching of entries, unbalanced */
  CAV ("CAV", "Matching of entries, unbalanced"),
  /** <code>CAW</code> - Document reference, internal */
  CAW ("CAW", "Document reference, internal"),
  /** <code>CAX</code> - European Value Added Tax identification */
  CAX ("CAX", "European Value Added Tax identification"),
  /** <code>CAY</code> - Cost accounting document */
  CAY ("CAY", "Cost accounting document"),
  /** <code>CAZ</code> - Grid operator's customer reference number */
  CAZ ("CAZ", "Grid operator's customer reference number"),
  /** <code>CBA</code> - Ticket control number */
  CBA ("CBA", "Ticket control number"),
  /** <code>CBB</code> - Order shipment grouping reference */
  CBB ("CBB", "Order shipment grouping reference"),
  /** <code>CD</code> - Credit note number */
  CD ("CD", "Credit note number"),
  /** <code>CEC</code> - Ceding company */
  CEC ("CEC", "Ceding company"),
  /** <code>CED</code> - Debit letter number */
  CED ("CED", "Debit letter number"),
  /** <code>CFE</code> - Consignee's further order */
  CFE ("CFE", "Consignee's further order"),
  /** <code>CFF</code> - Animal farm licence number */
  CFF ("CFF", "Animal farm licence number"),
  /** <code>CFO</code> - Consignor's further order */
  CFO ("CFO", "Consignor's further order"),
  /** <code>CG</code> - Consignee's order number */
  CG ("CG", "Consignee's order number"),
  /** <code>CH</code> - Customer catalogue number */
  CH ("CH", "Customer catalogue number"),
  /** <code>CK</code> - Cheque number */
  CK ("CK", "Cheque number"),
  /** <code>CKN</code> - Checking number */
  CKN ("CKN", "Checking number"),
  /** <code>CM</code> - Credit memo number */
  CM ("CM", "Credit memo number"),
  /** <code>CMR</code> - Road consignment note number */
  CMR ("CMR", "Road consignment note number"),
  /** <code>CN</code> - Carrier's reference number */
  CN ("CN", "Carrier's reference number"),
  /** <code>CNO</code> - Charges note document attachment indicator */
  CNO ("CNO", "Charges note document attachment indicator"),
  /** <code>COF</code> - Call off order number */
  COF ("COF", "Call off order number"),
  /** <code>CP</code> - Condition of purchase document number */
  CP ("CP", "Condition of purchase document number"),
  /** <code>CR</code> - Customer reference number */
  CR ("CR", "Customer reference number"),
  /** <code>CRN</code> - Transport means journey identifier */
  CRN ("CRN", "Transport means journey identifier"),
  /** <code>CS</code> - Condition of sale document number */
  CS ("CS", "Condition of sale document number"),
  /** <code>CST</code> - Team assignment number */
  CST ("CST", "Team assignment number"),
  /** <code>CT</code> - Contract number */
  CT ("CT", "Contract number"),
  /** <code>CU</code> - Consignment identifier, consignor assigned */
  CU ("CU", "Consignment identifier, consignor assigned"),
  /** <code>CV</code> - Container operators reference number */
  CV ("CV", "Container operators reference number"),
  /** <code>CW</code> - Package number */
  CW ("CW", "Package number"),
  /** <code>CZ</code> - Cooperation contract number */
  CZ ("CZ", "Cooperation contract number"),
  /** <code>DA</code> - Deferment approval number */
  DA ("DA", "Deferment approval number"),
  /** <code>DAN</code> - Debit account number */
  DAN ("DAN", "Debit account number"),
  /** <code>DB</code> - Buyer's debtor number */
  DB ("DB", "Buyer's debtor number"),
  /** <code>DI</code> - Distributor invoice number */
  DI ("DI", "Distributor invoice number"),
  /** <code>DL</code> - Debit note number */
  DL ("DL", "Debit note number"),
  /** <code>DM</code> - Document identifier */
  DM ("DM", "Document identifier"),
  /** <code>DQ</code> - Delivery note number */
  DQ ("DQ", "Delivery note number"),
  /** <code>DR</code> - Dock receipt number */
  DR ("DR", "Dock receipt number"),
  /** <code>EA</code> - Ending meter reading actual */
  EA ("EA", "Ending meter reading actual"),
  /** <code>EB</code> - Embargo permit number */
  EB ("EB", "Embargo permit number"),
  /** <code>ED</code> - Export declaration */
  ED ("ED", "Export declaration"),
  /** <code>EE</code> - Ending meter reading estimated */
  EE ("EE", "Ending meter reading estimated"),
  /** <code>EEP</code> - Electrical and electronic equipment producer registration */
  EEP ("EEP", "Electrical and electronic equipment producer registration"),
  /** <code>EI</code> - Employer's identification number */
  EI ("EI", "Employer's identification number"),
  /** <code>EN</code> - Embargo number */
  EN ("EN", "Embargo number"),
  /** <code>EQ</code> - Equipment number */
  EQ ("EQ", "Equipment number"),
  /** <code>ER</code> - Container/equipment receipt number */
  ER ("ER", "Container/equipment receipt number"),
  /** <code>ERN</code> - Exporter's reference number */
  ERN ("ERN", "Exporter's reference number"),
  /** <code>ET</code> - Excess transportation number */
  ET ("ET", "Excess transportation number"),
  /** <code>EX</code> - Export permit identifier */
  EX ("EX", "Export permit identifier"),
  /** <code>FC</code> - Fiscal number */
  FC ("FC", "Fiscal number"),
  /** <code>FF</code> - Consignment identifier, freight forwarder assigned */
  FF ("FF", "Consignment identifier, freight forwarder assigned"),
  /** <code>FI</code> - File line identifier */
  FI ("FI", "File line identifier"),
  /** <code>FLW</code> - Flow reference number */
  FLW ("FLW", "Flow reference number"),
  /** <code>FN</code> - Freight bill number */
  FN ("FN", "Freight bill number"),
  /** <code>FO</code> - Foreign exchange */
  FO ("FO", "Foreign exchange"),
  /** <code>FS</code> - Final sequence number */
  FS ("FS", "Final sequence number"),
  /** <code>FT</code> - Free zone identifier */
  FT ("FT", "Free zone identifier"),
  /** <code>FV</code> - File version number */
  FV ("FV", "File version number"),
  /** <code>FX</code> - Foreign exchange contract number */
  FX ("FX", "Foreign exchange contract number"),
  /** <code>GA</code> - Standard's number */
  GA ("GA", "Standard's number"),
  /** <code>GC</code> - Government contract number */
  GC ("GC", "Government contract number"),
  /** <code>GD</code> - Standard's code number */
  GD ("GD", "Standard's code number"),
  /** <code>GDN</code> - General declaration number */
  GDN ("GDN", "General declaration number"),
  /** <code>GN</code> - Government reference number */
  GN ("GN", "Government reference number"),
  /** <code>HS</code> - Harmonised system number */
  HS ("HS", "Harmonised system number"),
  /** <code>HWB</code> - House waybill number */
  HWB ("HWB", "House waybill number"),
  /** <code>IA</code> - Internal vendor number */
  IA ("IA", "Internal vendor number"),
  /** <code>IB</code> - In bond number */
  IB ("IB", "In bond number"),
  /** <code>ICA</code> - IATA cargo agent code number */
  ICA ("ICA", "IATA cargo agent code number"),
  /** <code>ICE</code> - Insurance certificate reference number */
  ICE ("ICE", "Insurance certificate reference number"),
  /** <code>ICO</code> - Insurance contract reference number */
  ICO ("ICO", "Insurance contract reference number"),
  /** <code>II</code> - Initial sample inspection report number */
  II ("II", "Initial sample inspection report number"),
  /** <code>IL</code> - Internal order number */
  IL ("IL", "Internal order number"),
  /** <code>INB</code> - Intermediary broker */
  INB ("INB", "Intermediary broker"),
  /** <code>INN</code> - Interchange number new */
  INN ("INN", "Interchange number new"),
  /** <code>INO</code> - Interchange number old */
  INO ("INO", "Interchange number old"),
  /** <code>IP</code> - Import permit identifier */
  IP ("IP", "Import permit identifier"),
  /** <code>IS</code> - Invoice number suffix */
  IS ("IS", "Invoice number suffix"),
  /** <code>IT</code> - Internal customer number */
  IT ("IT", "Internal customer number"),
  /** <code>IV</code> - Invoice document identifier */
  IV ("IV", "Invoice document identifier"),
  /** <code>JB</code> - Job number */
  JB ("JB", "Job number"),
  /** <code>JE</code> - Ending job sequence number */
  JE ("JE", "Ending job sequence number"),
  /** <code>LA</code> - Shipping label serial number */
  LA ("LA", "Shipping label serial number"),
  /** <code>LAN</code> - Loading authorisation identifier */
  LAN ("LAN", "Loading authorisation identifier"),
  /** <code>LAR</code> - Lower number in range */
  LAR ("LAR", "Lower number in range"),
  /** <code>LB</code> - Lockbox */
  LB ("LB", "Lockbox"),
  /** <code>LC</code> - Letter of credit number */
  LC ("LC", "Letter of credit number"),
  /** <code>LI</code> - Document line identifier */
  LI ("LI", "Document line identifier"),
  /** <code>LO</code> - Load planning number */
  LO ("LO", "Load planning number"),
  /** <code>LRC</code> - Reservation office identifier */
  LRC ("LRC", "Reservation office identifier"),
  /** <code>LS</code> - Bar coded label serial number */
  LS ("LS", "Bar coded label serial number"),
  /** <code>MA</code> - Ship notice/manifest number */
  MA ("MA", "Ship notice/manifest number"),
  /** <code>MB</code> - Master bill of lading number */
  MB ("MB", "Master bill of lading number"),
  /** <code>MF</code> - Manufacturer's part number */
  MF ("MF", "Manufacturer's part number"),
  /** <code>MG</code> - Meter unit number */
  MG ("MG", "Meter unit number"),
  /** <code>MH</code> - Manufacturing order number */
  MH ("MH", "Manufacturing order number"),
  /** <code>MR</code> - Message recipient */
  MR ("MR", "Message recipient"),
  /** <code>MRN</code> - Mailing reference number */
  MRN ("MRN", "Mailing reference number"),
  /** <code>MS</code> - Message sender */
  MS ("MS", "Message sender"),
  /** <code>MSS</code> - Manufacturer's material safety data sheet number */
  MSS ("MSS", "Manufacturer's material safety data sheet number"),
  /** <code>MWB</code> - Master air waybill number */
  MWB ("MWB", "Master air waybill number"),
  /** <code>NA</code> - North American hazardous goods classification number */
  NA ("NA", "North American hazardous goods classification number"),
  /** <code>NF</code> - Nota Fiscal */
  NF ("NF", "Nota Fiscal"),
  /** <code>OH</code> - Current invoice number */
  OH ("OH", "Current invoice number"),
  /** <code>OI</code> - Previous invoice number */
  OI ("OI", "Previous invoice number"),
  /** <code>ON</code> - Order document identifier, buyer assigned */
  ON ("ON", "Order document identifier, buyer assigned"),
  /** <code>OP</code> - Original purchase order */
  OP ("OP", "Original purchase order"),
  /** <code>OR</code> - General order number */
  OR ("OR", "General order number"),
  /** <code>PB</code> - Payer's financial institution account number */
  PB ("PB", "Payer's financial institution account number"),
  /** <code>PC</code> - Production code */
  PC ("PC", "Production code"),
  /** <code>PD</code> - Promotion deal number */
  PD ("PD", "Promotion deal number"),
  /** <code>PE</code> - Plant number */
  PE ("PE", "Plant number"),
  /** <code>PF</code> - Prime contractor contract number */
  PF ("PF", "Prime contractor contract number"),
  /** <code>PI</code> - Price list version number */
  PI ("PI", "Price list version number"),
  /** <code>PK</code> - Packing list number */
  PK ("PK", "Packing list number"),
  /** <code>PL</code> - Price list number */
  PL ("PL", "Price list number"),
  /** <code>POR</code> - Purchase order response number */
  POR ("POR", "Purchase order response number"),
  /** <code>PP</code> - Purchase order change number */
  PP ("PP", "Purchase order change number"),
  /** <code>PQ</code> - Payment reference */
  PQ ("PQ", "Payment reference"),
  /** <code>PR</code> - Price quote number */
  PR ("PR", "Price quote number"),
  /** <code>PS</code> - Purchase order number suffix */
  PS ("PS", "Purchase order number suffix"),
  /** <code>PW</code> - Prior purchase order number */
  PW ("PW", "Prior purchase order number"),
  /** <code>PY</code> - Payee's financial institution account number */
  PY ("PY", "Payee's financial institution account number"),
  /** <code>RA</code> - Remittance advice number */
  RA ("RA", "Remittance advice number"),
  /** <code>RC</code> - Rail/road routing code */
  RC ("RC", "Rail/road routing code"),
  /** <code>RCN</code> - Railway consignment note number */
  RCN ("RCN", "Railway consignment note number"),
  /** <code>RE</code> - Release number */
  RE ("RE", "Release number"),
  /** <code>REN</code> - Consignment receipt identifier */
  REN ("REN", "Consignment receipt identifier"),
  /** <code>RF</code> - Export reference number */
  RF ("RF", "Export reference number"),
  /** <code>RR</code> - Payer's financial institution transit routing No.(ACH */
  RR ("RR", "Payer's financial institution transit routing No.(ACH"),
  /** <code>RT</code> - Payee's financial institution transit routing No. */
  RT ("RT", "Payee's financial institution transit routing No."),
  /** <code>SA</code> - Sales person number */
  SA ("SA", "Sales person number"),
  /** <code>SB</code> - Sales region number */
  SB ("SB", "Sales region number"),
  /** <code>SD</code> - Sales department number */
  SD ("SD", "Sales department number"),
  /** <code>SE</code> - Serial number */
  SE ("SE", "Serial number"),
  /** <code>SEA</code> - Allocated seat */
  SEA ("SEA", "Allocated seat"),
  /** <code>SF</code> - Ship from */
  SF ("SF", "Ship from"),
  /** <code>SH</code> - Previous highest schedule number */
  SH ("SH", "Previous highest schedule number"),
  /** <code>SI</code> - SID (Shipper's identifying number for shipment) */
  SI ("SI", "SID (Shipper's identifying number for shipment)"),
  /** <code>SM</code> - Sales office number */
  SM ("SM", "Sales office number"),
  /** <code>SN</code> - Transport equipment seal identifier */
  SN ("SN", "Transport equipment seal identifier"),
  /** <code>SP</code> - Scan line */
  SP ("SP", "Scan line"),
  /** <code>SQ</code> - Equipment sequence number */
  SQ ("SQ", "Equipment sequence number"),
  /** <code>SRN</code> - Shipment reference number */
  SRN ("SRN", "Shipment reference number"),
  /** <code>SS</code> - Sellers reference number */
  SS ("SS", "Sellers reference number"),
  /** <code>STA</code> - Station reference number */
  STA ("STA", "Station reference number"),
  /** <code>SW</code> - Swap order number */
  SW ("SW", "Swap order number"),
  /** <code>SZ</code> - Specification number */
  SZ ("SZ", "Specification number"),
  /** <code>TB</code> - Trucker's bill of lading */
  TB ("TB", "Trucker's bill of lading"),
  /** <code>TCR</code> - Terminal operator's consignment reference */
  TCR ("TCR", "Terminal operator's consignment reference"),
  /** <code>TE</code> - Telex message number */
  TE ("TE", "Telex message number"),
  /** <code>TF</code> - Transfer number */
  TF ("TF", "Transfer number"),
  /** <code>TI</code> - TIR carnet number */
  TI ("TI", "TIR carnet number"),
  /** <code>TIN</code> - Transport instruction number */
  TIN ("TIN", "Transport instruction number"),
  /** <code>TL</code> - Tax exemption licence number */
  TL ("TL", "Tax exemption licence number"),
  /** <code>TN</code> - Transaction reference number */
  TN ("TN", "Transaction reference number"),
  /** <code>TP</code> - Test report number */
  TP ("TP", "Test report number"),
  /** <code>UAR</code> - Upper number of range */
  UAR ("UAR", "Upper number of range"),
  /** <code>UC</code> - Ultimate customer's reference number */
  UC ("UC", "Ultimate customer's reference number"),
  /** <code>UCN</code> - Unique consignment reference number */
  UCN ("UCN", "Unique consignment reference number"),
  /** <code>UN</code> - United Nations Dangerous Goods identifier */
  UN ("UN", "United Nations Dangerous Goods identifier"),
  /** <code>UO</code> - Ultimate customer's order number */
  UO ("UO", "Ultimate customer's order number"),
  /** <code>URI</code> - Uniform Resource Identifier */
  URI ("URI", "Uniform Resource Identifier"),
  /** <code>VA</code> - VAT registration number */
  VA ("VA", "VAT registration number"),
  /** <code>VC</code> - Vendor contract number */
  VC ("VC", "Vendor contract number"),
  /** <code>VGR</code> - Transport equipment gross mass verification reference */
  VGR ("VGR", "Transport equipment gross mass verification reference"),
  /** <code>VM</code> - Vessel identifier */
  VM ("VM", "Vessel identifier"),
  /** <code>VN</code> - Order number (vendor) */
  VN ("VN", "Order number (vendor)"),
  /** <code>VON</code> - Voyage number */
  VON ("VON", "Voyage number"),
  /** <code>VOR</code> - Transport equipment gross mass verification order reference */
  VOR ("VOR", "Transport equipment gross mass verification order reference"),
  /** <code>VP</code> - Vendor product number */
  VP ("VP", "Vendor product number"),
  /** <code>VR</code> - Vendor ID number */
  VR ("VR", "Vendor ID number"),
  /** <code>VS</code> - Vendor order number suffix */
  VS ("VS", "Vendor order number suffix"),
  /** <code>VT</code> - Motor vehicle identification number */
  VT ("VT", "Motor vehicle identification number"),
  /** <code>VV</code> - Voucher number */
  VV ("VV", "Voucher number"),
  /** <code>WE</code> - Warehouse entry number */
  WE ("WE", "Warehouse entry number"),
  /** <code>WM</code> - Weight agreement number */
  WM ("WM", "Weight agreement number"),
  /** <code>WN</code> - Well number */
  WN ("WN", "Well number"),
  /** <code>WR</code> - Warehouse receipt number */
  WR ("WR", "Warehouse receipt number"),
  /** <code>WS</code> - Warehouse storage location number */
  WS ("WS", "Warehouse storage location number"),
  /** <code>WY</code> - Rail waybill number */
  WY ("WY", "Rail waybill number"),
  /** <code>XA</code> - Company/place registration number */
  XA ("XA", "Company/place registration number"),
  /** <code>XC</code> - Cargo control number */
  XC ("XC", "Cargo control number"),
  /** <code>XP</code> - Previous cargo control number */
  XP ("XP", "Previous cargo control number"),
  /** <code>ZZZ</code> - Mutually defined reference number */
  ZZZ ("ZZZ", "Mutually defined reference number");

  private static final ICommonsMap <String, EEN16931ReferenceQualifierCode> MAP_BY_ID = new CommonsHashMap <> ();

  static
  {
    for (final EEN16931ReferenceQualifierCode e : values ())
      MAP_BY_ID.put (e.m_sID, e);
  }

  private final String m_sID;
  private final String m_sDisplayName;

  EEN16931ReferenceQualifierCode (@NonNull @Nonempty final String sID,
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
  public static EEN16931ReferenceQualifierCode getFromIDOrNull (@Nullable final String sID)
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
