/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time

import java.time.Month
import java.time.MonthDay

/**
 * Return the [Month] component of this [MonthDay].
 *
 * @see MonthDay.getMonth
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun MonthDay.component1(): Month = month

/**
 * Return the day component of this [MonthDay].
 *
 * @see MonthDay.getDayOfMonth
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun MonthDay.component2(): Int = dayOfMonth
