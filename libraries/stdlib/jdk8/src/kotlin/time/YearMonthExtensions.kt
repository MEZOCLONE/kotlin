/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time

import java.time.Month
import java.time.YearMonth

/**
 * Return the year component of this [YearMonth].
 *
 * @see YearMonth.getYear
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun YearMonth.component1(): Int = year

/**
 * Return the [Month] component of this [YearMonth].
 *
 * @see YearMonth.getMonth
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun YearMonth.component2(): Month = month
