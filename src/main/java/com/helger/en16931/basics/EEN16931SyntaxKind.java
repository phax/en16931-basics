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

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.helger.annotation.Nonempty;
import com.helger.base.id.IHasID;
import com.helger.base.lang.EnumHelper;
import com.helger.base.name.IHasDisplayName;
import com.helger.xml.XMLHelper;

/**
 * The kind of document syntax an EN 16931 core message may use. It is independent of the concrete
 * syntax version, because all UBL 2.x versions use the same XML namespace URIs and element names,
 * and so do all CII versions.
 *
 * @author Philip Helger
 */
public enum EEN16931SyntaxKind implements IHasID <String>, IHasDisplayName
{
  /** UBL Invoice */
  UBL_INVOICE ("ubl-invoice", "UBL Invoice", CEN16931Syntax.QNAME_UBL_INVOICE),
  /** UBL Credit Note */
  UBL_CREDIT_NOTE ("ubl-creditnote", "UBL Credit Note", CEN16931Syntax.QNAME_UBL_CREDIT_NOTE),
  /** CII Cross Industry Invoice */
  CII ("cii", "CII Cross Industry Invoice", CEN16931Syntax.QNAME_CII);

  private final String m_sID;
  private final String m_sDisplayName;
  private final QName m_aRootElementName;

  EEN16931SyntaxKind (@NonNull @Nonempty final String sID,
                      @NonNull @Nonempty final String sDisplayName,
                      @NonNull final QName aRootElementName)
  {
    m_sID = sID;
    m_sDisplayName = sDisplayName;
    m_aRootElementName = aRootElementName;
  }

  @NonNull
  @Nonempty
  public String getID ()
  {
    return m_sID;
  }

  @NonNull
  @Nonempty
  public String getDisplayName ()
  {
    return m_sDisplayName;
  }

  /**
   * @return The name of the document element of this syntax kind. Never <code>null</code>.
   */
  @NonNull
  public QName getRootElementName ()
  {
    return m_aRootElementName;
  }

  @Nullable
  public static EEN16931SyntaxKind getFromIDOrNull (@Nullable final String sID)
  {
    return EnumHelper.getFromIDOrNull (EEN16931SyntaxKind.class, sID);
  }

  /**
   * Determine the syntax kind from the name of the document element.
   *
   * @param aRootElementName
   *        The document element name to search. May be <code>null</code>.
   * @return <code>null</code> if no syntax kind uses that document element.
   */
  @Nullable
  public static EEN16931SyntaxKind getFromRootElementNameOrNull (@Nullable final QName aRootElementName)
  {
    if (aRootElementName != null)
      for (final EEN16931SyntaxKind e : values ())
        if (e.m_aRootElementName.equals (aRootElementName))
          return e;
    return null;
  }

  /**
   * Get the document element of the provided node. Note that
   * <code>XMLHelper.getDocumentElement</code> cannot be used, because it resolves via the owner
   * document and would therefore ignore a detached element.
   *
   * @param aNode
   *        The document or its document element. May be <code>null</code>.
   * @return <code>null</code> if the node is neither a {@link Document} nor an {@link Element}.
   */
  @Nullable
  static Element getRootElementOrNull (@Nullable final Node aNode)
  {
    if (aNode instanceof final Document aDoc)
      return aDoc.getDocumentElement ();
    if (aNode instanceof final Element aElement)
      return aElement;
    return null;
  }

  /**
   * Determine the syntax kind of an existing DOM tree from the name of its document element. This
   * does not tell the syntax version - all UBL 2.x versions share the same document element and so
   * do all CII versions.
   *
   * @param aNode
   *        The document or its document element. May be <code>null</code>.
   * @return <code>null</code> if the node has no document element, or if that element belongs to no
   *         known syntax kind.
   */
  @Nullable
  public static EEN16931SyntaxKind getFromNodeOrNull (@Nullable final Node aNode)
  {
    final Element aRoot = getRootElementOrNull (aNode);
    return aRoot == null ? null : getFromRootElementNameOrNull (XMLHelper.getQName (aRoot));
  }
}
