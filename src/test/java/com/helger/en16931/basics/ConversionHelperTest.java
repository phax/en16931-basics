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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.helger.base.wrapper.Wrapper;

/**
 * Test class for class {@link ConversionHelper}.
 *
 * @author Philip Helger
 */
public final class ConversionHelperTest
{
  @Test
  public void testIfNotNull ()
  {
    final Wrapper <String> aTarget = Wrapper.empty ();
    assertTrue (ConversionHelper.ifNotNull ("value", aTarget::set));
    assertEquals ("value", aTarget.get ());

    // An empty String is not null
    assertTrue (ConversionHelper.ifNotNull ("", aTarget::set));
    assertEquals ("", aTarget.get ());

    aTarget.set ("untouched");
    assertFalse (ConversionHelper.ifNotNull (null, aTarget::set));
    assertEquals ("untouched", aTarget.get ());
  }

  @Test
  public void testIfNotEmpty ()
  {
    final Wrapper <String> aTarget = Wrapper.empty ();
    assertTrue (ConversionHelper.ifNotEmpty ("value", aTarget::set));
    assertEquals ("value", aTarget.get ());

    // Unlike ifNotNull, an empty String is skipped
    assertFalse (ConversionHelper.ifNotEmpty ("", aTarget::set));
    assertEquals ("value", aTarget.get ());

    assertFalse (ConversionHelper.ifNotEmpty (null, aTarget::set));
    assertEquals ("value", aTarget.get ());

    // Whitespace only is not empty
    assertTrue (ConversionHelper.ifNotEmpty (" ", aTarget::set));
    assertEquals (" ", aTarget.get ());

    final Wrapper <String> aNeverSet = Wrapper.empty ();
    assertFalse (ConversionHelper.ifNotEmpty (null, aNeverSet::set));
    assertNull (aNeverSet.get ());
  }
}
