# en16931-basics — implementation TODO

Shared building blocks for `en16931-cii2ubl`, `en16931-purifier` and `en16931-ubl2cii`.

Status: B1-B10 done, B9 (release) and section 4 (consumer migration) open · Created 2026-09-05

## 1. Scope

**In — facts about the standard**, true regardless of conversion direction:

- the EN 16931 edition (2017 / 2026) and the BT-24 specification identifiers
- namespaces and root element QNames for CII and UBL
- syntax kind and document type enums
- code lists, above all the UNTDID 1001 subset for BT-3
- the code list version this artefact implements

**Out** — anything that would make it a junk drawer:

- conversion or purification logic
- anything typed to a JAXB model (`copyID`, `copyAmount`, the `parseDate` overloads, …) — these
  take CII-release-specific types and cannot be shared
- CLI code

Rule of thumb: if it changes when the *standard* changes, it belongs here. If it changes when *our
code* changes, it does not.

## 2. What to move, and from where

### 2.1 Already duplicated — the reason this repo exists

| Item | `en16931-cii2ubl` | `en16931-purifier` | `en16931-ubl2cii` |
|------|-------------------|--------------------|-------------------|
| Edition enum 2017/2026 | `EEN16931Edition` | `EEN16931Version` | — |
| CII + UBL namespaces / QNames | in `EEN16931Edition` | `CEN16931Syntax` | — |
| Syntax × version matrix | implicit in class names | `EEN16931SyntaxKind`, `EEN16931DocumentType` | — |
| BT-24 navigation | `EEN16931Edition`, both converters | `EN16931CIIRules2017` | both converters |
| `ifNotNull`, `ifNotEmpty` | `AbstractCIIToUBLConverterBase` | — | `AbstractToCIID16BConverter` |
| `isOriginatorDocumentReferenceTypeCode` | same | — | same (verbatim) |
| `isValidDocumentReferenceTypeCode` | same | — | same (verbatim) |
| BT-8 UNTDID 2005 ↔ 2475 | `mapDueDateTypeCode` (`5→3`) | — | `mapDueDateTypeCodeToCII` (`3→5`) |
| BT-3 code list | `AbstractCIIToUBLConverterBase` | — | will need it |

The BT-8 halves are currently held together only by a comment in `AbstractToCIID16BConverter`:

```java
// See cii2ubl AbstractCIIToUBLConverter.mapDueDateTypeCode for the forward mapping.
```

That class no longer exists — cii2ubl 4.0.0 renamed it. Exactly the rot this repo prevents.

### 2.2 Source file paths

```
en16931-cii2ubl/en16931-cii2ubl/src/main/java/com/helger/en16931/cii2ubl/
    EEN16931Edition.java                  edition enum, BT-24 detection, CII namespaces
    AbstractCIIToUBLConverterBase.java    BT-3 sets, mapDueDateTypeCode, isPaymentMeansCode*,
                                          is*DocumentReferenceTypeCode, ifNotNull/ifNotEmpty
en16931-purifier/en16931-purifier/src/main/java/com/helger/en16931/purifier/
    EEN16931Version.java                  merge with EEN16931Edition
    CEN16931Syntax.java                   QNAME_UBL_INVOICE / _CREDIT_NOTE / _CII
    EEN16931SyntaxKind.java               move as is
    EEN16931DocumentType.java             SPLIT - see 4.1
en16931-ubl2cii/en16931-ubl2cii/src/main/java/com/helger/en16931/ubl2cii/
    AbstractToCIID16BConverter.java       mapDueDateTypeCodeToCII + the four duplicated helpers
```

## 3. Action items

- [x] **B1 — Skeleton.** `pom.xml` on `com.helger:parent-pom`, groupId `com.helger`, artifactId
      `en16931-basics`, package `com.helger.en16931.basics`, Java 17, version `1.0.0-SNAPSHOT`.
      Dependencies: `ph-commons` and `ph-xml` only. **No ph-cii, no ph-ubl** — that is what keeps
      this artefact model-agnostic and cheap to depend on.

