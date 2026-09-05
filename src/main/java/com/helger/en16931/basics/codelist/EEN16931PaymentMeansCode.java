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
 * UNTDID 4461 payment means codes.
 * <p>
 * Used by BT-81. EN 16931 uses this code list as a full list.
 * <p>
 * Source of truth: sheet <code>Payment</code> of the EN 16931 code list workbook. The implemented
 * version of that workbook is {@link EN16931CodeLists#CODE_LIST_VERSION}, and the registry it comes
 * from is named in {@link EN16931CodeLists}.
 *
 * @author Philip Helger
 */
@CodingStyleguideUnaware
public enum EEN16931PaymentMeansCode implements IHasID <String>, IHasDisplayName
{
  /** <code>1</code> - Instrument not defined */
  _1 ("1", "Instrument not defined", null),
  /** <code>2</code> - Automated clearing house credit */
  _2 ("2", "Automated clearing house credit", null),
  /** <code>3</code> - Automated clearing house debit */
  _3 ("3", "Automated clearing house debit", null),
  /** <code>4</code> - ACH demand debit reversal */
  _4 ("4", "ACH demand debit reversal", null),
  /** <code>5</code> - ACH demand credit reversal */
  _5 ("5", "ACH demand credit reversal", null),
  /** <code>6</code> - ACH demand credit */
  _6 ("6", "ACH demand credit", null),
  /** <code>7</code> - ACH demand debit */
  _7 ("7", "ACH demand debit", null),
  /** <code>8</code> - Hold */
  _8 ("8", "Hold", null),
  /** <code>9</code> - National or regional clearing */
  _9 ("9", "National or regional clearing", null),
  /** <code>10</code> - In cash */
  _10 ("10", "In cash", null),
  /** <code>11</code> - ACH savings credit reversal */
  _11 ("11", "ACH savings credit reversal", null),
  /** <code>12</code> - ACH savings debit reversal */
  _12 ("12", "ACH savings debit reversal", null),
  /** <code>13</code> - ACH savings credit */
  _13 ("13", "ACH savings credit", null),
  /** <code>14</code> - ACH savings debit */
  _14 ("14", "ACH savings debit", null),
  /** <code>15</code> - Bookentry credit */
  _15 ("15", "Bookentry credit", null),
  /** <code>16</code> - Bookentry debit */
  _16 ("16", "Bookentry debit", null),
  /** <code>17</code> - ACH demand cash concentration/disbursement (CCD) credit */
  _17 ("17", "ACH demand cash concentration/disbursement (CCD) credit", null),
  /** <code>18</code> - ACH demand cash concentration/disbursement (CCD) debit */
  _18 ("18", "ACH demand cash concentration/disbursement (CCD) debit", null),
  /** <code>19</code> - ACH demand corporate trade payment (CTP) credit */
  _19 ("19", "ACH demand corporate trade payment (CTP) credit", null),
  /** <code>20</code> - Cheque */
  _20 ("20", "Cheque", null),
  /** <code>21</code> - Banker's draft */
  _21 ("21", "Banker's draft", null),
  /** <code>22</code> - Certified banker's draft */
  _22 ("22", "Certified banker's draft", null),
  /** <code>23</code> - Bank cheque (issued by a banking or similar establishment) */
  _23 ("23", "Bank cheque (issued by a banking or similar establishment)", null),
  /** <code>24</code> - Bill of exchange awaiting acceptance */
  _24 ("24", "Bill of exchange awaiting acceptance", null),
  /** <code>25</code> - Certified cheque */
  _25 ("25", "Certified cheque", null),
  /** <code>26</code> - Local cheque */
  _26 ("26", "Local cheque", null),
  /** <code>27</code> - ACH demand corporate trade payment (CTP) debit */
  _27 ("27", "ACH demand corporate trade payment (CTP) debit", null),
  /** <code>28</code> - ACH demand corporate trade exchange (CTX) credit */
  _28 ("28", "ACH demand corporate trade exchange (CTX) credit", null),
  /** <code>29</code> - ACH demand corporate trade exchange (CTX) debit */
  _29 ("29", "ACH demand corporate trade exchange (CTX) debit", null),
  /** <code>30</code> - Credit transfer (non-SEPA) */
  _30 ("30", "Credit transfer", "non-SEPA"),
  /** <code>31</code> - Debit transfer (non-SEPA) */
  _31 ("31", "Debit transfer", "non-SEPA"),
  /** <code>32</code> - ACH demand cash concentration/disbursement plus (CCD+) */
  _32 ("32", "ACH demand cash concentration/disbursement plus (CCD+)", null),
  /** <code>33</code> - ACH demand cash concentration/disbursement plus (CCD+) */
  _33 ("33", "ACH demand cash concentration/disbursement plus (CCD+)", null),
  /** <code>34</code> - ACH prearranged payment and deposit (PPD) */
  _34 ("34", "ACH prearranged payment and deposit (PPD)", null),
  /** <code>35</code> - ACH savings cash concentration/disbursement (CCD) credit */
  _35 ("35", "ACH savings cash concentration/disbursement (CCD) credit", null),
  /** <code>36</code> - ACH savings cash concentration/disbursement (CCD) debit */
  _36 ("36", "ACH savings cash concentration/disbursement (CCD) debit", null),
  /** <code>37</code> - ACH savings corporate trade payment (CTP) credit */
  _37 ("37", "ACH savings corporate trade payment (CTP) credit", null),
  /** <code>38</code> - ACH savings corporate trade payment (CTP) debit */
  _38 ("38", "ACH savings corporate trade payment (CTP) debit", null),
  /** <code>39</code> - ACH savings corporate trade exchange (CTX) credit */
  _39 ("39", "ACH savings corporate trade exchange (CTX) credit", null),
  /** <code>40</code> - ACH savings corporate trade exchange (CTX) debit */
  _40 ("40", "ACH savings corporate trade exchange (CTX) debit", null),
  /** <code>41</code> - ACH savings cash concentration/disbursement plus (CCD+) */
  _41 ("41", "ACH savings cash concentration/disbursement plus (CCD+)", null),
  /** <code>42</code> - Payment to bank account */
  _42 ("42", "Payment to bank account", null),
  /** <code>43</code> - ACH savings cash concentration/disbursement plus (CCD+) */
  _43 ("43", "ACH savings cash concentration/disbursement plus (CCD+)", null),
  /** <code>44</code> - Accepted bill of exchange */
  _44 ("44", "Accepted bill of exchange", null),
  /** <code>45</code> - Referenced home-banking credit transfer */
  _45 ("45", "Referenced home-banking credit transfer", null),
  /** <code>46</code> - Interbank debit transfer */
  _46 ("46", "Interbank debit transfer", null),
  /** <code>47</code> - Home-banking debit transfer */
  _47 ("47", "Home-banking debit transfer", null),
  /** <code>48</code> - Bank card (Use for all payment cards) */
  _48 ("48", "Bank card", "Use for all payment cards"),
  /** <code>49</code> - Direct debit */
  _49 ("49", "Direct debit", null),
  /** <code>50</code> - Payment by postgiro */
  _50 ("50", "Payment by postgiro", null),
  /** <code>51</code> - FR, norme 6 97-Telereglement CFONB (French Organisation for */
  _51 ("51", "FR, norme 6 97-Telereglement CFONB (French Organisation for", null),
  /** <code>52</code> - Urgent commercial payment */
  _52 ("52", "Urgent commercial payment", null),
  /** <code>53</code> - Urgent Treasury Payment */
  _53 ("53", "Urgent Treasury Payment", null),
  /** <code>54</code> - Credit card */
  _54 ("54", "Credit card", null),
  /** <code>55</code> - Debit card */
  _55 ("55", "Debit card", null),
  /** <code>56</code> - Bankgiro */
  _56 ("56", "Bankgiro", null),
  /** <code>57</code> - Standing agreement (Contractual payment means) */
  _57 ("57", "Standing agreement", "Contractual payment means"),
  /** <code>58</code> - SEPA credit transfer (SEPA) */
  _58 ("58", "SEPA credit transfer", "SEPA"),
  /** <code>59</code> - SEPA direct debit (SEPA) */
  _59 ("59", "SEPA direct debit", "SEPA"),
  /** <code>60</code> - Promissory note */
  _60 ("60", "Promissory note", null),
  /** <code>61</code> - Promissory note signed by the debtor */
  _61 ("61", "Promissory note signed by the debtor", null),
  /** <code>62</code> - Promissory note signed by the debtor and endorsed by a bank */
  _62 ("62", "Promissory note signed by the debtor and endorsed by a bank", null),
  /** <code>63</code> - Promissory note signed by the debtor and endorsed by a */
  _63 ("63", "Promissory note signed by the debtor and endorsed by a", null),
  /** <code>64</code> - Promissory note signed by a bank */
  _64 ("64", "Promissory note signed by a bank", null),
  /** <code>65</code> - Promissory note signed by a bank and endorsed by another */
  _65 ("65", "Promissory note signed by a bank and endorsed by another", null),
  /** <code>66</code> - Promissory note signed by a third party */
  _66 ("66", "Promissory note signed by a third party", null),
  /** <code>67</code> - Promissory note signed by a third party and endorsed by a */
  _67 ("67", "Promissory note signed by a third party and endorsed by a", null),
  /** <code>68</code> - Online payment service */
  _68 ("68", "Online payment service", null),
  /** <code>69</code> - Transfer Advice */
  _69 ("69", "Transfer Advice", null),
  /** <code>70</code> - Bill drawn by the creditor on the debtor */
  _70 ("70", "Bill drawn by the creditor on the debtor", null),
  /** <code>74</code> - Bill drawn by the creditor on a bank */
  _74 ("74", "Bill drawn by the creditor on a bank", null),
  /** <code>75</code> - Bill drawn by the creditor, endorsed by another bank */
  _75 ("75", "Bill drawn by the creditor, endorsed by another bank", null),
  /** <code>76</code> - Bill drawn by the creditor on a bank and endorsed by a */
  _76 ("76", "Bill drawn by the creditor on a bank and endorsed by a", null),
  /** <code>77</code> - Bill drawn by the creditor on a third party */
  _77 ("77", "Bill drawn by the creditor on a third party", null),
  /** <code>78</code> - Bill drawn by creditor on third party, accepted and */
  _78 ("78", "Bill drawn by creditor on third party, accepted and", null),
  /** <code>91</code> - Not transferable banker's draft */
  _91 ("91", "Not transferable banker's draft", null),
  /** <code>92</code> - Not transferable local cheque */
  _92 ("92", "Not transferable local cheque", null),
  /** <code>93</code> - Reference giro */
  _93 ("93", "Reference giro", null),
  /** <code>94</code> - Urgent giro */
  _94 ("94", "Urgent giro", null),
  /** <code>95</code> - Free format giro */
  _95 ("95", "Free format giro", null),
  /** <code>96</code> - Requested method for payment was not used */
  _96 ("96", "Requested method for payment was not used", null),
  /** <code>97</code> - Clearing between partners */
  _97 ("97", "Clearing between partners", null),
  /** <code>98</code> - JP, Electronically Recorded Monetary Claims */
  _98 ("98", "JP, Electronically Recorded Monetary Claims", null),
  /** <code>ZZZ</code> - Mutually defined */
  ZZZ ("ZZZ", "Mutually defined", null);

  private static final ICommonsMap <String, EEN16931PaymentMeansCode> MAP_BY_ID = new CommonsHashMap <> ();

  static
  {
    for (final EEN16931PaymentMeansCode e : values ())
      MAP_BY_ID.put (e.m_sID, e);
  }

  private final String m_sID;
  private final String m_sDisplayName;
  private final String m_sUsage;

  EEN16931PaymentMeansCode (@NonNull @Nonempty final String sID,
                            @NonNull @Nonempty final String sDisplayName,
                            @Nullable final String sUsage)
  {
    m_sID = sID;
    m_sDisplayName = sDisplayName;
    m_sUsage = sUsage;
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
   * @return The usage note of the workbook column "Usage in EN16931", or <code>null</code> if the
   *         workbook has none for this code.
   */
  @Nullable
  public String getUsage ()
  {
    return m_sUsage;
  }

  /**
   * Find the code list entry with the provided code.
   *
   * @param sID
   *        The code to search. May be <code>null</code>.
   * @return <code>null</code> if the code list contains no such code.
   */
  @Nullable
  public static EEN16931PaymentMeansCode getFromIDOrNull (@Nullable final String sID)
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
