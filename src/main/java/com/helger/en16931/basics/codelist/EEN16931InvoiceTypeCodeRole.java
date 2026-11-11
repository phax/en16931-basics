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
public enum EEN16931InvoiceTypeCodeRole implements IHasID <String>, IHasDisplayText
{
  /** The document type code identifies an Invoice */
  INVOICE ("invoice", "Invoice", "Rechnung"),
  /** The document type code identifies a Credit Note */
  CREDIT_NOTE ("credit-note", "Credit Note", "Gutschrift");

  private final String m_sID;
  private final IMultilingualText m_aTP;

  EEN16931InvoiceTypeCodeRole (@NonNull @Nonempty final String sID,
                               @NonNull @Nonempty final String sDisplayNameEN,
                               @NonNull @Nonempty final String sDisplayNameDE)
  {
    m_sID = sID;
    m_aTP = TextHelper.create_DE_EN (sDisplayNameDE, sDisplayNameEN);
  }

  @NonNull
  @Nonempty
  public String getID ()
  {
    return m_sID;
  }

  /**
   * Get the name of the role in the language of the passed locale.
   *
   * @param aContentLocale
   *        The locale to use. May not be <code>null</code>.
   * @return The name in the requested language. May be <code>null</code>.
   */
  @Nullable
  public String getDisplayText (@NonNull final Locale aContentLocale)
  {
    ValueEnforcer.notNull (aContentLocale, "ContentLocale");
    return DefaultTextResolver.getTextStatic (this, m_aTP, aContentLocale);
  }

  /**
   * Get the name of the role in the language of the passed locale and fall back to the English name
   * if there is no name in that language.
   *
   * @param aContentLocale
   *        The locale to use. May not be <code>null</code>.
   * @return The name in the requested language or the English name. Neither <code>null</code> nor
   *         empty.
   */
  @NonNull
  @Nonempty
  public String getDisplayTextOrEN (@NonNull final Locale aContentLocale)
  {
    final String ret = getDisplayText (aContentLocale);
    return ret != null ? ret : getDisplayText (TextHelper.EN);
  }

  @Nullable
  public static EEN16931InvoiceTypeCodeRole getFromIDOrNull (@Nullable final String sID)
  {
    return EnumHelper.getFromIDOrNull (EEN16931InvoiceTypeCodeRole.class, sID);
  }
}
