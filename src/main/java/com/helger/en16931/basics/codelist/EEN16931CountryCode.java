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
 * ISO 3166-1 country codes, as extended by EN 16931.
 * <p>
 * Used by BT-40, BT-55, BT-69, BT-80 and BT-159. EN 16931 uses this code list as a extended list.
 * <p>
 * Beyond ISO 3166-1 the list contains <code>1A</code> for Kosovo and <code>XI</code> for Northern
 * Ireland.
 * <p>
 * Source of truth: sheet <code>Country</code> of the EN 16931 code list workbook. The implemented
 * version of that workbook is {@link EN16931CodeLists#CODE_LIST_VERSION}, and the registry it comes
 * from is named in {@link EN16931CodeLists}.
 *
 * @author Philip Helger
 */
@CodingStyleguideUnaware
public enum EEN16931CountryCode implements IHasID <String>, IHasDisplayName
{
  /** <code>AD</code> - Andorra */
  AD ("AD", "Andorra"),
  /** <code>AE</code> - United Arab Emirates (the) */
  AE ("AE", "United Arab Emirates (the)"),
  /** <code>AF</code> - Afghanistan */
  AF ("AF", "Afghanistan"),
  /** <code>AG</code> - Antigua and Barbuda */
  AG ("AG", "Antigua and Barbuda"),
  /** <code>AI</code> - Anguilla */
  AI ("AI", "Anguilla"),
  /** <code>AL</code> - Albania */
  AL ("AL", "Albania"),
  /** <code>AM</code> - Armenia */
  AM ("AM", "Armenia"),
  /** <code>AO</code> - Angola */
  AO ("AO", "Angola"),
  /** <code>AQ</code> - Antarctica */
  AQ ("AQ", "Antarctica"),
  /** <code>AR</code> - Argentina */
  AR ("AR", "Argentina"),
  /** <code>AS</code> - American Samoa */
  AS ("AS", "American Samoa"),
  /** <code>AT</code> - Austria */
  AT ("AT", "Austria"),
  /** <code>AU</code> - Australia */
  AU ("AU", "Australia"),
  /** <code>AW</code> - Aruba */
  AW ("AW", "Aruba"),
  /** <code>AX</code> - Åland Islands */
  AX ("AX", "Åland Islands"),
  /** <code>AZ</code> - Azerbaijan */
  AZ ("AZ", "Azerbaijan"),
  /** <code>BA</code> - Bosnia and Herzegovina */
  BA ("BA", "Bosnia and Herzegovina"),
  /** <code>BB</code> - Barbados */
  BB ("BB", "Barbados"),
  /** <code>BD</code> - Bangladesh */
  BD ("BD", "Bangladesh"),
  /** <code>BE</code> - Belgium */
  BE ("BE", "Belgium"),
  /** <code>BF</code> - Burkina Faso */
  BF ("BF", "Burkina Faso"),
  /** <code>BG</code> - Bulgaria */
  BG ("BG", "Bulgaria"),
  /** <code>BH</code> - Bahrain */
  BH ("BH", "Bahrain"),
  /** <code>BI</code> - Burundi */
  BI ("BI", "Burundi"),
  /** <code>BJ</code> - Benin */
  BJ ("BJ", "Benin"),
  /** <code>BL</code> - Saint Barthélemy */
  BL ("BL", "Saint Barthélemy"),
  /** <code>BM</code> - Bermuda */
  BM ("BM", "Bermuda"),
  /** <code>BN</code> - Brunei Darussalam */
  BN ("BN", "Brunei Darussalam"),
  /** <code>BO</code> - Bolivia (Plurinational State of) */
  BO ("BO", "Bolivia (Plurinational State of)"),
  /** <code>BQ</code> - Bonaire, Sint Eustatius and Saba */
  BQ ("BQ", "Bonaire, Sint Eustatius and Saba"),
  /** <code>BR</code> - Brazil */
  BR ("BR", "Brazil"),
  /** <code>BS</code> - Bahamas (The) */
  BS ("BS", "Bahamas (The)"),
  /** <code>BT</code> - Bhutan */
  BT ("BT", "Bhutan"),
  /** <code>BV</code> - Bouvet Island */
  BV ("BV", "Bouvet Island"),
  /** <code>BW</code> - Botswana */
  BW ("BW", "Botswana"),
  /** <code>BY</code> - Belarus */
  BY ("BY", "Belarus"),
  /** <code>BZ</code> - Belize */
  BZ ("BZ", "Belize"),
  /** <code>CA</code> - Canada */
  CA ("CA", "Canada"),
  /** <code>CC</code> - Cocos (Keeling) Islands (the) */
  CC ("CC", "Cocos (Keeling) Islands (the)"),
  /** <code>CD</code> - Congo (the Democratic Republic of the) */
  CD ("CD", "Congo (the Democratic Republic of the)"),
  /** <code>CF</code> - Central African Republic (the) */
  CF ("CF", "Central African Republic (the)"),
  /** <code>CG</code> - Congo (the) */
  CG ("CG", "Congo (the)"),
  /** <code>CH</code> - Switzerland */
  CH ("CH", "Switzerland"),
  /** <code>CI</code> - Côte d'Ivoire */
  CI ("CI", "Côte d'Ivoire"),
  /** <code>CK</code> - Cook Islands (the) */
  CK ("CK", "Cook Islands (the)"),
  /** <code>CL</code> - Chile */
  CL ("CL", "Chile"),
  /** <code>CM</code> - Cameroon */
  CM ("CM", "Cameroon"),
  /** <code>CN</code> - China */
  CN ("CN", "China"),
  /** <code>CO</code> - Colombia */
  CO ("CO", "Colombia"),
  /** <code>CR</code> - Costa Rica */
  CR ("CR", "Costa Rica"),
  /** <code>CU</code> - Cuba */
  CU ("CU", "Cuba"),
  /** <code>CV</code> - Cabo Verde */
  CV ("CV", "Cabo Verde"),
  /** <code>CW</code> - Curaçao */
  CW ("CW", "Curaçao"),
  /** <code>CX</code> - Christmas Island */
  CX ("CX", "Christmas Island"),
  /** <code>CY</code> - Cyprus */
  CY ("CY", "Cyprus"),
  /** <code>CZ</code> - Czechia */
  CZ ("CZ", "Czechia"),
  /** <code>DE</code> - Germany */
  DE ("DE", "Germany"),
  /** <code>DJ</code> - Djibouti */
  DJ ("DJ", "Djibouti"),
  /** <code>DK</code> - Denmark */
  DK ("DK", "Denmark"),
  /** <code>DM</code> - Dominica */
  DM ("DM", "Dominica"),
  /** <code>DO</code> - Dominican Republic (the) */
  DO ("DO", "Dominican Republic (the)"),
  /** <code>DZ</code> - Algeria */
  DZ ("DZ", "Algeria"),
  /** <code>EC</code> - Ecuador */
  EC ("EC", "Ecuador"),
  /** <code>EE</code> - Estonia */
  EE ("EE", "Estonia"),
  /** <code>EG</code> - Egypt */
  EG ("EG", "Egypt"),
  /** <code>EH</code> - Western Sahara* */
  EH ("EH", "Western Sahara*"),
  /** <code>ER</code> - Eritrea */
  ER ("ER", "Eritrea"),
  /** <code>ES</code> - Spain */
  ES ("ES", "Spain"),
  /** <code>ET</code> - Ethiopia */
  ET ("ET", "Ethiopia"),
  /** <code>FI</code> - Finland */
  FI ("FI", "Finland"),
  /** <code>FJ</code> - Fiji */
  FJ ("FJ", "Fiji"),
  /** <code>FK</code> - Falkland Islands (the) [Malvinas] */
  FK ("FK", "Falkland Islands (the) [Malvinas]"),
  /** <code>FM</code> - Micronesia (Federated States of) */
  FM ("FM", "Micronesia (Federated States of)"),
  /** <code>FO</code> - Faroe Islands (the) */
  FO ("FO", "Faroe Islands (the)"),
  /** <code>FR</code> - France */
  FR ("FR", "France"),
  /** <code>GA</code> - Gabon */
  GA ("GA", "Gabon"),
  /** <code>GB</code> - United Kingdom of Great Britain and Northern Ireland (the) */
  GB ("GB", "United Kingdom of Great Britain and Northern Ireland (the)"),
  /** <code>GD</code> - Grenada */
  GD ("GD", "Grenada"),
  /** <code>GE</code> - Georgia */
  GE ("GE", "Georgia"),
  /** <code>GF</code> - French Guiana */
  GF ("GF", "French Guiana"),
  /** <code>GG</code> - Guernsey */
  GG ("GG", "Guernsey"),
  /** <code>GH</code> - Ghana */
  GH ("GH", "Ghana"),
  /** <code>GI</code> - Gibraltar */
  GI ("GI", "Gibraltar"),
  /** <code>GL</code> - Greenland */
  GL ("GL", "Greenland"),
  /** <code>GM</code> - Gambia (the) */
  GM ("GM", "Gambia (the)"),
  /** <code>GN</code> - Guinea */
  GN ("GN", "Guinea"),
  /** <code>GP</code> - Guadeloupe */
  GP ("GP", "Guadeloupe"),
  /** <code>GQ</code> - Equatorial Guinea */
  GQ ("GQ", "Equatorial Guinea"),
  /** <code>GR</code> - Greece */
  GR ("GR", "Greece"),
  /** <code>GS</code> - South Georgia and the South Sandwich Islands */
  GS ("GS", "South Georgia and the South Sandwich Islands"),
  /** <code>GT</code> - Guatemala */
  GT ("GT", "Guatemala"),
  /** <code>GU</code> - Guam */
  GU ("GU", "Guam"),
  /** <code>GW</code> - Guinea-Bissau */
  GW ("GW", "Guinea-Bissau"),
  /** <code>GY</code> - Guyana */
  GY ("GY", "Guyana"),
  /** <code>HK</code> - Hong Kong */
  HK ("HK", "Hong Kong"),
  /** <code>HM</code> - Heard Island and McDonald Islands */
  HM ("HM", "Heard Island and McDonald Islands"),
  /** <code>HN</code> - Honduras */
  HN ("HN", "Honduras"),
  /** <code>HR</code> - Croatia */
  HR ("HR", "Croatia"),
  /** <code>HT</code> - Haiti */
  HT ("HT", "Haiti"),
  /** <code>HU</code> - Hungary */
  HU ("HU", "Hungary"),
  /** <code>ID</code> - Indonesia */
  ID ("ID", "Indonesia"),
  /** <code>IE</code> - Ireland */
  IE ("IE", "Ireland"),
  /** <code>IL</code> - Israel */
  IL ("IL", "Israel"),
  /** <code>IM</code> - Isle of Man */
  IM ("IM", "Isle of Man"),
  /** <code>IN</code> - India */
  IN ("IN", "India"),
  /** <code>IO</code> - British Indian Ocean Territory (the) */
  IO ("IO", "British Indian Ocean Territory (the)"),
  /** <code>IQ</code> - Iraq */
  IQ ("IQ", "Iraq"),
  /** <code>IR</code> - Iran (Islamic Republic of) */
  IR ("IR", "Iran (Islamic Republic of)"),
  /** <code>IS</code> - Iceland */
  IS ("IS", "Iceland"),
  /** <code>IT</code> - Italy */
  IT ("IT", "Italy"),
  /** <code>JE</code> - Jersey */
  JE ("JE", "Jersey"),
  /** <code>JM</code> - Jamaica */
  JM ("JM", "Jamaica"),
  /** <code>JO</code> - Jordan */
  JO ("JO", "Jordan"),
  /** <code>JP</code> - Japan */
  JP ("JP", "Japan"),
  /** <code>KE</code> - Kenya */
  KE ("KE", "Kenya"),
  /** <code>KG</code> - Kyrgyzstan */
  KG ("KG", "Kyrgyzstan"),
  /** <code>KH</code> - Cambodia */
  KH ("KH", "Cambodia"),
  /** <code>KI</code> - Kiribati */
  KI ("KI", "Kiribati"),
  /** <code>KM</code> - Comoros (the) */
  KM ("KM", "Comoros (the)"),
  /** <code>KN</code> - Saint Kitts and Nevis */
  KN ("KN", "Saint Kitts and Nevis"),
  /** <code>KP</code> - Korea (the Democratic People's Republic of) */
  KP ("KP", "Korea (the Democratic People's Republic of)"),
  /** <code>KR</code> - Korea (the Republic of) */
  KR ("KR", "Korea (the Republic of)"),
  /** <code>KW</code> - Kuwait */
  KW ("KW", "Kuwait"),
  /** <code>KY</code> - Cayman Islands (the) */
  KY ("KY", "Cayman Islands (the)"),
  /** <code>KZ</code> - Kazakhstan */
  KZ ("KZ", "Kazakhstan"),
  /** <code>LA</code> - Lao People's Democratic Republic (the) */
  LA ("LA", "Lao People's Democratic Republic (the)"),
  /** <code>LB</code> - Lebanon */
  LB ("LB", "Lebanon"),
  /** <code>LC</code> - Saint Lucia */
  LC ("LC", "Saint Lucia"),
  /** <code>LI</code> - Liechtenstein */
  LI ("LI", "Liechtenstein"),
  /** <code>LK</code> - Sri Lanka */
  LK ("LK", "Sri Lanka"),
  /** <code>LR</code> - Liberia */
  LR ("LR", "Liberia"),
  /** <code>LS</code> - Lesotho */
  LS ("LS", "Lesotho"),
  /** <code>LT</code> - Lithuania */
  LT ("LT", "Lithuania"),
  /** <code>LU</code> - Luxembourg */
  LU ("LU", "Luxembourg"),
  /** <code>LV</code> - Latvia */
  LV ("LV", "Latvia"),
  /** <code>LY</code> - Libya */
  LY ("LY", "Libya"),
  /** <code>MA</code> - Morocco */
  MA ("MA", "Morocco"),
  /** <code>MC</code> - Monaco */
  MC ("MC", "Monaco"),
  /** <code>MD</code> - Moldova (the Republic of) */
  MD ("MD", "Moldova (the Republic of)"),
  /** <code>ME</code> - Montenegro */
  ME ("ME", "Montenegro"),
  /** <code>MF</code> - Saint Martin (French part) */
  MF ("MF", "Saint Martin (French part)"),
  /** <code>MG</code> - Madagascar */
  MG ("MG", "Madagascar"),
  /** <code>MH</code> - Marshall Islands (the) */
  MH ("MH", "Marshall Islands (the)"),
  /** <code>MK</code> - North Macedonia */
  MK ("MK", "North Macedonia"),
  /** <code>ML</code> - Mali */
  ML ("ML", "Mali"),
  /** <code>MM</code> - Myanmar */
  MM ("MM", "Myanmar"),
  /** <code>MN</code> - Mongolia */
  MN ("MN", "Mongolia"),
  /** <code>MO</code> - Macao */
  MO ("MO", "Macao"),
  /** <code>MP</code> - Northern Mariana Islands (the) */
  MP ("MP", "Northern Mariana Islands (the)"),
  /** <code>MQ</code> - Martinique */
  MQ ("MQ", "Martinique"),
  /** <code>MR</code> - Mauritania */
  MR ("MR", "Mauritania"),
  /** <code>MS</code> - Montserrat */
  MS ("MS", "Montserrat"),
  /** <code>MT</code> - Malta */
  MT ("MT", "Malta"),
  /** <code>MU</code> - Mauritius */
  MU ("MU", "Mauritius"),
  /** <code>MV</code> - Maldives */
  MV ("MV", "Maldives"),
  /** <code>MW</code> - Malawi */
  MW ("MW", "Malawi"),
  /** <code>MX</code> - Mexico */
  MX ("MX", "Mexico"),
  /** <code>MY</code> - Malaysia */
  MY ("MY", "Malaysia"),
  /** <code>MZ</code> - Mozambique */
  MZ ("MZ", "Mozambique"),
  /** <code>NA</code> - Namibia */
  NA ("NA", "Namibia"),
  /** <code>NC</code> - New Caledonia */
  NC ("NC", "New Caledonia"),
  /** <code>NE</code> - Niger (the) */
  NE ("NE", "Niger (the)"),
  /** <code>NF</code> - Norfolk Island */
  NF ("NF", "Norfolk Island"),
  /** <code>NG</code> - Nigeria */
  NG ("NG", "Nigeria"),
  /** <code>NI</code> - Nicaragua */
  NI ("NI", "Nicaragua"),
  /** <code>NL</code> - Netherlands (the) */
  NL ("NL", "Netherlands (the)"),
  /** <code>NO</code> - Norway */
  NO ("NO", "Norway"),
  /** <code>NP</code> - Nepal */
  NP ("NP", "Nepal"),
  /** <code>NR</code> - Nauru */
  NR ("NR", "Nauru"),
  /** <code>NU</code> - Niue */
  NU ("NU", "Niue"),
  /** <code>NZ</code> - New Zealand */
  NZ ("NZ", "New Zealand"),
  /** <code>OM</code> - Oman */
  OM ("OM", "Oman"),
  /** <code>PA</code> - Panama */
  PA ("PA", "Panama"),
  /** <code>PE</code> - Peru */
  PE ("PE", "Peru"),
  /** <code>PF</code> - French Polynesia */
  PF ("PF", "French Polynesia"),
  /** <code>PG</code> - Papua New Guinea */
  PG ("PG", "Papua New Guinea"),
  /** <code>PH</code> - Philippines (the) */
  PH ("PH", "Philippines (the)"),
  /** <code>PK</code> - Pakistan */
  PK ("PK", "Pakistan"),
  /** <code>PL</code> - Poland */
  PL ("PL", "Poland"),
  /** <code>PM</code> - Saint Pierre and Miquelon */
  PM ("PM", "Saint Pierre and Miquelon"),
  /** <code>PN</code> - Pitcairn */
  PN ("PN", "Pitcairn"),
  /** <code>PR</code> - Puerto Rico */
  PR ("PR", "Puerto Rico"),
  /** <code>PS</code> - Palestine, State of */
  PS ("PS", "Palestine, State of"),
  /** <code>PT</code> - Portugal */
  PT ("PT", "Portugal"),
  /** <code>PW</code> - Palau */
  PW ("PW", "Palau"),
  /** <code>PY</code> - Paraguay */
  PY ("PY", "Paraguay"),
  /** <code>QA</code> - Qatar */
  QA ("QA", "Qatar"),
  /** <code>RE</code> - Réunion */
  RE ("RE", "Réunion"),
  /** <code>RO</code> - Romania */
  RO ("RO", "Romania"),
  /** <code>RS</code> - Serbia */
  RS ("RS", "Serbia"),
  /** <code>RU</code> - Russian Federation (the) */
  RU ("RU", "Russian Federation (the)"),
  /** <code>RW</code> - Rwanda */
  RW ("RW", "Rwanda"),
  /** <code>SA</code> - Saudi Arabia */
  SA ("SA", "Saudi Arabia"),
  /** <code>SB</code> - Solomon Islands */
  SB ("SB", "Solomon Islands"),
  /** <code>SC</code> - Seychelles */
  SC ("SC", "Seychelles"),
  /** <code>SD</code> - Sudan (the) */
  SD ("SD", "Sudan (the)"),
  /** <code>SE</code> - Sweden */
  SE ("SE", "Sweden"),
  /** <code>SG</code> - Singapore */
  SG ("SG", "Singapore"),
  /** <code>SH</code> - Saint Helena, Ascension and Tristan da Cunha */
  SH ("SH", "Saint Helena, Ascension and Tristan da Cunha"),
  /** <code>SI</code> - Slovenia */
  SI ("SI", "Slovenia"),
  /** <code>SJ</code> - Svalbard and Jan Mayen */
  SJ ("SJ", "Svalbard and Jan Mayen"),
  /** <code>SK</code> - Slovakia */
  SK ("SK", "Slovakia"),
  /** <code>SL</code> - Sierra Leone */
  SL ("SL", "Sierra Leone"),
  /** <code>SM</code> - San Marino */
  SM ("SM", "San Marino"),
  /** <code>SN</code> - Senegal */
  SN ("SN", "Senegal"),
  /** <code>SO</code> - Somalia */
  SO ("SO", "Somalia"),
  /** <code>SR</code> - Suriname */
  SR ("SR", "Suriname"),
  /** <code>SS</code> - South Sudan */
  SS ("SS", "South Sudan"),
  /** <code>ST</code> - Sao Tome and Principe */
  ST ("ST", "Sao Tome and Principe"),
  /** <code>SV</code> - El Salvador */
  SV ("SV", "El Salvador"),
  /** <code>SX</code> - Sint Maarten (Dutch part) */
  SX ("SX", "Sint Maarten (Dutch part)"),
  /** <code>SY</code> - Syrian Arab Republic (the) */
  SY ("SY", "Syrian Arab Republic (the)"),
  /** <code>SZ</code> - Eswatini */
  SZ ("SZ", "Eswatini"),
  /** <code>TC</code> - Turks and Caicos Islands (the) */
  TC ("TC", "Turks and Caicos Islands (the)"),
  /** <code>TD</code> - Chad */
  TD ("TD", "Chad"),
  /** <code>TF</code> - French Southern Territories (the) */
  TF ("TF", "French Southern Territories (the)"),
  /** <code>TG</code> - Togo */
  TG ("TG", "Togo"),
  /** <code>TH</code> - Thailand */
  TH ("TH", "Thailand"),
  /** <code>TJ</code> - Tajikistan */
  TJ ("TJ", "Tajikistan"),
  /** <code>TK</code> - Tokelau */
  TK ("TK", "Tokelau"),
  /** <code>TL</code> - Timor-Leste */
  TL ("TL", "Timor-Leste"),
  /** <code>TM</code> - Turkmenistan */
  TM ("TM", "Turkmenistan"),
  /** <code>TN</code> - Tunisia */
  TN ("TN", "Tunisia"),
  /** <code>TO</code> - Tonga */
  TO ("TO", "Tonga"),
  /** <code>TR</code> - Türkiye */
  TR ("TR", "Türkiye"),
  /** <code>TT</code> - Trinidad and Tobago */
  TT ("TT", "Trinidad and Tobago"),
  /** <code>TV</code> - Tuvalu */
  TV ("TV", "Tuvalu"),
  /** <code>TW</code> - Taiwan (Province of China) */
  TW ("TW", "Taiwan (Province of China)"),
  /** <code>TZ</code> - Tanzania, the United Republic of */
  TZ ("TZ", "Tanzania, the United Republic of"),
  /** <code>UA</code> - Ukraine */
  UA ("UA", "Ukraine"),
  /** <code>UG</code> - Uganda */
  UG ("UG", "Uganda"),
  /** <code>UM</code> - United States Minor Outlying Islands (the) */
  UM ("UM", "United States Minor Outlying Islands (the)"),
  /** <code>US</code> - United States of America (the) */
  US ("US", "United States of America (the)"),
  /** <code>UY</code> - Uruguay */
  UY ("UY", "Uruguay"),
  /** <code>UZ</code> - Uzbekistan */
  UZ ("UZ", "Uzbekistan"),
  /** <code>VA</code> - Holy See (the) */
  VA ("VA", "Holy See (the)"),
  /** <code>VC</code> - Saint Vincent and the Grenadines */
  VC ("VC", "Saint Vincent and the Grenadines"),
  /** <code>VE</code> - Venezuela (Bolivarian Republic of) */
  VE ("VE", "Venezuela (Bolivarian Republic of)"),
  /** <code>VG</code> - Virgin Islands (British) */
  VG ("VG", "Virgin Islands (British)"),
  /** <code>VI</code> - Virgin Islands (U.S.) */
  VI ("VI", "Virgin Islands (U.S.)"),
  /** <code>VN</code> - Viet Nam */
  VN ("VN", "Viet Nam"),
  /** <code>VU</code> - Vanuatu */
  VU ("VU", "Vanuatu"),
  /** <code>WF</code> - Wallis and Futuna */
  WF ("WF", "Wallis and Futuna"),
  /** <code>WS</code> - Samoa */
  WS ("WS", "Samoa"),
  /** <code>YE</code> - Yemen */
  YE ("YE", "Yemen"),
  /** <code>YT</code> - Mayotte */
  YT ("YT", "Mayotte"),
  /** <code>ZA</code> - South Africa */
  ZA ("ZA", "South Africa"),
  /** <code>ZM</code> - Zambia */
  ZM ("ZM", "Zambia"),
  /** <code>ZW</code> - Zimbabwe */
  ZW ("ZW", "Zimbabwe"),
  /** <code>1A</code> - Kosovo */
  _1A ("1A", "Kosovo"),
  /** <code>XI</code> - United Kingdom (Northern Ireland) */
  XI ("XI", "United Kingdom (Northern Ireland)");

  private static final ICommonsMap <String, EEN16931CountryCode> MAP_BY_ID = new CommonsHashMap <> ();

  static
  {
    for (final EEN16931CountryCode e : values ())
      MAP_BY_ID.put (e.m_sID, e);
  }

  private final String m_sID;
  private final String m_sDisplayName;

  EEN16931CountryCode (@NonNull @Nonempty final String sID,
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
  public static EEN16931CountryCode getFromIDOrNull (@Nullable final String sID)
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
