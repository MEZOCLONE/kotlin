/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time

import java.time.LocalTime
import java.time.OffsetTime
import java.time.ZoneOffset

/**
 * Return the [LocalTime] of this [OffsetTime].
 *
 * @see OffsetTime.toLocalTime
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun OffsetTime.component1(): LocalTime = toLocalTime()

/**
 * Return the [ZoneOffset] of this [OffsetTime].
 *
 * @see OffsetTime.getOffset
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun OffsetTime.component2(): ZoneOffset = offset
