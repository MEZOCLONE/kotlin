/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time

import java.time.LocalTime

/**
 * Return the hour of this [LocalTime].
 *
 * @see LocalTime.getHour
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun LocalTime.component1(): Int = hour

/**
 * Return the minute of this [LocalTime].
 *
 * @see LocalTime.getMinute
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun LocalTime.component2(): Int = minute

/**
 * Return the second of this [LocalTime].
 *
 * @see LocalTime.getSecond
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun LocalTime.component3(): Int = second

/**
 * Return the nanosecond offset of this [LocalTime].
 *
 * @see LocalTime.getNano
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun LocalTime.component4(): Int = nano
