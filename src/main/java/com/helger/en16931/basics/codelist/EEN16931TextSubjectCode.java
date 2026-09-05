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
 * UNTDID 4451 text subject qualifiers.
 * <p>
 * Used by BT-21. EN 16931 uses this code list as a full list.
 * <p>
 * Source of truth: sheet <code>Text</code> of the EN 16931 code list workbook. The implemented
 * version of that workbook is {@link EN16931CodeLists#CODE_LIST_VERSION}, and the registry it comes
 * from is named in {@link EN16931CodeLists}.
 *
 * @author Philip Helger
 */
@CodingStyleguideUnaware
public enum EEN16931TextSubjectCode implements IHasID <String>, IHasDisplayName
{
  /** <code>AAA</code> - Goods item description */
  AAA ("AAA", "Goods item description"),
  /** <code>AAB</code> - Payment term */
  AAB ("AAB", "Payment term"),
  /** <code>AAC</code> - Dangerous goods additional information */
  AAC ("AAC", "Dangerous goods additional information"),
  /** <code>AAD</code> - Dangerous goods technical name */
  AAD ("AAD", "Dangerous goods technical name"),
  /** <code>AAE</code> - Acknowledgement description */
  AAE ("AAE", "Acknowledgement description"),
  /** <code>AAF</code> - Rate additional information */
  AAF ("AAF", "Rate additional information"),
  /** <code>AAG</code> - Party instructions */
  AAG ("AAG", "Party instructions"),
  /** <code>AAI</code> - General information */
  AAI ("AAI", "General information"),
  /** <code>AAJ</code> - Additional conditions of sale/purchase */
  AAJ ("AAJ", "Additional conditions of sale/purchase"),
  /** <code>AAK</code> - Price conditions */
  AAK ("AAK", "Price conditions"),
  /** <code>AAL</code> - Goods dimensions in characters */
  AAL ("AAL", "Goods dimensions in characters"),
  /** <code>AAM</code> - Equipment re-usage restrictions */
  AAM ("AAM", "Equipment re-usage restrictions"),
  /** <code>AAN</code> - Handling restriction */
  AAN ("AAN", "Handling restriction"),
  /** <code>AAO</code> - Error description (free text) */
  AAO ("AAO", "Error description (free text)"),
  /** <code>AAP</code> - Response (free text) */
  AAP ("AAP", "Response (free text)"),
  /** <code>AAQ</code> - Package content's description */
  AAQ ("AAQ", "Package content's description"),
  /** <code>AAR</code> - Terms of delivery */
  AAR ("AAR", "Terms of delivery"),
  /** <code>AAS</code> - Bill of lading remarks */
  AAS ("AAS", "Bill of lading remarks"),
  /** <code>AAT</code> - Mode of settlement information */
  AAT ("AAT", "Mode of settlement information"),
  /** <code>AAU</code> - Consignment invoice information */
  AAU ("AAU", "Consignment invoice information"),
  /** <code>AAV</code> - Clearance invoice information */
  AAV ("AAV", "Clearance invoice information"),
  /** <code>AAW</code> - Letter of credit information */
  AAW ("AAW", "Letter of credit information"),
  /** <code>AAX</code> - License information */
  AAX ("AAX", "License information"),
  /** <code>AAY</code> - Certification statements */
  AAY ("AAY", "Certification statements"),
  /** <code>AAZ</code> - Additional export information */
  AAZ ("AAZ", "Additional export information"),
  /** <code>ABA</code> - Tariff statements */
  ABA ("ABA", "Tariff statements"),
  /** <code>ABB</code> - Medical history */
  ABB ("ABB", "Medical history"),
  /** <code>ABC</code> - Conditions of sale or purchase */
  ABC ("ABC", "Conditions of sale or purchase"),
  /** <code>ABD</code> - Contract document type */
  ABD ("ABD", "Contract document type"),
  /** <code>ABE</code> - Additional terms and/or conditions (documentary credit) */
  ABE ("ABE", "Additional terms and/or conditions (documentary credit)"),
  /** <code>ABF</code> - Instructions or information about standby documentary */
  ABF ("ABF", "Instructions or information about standby documentary"),
  /** <code>ABG</code> - Instructions or information about partial shipment(s) */
  ABG ("ABG", "Instructions or information about partial shipment(s)"),
  /** <code>ABH</code> - Instructions or information about transhipment(s) */
  ABH ("ABH", "Instructions or information about transhipment(s)"),
  /** <code>ABI</code> - Additional handling instructions documentary credit */
  ABI ("ABI", "Additional handling instructions documentary credit"),
  /** <code>ABJ</code> - Domestic routing information */
  ABJ ("ABJ", "Domestic routing information"),
  /** <code>ABK</code> - Chargeable category of equipment */
  ABK ("ABK", "Chargeable category of equipment"),
  /** <code>ABL</code> - Government information */
  ABL ("ABL", "Government information"),
  /** <code>ABM</code> - Onward routing information */
  ABM ("ABM", "Onward routing information"),
  /** <code>ABN</code> - Accounting information */
  ABN ("ABN", "Accounting information"),
  /** <code>ABO</code> - Discrepancy information */
  ABO ("ABO", "Discrepancy information"),
  /** <code>ABP</code> - Confirmation instructions */
  ABP ("ABP", "Confirmation instructions"),
  /** <code>ABQ</code> - Method of issuance */
  ABQ ("ABQ", "Method of issuance"),
  /** <code>ABR</code> - Documents delivery instructions */
  ABR ("ABR", "Documents delivery instructions"),
  /** <code>ABS</code> - Additional conditions */
  ABS ("ABS", "Additional conditions"),
  /** <code>ABT</code> - Information/instructions about additional amounts covered */
  ABT ("ABT", "Information/instructions about additional amounts covered"),
  /** <code>ABU</code> - Deferred payment termed additional */
  ABU ("ABU", "Deferred payment termed additional"),
  /** <code>ABV</code> - Acceptance terms additional */
  ABV ("ABV", "Acceptance terms additional"),
  /** <code>ABW</code> - Negotiation terms additional */
  ABW ("ABW", "Negotiation terms additional"),
  /** <code>ABX</code> - Document name and documentary requirements */
  ABX ("ABX", "Document name and documentary requirements"),
  /** <code>ABZ</code> - Instructions/information about revolving documentary credit */
  ABZ ("ABZ", "Instructions/information about revolving documentary credit"),
  /** <code>ACA</code> - Documentary requirements */
  ACA ("ACA", "Documentary requirements"),
  /** <code>ACB</code> - Additional information */
  ACB ("ACB", "Additional information"),
  /** <code>ACC</code> - Factor assignment clause */
  ACC ("ACC", "Factor assignment clause"),
  /** <code>ACD</code> - Reason */
  ACD ("ACD", "Reason"),
  /** <code>ACE</code> - Dispute */
  ACE ("ACE", "Dispute"),
  /** <code>ACF</code> - Additional attribute information */
  ACF ("ACF", "Additional attribute information"),
  /** <code>ACG</code> - Absence declaration */
  ACG ("ACG", "Absence declaration"),
  /** <code>ACH</code> - Aggregation statement */
  ACH ("ACH", "Aggregation statement"),
  /** <code>ACI</code> - Compilation statement */
  ACI ("ACI", "Compilation statement"),
  /** <code>ACJ</code> - Definitional exception */
  ACJ ("ACJ", "Definitional exception"),
  /** <code>ACK</code> - Privacy statement */
  ACK ("ACK", "Privacy statement"),
  /** <code>ACL</code> - Quality statement */
  ACL ("ACL", "Quality statement"),
  /** <code>ACM</code> - Statistical description */
  ACM ("ACM", "Statistical description"),
  /** <code>ACN</code> - Statistical definition */
  ACN ("ACN", "Statistical definition"),
  /** <code>ACO</code> - Statistical name */
  ACO ("ACO", "Statistical name"),
  /** <code>ACP</code> - Statistical title */
  ACP ("ACP", "Statistical title"),
  /** <code>ACQ</code> - Off-dimension information */
  ACQ ("ACQ", "Off-dimension information"),
  /** <code>ACR</code> - Unexpected stops information */
  ACR ("ACR", "Unexpected stops information"),
  /** <code>ACS</code> - Principles */
  ACS ("ACS", "Principles"),
  /** <code>ACT</code> - Terms and definition */
  ACT ("ACT", "Terms and definition"),
  /** <code>ACU</code> - Segment name */
  ACU ("ACU", "Segment name"),
  /** <code>ACV</code> - Simple data element name */
  ACV ("ACV", "Simple data element name"),
  /** <code>ACW</code> - Scope */
  ACW ("ACW", "Scope"),
  /** <code>ACX</code> - Message type name */
  ACX ("ACX", "Message type name"),
  /** <code>ACY</code> - Introduction */
  ACY ("ACY", "Introduction"),
  /** <code>ACZ</code> - Glossary */
  ACZ ("ACZ", "Glossary"),
  /** <code>ADA</code> - Functional definition */
  ADA ("ADA", "Functional definition"),
  /** <code>ADB</code> - Examples */
  ADB ("ADB", "Examples"),
  /** <code>ADC</code> - Cover page */
  ADC ("ADC", "Cover page"),
  /** <code>ADD</code> - Dependency (syntax) notes */
  ADD ("ADD", "Dependency (syntax) notes"),
  /** <code>ADE</code> - Code value name */
  ADE ("ADE", "Code value name"),
  /** <code>ADF</code> - Code list name */
  ADF ("ADF", "Code list name"),
  /** <code>ADG</code> - Clarification of usage */
  ADG ("ADG", "Clarification of usage"),
  /** <code>ADH</code> - Composite data element name */
  ADH ("ADH", "Composite data element name"),
  /** <code>ADI</code> - Field of application */
  ADI ("ADI", "Field of application"),
  /** <code>ADJ</code> - Type of assets and liabilities */
  ADJ ("ADJ", "Type of assets and liabilities"),
  /** <code>ADK</code> - Promotion information */
  ADK ("ADK", "Promotion information"),
  /** <code>ADL</code> - Meter condition */
  ADL ("ADL", "Meter condition"),
  /** <code>ADM</code> - Meter reading information */
  ADM ("ADM", "Meter reading information"),
  /** <code>ADN</code> - Type of transaction reason */
  ADN ("ADN", "Type of transaction reason"),
  /** <code>ADO</code> - Type of survey question */
  ADO ("ADO", "Type of survey question"),
  /** <code>ADP</code> - Carrier's agent counter information */
  ADP ("ADP", "Carrier's agent counter information"),
  /** <code>ADQ</code> - Description of work item on equipment */
  ADQ ("ADQ", "Description of work item on equipment"),
  /** <code>ADR</code> - Message definition */
  ADR ("ADR", "Message definition"),
  /** <code>ADS</code> - Booked item information */
  ADS ("ADS", "Booked item information"),
  /** <code>ADT</code> - Source of document */
  ADT ("ADT", "Source of document"),
  /** <code>ADU</code> - Note */
  ADU ("ADU", "Note"),
  /** <code>ADV</code> - Fixed part of segment clarification text */
  ADV ("ADV", "Fixed part of segment clarification text"),
  /** <code>ADW</code> - Characteristics of goods */
  ADW ("ADW", "Characteristics of goods"),
  /** <code>ADX</code> - Additional discharge instructions */
  ADX ("ADX", "Additional discharge instructions"),
  /** <code>ADY</code> - Container stripping instructions */
  ADY ("ADY", "Container stripping instructions"),
  /** <code>ADZ</code> - CSC (Container Safety Convention) plate information */
  ADZ ("ADZ", "CSC (Container Safety Convention) plate information"),
  /** <code>AEA</code> - Cargo remarks */
  AEA ("AEA", "Cargo remarks"),
  /** <code>AEB</code> - Temperature control instructions */
  AEB ("AEB", "Temperature control instructions"),
  /** <code>AEC</code> - Text refers to expected data */
  AEC ("AEC", "Text refers to expected data"),
  /** <code>AED</code> - Text refers to received data */
  AED ("AED", "Text refers to received data"),
  /** <code>AEE</code> - Section clarification text */
  AEE ("AEE", "Section clarification text"),
  /** <code>AEF</code> - Information to the beneficiary */
  AEF ("AEF", "Information to the beneficiary"),
  /** <code>AEG</code> - Information to the applicant */
  AEG ("AEG", "Information to the applicant"),
  /** <code>AEH</code> - Instructions to the beneficiary */
  AEH ("AEH", "Instructions to the beneficiary"),
  /** <code>AEI</code> - Instructions to the applicant */
  AEI ("AEI", "Instructions to the applicant"),
  /** <code>AEJ</code> - Controlled atmosphere */
  AEJ ("AEJ", "Controlled atmosphere"),
  /** <code>AEK</code> - Take off annotation */
  AEK ("AEK", "Take off annotation"),
  /** <code>AEL</code> - Price variation narrative */
  AEL ("AEL", "Price variation narrative"),
  /** <code>AEM</code> - Documentary credit amendment instructions */
  AEM ("AEM", "Documentary credit amendment instructions"),
  /** <code>AEN</code> - Standard method narrative */
  AEN ("AEN", "Standard method narrative"),
  /** <code>AEO</code> - Project narrative */
  AEO ("AEO", "Project narrative"),
  /** <code>AEP</code> - Radioactive goods, additional information */
  AEP ("AEP", "Radioactive goods, additional information"),
  /** <code>AEQ</code> - Bank-to-bank information */
  AEQ ("AEQ", "Bank-to-bank information"),
  /** <code>AER</code> - Reimbursement instructions */
  AER ("AER", "Reimbursement instructions"),
  /** <code>AES</code> - Reason for amending a message */
  AES ("AES", "Reason for amending a message"),
  /** <code>AET</code> - Instructions to the paying and/or accepting and/or */
  AET ("AET", "Instructions to the paying and/or accepting and/or"),
  /** <code>AEU</code> - Interest instructions */
  AEU ("AEU", "Interest instructions"),
  /** <code>AEV</code> - Agent commission */
  AEV ("AEV", "Agent commission"),
  /** <code>AEW</code> - Remitting bank instructions */
  AEW ("AEW", "Remitting bank instructions"),
  /** <code>AEX</code> - Instructions to the collecting bank */
  AEX ("AEX", "Instructions to the collecting bank"),
  /** <code>AEY</code> - Collection amount instructions */
  AEY ("AEY", "Collection amount instructions"),
  /** <code>AEZ</code> - Internal auditing information */
  AEZ ("AEZ", "Internal auditing information"),
  /** <code>AFA</code> - Constraint */
  AFA ("AFA", "Constraint"),
  /** <code>AFB</code> - Comment */
  AFB ("AFB", "Comment"),
  /** <code>AFC</code> - Semantic note */
  AFC ("AFC", "Semantic note"),
  /** <code>AFD</code> - Help text */
  AFD ("AFD", "Help text"),
  /** <code>AFE</code> - Legend */
  AFE ("AFE", "Legend"),
  /** <code>AFF</code> - Batch code structure */
  AFF ("AFF", "Batch code structure"),
  /** <code>AFG</code> - Product application */
  AFG ("AFG", "Product application"),
  /** <code>AFH</code> - Customer complaint */
  AFH ("AFH", "Customer complaint"),
  /** <code>AFI</code> - Probable cause of fault */
  AFI ("AFI", "Probable cause of fault"),
  /** <code>AFJ</code> - Defect description */
  AFJ ("AFJ", "Defect description"),
  /** <code>AFK</code> - Repair description */
  AFK ("AFK", "Repair description"),
  /** <code>AFL</code> - Review comments */
  AFL ("AFL", "Review comments"),
  /** <code>AFM</code> - Title */
  AFM ("AFM", "Title"),
  /** <code>AFN</code> - Description of amount */
  AFN ("AFN", "Description of amount"),
  /** <code>AFO</code> - Responsibilities */
  AFO ("AFO", "Responsibilities"),
  /** <code>AFP</code> - Supplier */
  AFP ("AFP", "Supplier"),
  /** <code>AFQ</code> - Purchase region */
  AFQ ("AFQ", "Purchase region"),
  /** <code>AFR</code> - Affiliation */
  AFR ("AFR", "Affiliation"),
  /** <code>AFS</code> - Borrower */
  AFS ("AFS", "Borrower"),
  /** <code>AFT</code> - Line of business */
  AFT ("AFT", "Line of business"),
  /** <code>AFU</code> - Financial institution */
  AFU ("AFU", "Financial institution"),
  /** <code>AFV</code> - Business founder */
  AFV ("AFV", "Business founder"),
  /** <code>AFW</code> - Business history */
  AFW ("AFW", "Business history"),
  /** <code>AFX</code> - Banking arrangements */
  AFX ("AFX", "Banking arrangements"),
  /** <code>AFY</code> - Business origin */
  AFY ("AFY", "Business origin"),
  /** <code>AFZ</code> - Brand names' description */
  AFZ ("AFZ", "Brand names' description"),
  /** <code>AGA</code> - Business financing details */
  AGA ("AGA", "Business financing details"),
  /** <code>AGB</code> - Competition */
  AGB ("AGB", "Competition"),
  /** <code>AGC</code> - Construction process details */
  AGC ("AGC", "Construction process details"),
  /** <code>AGD</code> - Construction specialty */
  AGD ("AGD", "Construction specialty"),
  /** <code>AGE</code> - Contract information */
  AGE ("AGE", "Contract information"),
  /** <code>AGF</code> - Corporate filing */
  AGF ("AGF", "Corporate filing"),
  /** <code>AGG</code> - Customer information */
  AGG ("AGG", "Customer information"),
  /** <code>AGH</code> - Copyright notice */
  AGH ("AGH", "Copyright notice"),
  /** <code>AGI</code> - Contingent debt */
  AGI ("AGI", "Contingent debt"),
  /** <code>AGJ</code> - Conviction details */
  AGJ ("AGJ", "Conviction details"),
  /** <code>AGK</code> - Equipment */
  AGK ("AGK", "Equipment"),
  /** <code>AGL</code> - Workforce description */
  AGL ("AGL", "Workforce description"),
  /** <code>AGM</code> - Exemption */
  AGM ("AGM", "Exemption"),
  /** <code>AGN</code> - Future plans */
  AGN ("AGN", "Future plans"),
  /** <code>AGO</code> - Interviewee conversation information */
  AGO ("AGO", "Interviewee conversation information"),
  /** <code>AGP</code> - Intangible asset */
  AGP ("AGP", "Intangible asset"),
  /** <code>AGQ</code> - Inventory */
  AGQ ("AGQ", "Inventory"),
  /** <code>AGR</code> - Investment */
  AGR ("AGR", "Investment"),
  /** <code>AGS</code> - Intercompany relations information */
  AGS ("AGS", "Intercompany relations information"),
  /** <code>AGT</code> - Joint venture */
  AGT ("AGT", "Joint venture"),
  /** <code>AGU</code> - Loan */
  AGU ("AGU", "Loan"),
  /** <code>AGV</code> - Long term debt */
  AGV ("AGV", "Long term debt"),
  /** <code>AGW</code> - Location */
  AGW ("AGW", "Location"),
  /** <code>AGX</code> - Current legal structure */
  AGX ("AGX", "Current legal structure"),
  /** <code>AGY</code> - Marital contract */
  AGY ("AGY", "Marital contract"),
  /** <code>AGZ</code> - Marketing activities */
  AGZ ("AGZ", "Marketing activities"),
  /** <code>AHA</code> - Merger */
  AHA ("AHA", "Merger"),
  /** <code>AHB</code> - Marketable securities */
  AHB ("AHB", "Marketable securities"),
  /** <code>AHC</code> - Business debt */
  AHC ("AHC", "Business debt"),
  /** <code>AHD</code> - Original legal structure */
  AHD ("AHD", "Original legal structure"),
  /** <code>AHE</code> - Employee sharing arrangements */
  AHE ("AHE", "Employee sharing arrangements"),
  /** <code>AHF</code> - Organization details */
  AHF ("AHF", "Organization details"),
  /** <code>AHG</code> - Public record details */
  AHG ("AHG", "Public record details"),
  /** <code>AHH</code> - Price range */
  AHH ("AHH", "Price range"),
  /** <code>AHI</code> - Qualifications */
  AHI ("AHI", "Qualifications"),
  /** <code>AHJ</code> - Registered activity */
  AHJ ("AHJ", "Registered activity"),
  /** <code>AHK</code> - Criminal sentence */
  AHK ("AHK", "Criminal sentence"),
  /** <code>AHL</code> - Sales method */
  AHL ("AHL", "Sales method"),
  /** <code>AHM</code> - Educational institution information */
  AHM ("AHM", "Educational institution information"),
  /** <code>AHN</code> - Status details */
  AHN ("AHN", "Status details"),
  /** <code>AHO</code> - Sales */
  AHO ("AHO", "Sales"),
  /** <code>AHP</code> - Spouse information */
  AHP ("AHP", "Spouse information"),
  /** <code>AHQ</code> - Educational degree information */
  AHQ ("AHQ", "Educational degree information"),
  /** <code>AHR</code> - Shareholding information */
  AHR ("AHR", "Shareholding information"),
  /** <code>AHS</code> - Sales territory */
  AHS ("AHS", "Sales territory"),
  /** <code>AHT</code> - Accountant's comments */
  AHT ("AHT", "Accountant's comments"),
  /** <code>AHU</code> - Exemption law location */
  AHU ("AHU", "Exemption law location"),
  /** <code>AHV</code> - Share classifications */
  AHV ("AHV", "Share classifications"),
  /** <code>AHW</code> - Forecast */
  AHW ("AHW", "Forecast"),
  /** <code>AHX</code> - Event location */
  AHX ("AHX", "Event location"),
  /** <code>AHY</code> - Facility occupancy */
  AHY ("AHY", "Facility occupancy"),
  /** <code>AHZ</code> - Import and export details */
  AHZ ("AHZ", "Import and export details"),
  /** <code>AIA</code> - Additional facility information */
  AIA ("AIA", "Additional facility information"),
  /** <code>AIB</code> - Inventory value */
  AIB ("AIB", "Inventory value"),
  /** <code>AIC</code> - Education */
  AIC ("AIC", "Education"),
  /** <code>AID</code> - Event */
  AID ("AID", "Event"),
  /** <code>AIE</code> - Agent */
  AIE ("AIE", "Agent"),
  /** <code>AIF</code> - Domestically agreed financial statement details */
  AIF ("AIF", "Domestically agreed financial statement details"),
  /** <code>AIG</code> - Other current asset description */
  AIG ("AIG", "Other current asset description"),
  /** <code>AIH</code> - Other current liability description */
  AIH ("AIH", "Other current liability description"),
  /** <code>AII</code> - Former business activity */
  AII ("AII", "Former business activity"),
  /** <code>AIJ</code> - Trade name use */
  AIJ ("AIJ", "Trade name use"),
  /** <code>AIK</code> - Signing authority */
  AIK ("AIK", "Signing authority"),
  /** <code>AIL</code> - Guarantee */
  AIL ("AIL", "Guarantee"),
  /** <code>AIM</code> - Holding company operation */
  AIM ("AIM", "Holding company operation"),
  /** <code>AIN</code> - Consignment routing */
  AIN ("AIN", "Consignment routing"),
  /** <code>AIO</code> - Letter of protest */
  AIO ("AIO", "Letter of protest"),
  /** <code>AIP</code> - Question */
  AIP ("AIP", "Question"),
  /** <code>AIQ</code> - Party information */
  AIQ ("AIQ", "Party information"),
  /** <code>AIR</code> - Area boundaries description */
  AIR ("AIR", "Area boundaries description"),
  /** <code>AIS</code> - Advertisement information */
  AIS ("AIS", "Advertisement information"),
  /** <code>AIT</code> - Financial statement details */
  AIT ("AIT", "Financial statement details"),
  /** <code>AIU</code> - Access instructions */
  AIU ("AIU", "Access instructions"),
  /** <code>AIV</code> - Liquidity */
  AIV ("AIV", "Liquidity"),
  /** <code>AIW</code> - Credit line */
  AIW ("AIW", "Credit line"),
  /** <code>AIX</code> - Warranty terms */
  AIX ("AIX", "Warranty terms"),
  /** <code>AIY</code> - Division description */
  AIY ("AIY", "Division description"),
  /** <code>AIZ</code> - Reporting instruction */
  AIZ ("AIZ", "Reporting instruction"),
  /** <code>AJA</code> - Examination result */
  AJA ("AJA", "Examination result"),
  /** <code>AJB</code> - Laboratory result */
  AJB ("AJB", "Laboratory result"),
  /** <code>ALC</code> - Allowance/charge information */
  ALC ("ALC", "Allowance/charge information"),
  /** <code>ALD</code> - X-ray result */
  ALD ("ALD", "X-ray result"),
  /** <code>ALE</code> - Pathology result */
  ALE ("ALE", "Pathology result"),
  /** <code>ALF</code> - Intervention description */
  ALF ("ALF", "Intervention description"),
  /** <code>ALG</code> - Summary of admittance */
  ALG ("ALG", "Summary of admittance"),
  /** <code>ALH</code> - Medical treatment course detail */
  ALH ("ALH", "Medical treatment course detail"),
  /** <code>ALI</code> - Prognosis */
  ALI ("ALI", "Prognosis"),
  /** <code>ALJ</code> - Instruction to patient */
  ALJ ("ALJ", "Instruction to patient"),
  /** <code>ALK</code> - Instruction to physician */
  ALK ("ALK", "Instruction to physician"),
  /** <code>ALL</code> - All documents */
  ALL ("ALL", "All documents"),
  /** <code>ALM</code> - Medicine treatment */
  ALM ("ALM", "Medicine treatment"),
  /** <code>ALN</code> - Medicine dosage and administration */
  ALN ("ALN", "Medicine dosage and administration"),
  /** <code>ALO</code> - Availability of patient */
  ALO ("ALO", "Availability of patient"),
  /** <code>ALP</code> - Reason for service request */
  ALP ("ALP", "Reason for service request"),
  /** <code>ALQ</code> - Purpose of service */
  ALQ ("ALQ", "Purpose of service"),
  /** <code>ARR</code> - Arrival conditions */
  ARR ("ARR", "Arrival conditions"),
  /** <code>ARS</code> - Service requester's comment */
  ARS ("ARS", "Service requester's comment"),
  /** <code>AUT</code> - Authentication */
  AUT ("AUT", "Authentication"),
  /** <code>AUU</code> - Requested location description */
  AUU ("AUU", "Requested location description"),
  /** <code>AUV</code> - Medicine administration condition */
  AUV ("AUV", "Medicine administration condition"),
  /** <code>AUW</code> - Patient information */
  AUW ("AUW", "Patient information"),
  /** <code>AUX</code> - Precautionary measure */
  AUX ("AUX", "Precautionary measure"),
  /** <code>AUY</code> - Service characteristic */
  AUY ("AUY", "Service characteristic"),
  /** <code>AUZ</code> - Planned event comment */
  AUZ ("AUZ", "Planned event comment"),
  /** <code>AVA</code> - Expected delay comment */
  AVA ("AVA", "Expected delay comment"),
  /** <code>AVB</code> - Transport requirements comment */
  AVB ("AVB", "Transport requirements comment"),
  /** <code>AVC</code> - Temporary approval condition */
  AVC ("AVC", "Temporary approval condition"),
  /** <code>AVD</code> - Customs Valuation Information */
  AVD ("AVD", "Customs Valuation Information"),
  /** <code>AVE</code> - Value Added Tax (VAT) margin scheme */
  AVE ("AVE", "Value Added Tax (VAT) margin scheme"),
  /** <code>AVF</code> - Maritime Declaration of Health */
  AVF ("AVF", "Maritime Declaration of Health"),
  /** <code>BAG</code> - Passenger baggage information */
  BAG ("BAG", "Passenger baggage information"),
  /** <code>BAH</code> - Maritime Declaration of Health */
  BAH ("BAH", "Maritime Declaration of Health"),
  /** <code>BAI</code> - Additional product information address */
  BAI ("BAI", "Additional product information address"),
  /** <code>BAJ</code> - Information to be printed on despatch advice */
  BAJ ("BAJ", "Information to be printed on despatch advice"),
  /** <code>BAK</code> - Missing goods remarks */
  BAK ("BAK", "Missing goods remarks"),
  /** <code>BAL</code> - Non-acceptance information */
  BAL ("BAL", "Non-acceptance information"),
  /** <code>BAM</code> - Returns information */
  BAM ("BAM", "Returns information"),
  /** <code>BAN</code> - Sub-line item information */
  BAN ("BAN", "Sub-line item information"),
  /** <code>BAO</code> - Test information */
  BAO ("BAO", "Test information"),
  /** <code>BAP</code> - External link */
  BAP ("BAP", "External link"),
  /** <code>BAQ</code> - VAT exemption reason */
  BAQ ("BAQ", "VAT exemption reason"),
  /** <code>BAR</code> - Processing Instructions */
  BAR ("BAR", "Processing Instructions"),
  /** <code>BAS</code> - Relay Instructions */
  BAS ("BAS", "Relay Instructions"),
  /** <code>BAT</code> - SIMA applicable */
  BAT ("BAT", "SIMA applicable"),
  /** <code>BAU</code> - Appeals program code */
  BAU ("BAU", "Appeals program code"),
  /** <code>BAV</code> - SIMA subject */
  BAV ("BAV", "SIMA subject"),
  /** <code>BAW</code> - Surtax applicable */
  BAW ("BAW", "Surtax applicable"),
  /** <code>BAX</code> - SIMA security bond */
  BAX ("BAX", "SIMA security bond"),
  /** <code>BAY</code> - Surtax subject */
  BAY ("BAY", "Surtax subject"),
  /** <code>BAZ</code> - Safeguard applicable */
  BAZ ("BAZ", "Safeguard applicable"),
  /** <code>BBA</code> - Safeguard applicable */
  BBA ("BBA", "Safeguard applicable"),
  /** <code>BBB</code> - Safeguard subject */
  BBB ("BBB", "Safeguard subject"),
  /** <code>BLC</code> - Transport contract document clause */
  BLC ("BLC", "Transport contract document clause"),
  /** <code>BLD</code> - Instruction to prepare the patient */
  BLD ("BLD", "Instruction to prepare the patient"),
  /** <code>BLE</code> - Medicine treatment comment */
  BLE ("BLE", "Medicine treatment comment"),
  /** <code>BLF</code> - Examination result comment */
  BLF ("BLF", "Examination result comment"),
  /** <code>BLG</code> - Service request comment */
  BLG ("BLG", "Service request comment"),
  /** <code>BLH</code> - Prescription reason */
  BLH ("BLH", "Prescription reason"),
  /** <code>BLI</code> - Prescription comment */
  BLI ("BLI", "Prescription comment"),
  /** <code>BLJ</code> - Clinical investigation comment */
  BLJ ("BLJ", "Clinical investigation comment"),
  /** <code>BLK</code> - Medicinal specification comment */
  BLK ("BLK", "Medicinal specification comment"),
  /** <code>BLL</code> - Economic contribution comment */
  BLL ("BLL", "Economic contribution comment"),
  /** <code>BLM</code> - Status of a plan */
  BLM ("BLM", "Status of a plan"),
  /** <code>BLN</code> - Random sample test information */
  BLN ("BLN", "Random sample test information"),
  /** <code>BLO</code> - Period of time */
  BLO ("BLO", "Period of time"),
  /** <code>BLP</code> - Legislation */
  BLP ("BLP", "Legislation"),
  /** <code>BLQ</code> - Security measures requested */
  BLQ ("BLQ", "Security measures requested"),
  /** <code>BLR</code> - Transport contract document remark */
  BLR ("BLR", "Transport contract document remark"),
  /** <code>BLS</code> - Previous port of call security information */
  BLS ("BLS", "Previous port of call security information"),
  /** <code>BLT</code> - Security information */
  BLT ("BLT", "Security information"),
  /** <code>BLU</code> - Waste information */
  BLU ("BLU", "Waste information"),
  /** <code>BLV</code> - B2C marketing information, short description */
  BLV ("BLV", "B2C marketing information, short description"),
  /** <code>BLW</code> - B2B marketing information, long description */
  BLW ("BLW", "B2B marketing information, long description"),
  /** <code>BLX</code> - B2C marketing information, long description */
  BLX ("BLX", "B2C marketing information, long description"),
  /** <code>BLY</code> - Product ingredients */
  BLY ("BLY", "Product ingredients"),
  /** <code>BLZ</code> - Location short name */
  BLZ ("BLZ", "Location short name"),
  /** <code>BMA</code> - Packaging material information */
  BMA ("BMA", "Packaging material information"),
  /** <code>BMB</code> - Filler material information */
  BMB ("BMB", "Filler material information"),
  /** <code>BMC</code> - Ship-to-ship activity information */
  BMC ("BMC", "Ship-to-ship activity information"),
  /** <code>BMD</code> - Package material description */
  BMD ("BMD", "Package material description"),
  /** <code>BME</code> - Consumer level package marking */
  BME ("BME", "Consumer level package marking"),
  /** <code>BMF</code> - SIMA measure in force */
  BMF ("BMF", "SIMA measure in force"),
  /** <code>BMG</code> - Pre-CARM */
  BMG ("BMG", "Pre-CARM"),
  /** <code>BMH</code> - SIMA measure type */
  BMH ("BMH", "SIMA measure type"),
  /** <code>CCI</code> - Customs clearance instructions */
  CCI ("CCI", "Customs clearance instructions"),
  /** <code>CCJ</code> - Sub Type Code */
  CCJ ("CCJ", "Sub Type Code"),
  /** <code>CCK</code> - SIMA information */
  CCK ("CCK", "SIMA information"),
  /** <code>CCL</code> - Time limit end */
  CCL ("CCL", "Time limit end"),
  /** <code>CCM</code> - Time limit start */
  CCM ("CCM", "Time limit start"),
  /** <code>CCN</code> - Warehouse time limit */
  CCN ("CCN", "Warehouse time limit"),
  /** <code>CCO</code> - Value for duty information */
  CCO ("CCO", "Value for duty information"),
  /** <code>CEX</code> - Customs clearance instructions export */
  CEX ("CEX", "Customs clearance instructions export"),
  /** <code>CHG</code> - Change information */
  CHG ("CHG", "Change information"),
  /** <code>CIP</code> - Customs clearance instruction import */
  CIP ("CIP", "Customs clearance instruction import"),
  /** <code>CLP</code> - Clearance place requested */
  CLP ("CLP", "Clearance place requested"),
  /** <code>CLR</code> - Loading remarks */
  CLR ("CLR", "Loading remarks"),
  /** <code>COI</code> - Order information */
  COI ("COI", "Order information"),
  /** <code>CUR</code> - Customer remarks */
  CUR ("CUR", "Customer remarks"),
  /** <code>CUS</code> - Customs declaration information */
  CUS ("CUS", "Customs declaration information"),
  /** <code>DAR</code> - Damage remarks */
  DAR ("DAR", "Damage remarks"),
  /** <code>DCL</code> - Document issuer declaration */
  DCL ("DCL", "Document issuer declaration"),
  /** <code>DEL</code> - Delivery information */
  DEL ("DEL", "Delivery information"),
  /** <code>DIN</code> - Delivery instructions */
  DIN ("DIN", "Delivery instructions"),
  /** <code>DOC</code> - Documentation instructions */
  DOC ("DOC", "Documentation instructions"),
  /** <code>DUT</code> - Duty declaration */
  DUT ("DUT", "Duty declaration"),
  /** <code>EUR</code> - Effective used routing */
  EUR ("EUR", "Effective used routing"),
  /** <code>FBC</code> - First block to be printed on the transport contract */
  FBC ("FBC", "First block to be printed on the transport contract"),
  /** <code>GBL</code> - Government bill of lading information */
  GBL ("GBL", "Government bill of lading information"),
  /** <code>GEN</code> - Entire transaction set */
  GEN ("GEN", "Entire transaction set"),
  /** <code>GS7</code> - Further information concerning GGVS par. 7 */
  GS7 ("GS7", "Further information concerning GGVS par. 7"),
  /** <code>HAN</code> - Consignment handling instruction */
  HAN ("HAN", "Consignment handling instruction"),
  /** <code>HAZ</code> - Hazard information */
  HAZ ("HAZ", "Hazard information"),
  /** <code>ICN</code> - Consignment information for consignee */
  ICN ("ICN", "Consignment information for consignee"),
  /** <code>IIN</code> - Insurance instructions */
  IIN ("IIN", "Insurance instructions"),
  /** <code>IMI</code> - Invoice mailing instructions */
  IMI ("IMI", "Invoice mailing instructions"),
  /** <code>IND</code> - Commercial invoice item description */
  IND ("IND", "Commercial invoice item description"),
  /** <code>INS</code> - Insurance information */
  INS ("INS", "Insurance information"),
  /** <code>INV</code> - Invoice instruction */
  INV ("INV", "Invoice instruction"),
  /** <code>IRP</code> - Information for railway purpose */
  IRP ("IRP", "Information for railway purpose"),
  /** <code>ITR</code> - Inland transport details */
  ITR ("ITR", "Inland transport details"),
  /** <code>ITS</code> - Testing instructions */
  ITS ("ITS", "Testing instructions"),
  /** <code>LAN</code> - Location Alias */
  LAN ("LAN", "Location Alias"),
  /** <code>LIN</code> - Line item */
  LIN ("LIN", "Line item"),
  /** <code>LOI</code> - Loading instruction */
  LOI ("LOI", "Loading instruction"),
  /** <code>MCO</code> - Miscellaneous charge order */
  MCO ("MCO", "Miscellaneous charge order"),
  /** <code>MDH</code> - Maritime Declaration of Health */
  MDH ("MDH", "Maritime Declaration of Health"),
  /** <code>MKS</code> - Additional marks/numbers information */
  MKS ("MKS", "Additional marks/numbers information"),
  /** <code>ORI</code> - Order instruction */
  ORI ("ORI", "Order instruction"),
  /** <code>OSI</code> - Other service information */
  OSI ("OSI", "Other service information"),
  /** <code>PAC</code> - Packing/marking information */
  PAC ("PAC", "Packing/marking information"),
  /** <code>PAI</code> - Payment instructions information */
  PAI ("PAI", "Payment instructions information"),
  /** <code>PAY</code> - Payables information */
  PAY ("PAY", "Payables information"),
  /** <code>PKG</code> - Packaging information */
  PKG ("PKG", "Packaging information"),
  /** <code>PKT</code> - Packaging terms information */
  PKT ("PKT", "Packaging terms information"),
  /** <code>PMD</code> - Payment detail/remittance information */
  PMD ("PMD", "Payment detail/remittance information"),
  /** <code>PMT</code> - Payment information */
  PMT ("PMT", "Payment information"),
  /** <code>PRD</code> - Product information */
  PRD ("PRD", "Product information"),
  /** <code>PRF</code> - Price calculation formula */
  PRF ("PRF", "Price calculation formula"),
  /** <code>PRI</code> - Priority information */
  PRI ("PRI", "Priority information"),
  /** <code>PUR</code> - Purchasing information */
  PUR ("PUR", "Purchasing information"),
  /** <code>QIN</code> - Quarantine instructions */
  QIN ("QIN", "Quarantine instructions"),
  /** <code>QQD</code> - Quality demands/requirements */
  QQD ("QQD", "Quality demands/requirements"),
  /** <code>QUT</code> - Quotation instruction/information */
  QUT ("QUT", "Quotation instruction/information"),
  /** <code>RAH</code> - Risk and handling information */
  RAH ("RAH", "Risk and handling information"),
  /** <code>REG</code> - Regulatory information */
  REG ("REG", "Regulatory information"),
  /** <code>RET</code> - Return to origin information */
  RET ("RET", "Return to origin information"),
  /** <code>REV</code> - Receivables */
  REV ("REV", "Receivables"),
  /** <code>RQR</code> - Consignment route */
  RQR ("RQR", "Consignment route"),
  /** <code>SAF</code> - Safety information */
  SAF ("SAF", "Safety information"),
  /** <code>SIC</code> - Consignment documentary instruction */
  SIC ("SIC", "Consignment documentary instruction"),
  /** <code>SIN</code> - Special instructions */
  SIN ("SIN", "Special instructions"),
  /** <code>SLR</code> - Ship line requested */
  SLR ("SLR", "Ship line requested"),
  /** <code>SPA</code> - Special permission for transport, generally */
  SPA ("SPA", "Special permission for transport, generally"),
  /** <code>SPG</code> - Special permission concerning the goods to be transported */
  SPG ("SPG", "Special permission concerning the goods to be transported"),
  /** <code>SPH</code> - Special handling */
  SPH ("SPH", "Special handling"),
  /** <code>SPP</code> - Special permission concerning package */
  SPP ("SPP", "Special permission concerning package"),
  /** <code>SPT</code> - Special permission concerning transport means */
  SPT ("SPT", "Special permission concerning transport means"),
  /** <code>SRN</code> - Subsidiary risk number (IATA/DGR) */
  SRN ("SRN", "Subsidiary risk number (IATA/DGR)"),
  /** <code>SSR</code> - Special service request */
  SSR ("SSR", "Special service request"),
  /** <code>SUR</code> - Supplier remarks */
  SUR ("SUR", "Supplier remarks"),
  /** <code>TCA</code> - Consignment tariff */
  TCA ("TCA", "Consignment tariff"),
  /** <code>TDT</code> - Consignment transport */
  TDT ("TDT", "Consignment transport"),
  /** <code>TRA</code> - Transportation information */
  TRA ("TRA", "Transportation information"),
  /** <code>TRR</code> - Requested tariff */
  TRR ("TRR", "Requested tariff"),
  /** <code>TXD</code> - Tax declaration */
  TXD ("TXD", "Tax declaration"),
  /** <code>WHI</code> - Warehouse instruction/information */
  WHI ("WHI", "Warehouse instruction/information"),
  /** <code>ZZZ</code> - Mutually defined */
  ZZZ ("ZZZ", "Mutually defined");

  private static final ICommonsMap <String, EEN16931TextSubjectCode> MAP_BY_ID = new CommonsHashMap <> ();

  static
  {
    for (final EEN16931TextSubjectCode e : values ())
      MAP_BY_ID.put (e.m_sID, e);
  }

  private final String m_sID;
  private final String m_sDisplayName;

  EEN16931TextSubjectCode (@NonNull @Nonempty final String sID,
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
  public static EEN16931TextSubjectCode getFromIDOrNull (@Nullable final String sID)
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