- [x] **B2 — `EEN16931Edition`.** Merge cii2ubl's `EEN16931Edition` with purifier's
      `EEN16931Version`. Keep from each: `getID()` ("2017"/"2026"), `getDisplayName()`,
      `getSpecificationIdentifier()` (`urn:cen.eu:en16931:2017` / `:2026`),
      `getFromIDOrNull`, `getFromSpecificationIdentifierOrNull` (**prefix** match — XRechnung
      appends `#compliant#…`). Drop purifier's `isSupported()`; that is a purifier concern.

- [x] **B3 — `CEN16931Syntax`.** Namespace URIs and root QNames for UBL 2.1/2.5 Invoice and Credit
      Note and for CII. **Record explicitly that CII D16B, D22B and D25A use identical namespace
      URIs** — that is the non-obvious fact that makes namespace-based detection impossible.

- [x] **B4 — `EEN16931SyntaxKind`.** Move from purifier unchanged.

- [x] **B5 — BT-24 detection.** `getSpecificationIdentifier(Node)` / `(File)` and
      `detect(Node)` / `(File)`, lifted from cii2ubl's `EEN16931Edition`. Never JAXB — the right
      model is exactly what is not yet known. Guard `File.isFile()`; the readers throw or log on a
      missing file. See B10 for where the reading ended up.

- [x] **B6 — Code lists (`com.helger.en16931.basics.codelist`).** The valuable part.
      - `EN16931CodeLists.INVOICE_TYPE_CODES` / `CREDIT_NOTE_TYPE_CODES` (UNTDID 1001, BT-3)
      - `mapDueDateTypeCodeCIIToUBL` (2475 → 2005) and `mapDueDateTypeCodeUBLToCII` (2005 → 2475)
        as one **inverse pair in one file**, so they cannot drift
      - `isPaymentMeansCodeCreditTransfer` / `…PaymentCard` / `…DirectDebit` (UNTDID 4461)
      - `isOriginatorDocumentReferenceTypeCode` (`50`), `isValidDocumentReferenceTypeCode`
        (`50`, `130`), and the BG-24 supporting document code (`916`, list `1001`)
      - `CODE_LIST_VERSION = "v17b"` plus its effective date, so consumers can report what they
        implement

      Source of truth to cite in the Javadoc:
      <https://ec.europa.eu/digital-building-blocks/sites/spaces/DIGITAL/pages/467108974/Registry+of+supporting+artefacts+to+implement+EN16931#RegistryofsupportingartefactstoimplementEN16931-CEN/TC434EN16931>

      Current values from `EN16931 code lists values v17b - used from 2026-05-15.xlsx`, sheet
      `1001`: 62 codes, 49 Invoice + 13 Credit Note, **none in both roles**.
      The list is versioned **by date, not by edition** — both editions share it.

- [x] **B7 — Tiny helpers.** `ifNotNull`, `ifNotEmpty`. Low value on their own, but they are
      genuinely duplicated and have to live somewhere once the rest moves.

- [x] **B8 — Tests.** Per code list, assert the count and spot-check the classification
      (`380`→Invoice, `381`/`81`/`502`/`503`→Credit Note, `471`→Invoice). Assert the BT-8 pair is a
      true inverse for all three mappings. Assert BT-24 prefix matching including the XRechnung
      `#compliant#` form and the undeterminable cases.

- [x] **B10 — `SpecificationIdentifierReader`.** Move the BT-24 extraction out of the enum into
      its own class and read via **SAX** instead of building a DOM tree: BT-24 sits close to the
      start of the document in both syntaxes, so the content handler stops the parser as soon as
      the value is known and the rest of the file is never read. The DOM variant stays for callers
      that hold the document in memory anyway; `EEN16931Edition` only delegates.
      `SpecificationIdentifierReaderTest` asserts that both paths agree on every test document.

