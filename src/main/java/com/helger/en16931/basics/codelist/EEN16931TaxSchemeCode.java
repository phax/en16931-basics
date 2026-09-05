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
import com.helger.base.name.IHasDisplayName;

/**
 * The scheme identifier of the VAT identifier.
 * <p>
 * Used by BT-31, BT-48 and BT-63. The UBL and the CII syntax binding refer to different code lists
 * here - UBL uses a subset of UNECE 5153, CII uses a subset of UNECE 1153 - so each entry carries
 * both codes.
 * <p>
 * Source of truth: sheet <code>VAT ID</code> of the EN 16931 code list workbook. The implemented
 * version of that workbook is {@link EN16931CodeLists#CODE_LIST_VERSION}, and the registry it comes
 * from is named in {@link EN16931CodeLists}.
 *
 * @author Philip Helger
 */
public enum EEN16931TaxSchemeCode implements IHasDisplayName
{
  /** UBL <code>VAT</code>, CII <code>VA</code> - Value added tax */
  VAT ("VAT", "VA", "Value added tax");

  private final String m_sUBLCode;
  private final String m_sCIICode;
  private final String m_sDisplayName;

  EEN16931TaxSchemeCode (@NonNull @Nonempty final String sUBLCode,
        @NonNull @Nonempty final String sCIICode,
        @NonNull @Nonempty final String sDisplayName)
  {
    m_sUBLCode = sUBLCode;
    m_sCIICode = sCIICode;
    m_sDisplayName = sDisplayName;
  }

  /**
   * @return The UNECE 5153 code used by the UBL syntax binding. Neither <code>null</code> nor
   *         empty.
   */
  @NonNull
  @Nonempty
  public String getUBLCode ()
  {
    return m_sUBLCode;
  }

  /**
   * @return The UNECE 1153 code used by the CII syntax binding. Neither <code>null</code> nor
   *         empty.
   */
  @NonNull
  @Nonempty
  public String getCIICode ()
  {
    return m_sCIICode;
  }

  @NonNull
  @Nonempty
  public String getDisplayName ()
  {
    return m_sDisplayName;
  }

  /**
   * Find the entry with the provided code of the UBL syntax binding.
   *
   * @param sUBLCode
   *        The UBL code to search. May be <code>null</code>.
   * @return <code>null</code> if the code list contains no such code.
   */
  @Nullable
  public static EEN16931TaxSchemeCode getFromUBLCodeOrNull (@Nullable final String sUBLCode)
  {
    if (sUBLCode != null)
      for (final EEN16931TaxSchemeCode e : values ())
        if (e.m_sUBLCode.equals (sUBLCode))
          return e;
    return null;
  }

  /**
   * Find the entry with the provided code of the CII syntax binding.
   *
   * @param sCIICode
   *        The CII code to search. May be <code>null</code>.
   * @return <code>null</code> if the code list contains no such code.
   */
  @Nullable
  public static EEN16931TaxSchemeCode getFromCIICodeOrNull (@Nullable final String sCIICode)
  {
    if (sCIICode != null)
      for (final EEN16931TaxSchemeCode e : values ())
        if (e.m_sCIICode.equals (sCIICode))
          return e;
    return null;
  }
}
