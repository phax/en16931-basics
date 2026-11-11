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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Locale;

import org.junit.Test;

import com.helger.text.display.IHasDisplayText;

/**
 * Test class for the localized names of the code list enums.
 *
 * @author Philip Helger
 */
public final class EN16931DisplayTextTest
{
  private static final Locale DUTCH = Locale.forLanguageTag ("nl");
  private static final Locale SPANISH = Locale.forLanguageTag ("es");

  @Test
  public void testGermanNames ()
  {
    assertEquals ("Regelsteuersatz", EEN16931TaxCategoryCode.S.getDisplayText (Locale.GERMAN));
    assertEquals ("Regelsteuersatz", EEN16931TaxCategoryCode.S.getDisplayText (Locale.GERMANY));
    assertEquals ("SEPA-\u00dcberweisung", EEN16931PaymentMeansCode._58.getDisplayText (Locale.GERMAN));
  }

  @Test
  public void testInvoiceTypeRole ()
  {
    assertEquals ("Rechnung", EEN16931InvoiceTypeCodeRole.INVOICE.getDisplayText (Locale.GERMAN));
    assertEquals ("Gutschrift", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE.getDisplayText (Locale.GERMAN));
    assertEquals ("Creditnota", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE.getDisplayText (DUTCH));
    assertEquals ("Credit Note", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE.getDisplayText (Locale.ENGLISH));
    assertEquals ("Avoir", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE.getDisplayText (Locale.FRENCH));
    assertEquals ("Nota de cr\u00e9dito", EEN16931InvoiceTypeCodeRole.CREDIT_NOTE.getDisplayText (SPANISH));
  }

  @Test
  public void testInvoiceTypeCodes ()
  {
    assertEquals ("Handelsrechnung", EEN16931InvoiceTypeCode._380.getDisplayText (Locale.GERMAN));
    assertEquals ("Gutschrift", EEN16931InvoiceTypeCode._381.getDisplayText (Locale.GERMANY));
    assertEquals ("Handelsfactuur", EEN16931InvoiceTypeCode._380.getDisplayText (DUTCH));
    assertEquals ("Commercial invoice", EEN16931InvoiceTypeCode._380.getDisplayText (Locale.ENGLISH));
    assertEquals ("Facture commerciale", EEN16931InvoiceTypeCode._380.getDisplayText (Locale.FRENCH));
    assertEquals ("Facture commerciale", EEN16931InvoiceTypeCode._380.getDisplayText (Locale.CANADA_FRENCH));
    assertEquals ("Factura comercial", EEN16931InvoiceTypeCode._380.getDisplayText (SPANISH));
    for (final EEN16931InvoiceTypeCode e : EEN16931InvoiceTypeCode.values ())
    {
      final String sEN = e.getDisplayText (Locale.ENGLISH);
      assertNotNull (e.getID (), sEN);
      assertNotEquals (e.getID (), sEN, e.getDisplayText (Locale.GERMAN));
      assertNotEquals (e.getID (), sEN, e.getDisplayText (DUTCH));
      assertNotEquals (e.getID (), sEN, e.getDisplayText (Locale.FRENCH));
      assertNotEquals (e.getID (), sEN, e.getDisplayText (SPANISH));
    }
  }

  @Test
  public void testSpanishAndFrenchNames ()
  {
    assertEquals ("Tipo general", EEN16931TaxCategoryCode.S.getDisplayText (SPANISH));
    assertEquals ("Tipo general", EEN16931TaxCategoryCode.S.getDisplayText (Locale.forLanguageTag ("es-ES")));
    assertEquals ("Taux normal", EEN16931TaxCategoryCode.S.getDisplayText (Locale.FRENCH));
    assertEquals ("Taux normal", EEN16931TaxCategoryCode.S.getDisplayText (Locale.FRANCE));
    assertEquals ("Transferencia SEPA", EEN16931PaymentMeansCode._58.getDisplayText (SPANISH));
    assertEquals ("Virement SEPA", EEN16931PaymentMeansCode._58.getDisplayText (Locale.FRENCH));
    assertEquals ("Exon\u00e9r\u00e9 de TVA pour livraison intracommunautaire de biens et de services dans l'EEE",
                  EEN16931TaxCategoryCode.K.getDisplayText (Locale.FRENCH));
    // German is not affected
    assertEquals ("Regelsteuersatz", EEN16931TaxCategoryCode.S.getDisplayText (Locale.GERMAN));
  }