- [x] **B11 — One enum per code list.** Every sheet of the workbook
      `EN16931 code lists values v17b - used from 2026-05-15.xlsx` became an enum in the
      `codelist` package — `EEN16931CountryCode`, `EEN16931CurrencyCode`,
      `EEN16931InvoiceTypeCode` and 13 more, plus `EEN16931InvoiceTypeCodeRole`.
      `EN16931CodeLists` now **derives** its BT-3 sets and its BT-8 mappings from them, so no value
      is written down twice. Counts are asserted per sheet in `EN16931CodeListEnumsTest`.
      **The `Unit` sheet is the exception and stays out**: 2162 constants exceed the 65535 byte
      limit for a class initializer, so the enum does not compile. Do not re-add it.

- [ ] **B9 — Release 1.0.0**, then migrate the consumers.

## 4. Consumer migration

- [ ] **C1 — `en16931-cii2ubl`.** Delete `EEN16931Edition`; delete the BT-3 sets, the code
      predicates and `mapDueDateTypeCode` from `AbstractCIIToUBLConverterBase`; re-point
      `CIIToUBLDispatcher` and both edition base classes. `isInvoiceType` stays in cii2ubl — it
      navigates the CII model — but takes its code sets from `en16931-basics`.
      **Verification: `generated/toubl21/` and `generated/toubl25/` must stay byte-identical.**
      That is the whole regression suite for this migration.

- [ ] **C2 — `en16931-purifier`.** Delete `EEN16931Version`, `CEN16931Syntax`,
      `EEN16931SyntaxKind`. See 4.1 for `EEN16931DocumentType`.

- [ ] **C3 — `en16931-ubl2cii`.** Delete the four duplicated helpers and
      `mapDueDateTypeCodeToCII`; use the shared inverse pair. **Also fix the stale comment** naming
      `AbstractCIIToUBLConverter.mapDueDateTypeCode`.

- [ ] **C4 — unrelated but pending:** `en16931-ubl2cii`'s `CIIRoundTripTest` imports
      `com.helger.en16931.cii2ubl.CIIToUBL21Converter`, which cii2ubl 4.0.0 renamed to
      `com.helger.en16931.cii2ubl.en2017.CIID16BToUBL21Converter`. Test scope only, one line, but
      it breaks the moment the dependency is bumped.

### 4.1 `EEN16931DocumentType` cannot move as it is

Its constants carry purifier factories:

```java
UBL21_INVOICE ("ubl21-invoice", "UBL 2.1 Invoice", EEN16931SyntaxKind.UBL_INVOICE, "2.1",
               UBL21InvoicePurifier::new)
```

Split it: the data part (id, display name, syntax kind, syntax version) moves here; the purifier
keeps a lookup from that enum to its factory. Same pattern would then let cii2ubl map an edition to
its converter.

## 5. Decisions still open

1. **Hand-maintained or generated code lists?** Generating from the xlsx removes transcription risk
   but adds a build step and means checking the workbook in. Hand-maintained plus the tests in B8 is
   probably enough for lists this small — but the generated route is worth considering for
   EAS (113 codes) and VATEX (59) if they are ever enumerated here.
2. **Do the 2017 and 2026 editions ever need different code lists?** Today no — the list is
   versioned by date. Keep the API a plain constant until a real divergence appears; do not
   pre-emptively parameterise by edition.
3. **Timing.** Do this *after* cii2ubl 4.0.0 ships. That branch is feature complete and this would
   widen it considerably.

## 6. Background worth knowing before touching the code lists

Five rounds were spent getting the BT-3 list right in cii2ubl. The traps:

- an extract that looked current was a **2024 snapshot** (55 codes) — the workbook added
  `471 472 473 500 501` (Invoice) and `502 503` (Credit Note) in **v15, used from 2025-05-15**
- the **EN 16931 validation artefacts disagree with the code list** on `81`: BR-CL-01 accepts it on
  an Invoice, every version of the list has it as a Credit Note only. The code list wins
- the mapping document's own "new in 2026" table is **not** a complete diff — `BT-122-1` is new but
  absent from it
- **there is no 2017 → 2026 delta in this list at all.** Do not reintroduce one

See `en16931-cii2ubl/docs/plan-4.0.0.md` §4.4i for the full write-up.
