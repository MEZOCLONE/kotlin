/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time

import java.time.LocalDate
import java.time.Month

/**
 * Return the year of this [LocalDate].
 *
 * @see LocalDate.getYear
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun LocalDate.component1(): Int = year

/**
 * Return the [Month] of this [LocalDate].
 *
 * @see LocalDate.getMonth
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun LocalDate.component2(): Month = month

/**
 * Return the day (of the month) of this [LocalDate].
 *
 * @see LocalDate.getDayOfMonth
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun LocalDate.component3(): Int = dayOfMonth
