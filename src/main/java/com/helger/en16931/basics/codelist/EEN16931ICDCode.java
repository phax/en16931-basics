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
 * ISO/IEC 6523 identifier scheme codes.
 * <p>
 * Used by BT-29-1, BT-30-1, BT-46-1, BT-47-1, BT-60-1, BT-61-1, BT-71-1 and BT-157-1. EN 16931 uses
 * this code list as a full list.
 * <p>
 * Source of truth: sheet <code>ICD</code> of the EN 16931 code list workbook. The implemented
 * version of that workbook is {@link EN16931CodeLists#CODE_LIST_VERSION}, and the registry it comes
 * from is named in {@link EN16931CodeLists}.
 *
 * @author Philip Helger
 */
@CodingStyleguideUnaware
public enum EEN16931ICDCode implements IHasID <String>, IHasDisplayName
{
  /** <code>0002</code> - System Information et Repertoire des Entreprise et des Etablissements: SIRENE */
  _0002 ("0002", "System Information et Repertoire des Entreprise et des Etablissements: SIRENE"),
  /** <code>0003</code> - Codification Numerique des Etablissments Financiers En Belgique */
  _0003 ("0003", "Codification Numerique des Etablissments Financiers En Belgique"),
  /** <code>0004</code> - NBS/OSI NETWORK */
  _0004 ("0004", "NBS/OSI NETWORK"),
  /** <code>0005</code> - USA FED GOV OSI NETWORK */
  _0005 ("0005", "USA FED GOV OSI NETWORK"),
  /** <code>0006</code> - USA DOD OSI NETWORK */
  _0006 ("0006", "USA DOD OSI NETWORK"),
  /** <code>0007</code> - Organisationsnummer */
  _0007 ("0007", "Organisationsnummer"),
  /** <code>0008</code> - LE NUMERO NATIONAL */
  _0008 ("0008", "LE NUMERO NATIONAL"),
  /** <code>0009</code> - SIRET-CODE */
  _0009 ("0009", "SIRET-CODE"),
  /** <code>0010</code> - Organizational Identifiers for Structured Names under ISO 9541 Part 2 */
  _0010 ("0010", "Organizational Identifiers for Structured Names under ISO 9541 Part 2"),
  /** <code>0011</code> - International Code Designator for the Identification of OSI-based, Amateur Radio Organizations, Network Objects and Application Services. */
  _0011 ("0011", "International Code Designator for the Identification of OSI-based, Amateur Radio Organizations, Network Objects and Application Services."),
  /** <code>0012</code> - European Computer Manufacturers Association: ECMA */
  _0012 ("0012", "European Computer Manufacturers Association: ECMA"),
  /** <code>0013</code> - VSA FTP CODE (FTP = File Transfer Protocol) */
  _0013 ("0013", "VSA FTP CODE (FTP = File Transfer Protocol)"),
  /** <code>0014</code> - NIST/OSI Implememts' Workshop */
  _0014 ("0014", "NIST/OSI Implememts' Workshop"),
  /** <code>0015</code> - Electronic Data Interchange: EDI */
  _0015 ("0015", "Electronic Data Interchange: EDI"),
  /** <code>0016</code> - EWOS Object Identifiers */
  _0016 ("0016", "EWOS Object Identifiers"),
  /** <code>0017</code> - COMMON LANGUAGE */
  _0017 ("0017", "COMMON LANGUAGE"),
  /** <code>0018</code> - SNA/OSI Network */
  _0018 ("0018", "SNA/OSI Network"),
  /** <code>0019</code> - Air Transport Industry Services Communications Network */
  _0019 ("0019", "Air Transport Industry Services Communications Network"),
  /** <code>0020</code> - European Laboratory for Particle Physics: CERN */
  _0020 ("0020", "European Laboratory for Particle Physics: CERN"),
  /** <code>0021</code> - SOCIETY FOR WORLDWIDE INTERBANK FINANCIAL, TELECOMMUNICATION S.W.I.F.T. */
  _0021 ("0021", "SOCIETY FOR WORLDWIDE INTERBANK FINANCIAL, TELECOMMUNICATION S.W.I.F.T."),
  /** <code>0022</code> - OSF Distributed Computing Object Identification */
  _0022 ("0022", "OSF Distributed Computing Object Identification"),
  /** <code>0023</code> - Nordic University and Research Network: NORDUnet */
  _0023 ("0023", "Nordic University and Research Network: NORDUnet"),
  /** <code>0024</code> - Digital Equipment Corporation: DEC */
  _0024 ("0024", "Digital Equipment Corporation: DEC"),
  /** <code>0025</code> - OSI ASIA-OCEANIA WORKSHOP */
  _0025 ("0025", "OSI ASIA-OCEANIA WORKSHOP"),
  /** <code>0026</code> - NATO ISO 6523 ICDE coding scheme */
  _0026 ("0026", "NATO ISO 6523 ICDE coding scheme"),
  /** <code>0027</code> - Aeronautical Telecommunications Network (ATN) */
  _0027 ("0027", "Aeronautical Telecommunications Network (ATN)"),
  /** <code>0028</code> - International Standard ISO 6523 */
  _0028 ("0028", "International Standard ISO 6523"),
  /** <code>0029</code> - The All-Union Classifier of Enterprises and Organisations */
  _0029 ("0029", "The All-Union Classifier of Enterprises and Organisations"),
  /** <code>0030</code> - AT&amp;T/OSI Network */
  _0030 ("0030", "AT&T/OSI Network"),
  /** <code>0031</code> - EDI Partner Identification Code */
  _0031 ("0031", "EDI Partner Identification Code"),
  /** <code>0032</code> - Telecom Australia */
  _0032 ("0032", "Telecom Australia"),
  /** <code>0033</code> - S G W OSI Internetwork */
  _0033 ("0033", "S G W OSI Internetwork"),
  /** <code>0034</code> - Reuter Open Address Standard */
  _0034 ("0034", "Reuter Open Address Standard"),
  /** <code>0035</code> - ISO 6523 - ICD */
  _0035 ("0035", "ISO 6523 - ICD"),
  /** <code>0036</code> - TeleTrust Object Identifiers */
  _0036 ("0036", "TeleTrust Object Identifiers"),
  /** <code>0037</code> - LY-tunnus */
  _0037 ("0037", "LY-tunnus"),
  /** <code>0038</code> - The Australian GOSIP Network */
  _0038 ("0038", "The Australian GOSIP Network"),
  /** <code>0039</code> - The OZ DOD OSI Network */
  _0039 ("0039", "The OZ DOD OSI Network"),
  /** <code>0040</code> - Unilever Group Companies */
  _0040 ("0040", "Unilever Group Companies"),
  /** <code>0041</code> - Citicorp Global Information Network */
  _0041 ("0041", "Citicorp Global Information Network"),
  /** <code>0042</code> - DBP Telekom Object Identifiers */
  _0042 ("0042", "DBP Telekom Object Identifiers"),
  /** <code>0043</code> - HydroNETT */
  _0043 ("0043", "HydroNETT"),
  /** <code>0044</code> - Thai Industrial Standards Institute (TISI) */
  _0044 ("0044", "Thai Industrial Standards Institute (TISI)"),
  /** <code>0045</code> - ICI Company Identification System */
  _0045 ("0045", "ICI Company Identification System"),
  /** <code>0046</code> - FUNLOC */
  _0046 ("0046", "FUNLOC"),
  /** <code>0047</code> - BULL ODI/DSA/UNIX Network */
  _0047 ("0047", "BULL ODI/DSA/UNIX Network"),
  /** <code>0048</code> - OSINZ */
  _0048 ("0048", "OSINZ"),
  /** <code>0049</code> - Auckland Area Health */
  _0049 ("0049", "Auckland Area Health"),
  /** <code>0050</code> - Firmenich */
  _0050 ("0050", "Firmenich"),
  /** <code>0051</code> - AGFA-DIS */
  _0051 ("0051", "AGFA-DIS"),
  /** <code>0052</code> - Society of Motion Picture and Television Engineers (SMPTE) */
  _0052 ("0052", "Society of Motion Picture and Television Engineers (SMPTE)"),
  /** <code>0053</code> - Migros_Network M_NETOPZ */
  _0053 ("0053", "Migros_Network M_NETOPZ"),
  /** <code>0054</code> - ISO6523 - ICDPCR */
  _0054 ("0054", "ISO6523 - ICDPCR"),
  /** <code>0055</code> - Energy Net */
  _0055 ("0055", "Energy Net"),
  /** <code>0056</code> - Nokia Object Identifiers (NOI) */
  _0056 ("0056", "Nokia Object Identifiers (NOI)"),
  /** <code>0057</code> - Saint Gobain */
  _0057 ("0057", "Saint Gobain"),
  /** <code>0058</code> - Siemens Corporate Network */
  _0058 ("0058", "Siemens Corporate Network"),
  /** <code>0059</code> - DANZNET */
  _0059 ("0059", "DANZNET"),
  /** <code>0060</code> - Data Universal Numbering System (D-U-N-S Number) */
  _0060 ("0060", "Data Universal Numbering System (D-U-N-S Number)"),
  /** <code>0061</code> - SOFFEX OSI */
  _0061 ("0061", "SOFFEX OSI"),
  /** <code>0062</code> - KPN OVN */
  _0062 ("0062", "KPN OVN"),
  /** <code>0063</code> - ascomOSINet */
  _0063 ("0063", "ascomOSINet"),
  /** <code>0064</code> - UTC: Uniforme Transport Code */
  _0064 ("0064", "UTC: Uniforme Transport Code"),
  /** <code>0065</code> - SOLVAY OSI CODING */
  _0065 ("0065", "SOLVAY OSI CODING"),
  /** <code>0066</code> - Roche Corporate Network */
  _0066 ("0066", "Roche Corporate Network"),
  /** <code>0067</code> - ZellwegerOSINet */
  _0067 ("0067", "ZellwegerOSINet"),
  /** <code>0068</code> - Intel Corporation OSI */
  _0068 ("0068", "Intel Corporation OSI"),
  /** <code>0069</code> - SITA Object Identifier Tree */
  _0069 ("0069", "SITA Object Identifier Tree"),
  /** <code>0070</code> - DaimlerChrysler Corporate Network */
  _0070 ("0070", "DaimlerChrysler Corporate Network"),
  /** <code>0071</code> - LEGO /OSI NETWORK */
  _0071 ("0071", "LEGO /OSI NETWORK"),
  /** <code>0072</code> - NAVISTAR/OSI Network */
  _0072 ("0072", "NAVISTAR/OSI Network"),
  /** <code>0073</code> - ICD Formatted ATM address */
  _0073 ("0073", "ICD Formatted ATM address"),
  /** <code>0074</code> - ARINC */
  _0074 ("0074", "ARINC"),
  /** <code>0075</code> - Alcanet/Alcatel-Alsthom Corporate Network */
  _0075 ("0075", "Alcanet/Alcatel-Alsthom Corporate Network"),
  /** <code>0076</code> - Sistema Italiano di Identificazione di ogetti gestito da UNINFO */
  _0076 ("0076", "Sistema Italiano di Identificazione di ogetti gestito da UNINFO"),
  /** <code>0077</code> - Sistema Italiano di Indirizzamento di Reti OSI Gestito da UNINFO */
  _0077 ("0077", "Sistema Italiano di Indirizzamento di Reti OSI Gestito da UNINFO"),
  /** <code>0078</code> - Mitel terminal or switching equipment */
  _0078 ("0078", "Mitel terminal or switching equipment"),
  /** <code>0079</code> - ATM Forum */
  _0079 ("0079", "ATM Forum"),
  /** <code>0080</code> - UK National Health Service Scheme, (EDIRA compliant) */
  _0080 ("0080", "UK National Health Service Scheme, (EDIRA compliant)"),
  /** <code>0081</code> - International NSAP */
  _0081 ("0081", "International NSAP"),
  /** <code>0082</code> - Norwegian Telecommunications Authority's, NTA'S, EDI, identifier scheme (EDIRA compliant) */
  _0082 ("0082", "Norwegian Telecommunications Authority's, NTA'S, EDI, identifier scheme (EDIRA compliant)"),
  /** <code>0083</code> - Advanced Telecommunications Modules Limited, Corporate Network */
  _0083 ("0083", "Advanced Telecommunications Modules Limited, Corporate Network"),
  /** <code>0084</code> - Athens Chamber of Commerce &amp; Industry Scheme (EDIRA compliant) */
  _0084 ("0084", "Athens Chamber of Commerce & Industry Scheme (EDIRA compliant)"),
  /** <code>0085</code> - Swiss Chambers of Commerce Scheme (EDIRA) compliant */
  _0085 ("0085", "Swiss Chambers of Commerce Scheme (EDIRA) compliant"),
  /** <code>0086</code> - United States Council for International Business (USCIB) Scheme, (EDIRA compliant) */
  _0086 ("0086", "United States Council for International Business (USCIB) Scheme, (EDIRA compliant)"),
  /** <code>0087</code> - National Federation of Chambers of Commerce &amp; Industry of Belgium, Scheme (EDIRA compliant) */
  _0087 ("0087", "National Federation of Chambers of Commerce & Industry of Belgium, Scheme (EDIRA compliant)"),
  /** <code>0088</code> - EAN Location Code */
  _0088 ("0088", "EAN Location Code"),
  /** <code>0089</code> - The Association of British Chambers of Commerce Ltd. Scheme, (EDIRA compliant) */
  _0089 ("0089", "The Association of British Chambers of Commerce Ltd. Scheme, (EDIRA compliant)"),
  /** <code>0090</code> - Internet IP addressing - ISO 6523 ICD encoding */
  _0090 ("0090", "Internet IP addressing - ISO 6523 ICD encoding"),
  /** <code>0091</code> - Cisco Sysytems / OSI Network */
  _0091 ("0091", "Cisco Sysytems / OSI Network"),
  /** <code>0093</code> - Revenue Canada Business Number Registration (EDIRA compliant) */
  _0093 ("0093", "Revenue Canada Business Number Registration (EDIRA compliant)"),
  /** <code>0094</code> - DEUTSCHER INDUSTRIE- UND HANDELSTAG (DIHT) Scheme (EDIRA compliant) */
  _0094 ("0094", "DEUTSCHER INDUSTRIE- UND HANDELSTAG (DIHT) Scheme (EDIRA compliant)"),
  /** <code>0095</code> - Hewlett - Packard Company Internal AM Network */
  _0095 ("0095", "Hewlett - Packard Company Internal AM Network"),
  /** <code>0096</code> - The Danish Business Authority - P-number (DK:P) */
  _0096 ("0096", "The Danish Business Authority - P-number (DK:P)"),
  /** <code>0097</code> - FTI - Ediforum Italia, (EDIRA compliant) */
  _0097 ("0097", "FTI - Ediforum Italia, (EDIRA compliant)"),
  /** <code>0098</code> - CHAMBER OF COMMERCE TEL AVIV-JAFFA Scheme (EDIRA compliant) */
  _0098 ("0098", "CHAMBER OF COMMERCE TEL AVIV-JAFFA Scheme (EDIRA compliant)"),
  /** <code>0099</code> - Siemens Supervisory Systems Network */
  _0099 ("0099", "Siemens Supervisory Systems Network"),
  /** <code>0100</code> - PNG_ICD Scheme */
  _0100 ("0100", "PNG_ICD Scheme"),
  /** <code>0101</code> - South African Code Allocation */
  _0101 ("0101", "South African Code Allocation"),
  /** <code>0102</code> - HEAG */
  _0102 ("0102", "HEAG"),
  /** <code>0104</code> - BT - ICD Coding System */
  _0104 ("0104", "BT - ICD Coding System"),
  /** <code>0105</code> - Portuguese Chamber of Commerce and Industry Scheme (EDIRA compliant) */
  _0105 ("0105", "Portuguese Chamber of Commerce and Industry Scheme (EDIRA compliant)"),
  /** <code>0106</code> - Vereniging van Kamers van Koophandel en Fabrieken in Nederland (Association of Chambers of Commerce and Industry in the Netherlands), Scheme (EDIRA compliant) */
  _0106 ("0106", "Vereniging van Kamers van Koophandel en Fabrieken in Nederland (Association of Chambers of Commerce and Industry in the Netherlands), Scheme (EDIRA compliant)"),
  /** <code>0107</code> - Association of Swedish Chambers of Commerce and Industry Scheme (EDIRA compliant) */
  _0107 ("0107", "Association of Swedish Chambers of Commerce and Industry Scheme (EDIRA compliant)"),
  /** <code>0108</code> - Australian Chambers of Commerce and Industry Scheme (EDIRA compliant) */
  _0108 ("0108", "Australian Chambers of Commerce and Industry Scheme (EDIRA compliant)"),
  /** <code>0109</code> - BellSouth ICD AESA (ATM End System Address) */
  _0109 ("0109", "BellSouth ICD AESA (ATM End System Address)"),
  /** <code>0110</code> - Bell Atlantic */
  _0110 ("0110", "Bell Atlantic"),
  /** <code>0111</code> - Object Identifiers */
  _0111 ("0111", "Object Identifiers"),
  /** <code>0112</code> - ISO register for Standards producing Organizations */
  _0112 ("0112", "ISO register for Standards producing Organizations"),
  /** <code>0113</code> - OriginNet */
  _0113 ("0113", "OriginNet"),
  /** <code>0114</code> - Check Point Software Technologies */
  _0114 ("0114", "Check Point Software Technologies"),
  /** <code>0115</code> - Pacific Bell Data Communications Network */
  _0115 ("0115", "Pacific Bell Data Communications Network"),
  /** <code>0116</code> - PSS Object Identifiers */
  _0116 ("0116", "PSS Object Identifiers"),
  /** <code>0117</code> - STENTOR-ICD CODING SYSTEM */
  _0117 ("0117", "STENTOR-ICD CODING SYSTEM"),
  /** <code>0118</code> - ATM-Network ZN'96 */
  _0118 ("0118", "ATM-Network ZN'96"),
  /** <code>0119</code> - MCI / OSI Network */
  _0119 ("0119", "MCI / OSI Network"),
  /** <code>0120</code> - Advantis */
  _0120 ("0120", "Advantis"),
  /** <code>0121</code> - Affable Software Data Interchange Codes */
  _0121 ("0121", "Affable Software Data Interchange Codes"),
  /** <code>0122</code> - BB-DATA GmbH */
  _0122 ("0122", "BB-DATA GmbH"),
  /** <code>0123</code> - BASF Company ATM-Network */
  _0123 ("0123", "BASF Company ATM-Network"),
  /** <code>0124</code> - IOTA Identifiers for Organizations for Telecommunications Addressing using the ICD system format defined in ISO/IEC 8348 */
  _0124 ("0124", "IOTA Identifiers for Organizations for Telecommunications Addressing using the ICD system format defined in ISO/IEC 8348"),
  /** <code>0125</code> - Henkel Corporate Network (H-Net) */
  _0125 ("0125", "Henkel Corporate Network (H-Net)"),
  /** <code>0126</code> - GTE/OSI Network */
  _0126 ("0126", "GTE/OSI Network"),
  /** <code>0127</code> - Dresdner Bank Corporate Network */
  _0127 ("0127", "Dresdner Bank Corporate Network"),
  /** <code>0128</code> - BCNR (Swiss Clearing Bank Number) */
  _0128 ("0128", "BCNR (Swiss Clearing Bank Number)"),
  /** <code>0129</code> - BPI (Swiss Business Partner Identification) code */
  _0129 ("0129", "BPI (Swiss Business Partner Identification) code"),
  /** <code>0130</code> - Directorates of the European Commission */
  _0130 ("0130", "Directorates of the European Commission"),
  /** <code>0131</code> - Code for the Identification of National Organizations */
  _0131 ("0131", "Code for the Identification of National Organizations"),
  /** <code>0132</code> - Certicom Object Identifiers */
  _0132 ("0132", "Certicom Object Identifiers"),
  /** <code>0133</code> - TC68 OID */
  _0133 ("0133", "TC68 OID"),
  /** <code>0134</code> - Infonet Services Corporation */
  _0134 ("0134", "Infonet Services Corporation"),
  /** <code>0135</code> - SIA Object Identifiers */
  _0135 ("0135", "SIA Object Identifiers"),
  /** <code>0136</code> - Cable &amp; Wireless Global ATM End-System Address Plan */
  _0136 ("0136", "Cable & Wireless Global ATM End-System Address Plan"),
  /** <code>0137</code> - Global AESA scheme */
  _0137 ("0137", "Global AESA scheme"),
  /** <code>0138</code> - France Telecom ATM End System Address Plan */
  _0138 ("0138", "France Telecom ATM End System Address Plan"),
  /** <code>0139</code> - Savvis Communications AESA:. */
  _0139 ("0139", "Savvis Communications AESA:."),
  /** <code>0140</code> - Toshiba Organizations, Partners, And Suppliers' (TOPAS) Code */
  _0140 ("0140", "Toshiba Organizations, Partners, And Suppliers' (TOPAS) Code"),
  /** <code>0141</code> - NATO Commercial and Government Entity system */
  _0141 ("0141", "NATO Commercial and Government Entity system"),
  /** <code>0142</code> - SECETI Object Identifiers */
  _0142 ("0142", "SECETI Object Identifiers"),
  /** <code>0143</code> - EINESTEINet AG */
  _0143 ("0143", "EINESTEINet AG"),
  /** <code>0144</code> - DoDAAC (Department of Defense Activity Address Code) */
  _0144 ("0144", "DoDAAC (Department of Defense Activity Address Code)"),
  /** <code>0145</code> - DGCP (Direction Générale de la Comptabilité Publique)administrative accounting identification scheme */
  _0145 ("0145", "DGCP (Direction Générale de la Comptabilité Publique)administrative accounting identification scheme"),
  /** <code>0146</code> - DGI (Direction Générale des Impots) code */
  _0146 ("0146", "DGI (Direction Générale des Impots) code"),
  /** <code>0147</code> - Standard Company Code */
  _0147 ("0147", "Standard Company Code"),
  /** <code>0148</code> - ITU (International Telecommunications Union)Data Network Identification Codes (DNIC) */
  _0148 ("0148", "ITU (International Telecommunications Union)Data Network Identification Codes (DNIC)"),
  /** <code>0149</code> - Global Business Identifier */
  _0149 ("0149", "Global Business Identifier"),
  /** <code>0150</code> - Madge Networks Ltd- ICD ATM Addressing Scheme */
  _0150 ("0150", "Madge Networks Ltd- ICD ATM Addressing Scheme"),
  /** <code>0151</code> - Australian Business Number (ABN) Scheme */
  _0151 ("0151", "Australian Business Number (ABN) Scheme"),
  /** <code>0152</code> - Edira Scheme Identifier Code */
  _0152 ("0152", "Edira Scheme Identifier Code"),
  /** <code>0153</code> - Concert Global Network Services ICD AESA */
  _0153 ("0153", "Concert Global Network Services ICD AESA"),
  /** <code>0154</code> - Identification number of economic subjects: (ICO) */
  _0154 ("0154", "Identification number of economic subjects: (ICO)"),
  /** <code>0155</code> - Global Crossing AESA (ATM End System Address) */
  _0155 ("0155", "Global Crossing AESA (ATM End System Address)"),
  /** <code>0156</code> - AUNA */
  _0156 ("0156", "AUNA"),
  /** <code>0157</code> - ATM interconnection with the Dutch KPN Telecom */
  _0157 ("0157", "ATM interconnection with the Dutch KPN Telecom"),
  /** <code>0158</code> - Identification number of economic subject (ICO) Act on State Statistics of 29 November 2'001, § 27 */
  _0158 ("0158", "Identification number of economic subject (ICO) Act on State Statistics of 29 November 2'001, § 27"),
  /** <code>0159</code> - ACTALIS Object Identifiers */
  _0159 ("0159", "ACTALIS Object Identifiers"),
  /** <code>0160</code> - GTIN - Global Trade Item Number */
  _0160 ("0160", "GTIN - Global Trade Item Number"),
  /** <code>0161</code> - ECCMA Open Technical Directory */
  _0161 ("0161", "ECCMA Open Technical Directory"),
  /** <code>0162</code> - CEN/ISSS Object Identifier Scheme */
  _0162 ("0162", "CEN/ISSS Object Identifier Scheme"),
  /** <code>0163</code> - US-EPA Facility Identifier */
  _0163 ("0163", "US-EPA Facility Identifier"),
  /** <code>0164</code> - TELUS Corporation */
  _0164 ("0164", "TELUS Corporation"),
  /** <code>0165</code> - FIEIE Object identifiers */
  _0165 ("0165", "FIEIE Object identifiers"),
  /** <code>0166</code> - Swissguide Identifier Scheme */
  _0166 ("0166", "Swissguide Identifier Scheme"),
  /** <code>0167</code> - Priority Telecom ATM End System Address Plan */
  _0167 ("0167", "Priority Telecom ATM End System Address Plan"),
  /** <code>0168</code> - Vodafone Ireland OSI Addressing */
  _0168 ("0168", "Vodafone Ireland OSI Addressing"),
  /** <code>0169</code> - Swiss Federal Business Identification Number. Central Business names Index (zefix) Identification Number */
  _0169 ("0169", "Swiss Federal Business Identification Number. Central Business names Index (zefix) Identification Number"),
  /** <code>0170</code> - Teikoku Company Code */
  _0170 ("0170", "Teikoku Company Code"),
  /** <code>0171</code> - Luxembourg CP &amp; CPS (Certification Policy and Certification Practice Statement) Index */
  _0171 ("0171", "Luxembourg CP & CPS (Certification Policy and Certification Practice Statement) Index"),
  /** <code>0172</code> - Project Group “Lists of Properties” (PROLIST®) */
  _0172 ("0172", "Project Group “Lists of Properties” (PROLIST®)"),
  /** <code>0173</code> - eCI&#64;ss */
  _0173 ("0173", "eCI@ss"),
  /** <code>0174</code> - StepNexus */
  _0174 ("0174", "StepNexus"),
  /** <code>0175</code> - Siemens AG */
  _0175 ("0175", "Siemens AG"),
  /** <code>0176</code> - Paradine GmbH */
  _0176 ("0176", "Paradine GmbH"),
  /** <code>0177</code> - Odette International Limited */
  _0177 ("0177", "Odette International Limited"),
  /** <code>0178</code> - Route1 MobiNET */
  _0178 ("0178", "Route1 MobiNET"),
  /** <code>0179</code> - Penango Object Identifiers */
  _0179 ("0179", "Penango Object Identifiers"),
  /** <code>0180</code> - Lithuanian military PKI */
  _0180 ("0180", "Lithuanian military PKI"),
  /** <code>0183</code> - Numéro d'identification suisse des enterprises (IDE), Swiss Unique Business Identification Number (UIDB) */
  _0183 ("0183", "Numéro d'identification suisse des enterprises (IDE), Swiss Unique Business Identification Number (UIDB)"),
  /** <code>0184</code> - DIGSTORG */
  _0184 ("0184", "DIGSTORG"),
  /** <code>0185</code> - Perceval Object Code */
  _0185 ("0185", "Perceval Object Code"),
  /** <code>0186</code> - TrustPoint Object Identifiers */
  _0186 ("0186", "TrustPoint Object Identifiers"),
  /** <code>0187</code> - Amazon Unique Identification Scheme */
  _0187 ("0187", "Amazon Unique Identification Scheme"),
  /** <code>0188</code> - Corporate Number of The Social Security and Tax Number System */
  _0188 ("0188", "Corporate Number of The Social Security and Tax Number System"),
  /** <code>0189</code> - European Business Identifier (EBID) */
  _0189 ("0189", "European Business Identifier (EBID)"),
  /** <code>0190</code> - Organisatie Indentificatie Nummer (OIN) */
  _0190 ("0190", "Organisatie Indentificatie Nummer (OIN)"),
  /** <code>0191</code> - Company Code (Estonia) */
  _0191 ("0191", "Company Code (Estonia)"),
  /** <code>0192</code> - Organisasjonsnummer */
  _0192 ("0192", "Organisasjonsnummer"),
  /** <code>0193</code> - UBL.BE Party Identifier */
  _0193 ("0193", "UBL.BE Party Identifier"),
  /** <code>0194</code> - KOIOS Open Technical Dictionary */
  _0194 ("0194", "KOIOS Open Technical Dictionary"),
  /** <code>0195</code> - Singapore Nationwide E-lnvoice Framework */
  _0195 ("0195", "Singapore Nationwide E-lnvoice Framework"),
  /** <code>0196</code> - Icelandic identifier - Íslensk kennitala */
  _0196 ("0196", "Icelandic identifier - Íslensk kennitala"),
  /** <code>0197</code> - APPLiA Pl Standard */
  _0197 ("0197", "APPLiA Pl Standard"),
  /** <code>0198</code> - ERSTORG */
  _0198 ("0198", "ERSTORG"),
  /** <code>0199</code> - Legal Entity Identifier (LEI) */
  _0199 ("0199", "Legal Entity Identifier (LEI)"),
  /** <code>0200</code> - Legal entity code (Lithuania) */
  _0200 ("0200", "Legal entity code (Lithuania)"),
  /** <code>0201</code> - Codice Univoco Unità Organizzativa iPA */
  _0201 ("0201", "Codice Univoco Unità Organizzativa iPA"),
  /** <code>0202</code> - Indirizzo di Posta Elettronica Certificata */
  _0202 ("0202", "Indirizzo di Posta Elettronica Certificata"),
  /** <code>0203</code> - eDelivery Network Participant identifier */
  _0203 ("0203", "eDelivery Network Participant identifier"),
  /** <code>0204</code> - Leitweg-ID */
  _0204 ("0204", "Leitweg-ID"),
  /** <code>0205</code> - CODDEST */
  _0205 ("0205", "CODDEST"),
  /** <code>0206</code> - Registre du Commerce et de l’Industrie : RCI */
  _0206 ("0206", "Registre du Commerce et de l’Industrie : RCI"),
  /** <code>0207</code> - PiLog Ontology Codification Identifier (POCI) */
  _0207 ("0207", "PiLog Ontology Codification Identifier (POCI)"),
  /** <code>0208</code> - Numero d'entreprise / ondernemingsnummer / Unternehmensnummer */
  _0208 ("0208", "Numero d'entreprise / ondernemingsnummer / Unternehmensnummer"),
  /** <code>0209</code> - GS1 identification keys */
  _0209 ("0209", "GS1 identification keys"),
  /** <code>0210</code> - CODICE FISCALE */
  _0210 ("0210", "CODICE FISCALE"),
  /** <code>0211</code> - PARTITA IVA */
  _0211 ("0211", "PARTITA IVA"),
  /** <code>0212</code> - Finnish Organization Identifier */
  _0212 ("0212", "Finnish Organization Identifier"),
  /** <code>0213</code> - Finnish Organization Value Add Tax Identifier */
  _0213 ("0213", "Finnish Organization Value Add Tax Identifier"),
  /** <code>0214</code> - Tradeplace TradePI Standard */
  _0214 ("0214", "Tradeplace TradePI Standard"),
  /** <code>0215</code> - Net service ID */
  _0215 ("0215", "Net service ID"),
  /** <code>0216</code> - OVTcode */
  _0216 ("0216", "OVTcode"),
  /** <code>0217</code> - The Netherlands Chamber of Commerce and Industry establishment number */
  _0217 ("0217", "The Netherlands Chamber of Commerce and Industry establishment number"),
  /** <code>0218</code> - Unified registration number (Latvia) */
  _0218 ("0218", "Unified registration number (Latvia)"),
  /** <code>0219</code> - Taxpayer registration code (Latvia) */
  _0219 ("0219", "Taxpayer registration code (Latvia)"),
  /** <code>0220</code> - The Register of Natural Persons (Latvia) */
  _0220 ("0220", "The Register of Natural Persons (Latvia)"),
  /** <code>0221</code> - The registered number of the qualified invoice issuer */
  _0221 ("0221", "The registered number of the qualified invoice issuer"),
  /** <code>0222</code> - Metadata Registry Support */
  _0222 ("0222", "Metadata Registry Support"),
  /** <code>0223</code> - EU based company */
  _0223 ("0223", "EU based company"),
  /** <code>0224</code> - FTCTC CODE ROUTAGE */
  _0224 ("0224", "FTCTC CODE ROUTAGE"),
  /** <code>0225</code> - FRCTC ELECTRONIC ADDRESS */
  _0225 ("0225", "FRCTC ELECTRONIC ADDRESS"),
  /** <code>0226</code> - FRCTC Particulier */
  _0226 ("0226", "FRCTC Particulier"),
  /** <code>0227</code> - NON - EU based company */
  _0227 ("0227", "NON - EU based company"),
  /** <code>0228</code> - Répertoire des Entreprises et des Etablissements (RIDET) */
  _0228 ("0228", "Répertoire des Entreprises et des Etablissements (RIDET)"),
  /** <code>0229</code> - T.A.H.I.T.I (traitement automatique hiérarchisé des institutions de Tahiti et des îles) */
  _0229 ("0229", "T.A.H.I.T.I (traitement automatique hiérarchisé des institutions de Tahiti et des îles)"),
  /** <code>0230</code> - National e-Invoicing Framework */
  _0230 ("0230", "National e-Invoicing Framework"),
  /** <code>0231</code> - Single taxable company (France) */
  _0231 ("0231", "Single taxable company (France)"),
  /** <code>0232</code> - NOBB product number */
  _0232 ("0232", "NOBB product number"),
  /** <code>0233</code> - Elnummer */
  _0233 ("0233", "Elnummer"),
  /** <code>0234</code> - Toimitusosoite ID */
  _0234 ("0234", "Toimitusosoite ID"),
  /** <code>0235</code> - UAE Tax Identification Number (TIN) */
  _0235 ("0235", "UAE Tax Identification Number (TIN)"),
  /** <code>0236</code> - ToimipaikkalD */
  _0236 ("0236", "ToimipaikkalD"),
  /** <code>0237</code> - CPR (Danish person civil registration number) */
  _0237 ("0237", "CPR (Danish person civil registration number)"),
  /** <code>0238</code> - Plateforme.s agréée.s à la facturation électronique (PPF/PDP) */
  _0238 ("0238", "Plateforme.s agréée.s à la facturation électronique (PPF/PDP)"),
  /** <code>0239</code> - EAEU */
  _0239 ("0239", "EAEU"),
  /** <code>0240</code> - Register of legal persons (in French : Répertoire des personnes morales) */
  _0240 ("0240", "Register of legal persons (in French : Répertoire des personnes morales)"),
  /** <code>0241</code> - Hitachi Rail */
  _0241 ("0241", "Hitachi Rail"),
  /** <code>0242</code> - OpenPeppol Service Provider Identification Scheme (SPIS) */
  _0242 ("0242", "OpenPeppol Service Provider Identification Scheme (SPIS)"),
  /** <code>0243</code> - Business Partner Number (Catena-X) */
  _0243 ("0243", "Business Partner Number (Catena-X)"),
  /** <code>0244</code> - Tax Identification (Tax ID), Nigeria */
  _0244 ("0244", "Tax Identification (Tax ID), Nigeria"),
  /** <code>0245</code> - Tax identification number (DIČ, Slovakia) */
  _0245 ("0245", "Tax identification number (DIČ, Slovakia)"),
  /** <code>0246</code> - German Electronic Business Address */
  _0246 ("0246", "German Electronic Business Address"),
  /** <code>0247</code> - Name unknown */
  _0247 ("0247", "Name unknown"),
  /** <code>0248</code> - Oman Value Added Tax Identification Number (VATIN) */
  _0248 ("0248", "Oman Value Added Tax Identification Number (VATIN)");

  private static final ICommonsMap <String, EEN16931ICDCode> MAP_BY_ID = new CommonsHashMap <> ();

  static
  {
    for (final EEN16931ICDCode e : values ())
      MAP_BY_ID.put (e.m_sID, e);
  }

  private final String m_sID;
  private final String m_sDisplayName;

  EEN16931ICDCode (@NonNull @Nonempty final String sID,
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
  public static EEN16931ICDCode getFromIDOrNull (@Nullable final String sID)
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
