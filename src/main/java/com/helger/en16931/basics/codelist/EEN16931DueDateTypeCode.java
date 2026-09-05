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

/**
 * The BT-8 value added tax point date codes.
 * <p>
 * Used by BT-8. EN 16931 uses this code list as a subset, and it is the one code list where the UBL
 * and the CII syntax binding refer to <b>different</b> code lists: UBL uses UNTDID 2005, CII uses
 * UNTDID 2475. Each entry therefore carries both codes, which is what makes
 * {@link EN16931CodeLists#mapDueDateTypeCodeCIIToUBL(String)} and its inverse a true pair - they are
 * derived from this single table and cannot drift apart.
 * <p>
 * Source of truth: sheet <code>Time</code> of the EN 16931 code list workbook. The implemented
 * version of that workbook is {@link EN16931CodeLists#CODE_LIST_VERSION}, and the registry it comes
 * from is named in {@link EN16931CodeLists}.
 *
 * @author Philip Helger
 */
public enum EEN16931DueDateTypeCode
{
  /** UBL <code>3</code> - Invoice document issue date time; CII <code>5</code> - Date of invoice */
  INVOICE_DOCUMENT_ISSUE_DATE_TIME ("3", "Invoice document issue date time", "5", "Date of invoice"),
  /**
   * UBL <code>35</code> - Delivery date/time, actual; CII <code>29</code> - Date of delivery of
   * goods to establishments/domicile/site
   */
  DELIVERY_DATE_TIME_ACTUAL ("35",
                             "Delivery date/time, actual",
                             "29",
                             "Date of delivery of goods to establishments/domicile/site"),
  /** UBL <code>432</code> - Paid to date; CII <code>72</code> - Payment date */
  PAID_TO_DATE ("432", "Paid to date", "72", "Payment date");

  private final String m_sUBLCode;
  private final String m_sUBLDisplayName;
  private final String m_sCIICode;
  private final String m_sCIIDisplayName;

  EEN16931DueDateTypeCode (@NonNull @Nonempty final String sUBLCode,
                           @NonNull @Nonempty final String sUBLDisplayName,
                           @NonNull @Nonempty final String sCIICode,
                           @NonNull @Nonempty final String sCIIDisplayName)
  {
    m_sUBLCode = sUBLCode;
    m_sUBLDisplayName = sUBLDisplayName;
    m_sCIICode = sCIICode;
    m_sCIIDisplayName = sCIIDisplayName;
  }

  /**
   * @return The UNTDID 2005 code used by the UBL syntax binding. Neither <code>null</code> nor
   *         empty.
   */
  @NonNull
  @Nonempty
  public String getUBLCode ()
  {
    return m_sUBLCode;
  }

  /**
   * @return The name of the UNTDID 2005 code. Neither <code>null</code> nor empty.
   */
  @NonNull
  @Nonempty
  public String getUBLDisplayName ()
  {
    return m_sUBLDisplayName;
  }

  /**
   * @return The UNTDID 2475 code used by the CII syntax binding. Neither <code>null</code> nor
   *         empty.
   */
  @NonNull
  @Nonempty
  public String getCIICode ()
  {
    return m_sCIICode;
  }

  /**
   * @return The name of the UNTDID 2475 code. Neither <code>null</code> nor empty.
   */
  @NonNull
  @Nonempty
  public String getCIIDisplayName ()
  {
    return m_sCIIDisplayName;
  }

  /**
   * Find the entry with the provided UNTDID 2005 code of the UBL syntax binding.
   *
   * @param sUBLCode
   *        The UBL BT-8 code to search. May be <code>null</code>.
   * @return <code>null</code> if the code list contains no such code.
   */
  @Nullable
  public static EEN16931DueDateTypeCode getFromUBLCodeOrNull (@Nullable final String sUBLCode)
  {
    if (sUBLCode != null)
      for (final EEN16931DueDateTypeCode e : values ())
        if (e.m_sUBLCode.equals (sUBLCode))
          return e;
    return null;
  }

  /**
   * Find the entry with the provided UNTDID 2475 code of the CII syntax binding.
   *
   * @param sCIICode
   *        The CII BT-8 code to search. May be <code>null</code>.
   * @return <code>null</code> if the code list contains no such code.
   */
  @Nullable
  public static EEN16931DueDateTypeCode getFromCIICodeOrNull (@Nullable final String sCIICode)
  {
    if (sCIICode != null)
      for (final EEN16931DueDateTypeCode e : values ())
        if (e.m_sCIICode.equals (sCIICode))
          return e;
    return null;
  }
}