  @Test
  public void testEnglishIsTheFallBack ()
  {
    for (final Locale aLocale : new Locale [] { Locale.ENGLISH, Locale.US })
    {
      assertEquals ("Standard rate", EEN16931TaxCategoryCode.S.getDisplayText (aLocale));
      assertEquals ("SEPA credit transfer", EEN16931PaymentMeansCode._58.getDisplayText (aLocale));
    }
    // Languages without a translation
    for (final Locale aLocale : new Locale [] { Locale.ITALIAN, Locale.ROOT })
    {
      assertNull (EEN16931TaxCategoryCode.S.getDisplayText (aLocale));
      assertEquals ("Standard rate", EEN16931TaxCategoryCode.S.getDisplayTextOrEN (aLocale));
      assertNull (EEN16931PaymentMeansCode._58.getDisplayText (aLocale));
      assertEquals ("SEPA credit transfer", EEN16931PaymentMeansCode._58.getDisplayTextOrEN (aLocale));
    }
    assertNull (EEN16931InvoiceTypeCode._380.getDisplayText (Locale.ITALIAN));
    assertEquals ("Commercial invoice", EEN16931InvoiceTypeCode._380.getDisplayTextOrEN (Locale.ITALIAN));
    // Code lists without a translation
    assertNull (EEN16931AllowanceReasonCode._100.getDisplayText (Locale.GERMAN));
    assertNull (EEN16931AllowanceReasonCode._100.getDisplayText (Locale.FRENCH));
    assertNull (EEN16931AllowanceReasonCode._100.getDisplayText (SPANISH));
    assertEquals ("Special rebate", EEN16931AllowanceReasonCode._100.getDisplayTextOrEN (Locale.GERMAN));
    assertEquals ("Special rebate", EEN16931AllowanceReasonCode._100.getDisplayTextOrEN (Locale.FRENCH));
    assertEquals ("Special rebate", EEN16931AllowanceReasonCode._100.getDisplayTextOrEN (SPANISH));
    // Payment means without a translation
    assertNull (EEN16931PaymentMeansCode._1.getDisplayText (Locale.FRENCH));
    assertEquals ("Instrument not defined", EEN16931PaymentMeansCode._1.getDisplayTextOrEN (Locale.FRENCH));
    // A translation is preferred over the English name
    assertEquals ("Regelsteuersatz", EEN16931TaxCategoryCode.S.getDisplayTextOrEN (Locale.GERMAN));
  }

  @Test
  public void testCountryAndCurrencyFromTheJdk ()
  {
    assertEquals ("Deutschland", EEN16931CountryCode.DE.getDisplayText (Locale.GERMAN));
    assertEquals ("Germany", EEN16931CountryCode.DE.getDisplayText (Locale.ENGLISH));
    assertEquals ("Euro", EEN16931CurrencyCode.EUR.getDisplayText (Locale.GERMAN));
    // Codes of EN 16931 that are no ISO 3166-1 codes
    assertNotNull (EEN16931CountryCode.getFromIDOrNull ("XI"));
    assertEquals (EEN16931CountryCode.getFromIDOrNull ("XI").getDisplayText (Locale.ENGLISH),
                  EEN16931CountryCode.getFromIDOrNull ("XI").getDisplayTextOrEN (Locale.GERMAN));
    assertEquals (EEN16931CountryCode.getFromIDOrNull ("1A").getDisplayText (Locale.ENGLISH),
                  EEN16931CountryCode.getFromIDOrNull ("1A").getDisplayTextOrEN (Locale.GERMAN));
  }

  @Test
  public void testEnumsAreDisplayTexts ()
  {
    final IHasDisplayText aText = EEN16931TaxCategoryCode.S;
    assertEquals ("Regelsteuersatz", aText.getDisplayText (Locale.GERMAN));
  }
}
