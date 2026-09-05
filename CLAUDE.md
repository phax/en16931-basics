# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

The shared building blocks of the EN 16931 tooling - the facts about the standard that
`en16931-cii2ubl`, `en16931-purifier` and `en16931-ubl2cii` all need. Single Maven module, no
submodules, no CLI.

**The rule that decides what belongs here:** if it changes when the *standard* changes, it belongs
here. If it changes when *our* code changes, it does not.

Explicitly out of scope: conversion or purification logic, anything typed to a JAXB model
(`copyID`, `copyAmount`, the `parseDate` overloads - they take CII-release-specific types and cannot
be shared) and CLI code.

## Build & Test Commands

```bash
mvn clean compile                # Compile
mvn clean test                   # Run all tests
mvn clean install                # Build and install

# Single test class
mvn test -Dtest=EN16931CodeListsTest

# Single test method
mvn test -Dtest=EEN16931EditionTest#testDetectCII

mvn license:format               # Apply the license header of src/etc/license-template.txt
```

Requires Java 17+.

## Dependencies

`ph-commons` and `ph-xml` only. **No ph-cii and no ph-ubl** - that is what keeps this artefact model
agnostic and cheap to depend on. The XML namespace URIs are therefore spelled out as String literals
in `CEN16931Syntax` instead of being taken from `CCIID16B` and `CUBL21`; `EEN16931SyntaxKindTest`
pins the literals.

## Architecture

```
com.helger.en16931.basics
  EEN16931Edition        EN2017 / EN2026, BT-24 specification identifiers, BT-24 based detection
  CEN16931Syntax         namespace URIs, customary prefixes, document element QNames
  EEN16931SyntaxKind     UBL_INVOICE, UBL_CREDIT_NOTE, CII - independent of the syntax version
  EEN16931DocumentType   syntax kind x syntax version, data only
  ConversionHelper       ifNotNull, ifNotEmpty

com.helger.en16931.basics.codelist
  EN16931CodeLists       the UNTDID subsets EN 16931 uses and the UBL <-> CII code mappings
```

### Why the edition cannot be detected from the namespaces

CII D16B, D22B and D25A all declare the identical namespace URIs, and so do all UBL 2.x versions.
The XML Schema does not discriminate either, because a D16B instance also validates against the D25A
XSD. The only reliable discriminator is BT-24, which is why `EEN16931Edition` carries the detection.
The detection is a **DOM peek and never unmarshals** - the correct JAXB model is exactly what is not
known yet. BT-24 is matched by **prefix**, because CIUS identifiers are appended with
`#compliant#...`.

`EEN16931DocumentType` carries **data only**. A consumer that needs a behaviour per document type -
a purifier, a converter, a marshaller - keeps its own lookup from the enum to its factory, because
those objects are typed to a JAXB model this artefact does not depend on.

## The code lists

`EN16931CodeLists` is the valuable part of this artefact and the part that is easiest to get wrong.
The source of truth is the workbook `EN16931 code lists values v17b - used from 2026-05-15.xlsx`
from the [EN 16931 registry of supporting
artefacts](https://ec.europa.eu/digital-building-blocks/sites/spaces/DIGITAL/pages/467108974/Registry+of+supporting+artefacts+to+implement+EN16931#RegistryofsupportingartefactstoimplementEN16931-CEN/TC434EN16931).

The lists are hand maintained, and `EN16931CodeListsTest` is what makes that safe: it asserts the
counts, the classification of the interesting codes and that the BT-8 pair is a true inverse. Bump
`CODE_LIST_VERSION` and `CODE_LIST_EFFECTIVE_DATE` together with any value change, and update the
counts in the test.

Traps that cost five rounds to find in cii2ubl:

- An extract with **55 codes is a 2024 snapshot**. `471 472 473 500 501` (Invoice) and `502 503`
  (Credit Note) were added in **v15, used from 2025-05-15**. v17b has 62 codes: 49 Invoice, 13
  Credit Note, none in both roles.
- The **EN 16931 validation artefacts disagree with the code list on `81`**: BR-CL-01 accepts it on
  an Invoice, every version of the list has it as a Credit Note only. The code list wins.
- The mapping document's own "new in 2026" table is **not** a complete diff.
- **There is no 2017 to 2026 delta in this list at all.** The lists are versioned by date, not by
  edition, so both editions share them. Do not parameterise the API by edition until a real
  divergence appears.
- The BT-8 mappings are derived from a **single table** so they cannot drift apart. Keep it that
  way; the previous arrangement held the two halves together with nothing but a comment, and that
  comment went stale.

## Testing

- JUnit 4
- The test documents below `src/test/resources/external/` are purpose built minimal fragments. They
  are **not** valid UBL or CII documents - they contain just enough to exercise the BT-24 detection,
  including the XRechnung and Peppol `#compliant#` forms and the undeterminable cases.

## Consumers

The three consuming projects still hold their own copies of most of this. The migration is tracked
in `TODO.md` section 4 and is **not** done yet - do not assume any of them already depends on this
artefact.

## Coding Conventions

Follow the [helger coding styleguide](https://github.com/phax/meta/blob/master/CodingStyleguide.md):
Hungarian notation, `m_`/`s_` scope prefixes, `_` prefix for private methods, `final` parameters,
a space before parentheses and generic angle brackets, and inline String concatenation in log calls.
