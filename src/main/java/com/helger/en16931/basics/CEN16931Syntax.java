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
package com.helger.en16931.basics;

import javax.xml.namespace.QName;

import com.helger.annotation.concurrent.Immutable;

/**
 * Constants of the XML syntaxes used by the EN 16931 syntax bindings.
 * <p>
 * All UBL 2.x versions use the same XML namespace URIs and the same element names, and so do all
 * CII versions. The constants in this class are therefore valid for UBL 2.1 as well as UBL 2.5, and
 * for CII D16B, CII D22B as well as CII D25A.
 * <p>
 * <b>The identical CII namespace URIs are the reason why the CII release cannot be determined from
 * the document.</b> <code>ph-cii</code> declares the very same URIs for D16B, D22B and D25A:
 *
 * <pre>
 * CCIID16B.XML_SCHEMA_RSM_NAMESPACE_URL == CCIID22B.XML_SCHEMA_RSM_NAMESPACE_URL
 *                                       == CCIID25A.XML_SCHEMA_CII_NAMESPACE_URL
 *                                       == "urn:un:unece:uncefact:data:standard:CrossIndustryInvoice:100"
 * </pre>
 *
 * Neither does the XML Schema help, because a D16B instance also validates against the D25A XSD.
 * The only reliable discriminator is BT-24 - see
 * {@link EEN16931Edition#getSpecificationIdentifier(org.w3c.dom.Node)}.
 * <p>
 * The values are deliberately spelled out as String literals and not taken from
 * <code>ph-cii</code> or <code>ph-ubl</code>, so that this artefact stays free of any JAXB model.
 *
 * @author Philip Helger
 */
@Immutable
public final class CEN16931Syntax
{
  /** The XML namespace URI of the UBL Invoice document */
  public static final String NS_URI_UBL_INVOICE = "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2";
  /** The XML namespace URI of the UBL CreditNote document */
  public static final String NS_URI_UBL_CREDIT_NOTE = "urn:oasis:names:specification:ubl:schema:xsd:CreditNote-2";
  /** The XML namespace URI of the UBL Common Basic Components */
  public static final String NS_URI_UBL_CBC = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2";
  /** The XML namespace URI of the UBL Common Aggregate Components */
  public static final String NS_URI_UBL_CAC = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2";

  /** The XML namespace URI of the CII CrossIndustryInvoice document */
  public static final String NS_URI_CII_RSM = "urn:un:unece:uncefact:data:standard:CrossIndustryInvoice:100";
  /** The XML namespace URI of the CII Reusable Aggregate Business Information Entities */
  public static final String NS_URI_CII_RAM = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100";
  /** The XML namespace URI of the CII Unqualified Data Types */
  public static final String NS_URI_CII_UDT = "urn:un:unece:uncefact:data:standard:UnqualifiedDataType:100";
  /** The XML namespace URI of the CII Qualified Data Types */
  public static final String NS_URI_CII_QDT = "urn:un:unece:uncefact:data:standard:QualifiedDataType:100";

  /** The customary XML namespace prefix of the UBL Common Basic Components */
  public static final String PREFIX_UBL_CBC = "cbc";
  /** The customary XML namespace prefix of the UBL Common Aggregate Components */
  public static final String PREFIX_UBL_CAC = "cac";
  /** The customary XML namespace prefix of the CII document */
  public static final String PREFIX_CII_RSM = "rsm";
  /** The customary XML namespace prefix of the CII aggregates */
  public static final String PREFIX_CII_RAM = "ram";
  /** The customary XML namespace prefix of the CII unqualified data types */
  public static final String PREFIX_CII_UDT = "udt";
  /** The customary XML namespace prefix of the CII qualified data types */
  public static final String PREFIX_CII_QDT = "qdt";

  /** The document element of a UBL Invoice */
  public static final QName QNAME_UBL_INVOICE = new QName (NS_URI_UBL_INVOICE, "Invoice");
  /** The document element of a UBL CreditNote */
  public static final QName QNAME_UBL_CREDIT_NOTE = new QName (NS_URI_UBL_CREDIT_NOTE, "CreditNote");
  /** The document element of a CII CrossIndustryInvoice */
  public static final QName QNAME_CII = new QName (NS_URI_CII_RSM, "CrossIndustryInvoice");

  private CEN16931Syntax ()
  {}
}
