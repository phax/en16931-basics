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
 * CEF EAS electronic address scheme identifiers.
 * <p>
 * Used by BT-34-1 and BT-49-1. EN 16931 uses this code list as a full list.
 * <p>
 * Source of truth: sheet <code>EAS</code> of the EN 16931 code list workbook. The implemented
 * version of that workbook is {@link EN16931CodeLists#CODE_LIST_VERSION}, and the registry it comes
 * from is named in {@link EN16931CodeLists}.
 *
 * @author Philip Helger
 */
@CodingStyleguideUnaware
public enum EEN16931EASCode implements IHasID <String>, IHasDisplayName
{
  /** <code>0002</code> - System Information et Repertoire des Entreprise et des Etablissements: SIRENE */
  _0002 ("0002", "System Information et Repertoire des Entreprise et des Etablissements: SIRENE"),
  /** <code>0007</code> - Organisationsnummer */
  _0007 ("0007", "Organisationsnummer"),
  /** <code>0009</code> - SIRET-CODE */
  _0009 ("0009", "SIRET-CODE"),
  /** <code>0037</code> - LY-tunnus */
  _0037 ("0037", "LY-tunnus"),
  /** <code>0060</code> - Data Universal Numbering System (D-U-N-S Number) */
  _0060 ("0060", "Data Universal Numbering System (D-U-N-S Number)"),
  /** <code>0088</code> - EAN Location Code */
  _0088 ("0088", "EAN Location Code"),
  /** <code>0096</code> - The Danish Business Authority - P-number (DK:P) */
  _0096 ("0096", "The Danish Business Authority - P-number (DK:P)"),
  /** <code>0097</code> - FTI - Ediforum Italia, (EDIRA compliant) */
  _0097 ("0097", "FTI - Ediforum Italia, (EDIRA compliant)"),
  /** <code>0106</code> - Vereniging van Kamers van Koophandel en Fabrieken in Nederland (Association of Chambers of Commerce and Industry in the Netherlands), Scheme (EDIRA compliant) */
  _0106 ("0106", "Vereniging van Kamers van Koophandel en Fabrieken in Nederland (Association of Chambers of Commerce and Industry in the Netherlands), Scheme (EDIRA compliant)"),
  /** <code>0130</code> - Directorates of the European Commission */
  _0130 ("0130", "Directorates of the European Commission"),
  /** <code>0135</code> - SIA Object Identifiers */
  _0135 ("0135", "SIA Object Identifiers"),
  /** <code>0142</code> - SECETI Object Identifiers */
  _0142 ("0142", "SECETI Object Identifiers"),
  /** <code>0147</code> - Standard Company Code */
  _0147 ("0147", "Standard Company Code"),
  /** <code>0151</code> - Australian Business Number (ABN) Scheme */
  _0151 ("0151", "Australian Business Number (ABN) Scheme"),
  /** <code>0154</code> - Identification number of economic subjects: (ICO) */
  _0154 ("0154", "Identification number of economic subjects: (ICO)"),
  /** <code>0158</code> - Identification number of economic subject (ICO) Act on State Statistics of 29 November 2001, § 27 */
  _0158 ("0158", "Identification number of economic subject (ICO) Act on State Statistics of 29 November 2001, § 27"),
  /** <code>0170</code> - Teikoku Company Code */
  _0170 ("0170", "Teikoku Company Code"),
  /** <code>0177</code> - Odette International Limited */
  _0177 ("0177", "Odette International Limited"),
  /** <code>0183</code> - Numéro d'identification suisse des enterprises (IDE), Swiss Unique Business Identification Number (UIDB) */
  _0183 ("0183", "Numéro d'identification suisse des enterprises (IDE), Swiss Unique Business Identification Number (UIDB)"),
  /** <code>0184</code> - DIGSTORG */
  _0184 ("0184", "DIGSTORG"),
  /** <code>0188</code> - Corporate Number of The Social Security and Tax Number System */
  _0188 ("0188", "Corporate Number of The Social Security and Tax Number System"),
  /** <code>0190</code> - Dutch Originator's Identification Number */
  _0190 ("0190", "Dutch Originator's Identification Number"),
  /** <code>0191</code> - Centre of Registers and Information Systems of the Ministry of Justice */
  _0191 ("0191", "Centre of Registers and Information Systems of the Ministry of Justice"),
  /** <code>0192</code> - Enhetsregisteret ved Bronnoysundregisterne */
  _0192 ("0192", "Enhetsregisteret ved Bronnoysundregisterne"),
  /** <code>0193</code> - UBL.BE party identifier */
  _0193 ("0193", "UBL.BE party identifier"),
  /** <code>0194</code> - KOIOS Open Technical Dictionary */
  _0194 ("0194", "KOIOS Open Technical Dictionary"),
  /** <code>0195</code> - Singapore UEN identifier */
  _0195 ("0195", "Singapore UEN identifier"),
  /** <code>0196</code> - Kennitala - Iceland legal id for individuals and legal entities */
  _0196 ("0196", "Kennitala - Iceland legal id for individuals and legal entities"),
  /** <code>0198</code> - ERSTORG */
  _0198 ("0198", "ERSTORG"),
  /** <code>0199</code> - Global legal entity identifier (GLEIF) */
  _0199 ("0199", "Global legal entity identifier (GLEIF)"),
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
  /** <code>0215</code> - Net service ID */
  _0215 ("0215", "Net service ID"),
  /** <code>0216</code> - OVTcode */
  _0216 ("0216", "OVTcode"),
  /** <code>0217</code> - The Netherlands Chamber of Commerce and Industry establishment number */
  _0217 ("0217", "The Netherlands Chamber of Commerce and Industry establishment number"),
  /** <code>0218</code> - Unified registration number (Latvia) */
  _0218 ("0218", "Unified registration number (Latvia)"),
  /** <code>0221</code> - The registered number of the qualified invoice issuer */
  _0221 ("0221", "The registered number of the qualified invoice issuer"),
  /** <code>0225</code> - FRCTC ELECTRONIC ADDRESS */
  _0225 ("0225", "FRCTC ELECTRONIC ADDRESS"),
  /** <code>0230</code> - National e-Invoicing Framework */
  _0230 ("0230", "National e-Invoicing Framework"),
  /** <code>0235</code> - UAE Tax Identification Number (TIN) */
  _0235 ("0235", "UAE Tax Identification Number (TIN)"),
  /** <code>0240</code> - Register of legal persons (in French : Répertoire des personnes morales) */
  _0240 ("0240", "Register of legal persons (in French : Répertoire des personnes morales)"),
  /** <code>0242</code> - OpenPeppol Service Provider Identification Scheme (SPIS) */
  _0242 ("0242", "OpenPeppol Service Provider Identification Scheme (SPIS)"),
  /** <code>0244</code> - Tax Identification (Tax ID), Nigeria */
  _0244 ("0244", "Tax Identification (Tax ID), Nigeria"),
  /** <code>0245</code> - Tax identification number (DIČ, Slovakia) */
  _0245 ("0245", "Tax identification number (DIČ, Slovakia)"),
  /** <code>0246</code> - German Electronic Business Address */
  _0246 ("0246", "German Electronic Business Address"),
  /** <code>0248</code> - Oman Value Added Tax Identification Number (VATIN) */
  _0248 ("0248", "Oman Value Added Tax Identification Number (VATIN)"),
  /** <code>9910</code> - Hungary VAT number */
  _9910 ("9910", "Hungary VAT number"),
  /** <code>9913</code> - Business Registers Network */
  _9913 ("9913", "Business Registers Network"),
  /** <code>9914</code> - Österreichische Umsatzsteuer-Identifikationsnummer */
  _9914 ("9914", "Österreichische Umsatzsteuer-Identifikationsnummer"),
  /** <code>9915</code> - Österreichisches Verwaltungs bzw. Organisationskennzeichen */
  _9915 ("9915", "Österreichisches Verwaltungs bzw. Organisationskennzeichen"),
  /** <code>9918</code> - SOCIETY FOR WORLDWIDE INTERBANK FINANCIAL, TELECOMMUNICATION S.W.I.F.T */
  _9918 ("9918", "SOCIETY FOR WORLDWIDE INTERBANK FINANCIAL, TELECOMMUNICATION S.W.I.F.T"),
  /** <code>9919</code> - Kennziffer des Unternehmensregisters */
  _9919 ("9919", "Kennziffer des Unternehmensregisters"),
  /** <code>9920</code> - Agencia Española de Administración Tributaria */
  _9920 ("9920", "Agencia Española de Administración Tributaria"),
  /** <code>9922</code> - Andorra VAT number */
  _9922 ("9922", "Andorra VAT number"),
  /** <code>9923</code> - Albania VAT number */
  _9923 ("9923", "Albania VAT number"),
  /** <code>9924</code> - Bosnia and Herzegovina VAT number */
  _9924 ("9924", "Bosnia and Herzegovina VAT number"),
  /** <code>9925</code> - Belgium VAT number */
  _9925 ("9925", "Belgium VAT number"),
  /** <code>9926</code> - Bulgaria VAT number */
  _9926 ("9926", "Bulgaria VAT number"),
  /** <code>9927</code> - Switzerland VAT number */
  _9927 ("9927", "Switzerland VAT number"),
  /** <code>9928</code> - Cyprus VAT number */
  _9928 ("9928", "Cyprus VAT number"),
  /** <code>9929</code> - Czech Republic VAT number */
  _9929 ("9929", "Czech Republic VAT number"),
  /** <code>9930</code> - Germany VAT number */
  _9930 ("9930", "Germany VAT number"),
  /** <code>9931</code> - Estonia VAT number */
  _9931 ("9931", "Estonia VAT number"),
  /** <code>9932</code> - United Kingdom VAT number */
  _9932 ("9932", "United Kingdom VAT number"),
  /** <code>9933</code> - Greece VAT number */
  _9933 ("9933", "Greece VAT number"),
  /** <code>9934</code> - Croatia VAT number */
  _9934 ("9934", "Croatia VAT number"),
  /** <code>9935</code> - Ireland VAT number */
  _9935 ("9935", "Ireland VAT number"),
  /** <code>9936</code> - Liechtenstein VAT number */
  _9936 ("9936", "Liechtenstein VAT number"),
  /** <code>9937</code> - Lithuania VAT number */
  _9937 ("9937", "Lithuania VAT number"),
  /** <code>9938</code> - Luxemburg VAT number */
  _9938 ("9938", "Luxemburg VAT number"),
  /** <code>9939</code> - Latvia VAT number */
  _9939 ("9939", "Latvia VAT number"),
  /** <code>9940</code> - Monaco VAT number */
  _9940 ("9940", "Monaco VAT number"),
  /** <code>9941</code> - Montenegro VAT number */
  _9941 ("9941", "Montenegro VAT number"),
  /** <code>9942</code> - Macedonia, the former Yugoslav Republic of VAT number */
  _9942 ("9942", "Macedonia, the former Yugoslav Republic of VAT number"),
  /** <code>9943</code> - Malta VAT number */
  _9943 ("9943", "Malta VAT number"),
  /** <code>9944</code> - Netherlands VAT number */
  _9944 ("9944", "Netherlands VAT number"),
  /** <code>9945</code> - Poland VAT number */
  _9945 ("9945", "Poland VAT number"),
  /** <code>9946</code> - Portugal VAT number */
  _9946 ("9946", "Portugal VAT number"),
  /** <code>9947</code> - Romania VAT number */
  _9947 ("9947", "Romania VAT number"),
  /** <code>9948</code> - Serbia VAT number */
  _9948 ("9948", "Serbia VAT number"),
  /** <code>9949</code> - Slovenia VAT number */
  _9949 ("9949", "Slovenia VAT number"),
  /** <code>9950</code> - Slovakia VAT number */
  _9950 ("9950", "Slovakia VAT number"),
  /** <code>9951</code> - San Marino VAT number */
  _9951 ("9951", "San Marino VAT number"),
  /** <code>9952</code> - Turkey VAT number */
  _9952 ("9952", "Turkey VAT number"),
  /** <code>9953</code> - Holy See (Vatican City State) VAT number */
  _9953 ("9953", "Holy See (Vatican City State) VAT number"),
  /** <code>9957</code> - French VAT number */
  _9957 ("9957", "French VAT number"),
  /** <code>9959</code> - Employer Identification Number (EIN, USA) */
  _9959 ("9959", "Employer Identification Number (EIN, USA)"),
  /** <code>AN</code> - O.F.T.P. (ODETTE File Transfer Protocol) */
  AN ("AN", "O.F.T.P. (ODETTE File Transfer Protocol)"),
  /** <code>AQ</code> - X.400 address for mail text */
  AQ ("AQ", "X.400 address for mail text"),
  /** <code>AS</code> - AS2 exchange */
  AS ("AS", "AS2 exchange"),
  /** <code>AU</code> - File Transfer Protocol */
  AU ("AU", "File Transfer Protocol"),
  /** <code>EM</code> - Electronic mail (SMPT) */
  EM ("EM", "Electronic mail (SMPT)");

  private static final ICommonsMap <String, EEN16931EASCode> MAP_BY_ID = new CommonsHashMap <> ();

  static
  {
    for (final EEN16931EASCode e : values ())
      MAP_BY_ID.put (e.m_sID, e);
  }

  private final String m_sID;
  private final String m_sDisplayName;

  EEN16931EASCode (@NonNull @Nonempty final String sID,
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
  public static EEN16931EASCode getFromIDOrNull (@Nullable final String sID)
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
