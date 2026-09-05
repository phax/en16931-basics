# en16931-basics

<!-- ph-badge-start -->
[![Sonatype Central](https://maven-badges.sml.io/sonatype-central/com.helger/en16931-basics/badge.svg)](https://maven-badges.sml.io/sonatype-central/com.helger/en16931-basics/)
[![javadoc](https://javadoc.io/badge2/com.helger/en16931-basics/javadoc.svg)](https://javadoc.io/doc/com.helger/en16931-basics)

> If this project saved you some time or made your day a little easier, a star would mean a lot — it helps others find it too.
<!-- ph-badge-end -->

The shared building blocks of the EN 16931 tooling: the facts about the standard that
[en16931-cii2ubl](https://github.com/phax/en16931-cii2ubl),
[en16931-purifier](https://github.com/phax/en16931-purifier) and
[en16931-ubl2cii](https://github.com/phax/en16931-ubl2cii) all need, held in exactly one place.

This is a Java 17+ library. Its only dependencies are `ph-commons` and `ph-xml` — **deliberately
neither ph-cii nor ph-ubl**. That is what keeps this artefact model agnostic and cheap to depend on.

This library is licensed under the Apache License Version 2.0.

# What is in here

Everything in this library changes when the **standard** changes, and stays put when *our* code
changes:

| Class | Contents |
|-------|----------|
| `EEN16931Edition` | The 2017 and the 2026 edition, their BT-24 specification identifiers and the BT-24 based detection |
| `CEN16931Syntax` | The XML namespace URIs, the customary prefixes and the document element names of UBL and CII |
| `EEN16931SyntaxKind` | UBL Invoice, UBL Credit Note, CII — the syntax kind, independent of the syntax version |
| `EEN16931DocumentType` | Syntax kind × syntax version, as data only |
| `EN16931CodeLists` | The UNTDID code list subsets that EN 16931 uses, and the mappings between the UBL and the CII code list of the same business term |
| `ConversionHelper` | `ifNotNull` and `ifNotEmpty` |

What is **not** in here: conversion or purification logic, anything typed to a JAXB model, and CLI
code.

# Maven usage

Replace `x.y.z` with the effective version you want to use:

```xml
<dependency>
  <groupId>com.helger</groupId>
  <artifactId>en16931-basics</artifactId>
  <version>x.y.z</version>
</dependency>
```

# The EN 16931 edition

Each edition prescribes exactly one CII release and one UBL version:

| Edition | BT-24 specification identifier | CII | UBL |
|---------|--------------------------------|-----|-----|
| `EEN16931Edition.EN2017` | `urn:cen.eu:en16931:2017` | D16B | 2.1 |
| `EEN16931Edition.EN2026` | `urn:cen.eu:en16931:2026` | D25A | 2.5 |

**The edition cannot be told from the XML namespaces.** CII D16B, D22B and D25A all use the
identical namespace URIs, and so do all UBL 2.x versions. The XML Schema does not help either,
because a CII D16B instance also validates against the CII D25A XSD. The only reliable discriminator
is BT-24 (Specification identifier), which is mandatory in every EN 16931 document.

```java
final EEN16931Edition eEdition = EEN16931Edition.detect (new File ("invoice.xml"));
```

`detect` accepts a `File`, a `org.w3c.dom.Document` or a document element, determines the syntax
kind from the document element and reads BT-24 from `cbc:CustomizationID` for UBL respectively from
`rsm:ExchangedDocumentContext/ram:GuidelineSpecifiedDocumentContextParameter/ram:ID` for CII. It is
a DOM peek and never unmarshals, because the correct JAXB model is exactly what is not known yet.
It returns `null` if BT-24 is absent or belongs to no known edition — a legacy ZUGFeRD 1.0 document
carries `urn:ferd:CrossIndustryDocument:invoice:1p0:comfort`, for example.

BT-24 is matched by **prefix**, because customizations append their own identifier:

```java
// both yield EN2017
EEN16931Edition.getFromSpecificationIdentifierOrNull ("urn:cen.eu:en16931:2017");
EEN16931Edition.getFromSpecificationIdentifierOrNull ("urn:cen.eu:en16931:2017#compliant#urn:xeinkauf.de:kosit:xrechnung_3.0");
```

# The code lists

`EN16931CodeLists` holds the UNTDID subsets that EN 16931 uses. The source of truth is the
[Registry of supporting artefacts to implement EN 16931](https://ec.europa.eu/digital-building-blocks/sites/spaces/DIGITAL/pages/467108974/Registry+of+supporting+artefacts+to+implement+EN16931#RegistryofsupportingartefactstoimplementEN16931-CEN/TC434EN16931).

| Business term | Code list | API |
|---------------|-----------|-----|
| BT-3 Invoice type code | UNTDID 1001 | `INVOICE_TYPE_CODES`, `CREDIT_NOTE_TYPE_CODES`, `isInvoiceTypeCode`, `isCreditNoteTypeCode` |
| BT-8 VAT point date code | UNTDID 2475 (CII) ↔ UNTDID 2005 (UBL) | `mapDueDateTypeCodeCIIToUBL`, `mapDueDateTypeCodeUBLToCII` |
| BT-81 Payment means type code | UNTDID 4461 | `isPaymentMeansCodeCreditTransfer`, `isPaymentMeansCodePaymentCard`, `isPaymentMeansCodeDirectDebit` |
| BT-17 / BT-18 / BG-24 document type code | UNTDID 1001 | `isOriginatorDocumentReferenceTypeCode`, `isValidDocumentReferenceTypeCode`, `DOCUMENT_TYPE_CODE_SUPPORTING_DOCUMENT` |

The implemented workbook version is available as `CODE_LIST_VERSION` and
`CODE_LIST_EFFECTIVE_DATE`, so a consumer can report what it is based on.

Notes that are easy to get wrong:

* The code lists are versioned **by date and not by EN 16931 edition**. The 2017 and the 2026
  edition share them; there is no 2017 to 2026 delta in these lists.
* BT-3 is a subset of 62 codes, 49 of them an Invoice and 13 of them a Credit Note. **No code
  appears in both roles.** The codes `471`, `472`, `473`, `500`, `501`, `502` and `503` were added
  in v15 (used from 2025-05-15); an extract with 55 codes is a 2024 snapshot.
* The EN 16931 validation artefacts accept `81` on an Invoice, whereas every version of the code
  list has it as a Credit Note only. **The code list wins here.**
* The two BT-8 mappings are an inverse pair derived from a single table, so the two directions
  cannot drift apart.

# Building

Requires Java 17 or higher.

```bash
mvn clean install
```

# News and noteworthy

v1.0.0 - work in progress
* Initial version
* Contains `EEN16931Edition` with the BT-24 based edition detection for UBL and CII
* Contains `CEN16931Syntax`, `EEN16931SyntaxKind` and `EEN16931DocumentType`
* Contains `EN16931CodeLists` based on the code list values `v17b` (used from 2026-05-15)

---

My personal [Coding Styleguide](https://github.com/phax/meta/blob/master/CodingStyleguide.md) |
It is appreciated if you star the GitHub project if you like it.
