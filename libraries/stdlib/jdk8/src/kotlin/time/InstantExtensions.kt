/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time

import java.time.Instant

/**
 * Return the seconds of this [Instant].
 *
 * @see Instant.getEpochSecond
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun Instant.component1(): Long = epochSecond

/**
 * Return the nanosecond offset of this [Instant].
 *
 * @see Instant.getNano
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun Instant.component2(): Int = nano
