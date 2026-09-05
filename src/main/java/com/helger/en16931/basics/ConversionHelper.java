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

import java.util.function.Consumer;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import com.helger.annotation.concurrent.Immutable;
import com.helger.base.string.StringHelper;

/**
 * Small helpers that keep the mapping code of a syntax converter terse. They only exist because
 * every conversion consists of hundreds of "copy this value, unless it is absent" steps.
 *
 * @author Philip Helger
 */
@Immutable
public final class ConversionHelper
{
  private ConversionHelper ()
  {}

  /**
   * Pass the provided value to the provided consumer, but only if it is not <code>null</code>.
   *
   * @param <T>
   *        The value type
   * @param aObj
   *        The value to be passed on. May be <code>null</code>.
   * @param aConsumer
   *        The consumer to be invoked. May not be <code>null</code>.
   * @return <code>true</code> if the consumer was invoked, <code>false</code> if not.
   */
  public static <T> boolean ifNotNull (@Nullable final T aObj, @NonNull final Consumer <? super T> aConsumer)
  {
    if (aObj == null)
      return false;
    aConsumer.accept (aObj);
    return true;
  }

  /**
   * Pass the provided String to the provided consumer, but only if it is neither <code>null</code>
   * nor empty.
   *
   * @param s
   *        The value to be passed on. May be <code>null</code>.
   * @param aConsumer
   *        The consumer to be invoked. May not be <code>null</code>.
   * @return <code>true</code> if the consumer was invoked, <code>false</code> if not.
   */
  public static boolean ifNotEmpty (@Nullable final String s, @NonNull final Consumer <? super String> aConsumer)
  {
    if (StringHelper.isEmpty (s))
      return false;
    aConsumer.accept (s);
    return true;
  }
}
