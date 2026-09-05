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
 * CEF VATEX VAT exemption reason codes.
 * <p>
 * Used by BT-121. EN 16931 uses this code list as a full list.
 * <p>
 * The workbook itself notes that the names of <code>VATEX-EU-D</code> and <code>VATEX-EU-F</code>
 * differ from the VATEX code list proper. The correction requires a non backwards compatible change
 * and is postponed to November 2026. The names below are the ones of the workbook.
 * <p>
 * Source of truth: sheet <code>VATEX</code> of the EN 16931 code list workbook. The implemented
 * version of that workbook is {@link EN16931CodeLists#CODE_LIST_VERSION}, and the registry it comes
 * from is named in {@link EN16931CodeLists}.
 *
 * @author Philip Helger
 */
@CodingStyleguideUnaware
public enum EEN16931VATEXCode implements IHasID <String>, IHasDisplayName
{
  /** <code>VATEX-EU-79-C</code> - Exempt based on article 79, point c of Council Directive 2006/112/EC */
  VATEX_EU_79_C ("VATEX-EU-79-C", "Exempt based on article 79, point c of Council Directive 2006/112/EC", "Repayment of expenditure is not an exemption in the sense of the VAT Directive but may be handled as such in the context of the EN16931."),
  /** <code>VATEX-EU-132</code> - Exempt based on article 132 of Council Directive 2006/112/EC */
  VATEX_EU_132 ("VATEX-EU-132", "Exempt based on article 132 of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-132-1A</code> - Exempt based on article 132, section 1 (a) of Council Directive 2006/112/EC */
  VATEX_EU_132_1A ("VATEX-EU-132-1A", "Exempt based on article 132, section 1 (a) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-132-1B</code> - Exempt based on article 132, section 1 (b) of Council Directive 2006/112/EC */
  VATEX_EU_132_1B ("VATEX-EU-132-1B", "Exempt based on article 132, section 1 (b) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-132-1C</code> - Exempt based on article 132, section 1 (c) of Council Directive 2006/112/EC */
  VATEX_EU_132_1C ("VATEX-EU-132-1C", "Exempt based on article 132, section 1 (c) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-132-1D</code> - Exempt based on article 132, section 1 (d) of Council Directive 2006/112/EC */
  VATEX_EU_132_1D ("VATEX-EU-132-1D", "Exempt based on article 132, section 1 (d) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-132-1E</code> - Exempt based on article 132, section 1 (e) of Council Directive 2006/112/EC */
  VATEX_EU_132_1E ("VATEX-EU-132-1E", "Exempt based on article 132, section 1 (e) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-132-1F</code> - Exempt based on article 132, section 1 (f) of Council Directive 2006/112/EC */
  VATEX_EU_132_1F ("VATEX-EU-132-1F", "Exempt based on article 132, section 1 (f) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-132-1G</code> - Exempt based on article 132, section 1 (g) of Council Directive 2006/112/EC */
  VATEX_EU_132_1G ("VATEX-EU-132-1G", "Exempt based on article 132, section 1 (g) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-132-1H</code> - Exempt based on article 132, section 1 (h) of Council Directive 2006/112/EC */
  VATEX_EU_132_1H ("VATEX-EU-132-1H", "Exempt based on article 132, section 1 (h) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-132-1I</code> - Exempt based on article 132, section 1 (i) of Council Directive 2006/112/EC */
  VATEX_EU_132_1I ("VATEX-EU-132-1I", "Exempt based on article 132, section 1 (i) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-132-1J</code> - Exempt based on article 132, section 1 (j) of Council Directive 2006/112/EC */
  VATEX_EU_132_1J ("VATEX-EU-132-1J", "Exempt based on article 132, section 1 (j) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-132-1K</code> - Exempt based on article 132, section 1 (k) of Council Directive 2006/112/EC */
  VATEX_EU_132_1K ("VATEX-EU-132-1K", "Exempt based on article 132, section 1 (k) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-132-1L</code> - Exempt based on article 132, section 1 (l) of Council Directive 2006/112/EC */
  VATEX_EU_132_1L ("VATEX-EU-132-1L", "Exempt based on article 132, section 1 (l) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-132-1M</code> - Exempt based on article 132, section 1 (m) of Council Directive 2006/112/EC */
  VATEX_EU_132_1M ("VATEX-EU-132-1M", "Exempt based on article 132, section 1 (m) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-132-1N</code> - Exempt based on article 132, section 1 (n) of Council Directive 2006/112/EC */
  VATEX_EU_132_1N ("VATEX-EU-132-1N", "Exempt based on article 132, section 1 (n) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-132-1O</code> - Exempt based on article 132, section 1 (o) of Council Directive 2006/112/EC */
  VATEX_EU_132_1O ("VATEX-EU-132-1O", "Exempt based on article 132, section 1 (o) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-132-1P</code> - Exempt based on article 132, section 1 (p) of Council Directive 2006/112/EC */
  VATEX_EU_132_1P ("VATEX-EU-132-1P", "Exempt based on article 132, section 1 (p) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-132-1Q</code> - Exempt based on article 132, section 1 (q) of Council Directive 2006/112/EC */
  VATEX_EU_132_1Q ("VATEX-EU-132-1Q", "Exempt based on article 132, section 1 (q) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-135-1</code> - Exempt based on article 135, section 1 of Council Directive 2006/112/EC */
  VATEX_EU_135_1 ("VATEX-EU-135-1", "Exempt based on article 135, section 1 of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-143</code> - Exempt based on article 143 of Council Directive 2006/112/EC */
  VATEX_EU_143 ("VATEX-EU-143", "Exempt based on article 143 of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-143-1A</code> - Exempt based on article 143, section 1 (a) of Council Directive 2006/112/EC */
  VATEX_EU_143_1A ("VATEX-EU-143-1A", "Exempt based on article 143, section 1 (a) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-143-1B</code> - Exempt based on article 143, section 1 (b) of Council Directive 2006/112/EC */
  VATEX_EU_143_1B ("VATEX-EU-143-1B", "Exempt based on article 143, section 1 (b) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-143-1C</code> - Exempt based on article 143, section 1 (c) of Council Directive 2006/112/EC */
  VATEX_EU_143_1C ("VATEX-EU-143-1C", "Exempt based on article 143, section 1 (c) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-143-1D</code> - Exempt based on article 143, section 1 (d) of Council Directive 2006/112/EC */
  VATEX_EU_143_1D ("VATEX-EU-143-1D", "Exempt based on article 143, section 1 (d) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-143-1E</code> - Exempt based on article 143, section 1 (e) of Council Directive 2006/112/EC */
  VATEX_EU_143_1E ("VATEX-EU-143-1E", "Exempt based on article 143, section 1 (e) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-143-1F</code> - Exempt based on article 143, section 1 (f) of Council Directive 2006/112/EC */
  VATEX_EU_143_1F ("VATEX-EU-143-1F", "Exempt based on article 143, section 1 (f) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-143-1FA</code> - Exempt based on article 143, section 1 (fa) of Council Directive 2006/112/EC */
  VATEX_EU_143_1FA ("VATEX-EU-143-1FA", "Exempt based on article 143, section 1 (fa) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-143-1G</code> - Exempt based on article 143, section 1 (g) of Council Directive 2006/112/EC */
  VATEX_EU_143_1G ("VATEX-EU-143-1G", "Exempt based on article 143, section 1 (g) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-143-1H</code> - Exempt based on article 143, section 1 (h) of Council Directive 2006/112/EC */
  VATEX_EU_143_1H ("VATEX-EU-143-1H", "Exempt based on article 143, section 1 (h) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-143-1I</code> - Exempt based on article 143, section 1 (i) of Council Directive 2006/112/EC */
  VATEX_EU_143_1I ("VATEX-EU-143-1I", "Exempt based on article 143, section 1 (i) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-143-1J</code> - Exempt based on article 143, section 1 (j) of Council Directive 2006/112/EC */
  VATEX_EU_143_1J ("VATEX-EU-143-1J", "Exempt based on article 143, section 1 (j) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-143-1K</code> - Exempt based on article 143, section 1 (k) of Council Directive 2006/112/EC */
  VATEX_EU_143_1K ("VATEX-EU-143-1K", "Exempt based on article 143, section 1 (k) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-143-1L</code> - Exempt based on article 143, section 1 (l) of Council Directive 2006/112/EC */
  VATEX_EU_143_1L ("VATEX-EU-143-1L", "Exempt based on article 143, section 1 (l) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-144</code> - Exempt based on article 144 of Council Directive 2006/112/EC */
  VATEX_EU_144 ("VATEX-EU-144", "Exempt based on article 144 of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-146-1E</code> - Exempt based on article 146 section 1 (e) of Council Directive 2006/112/EC */
  VATEX_EU_146_1E ("VATEX-EU-146-1E", "Exempt based on article 146 section 1 (e) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-148</code> - Exempt based on article 148 of Council Directive 2006/112/EC */
  VATEX_EU_148 ("VATEX-EU-148", "Exempt based on article 148 of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-148-A</code> - Exempt based on article 148, section (a) of Council Directive 2006/112/EC */
  VATEX_EU_148_A ("VATEX-EU-148-A", "Exempt based on article 148, section (a) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-148-B</code> - Exempt based on article 148, section (b) of Council Directive 2006/112/EC */
  VATEX_EU_148_B ("VATEX-EU-148-B", "Exempt based on article 148, section (b) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-148-C</code> - Exempt based on article 148, section (c) of Council Directive 2006/112/EC */
  VATEX_EU_148_C ("VATEX-EU-148-C", "Exempt based on article 148, section (c) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-148-D</code> - Exempt based on article 148, section (d) of Council Directive 2006/112/EC */
  VATEX_EU_148_D ("VATEX-EU-148-D", "Exempt based on article 148, section (d) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-148-E</code> - Exempt based on article 148, section (e) of Council Directive 2006/112/EC */
  VATEX_EU_148_E ("VATEX-EU-148-E", "Exempt based on article 148, section (e) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-148-F</code> - Exempt based on article 148, section (f) of Council Directive 2006/112/EC */
  VATEX_EU_148_F ("VATEX-EU-148-F", "Exempt based on article 148, section (f) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-148-G</code> - Exempt based on article 148, section (g) of Council Directive 2006/112/EC */
  VATEX_EU_148_G ("VATEX-EU-148-G", "Exempt based on article 148, section (g) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-151</code> - Exempt based on article 151 of Council Directive 2006/112/EC */
  VATEX_EU_151 ("VATEX-EU-151", "Exempt based on article 151 of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-151-1A</code> - Exempt based on article 151, section 1 (a) of Council Directive 2006/112/EC */
  VATEX_EU_151_1A ("VATEX-EU-151-1A", "Exempt based on article 151, section 1 (a) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-151-1AA</code> - Exempt based on article 151, section 1 (aa) of Council Directive 2006/112/EC */
  VATEX_EU_151_1AA ("VATEX-EU-151-1AA", "Exempt based on article 151, section 1 (aa) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-151-1B</code> - Exempt based on article 151, section 1 (b) of Council Directive 2006/112/EC */
  VATEX_EU_151_1B ("VATEX-EU-151-1B", "Exempt based on article 151, section 1 (b) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-151-1C</code> - Exempt based on article 151, section 1 (c) of Council Directive 2006/112/EC */
  VATEX_EU_151_1C ("VATEX-EU-151-1C", "Exempt based on article 151, section 1 (c) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-151-1D</code> - Exempt based on article 151, section 1 (d) of Council Directive 2006/112/EC */
  VATEX_EU_151_1D ("VATEX-EU-151-1D", "Exempt based on article 151, section 1 (d) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-151-1E</code> - Exempt based on article 151, section 1 (e) of Council Directive 2006/112/EC */
  VATEX_EU_151_1E ("VATEX-EU-151-1E", "Exempt based on article 151, section 1 (e) of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-153</code> - Exempt based on article 153 of Council Directive 2006/112/EC */
  VATEX_EU_153 ("VATEX-EU-153", "Exempt based on article 153 of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-159</code> - Exempt based on article 159 of Council Directive 2006/112/EC */
  VATEX_EU_159 ("VATEX-EU-159", "Exempt based on article 159 of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-309</code> - Exempt based on article 309 of Council Directive 2006/112/EC */
  VATEX_EU_309 ("VATEX-EU-309", "Exempt based on article 309 of Council Directive 2006/112/EC", null),
  /** <code>VATEX-EU-AE</code> - Reverse charge */
  VATEX_EU_AE ("VATEX-EU-AE", "Reverse charge", "Only use with VAT category code AE"),
  /** <code>VATEX-EU-D</code> - Travel agents VAT scheme. */
  VATEX_EU_D ("VATEX-EU-D", "Travel agents VAT scheme.", "Only use with VAT category code E"),
  /** <code>VATEX-EU-F</code> - Intra-Community acquisition of second hand goods */
  VATEX_EU_F ("VATEX-EU-F", "Intra-Community acquisition of second hand goods", "Only use with VAT category code E"),
  /** <code>VATEX-EU-G</code> - Export outside the EU */
  VATEX_EU_G ("VATEX-EU-G", "Export outside the EU", "Only use with VAT category code G"),
  /** <code>VATEX-EU-I</code> - Intra-Community acquisition of works of art */
  VATEX_EU_I ("VATEX-EU-I", "Intra-Community acquisition of works of art", "Only use with VAT category code E"),
  /** <code>VATEX-EU-IC</code> - Intra-community supply */
  VATEX_EU_IC ("VATEX-EU-IC", "Intra-community supply", "Only use with VAT category code K"),
  /** <code>VATEX-EU-J</code> - Intra-Community acquisition of collectors items and antiques */
  VATEX_EU_J ("VATEX-EU-J", "Intra-Community acquisition of collectors items and antiques", "Only use with VAT category code E"),
  /** <code>VATEX-EU-O</code> - Not subject to VAT */
  VATEX_EU_O ("VATEX-EU-O", "Not subject to VAT", "Only use with VAT category code O"),
  /** <code>VATEX-FR-FRANCHISE</code> - France domestic VAT franchise in base */
  VATEX_FR_FRANCHISE ("VATEX-FR-FRANCHISE", "France domestic VAT franchise in base", "For domestic invoicing in France"),
  /** <code>VATEX-FR-CNWVAT</code> - France domestic Credit Notes without VAT, due to supplier forfeit of VAT for discount */
  VATEX_FR_CNWVAT ("VATEX-FR-CNWVAT", "France domestic Credit Notes without VAT, due to supplier forfeit of VAT for discount", "For domestic Credit Notes only in France"),
  /** <code>VATEX-FR-CGI261-1</code> - Exempt based on 1 of article 261 of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261_1 ("VATEX-FR-CGI261-1", "Exempt based on 1 of article 261 of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261-2</code> - Exempt based on 2 of article 261 of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261_2 ("VATEX-FR-CGI261-2", "Exempt based on 2 of article 261 of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261-3</code> - Exempt based on 3 of article 261 of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261_3 ("VATEX-FR-CGI261-3", "Exempt based on 3 of article 261 of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261-4</code> - Exempt based on 4 of article 261 of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261_4 ("VATEX-FR-CGI261-4", "Exempt based on 4 of article 261 of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261-5</code> - Exempt based on 5 of article 261 of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261_5 ("VATEX-FR-CGI261-5", "Exempt based on 5 of article 261 of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261-7</code> - Exempt based on 7 of article 261 of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261_7 ("VATEX-FR-CGI261-7", "Exempt based on 7 of article 261 of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261-8</code> - Exempt based on 8 of article 261 of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261_8 ("VATEX-FR-CGI261-8", "Exempt based on 8 of article 261 of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261A</code> - Exempt based on article 261 A of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261A ("VATEX-FR-CGI261A", "Exempt based on article 261 A of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261B</code> - Exempt based on article 261 B of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261B ("VATEX-FR-CGI261B", "Exempt based on article 261 B of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261C-1</code> - Exempt based on 1° of article 261 C of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261C_1 ("VATEX-FR-CGI261C-1", "Exempt based on 1° of article 261 C of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261C-2</code> - Exempt based on 2° of article 261 C of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261C_2 ("VATEX-FR-CGI261C-2", "Exempt based on 2° of article 261 C of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261C-3</code> - Exempt based on 3° of article 261 C of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261C_3 ("VATEX-FR-CGI261C-3", "Exempt based on 3° of article 261 C of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261D-1</code> - Exempt based on 1° of article 261 D of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261D_1 ("VATEX-FR-CGI261D-1", "Exempt based on 1° of article 261 D of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261D-1BIS</code> - Exempt based on 1°bis of article 261 D of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261D_1BIS ("VATEX-FR-CGI261D-1BIS", "Exempt based on 1°bis of article 261 D of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261D-2</code> - Exempt based on 2° of article 261 D of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261D_2 ("VATEX-FR-CGI261D-2", "Exempt based on 2° of article 261 D of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261D-3</code> - Exempt based on 3° of article 261 D of the Code Général des Impôts (CGI ; General tax code) Exonération de TVA - Article 261 D-3° du Code Général des Impôts */
  VATEX_FR_CGI261D_3 ("VATEX-FR-CGI261D-3", "Exempt based on 3° of article 261 D of the Code Général des Impôts (CGI ; General tax code) Exonération de TVA - Article 261 D-3° du Code Général des Impôts", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261D-4</code> - Exempt based on 4° of article 261 D of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261D_4 ("VATEX-FR-CGI261D-4", "Exempt based on 4° of article 261 D of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261E-1</code> - Exempt based on 1° of article 261 E of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261E_1 ("VATEX-FR-CGI261E-1", "Exempt based on 1° of article 261 E of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI261E-2</code> - Exempt based on 2° of article 261 E of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI261E_2 ("VATEX-FR-CGI261E-2", "Exempt based on 2° of article 261 E of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI277A</code> - Exempt based on article 277 A of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI277A ("VATEX-FR-CGI277A", "Exempt based on article 277 A of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI275</code> - Exempt based on article 275 of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI275 ("VATEX-FR-CGI275", "Exempt based on article 275 of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-298SEXDECIESA</code> - Exempt based on article 298 sexdecies A of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_298SEXDECIESA ("VATEX-FR-298SEXDECIESA", "Exempt based on article 298 sexdecies A of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-CGI295</code> - Exempt based on article 295 of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_CGI295 ("VATEX-FR-CGI295", "Exempt based on article 295 of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France"),
  /** <code>VATEX-FR-AE</code> - Exempt based on 2 of article 283 of the Code Général des Impôts (CGI ; General tax code) */
  VATEX_FR_AE ("VATEX-FR-AE", "Exempt based on 2 of article 283 of the Code Général des Impôts (CGI ; General tax code)", "Only for domestic invoicing in France");

  private static final ICommonsMap <String, EEN16931VATEXCode> MAP_BY_ID = new CommonsHashMap <> ();

  static
  {
    for (final EEN16931VATEXCode e : values ())
      MAP_BY_ID.put (e.m_sID, e);
  }

  private final String m_sID;
  private final String m_sDisplayName;
  private final String m_sRemark;

  EEN16931VATEXCode (@NonNull @Nonempty final String sID,
                     @NonNull @Nonempty final String sDisplayName,
                     @Nullable final String sRemark)
  {
    m_sID = sID;
    m_sDisplayName = sDisplayName;
    m_sRemark = sRemark;
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
   * @return The remark of the workbook, or <code>null</code> if the workbook has none for this
   *         code.
   */
  @Nullable
  public String getRemark ()
  {
    return m_sRemark;
  }

  /**
   * Find the code list entry with the provided code.
   *
   * @param sID
   *        The code to search. May be <code>null</code>.
   * @return <code>null</code> if the code list contains no such code.
   */
  @Nullable
  public static EEN16931VATEXCode getFromIDOrNull (@Nullable final String sID)
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
