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
 * UNTDID 5189 allowance codes.
 * <p>
 * Used by BT-98 and BT-140. EN 16931 uses this code list as a subset.
 * <p>
 * Source of truth: sheet <code>Allowance</code> of the EN 16931 code list workbook. The implemented
 * version of that workbook is {@link EN16931CodeLists#CODE_LIST_VERSION}, and the registry it comes
 * from is named in {@link EN16931CodeLists}.
 *
 * @author Philip Helger
 */
@CodingStyleguideUnaware
public enum EEN16931AllowanceReasonCode implements IHasID <String>, IHasDisplayName
{
  /** <code>41</code> - Bonus for works ahead of schedule */
  _41 ("41", "Bonus for works ahead of schedule"),
  /** <code>42</code> - Other bonus */
  _42 ("42", "Other bonus"),
  /** <code>60</code> - Manufacturer’s consumer discount */
  _60 ("60", "Manufacturer’s consumer discount"),
  /** <code>62</code> - Due to military status */
  _62 ("62", "Due to military status"),
  /** <code>63</code> - Due to work accident */
  _63 ("63", "Due to work accident"),
  /** <code>64</code> - Special agreement */
  _64 ("64", "Special agreement"),
  /** <code>65</code> - Production error discount */
  _65 ("65", "Production error discount"),
  /** <code>66</code> - New outlet discount */
  _66 ("66", "New outlet discount"),
  /** <code>67</code> - Sample discount */
  _67 ("67", "Sample discount"),
  /** <code>68</code> - End-of-range discount */
  _68 ("68", "End-of-range discount"),
  /** <code>70</code> - Incoterm discount */
  _70 ("70", "Incoterm discount"),
  /** <code>71</code> - Point of sales threshold allowance */
  _71 ("71", "Point of sales threshold allowance"),
  /** <code>88</code> - Material surcharge/deduction */
  _88 ("88", "Material surcharge/deduction"),
  /** <code>95</code> - Discount */
  _95 ("95", "Discount"),
  /** <code>100</code> - Special rebate */
  _100 ("100", "Special rebate"),
  /** <code>102</code> - Fixed long term */
  _102 ("102", "Fixed long term"),
  /** <code>103</code> - Temporary */
  _103 ("103", "Temporary"),
  /** <code>104</code> - Standard */
  _104 ("104", "Standard"),
  /** <code>105</code> - Yearly turnover */
  _105 ("105", "Yearly turnover");

  private static final ICommonsMap <String, EEN16931AllowanceReasonCode> MAP_BY_ID = new CommonsHashMap <> ();

  static
  {
    for (final EEN16931AllowanceReasonCode e : values ())
      MAP_BY_ID.put (e.m_sID, e);
  }

  private final String m_sID;
  private final String m_sDisplayName;

  EEN16931AllowanceReasonCode (@NonNull @Nonempty final String sID,
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
  public static EEN16931AllowanceReasonCode getFromIDOrNull (@Nullable final String sID)
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
