/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time

import java.time.Duration

/**
 * Return the seconds component of this [Duration].
 *
 * @see Duration.getSeconds
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun Duration.component1(): Long = seconds

/**
 * Returns the nanosecond offset of this [Duration].
 *
 * @see Duration.getNano
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun Duration.component2(): Int = nano
