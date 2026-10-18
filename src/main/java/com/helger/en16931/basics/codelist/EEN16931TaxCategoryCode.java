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

import java.util.Locale;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import com.helger.annotation.Nonempty;
import com.helger.annotation.misc.Translatable;
import com.helger.annotation.style.CodingStyleguideUnaware;
import com.helger.base.enforce.ValueEnforcer;
import com.helger.base.id.IHasID;
import com.helger.base.name.IHasDisplayName;
import com.helger.collection.commons.CommonsHashMap;
import com.helger.collection.commons.ICommonsMap;
import com.helger.text.IMultilingualText;
import com.helger.text.display.IHasDisplayText;
import com.helger.text.resolve.DefaultTextResolver;
import com.helger.text.util.TextHelper;

/**
 * UNTDID 5305 duty or tax or fee category codes.
 * <p>
 * Used by BT-95, BT-102, BT-118 and BT-151. EN 16931 uses this code list as a subset.
 * <p>
 * Source of truth: sheet <code>5305</code> of the EN 16931 code list workbook. The implemented
 * version of that workbook is {@link EN16931CodeLists#CODE_LIST_VERSION}, and the registry it comes
 * from is named in {@link EN16931CodeLists}.
 *
 * @author Philip Helger
 */
@Translatable
@CodingStyleguideUnaware
public enum EEN16931TaxCategoryCode implements IHasID <String>, IHasDisplayName, IHasDisplayText
{
  /** <code>S</code> - Standard rate */
  S ("S", "Standard rate", "Standard rate", "Regelsteuersatz"),
  /** <code>Z</code> - Zero rated goods */
  Z ("Z", "Zero rated goods", "Zero rated goods", "Steuersatz Null"),
  /** <code>E</code> - Exempt from tax */
  E ("E", "Exempt from tax", "Exempt from tax", "USt-befreit"),
  /** <code>AE</code> - VAT Reverse charge */
  AE ("AE", "VAT Reverse charge", "VAT reverse charge", "Umkehrung der Steuerschuldnerschaft"),
  /** <code>K</code> - VAT exempt for EEA intra-community supply of goods and services */
  K ("K",
     "VAT exempt for EEA intra-community supply of goods and services",
     "VAT exempt for intra community supply of goods", "USt-befreit für innergemeinschaftliche EWR-Lieferung"),
  /** <code>G</code> - Free export item, tax not charged */
  G ("G", "Free export item, tax not charged", "Free export item, tax not charged", "Freier Ausfuhrartikel, USt nicht berechnet"),
  /** <code>O</code> - Service outside scope of tax */
  O ("O", "Service outside scope of tax", "Services outside scope of tax", "Außerhalb des USt-Geltungsbereichs"),
  /** <code>L</code> - Canary Islands general indirect tax */
  L ("L", "Canary Islands general indirect tax", "Canary Islands General Indirect Tax", "Kanarische Inseln IGIC"),
  /** <code>M</code> - Tax for production, services and importation in Ceuta and Melilla */
  M ("M", "Tax for production, services and importation in Ceuta and Melilla", "Liable for IPSI", "Ceuta und Melilla IPSI");

  private static final ICommonsMap <String, EEN16931TaxCategoryCode> MAP_BY_ID = new CommonsHashMap <> ();

  static
  {
    for (final EEN16931TaxCategoryCode e : values ())
      MAP_BY_ID.put (e.m_sID, e);
  }

  private final String m_sID;
  private final String m_sDisplayName;
  private final IMultilingualText m_aTP;
  private final String m_sSemanticModelName;

  EEN16931TaxCategoryCode (@NonNull @Nonempty final String sID,
                           @NonNull @Nonempty final String sDisplayName,
                           @NonNull @Nonempty final String sSemanticModelName)
  {
    this (sID, sDisplayName, sSemanticModelName, TextHelper.create_EN (sDisplayName));
  }

  EEN16931TaxCategoryCode (@NonNull @Nonempty final String sID,
                           @NonNull @Nonempty final String sDisplayName,
                           @NonNull @Nonempty final String sSemanticModelName,
                           @NonNull @Nonempty final String sDisplayNameDE)
  {
    this (sID, sDisplayName, sSemanticModelName, TextHelper.create_DE_EN (sDisplayNameDE, sDisplayName));
  }

  private EEN16931TaxCategoryCode (@NonNull @Nonempty final String sID,
                                   @NonNull @Nonempty final String sDisplayName,
                                   @NonNull @Nonempty final String sSemanticModelName,
                                   @NonNull final IMultilingualText aTP)
  {
    m_sID = sID;
    m_sDisplayName = sDisplayName;
    m_aTP = aTP;
    m_sSemanticModelName = sSemanticModelName;
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
   * Get the name of the code in the language of the passed locale. English is the fall back
   * language.
   *
   * @param aContentLocale
   *        The locale to use. May not be <code>null</code>.
   * @return The name in the requested language or the English name. Neither <code>null</code> nor
   *         empty.
   */
  @NonNull
  @Nonempty
  public String getDisplayText (@NonNull final Locale aContentLocale)
  {
    ValueEnforcer.notNull (aContentLocale, "ContentLocale");
    final String ret = DefaultTextResolver.getTextStatic (this, m_aTP, aContentLocale);
    return ret != null ? ret : m_sDisplayName;
  }

  /**
   * @return The name of the code in the EN 16931 semantic data model, which differs in wording from
   *         the UNTDID name. Neither <code>null</code> nor empty.
   */
  @NonNull
  @Nonempty
  public String getSemanticModelName ()
  {
    return m_sSemanticModelName;
  }

  /**
   * Find the code list entry with the provided code.
   *
   * @param sID
   *        The code to search. May be <code>null</code>.
   * @return <code>null</code> if the code list contains no such code.
   */
  @Nullable
  public static EEN16931TaxCategoryCode getFromIDOrNull (@Nullable final String sID)
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
