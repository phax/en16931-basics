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
import com.helger.base.enforce.ValueEnforcer;
import com.helger.base.id.IHasID;
import com.helger.base.lang.EnumHelper;
import com.helger.base.name.IHasDisplayName;
import com.helger.text.IMultilingualText;
import com.helger.text.display.IHasDisplayText;
import com.helger.text.resolve.DefaultTextResolver;
import com.helger.text.util.TextHelper;

/**
 * The interpretation EN 16931 puts on a UNTDID 1001 document type code of BT-3. This is the
 * workbook column <code>EN16931 interpretation</code> of sheet <code>1001</code>. Every code of
 * {@link EEN16931InvoiceTypeCode} has exactly one role - no code appears in both.
 *
 * @author Philip Helger
 */
@Translatable
public enum EEN16931InvoiceTypeCodeRole implements IHasID <String>, IHasDisplayName, IHasDisplayText
{
  /** The document type code identifies an Invoice */
  INVOICE ("invoice", "Invoice", "Rechnung"),
  /** The document type code identifies a Credit Note */
  CREDIT_NOTE ("credit-note", "Credit Note", "Gutschrift");

  private final String m_sID;
  private final String m_sDisplayName;
  private final IMultilingualText m_aTP;

  EEN16931InvoiceTypeCodeRole (@NonNull @Nonempty final String sID,
                               @NonNull @Nonempty final String sDisplayName,
                               @NonNull @Nonempty final String sDisplayNameDE)
  {
    m_sID = sID;
    m_sDisplayName = sDisplayName;
    m_aTP = TextHelper.create_DE_EN (sDisplayNameDE, sDisplayName);
  }

  @NonNull
  @Nonempty
  public String getID ()
  {
    return m_sID;
  }

  /**
   * @return The name as spelled in the workbook, e.g. <code>Credit Note</code>. Neither
   *         <code>null</code> nor empty.
   */
  @NonNull
  @Nonempty
  public String getDisplayName ()
  {
    return m_sDisplayName;
  }

  /**
   * Get the name of the role in the language of the passed locale. English is the fall back
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

  @Nullable
  public static EEN16931InvoiceTypeCodeRole getFromIDOrNull (@Nullable final String sID)
  {
    return EnumHelper.getFromIDOrNull (EEN16931InvoiceTypeCodeRole.class, sID);
  }
}
