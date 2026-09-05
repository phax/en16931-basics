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
 * ISO 4217 currency codes.
 * <p>
 * Used by BT-5 and BT-6. EN 16931 uses this code list as a full list.
 * <p>
 * Source of truth: sheet <code>Currency</code> of the EN 16931 code list workbook. The implemented
 * version of that workbook is {@link EN16931CodeLists#CODE_LIST_VERSION}, and the registry it comes
 * from is named in {@link EN16931CodeLists}.
 *
 * @author Philip Helger
 */
@CodingStyleguideUnaware
public enum EEN16931CurrencyCode implements IHasID <String>, IHasDisplayName
{
  /** <code>AED</code> - UAE Dirham */
  AED ("AED", "UAE Dirham"),
  /** <code>AFN</code> - Afghani */
  AFN ("AFN", "Afghani"),
  /** <code>ALL</code> - Lek */
  ALL ("ALL", "Lek"),
  /** <code>AMD</code> - Armenian Dram */
  AMD ("AMD", "Armenian Dram"),
  /** <code>AOA</code> - Kwanza */
  AOA ("AOA", "Kwanza"),
  /** <code>ARS</code> - Argentine Peso */
  ARS ("ARS", "Argentine Peso"),
  /** <code>AUD</code> - Australian Dollar */
  AUD ("AUD", "Australian Dollar"),
  /** <code>AWG</code> - Aruban Florin */
  AWG ("AWG", "Aruban Florin"),
  /** <code>AZN</code> - Azerbaijan Manat */
  AZN ("AZN", "Azerbaijan Manat"),
  /** <code>BAM</code> - Convertible Mark */
  BAM ("BAM", "Convertible Mark"),
  /** <code>BBD</code> - Barbados Dollar */
  BBD ("BBD", "Barbados Dollar"),
  /** <code>BDT</code> - Taka */
  BDT ("BDT", "Taka"),
  /** <code>BHD</code> - Bahraini Dinar */
  BHD ("BHD", "Bahraini Dinar"),
  /** <code>BIF</code> - Burundi Franc */
  BIF ("BIF", "Burundi Franc"),
  /** <code>BMD</code> - Bermudian Dollar */
  BMD ("BMD", "Bermudian Dollar"),
  /** <code>BND</code> - Brunei Dollar */
  BND ("BND", "Brunei Dollar"),
  /** <code>BOB</code> - Boliviano */
  BOB ("BOB", "Boliviano"),
  /** <code>BOV</code> - Mvdol */
  BOV ("BOV", "Mvdol"),
  /** <code>BRL</code> - Brazilian Real */
  BRL ("BRL", "Brazilian Real"),
  /** <code>BSD</code> - Bahamian Dollar */
  BSD ("BSD", "Bahamian Dollar"),
  /** <code>BTN</code> - Ngultrum */
  BTN ("BTN", "Ngultrum"),
  /** <code>BWP</code> - Pula */
  BWP ("BWP", "Pula"),
  /** <code>BYN</code> - Belarusian Ruble */
  BYN ("BYN", "Belarusian Ruble"),
  /** <code>BZD</code> - Belize Dollar */
  BZD ("BZD", "Belize Dollar"),
  /** <code>CAD</code> - Canadian Dollar */
  CAD ("CAD", "Canadian Dollar"),
  /** <code>CDF</code> - Congolese Franc */
  CDF ("CDF", "Congolese Franc"),
  /** <code>CHE</code> - WIR Euro */
  CHE ("CHE", "WIR Euro"),
  /** <code>CHF</code> - Swiss Franc */
  CHF ("CHF", "Swiss Franc"),
  /** <code>CHW</code> - WIR Franc */
  CHW ("CHW", "WIR Franc"),
  /** <code>CLF</code> - Unidad de Fomento */
  CLF ("CLF", "Unidad de Fomento"),
  /** <code>CLP</code> - Chilean Peso */
  CLP ("CLP", "Chilean Peso"),
  /** <code>CNY</code> - Yuan Renminbi */
  CNY ("CNY", "Yuan Renminbi"),
  /** <code>CNH</code> - Renminbi (offshore) */
  CNH ("CNH", "Renminbi (offshore)"),
  /** <code>COP</code> - Colombian Peso */
  COP ("COP", "Colombian Peso"),
  /** <code>COU</code> - Unidad de Valor Real */
  COU ("COU", "Unidad de Valor Real"),
  /** <code>CRC</code> - Costa Rican Colon */
  CRC ("CRC", "Costa Rican Colon"),
  /** <code>CUP</code> - Cuban Peso */
  CUP ("CUP", "Cuban Peso"),
  /** <code>CVE</code> - Cabo Verde Escudo */
  CVE ("CVE", "Cabo Verde Escudo"),
  /** <code>CZK</code> - Czech Koruna */
  CZK ("CZK", "Czech Koruna"),
  /** <code>DJF</code> - Djibouti Franc */
  DJF ("DJF", "Djibouti Franc"),
  /** <code>DKK</code> - Danish Krone */
  DKK ("DKK", "Danish Krone"),
  /** <code>DOP</code> - Dominican Peso */
  DOP ("DOP", "Dominican Peso"),
  /** <code>DZD</code> - Algerian Dinar */
  DZD ("DZD", "Algerian Dinar"),
  /** <code>EGP</code> - Egyptian Pound */
  EGP ("EGP", "Egyptian Pound"),
  /** <code>ERN</code> - Nakfa */
  ERN ("ERN", "Nakfa"),
  /** <code>ETB</code> - Ethiopian Birr */
  ETB ("ETB", "Ethiopian Birr"),
  /** <code>EUR</code> - Euro */
  EUR ("EUR", "Euro"),
  /** <code>FJD</code> - Fiji Dollar */
  FJD ("FJD", "Fiji Dollar"),
  /** <code>FKP</code> - Falkland Islands Pound */
  FKP ("FKP", "Falkland Islands Pound"),
  /** <code>GBP</code> - Pound Sterling */
  GBP ("GBP", "Pound Sterling"),
  /** <code>GEL</code> - Lari */
  GEL ("GEL", "Lari"),
  /** <code>GHS</code> - Ghana Cedi */
  GHS ("GHS", "Ghana Cedi"),
  /** <code>GIP</code> - Gibraltar Pound */
  GIP ("GIP", "Gibraltar Pound"),
  /** <code>GMD</code> - Dalasi */
  GMD ("GMD", "Dalasi"),
  /** <code>GNF</code> - Guinean Franc */
  GNF ("GNF", "Guinean Franc"),
  /** <code>GTQ</code> - Quetzal */
  GTQ ("GTQ", "Quetzal"),
  /** <code>GYD</code> - Guyana Dollar */
  GYD ("GYD", "Guyana Dollar"),
  /** <code>HKD</code> - Hong Kong Dollar */
  HKD ("HKD", "Hong Kong Dollar"),
  /** <code>HNL</code> - Lempira */
  HNL ("HNL", "Lempira"),
  /** <code>HTG</code> - Gourde */
  HTG ("HTG", "Gourde"),
  /** <code>HUF</code> - Forint */
  HUF ("HUF", "Forint"),
  /** <code>IDR</code> - Rupiah */
  IDR ("IDR", "Rupiah"),
  /** <code>ILS</code> - New Israeli Sheqel */
  ILS ("ILS", "New Israeli Sheqel"),
  /** <code>INR</code> - Indian Rupee */
  INR ("INR", "Indian Rupee"),
  /** <code>IQD</code> - Iraqi Dinar */
  IQD ("IQD", "Iraqi Dinar"),
  /** <code>IRR</code> - Iranian Rial */
  IRR ("IRR", "Iranian Rial"),
  /** <code>ISK</code> - Iceland Krona */
  ISK ("ISK", "Iceland Krona"),
  /** <code>JMD</code> - Jamaican Dollar */
  JMD ("JMD", "Jamaican Dollar"),
  /** <code>JOD</code> - Jordanian Dinar */
  JOD ("JOD", "Jordanian Dinar"),
  /** <code>JPY</code> - Yen */
  JPY ("JPY", "Yen"),
  /** <code>KES</code> - Kenyan Shilling */
  KES ("KES", "Kenyan Shilling"),
  /** <code>KGS</code> - Som */
  KGS ("KGS", "Som"),
  /** <code>KHR</code> - Riel */
  KHR ("KHR", "Riel"),
  /** <code>KMF</code> - Comorian Franc */
  KMF ("KMF", "Comorian Franc"),
  /** <code>KPW</code> - North Korean Won */
  KPW ("KPW", "North Korean Won"),
  /** <code>KRW</code> - Won */
  KRW ("KRW", "Won"),
  /** <code>KWD</code> - Kuwaiti Dinar */
  KWD ("KWD", "Kuwaiti Dinar"),
  /** <code>KYD</code> - Cayman Islands Dollar */
  KYD ("KYD", "Cayman Islands Dollar"),
  /** <code>KZT</code> - Tenge */
  KZT ("KZT", "Tenge"),
  /** <code>LAK</code> - Lao Kip */
  LAK ("LAK", "Lao Kip"),
  /** <code>LBP</code> - Lebanese Pound */
  LBP ("LBP", "Lebanese Pound"),
  /** <code>LKR</code> - Sri Lanka Rupee */
  LKR ("LKR", "Sri Lanka Rupee"),
  /** <code>LRD</code> - Liberian Dollar */
  LRD ("LRD", "Liberian Dollar"),
  /** <code>LSL</code> - Loti */
  LSL ("LSL", "Loti"),
  /** <code>LYD</code> - Libyan Dinar */
  LYD ("LYD", "Libyan Dinar"),
  /** <code>MAD</code> - Moroccan Dirham */
  MAD ("MAD", "Moroccan Dirham"),
  /** <code>MDL</code> - Moldovan Leu */
  MDL ("MDL", "Moldovan Leu"),
  /** <code>MGA</code> - Malagasy Ariary */
  MGA ("MGA", "Malagasy Ariary"),
  /** <code>MKD</code> - Denar */
  MKD ("MKD", "Denar"),
  /** <code>MMK</code> - Kyat */
  MMK ("MMK", "Kyat"),
  /** <code>MNT</code> - Tugrik */
  MNT ("MNT", "Tugrik"),
  /** <code>MOP</code> - Pataca */
  MOP ("MOP", "Pataca"),
  /** <code>MRU</code> - Ouguiya */
  MRU ("MRU", "Ouguiya"),
  /** <code>MUR</code> - Mauritius Rupee */
  MUR ("MUR", "Mauritius Rupee"),
  /** <code>MVR</code> - Rufiyaa */
  MVR ("MVR", "Rufiyaa"),
  /** <code>MWK</code> - Malawi Kwacha */
  MWK ("MWK", "Malawi Kwacha"),
  /** <code>MXN</code> - Mexican Peso */
  MXN ("MXN", "Mexican Peso"),
  /** <code>MXV</code> - Mexican Unidad de Inversion (UDI) */
  MXV ("MXV", "Mexican Unidad de Inversion (UDI)"),
  /** <code>MYR</code> - Malaysian Ringgit */
  MYR ("MYR", "Malaysian Ringgit"),
  /** <code>MZN</code> - Mozambique Metical */
  MZN ("MZN", "Mozambique Metical"),
  /** <code>NAD</code> - Namibia Dollar */
  NAD ("NAD", "Namibia Dollar"),
  /** <code>NGN</code> - Naira */
  NGN ("NGN", "Naira"),
  /** <code>NIO</code> - Cordoba Oro */
  NIO ("NIO", "Cordoba Oro"),
  /** <code>NOK</code> - Norwegian Krone */
  NOK ("NOK", "Norwegian Krone"),
  /** <code>NPR</code> - Nepalese Rupee */
  NPR ("NPR", "Nepalese Rupee"),
  /** <code>NZD</code> - New Zealand Dollar */
  NZD ("NZD", "New Zealand Dollar"),
  /** <code>OMR</code> - Rial Omani */
  OMR ("OMR", "Rial Omani"),
  /** <code>PAB</code> - Balboa */
  PAB ("PAB", "Balboa"),
  /** <code>PEN</code> - Sol */
  PEN ("PEN", "Sol"),
  /** <code>PGK</code> - Kina */
  PGK ("PGK", "Kina"),
  /** <code>PHP</code> - Philippine Peso */
  PHP ("PHP", "Philippine Peso"),
  /** <code>PKR</code> - Pakistan Rupee */
  PKR ("PKR", "Pakistan Rupee"),
  /** <code>PLN</code> - Zloty */
  PLN ("PLN", "Zloty"),
  /** <code>PYG</code> - Guarani */
  PYG ("PYG", "Guarani"),
  /** <code>QAR</code> - Qatari Rial */
  QAR ("QAR", "Qatari Rial"),
  /** <code>RON</code> - Romanian Leu */
  RON ("RON", "Romanian Leu"),
  /** <code>RSD</code> - Serbian Dinar */
  RSD ("RSD", "Serbian Dinar"),
  /** <code>RUB</code> - Russian Ruble */
  RUB ("RUB", "Russian Ruble"),
  /** <code>RWF</code> - Rwanda Franc */
  RWF ("RWF", "Rwanda Franc"),
  /** <code>SAR</code> - Saudi Riyal */
  SAR ("SAR", "Saudi Riyal"),
  /** <code>SBD</code> - Solomon Islands Dollar */
  SBD ("SBD", "Solomon Islands Dollar"),
  /** <code>SCR</code> - Seychelles Rupee */
  SCR ("SCR", "Seychelles Rupee"),
  /** <code>SDG</code> - Sudanese Pound */
  SDG ("SDG", "Sudanese Pound"),
  /** <code>SEK</code> - Swedish Krona */
  SEK ("SEK", "Swedish Krona"),
  /** <code>SGD</code> - Singapore Dollar */
  SGD ("SGD", "Singapore Dollar"),
  /** <code>SHP</code> - Saint Helena Pound */
  SHP ("SHP", "Saint Helena Pound"),
  /** <code>SLE</code> - Sierra Leone (new valuation 2022) */
  SLE ("SLE", "Sierra Leone (new valuation 2022)"),
  /** <code>SOS</code> - Somali Shilling */
  SOS ("SOS", "Somali Shilling"),
  /** <code>SRD</code> - Surinam Dollar */
  SRD ("SRD", "Surinam Dollar"),
  /** <code>SSP</code> - South Sudanese Pound */
  SSP ("SSP", "South Sudanese Pound"),
  /** <code>STN</code> - Dobra */
  STN ("STN", "Dobra"),
  /** <code>SVC</code> - El Salvador Colon */
  SVC ("SVC", "El Salvador Colon"),
  /** <code>SYP</code> - Syrian Pound */
  SYP ("SYP", "Syrian Pound"),
  /** <code>SZL</code> - Lilangeni */
  SZL ("SZL", "Lilangeni"),
  /** <code>THB</code> - Baht */
  THB ("THB", "Baht"),
  /** <code>TJS</code> - Somoni */
  TJS ("TJS", "Somoni"),
  /** <code>TMT</code> - Turkmenistan New Manat */
  TMT ("TMT", "Turkmenistan New Manat"),
  /** <code>TND</code> - Tunisian Dinar */
  TND ("TND", "Tunisian Dinar"),
  /** <code>TOP</code> - Pa’anga */
  TOP ("TOP", "Pa’anga"),
  /** <code>TRY</code> - Turkish Lira */
  TRY ("TRY", "Turkish Lira"),
  /** <code>TTD</code> - Trinidad and Tobago Dollar */
  TTD ("TTD", "Trinidad and Tobago Dollar"),
  /** <code>TWD</code> - New Taiwan Dollar */
  TWD ("TWD", "New Taiwan Dollar"),
  /** <code>TZS</code> - Tanzanian Shilling */
  TZS ("TZS", "Tanzanian Shilling"),
  /** <code>UAH</code> - Hryvnia */
  UAH ("UAH", "Hryvnia"),
  /** <code>UGX</code> - Uganda Shilling */
  UGX ("UGX", "Uganda Shilling"),
  /** <code>USD</code> - US Dollar */
  USD ("USD", "US Dollar"),
  /** <code>USN</code> - US Dollar (Next day) */
  USN ("USN", "US Dollar (Next day)"),
  /** <code>UYI</code> - Uruguay Peso en Unidades Indexadas (UI) */
  UYI ("UYI", "Uruguay Peso en Unidades Indexadas (UI)"),
  /** <code>UYU</code> - Peso Uruguayo */
  UYU ("UYU", "Peso Uruguayo"),
  /** <code>UYW</code> - Unidad Previsional */
  UYW ("UYW", "Unidad Previsional"),
  /** <code>UZS</code> - Uzbekistan Sum */
  UZS ("UZS", "Uzbekistan Sum"),
  /** <code>VED</code> - Bolívar Soberano, new valuation */
  VED ("VED", "Bolívar Soberano, new valuation"),
  /** <code>VES</code> - Bolívar Soberano */
  VES ("VES", "Bolívar Soberano"),
  /** <code>VND</code> - Dong */
  VND ("VND", "Dong"),
  /** <code>VUV</code> - Vatu */
  VUV ("VUV", "Vatu"),
  /** <code>WST</code> - Tala */
  WST ("WST", "Tala"),
  /** <code>XAF</code> - CFA Franc BEAC */
  XAF ("XAF", "CFA Franc BEAC"),
  /** <code>XAG</code> - Silver */
  XAG ("XAG", "Silver"),
  /** <code>XAU</code> - Gold */
  XAU ("XAU", "Gold"),
  /** <code>XBA</code> - Bond Markets Unit European Composite Unit (EURCO) */
  XBA ("XBA", "Bond Markets Unit European Composite Unit (EURCO)"),
  /** <code>XBB</code> - Bond Markets Unit European Monetary Unit (E.M.U.-6) */
  XBB ("XBB", "Bond Markets Unit European Monetary Unit (E.M.U.-6)"),
  /** <code>XBC</code> - Bond Markets Unit European Unit of Account 9 (E.U.A.-9) */
  XBC ("XBC", "Bond Markets Unit European Unit of Account 9 (E.U.A.-9)"),
  /** <code>XBD</code> - Bond Markets Unit European Unit of Account 17 (E.U.A.-17) */
  XBD ("XBD", "Bond Markets Unit European Unit of Account 17 (E.U.A.-17)"),
  /** <code>XCD</code> - East Caribbean Dollar */
  XCD ("XCD", "East Caribbean Dollar"),
  /** <code>XCG</code> - Caribbean guilder */
  XCG ("XCG", "Caribbean guilder"),
  /** <code>XDR</code> - SDR (Special Drawing Right) */
  XDR ("XDR", "SDR (Special Drawing Right)"),
  /** <code>XOF</code> - CFA Franc BCEAO */
  XOF ("XOF", "CFA Franc BCEAO"),
  /** <code>XPD</code> - Palladium */
  XPD ("XPD", "Palladium"),
  /** <code>XPF</code> - CFP Franc */
  XPF ("XPF", "CFP Franc"),
  /** <code>XPT</code> - Platinum */
  XPT ("XPT", "Platinum"),
  /** <code>XSU</code> - Sucre */
  XSU ("XSU", "Sucre"),
  /** <code>XTS</code> - Codes specifically reserved for testing purposes */
  XTS ("XTS", "Codes specifically reserved for testing purposes"),
  /** <code>XUA</code> - ADB Unit of Account */
  XUA ("XUA", "ADB Unit of Account"),
  /** <code>XXX</code> - The codes assigned for transactions where no currency is involved */
  XXX ("XXX", "The codes assigned for transactions where no currency is involved"),
  /** <code>YER</code> - Yemeni Rial */
  YER ("YER", "Yemeni Rial"),
  /** <code>ZAR</code> - Rand */
  ZAR ("ZAR", "Rand"),
  /** <code>ZMW</code> - Zambian Kwacha */
  ZMW ("ZMW", "Zambian Kwacha"),
  /** <code>ZWG</code> - Zimbabwe Gold */
  ZWG ("ZWG", "Zimbabwe Gold");

  private static final ICommonsMap <String, EEN16931CurrencyCode> MAP_BY_ID = new CommonsHashMap <> ();

  static
  {
    for (final EEN16931CurrencyCode e : values ())
      MAP_BY_ID.put (e.m_sID, e);
  }

  private final String m_sID;
  private final String m_sDisplayName;

  EEN16931CurrencyCode (@NonNull @Nonempty final String sID,
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
  public static EEN16931CurrencyCode getFromIDOrNull (@Nullable final String sID)
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
