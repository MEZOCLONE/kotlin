/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time

import java.time.Period

/**
 * Return the years component of this [Period].
 *
 * @see Period.getYears
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun Period.component1(): Int = years

/**
 * Return the months component of this [Period].
 *
 * @see Period.getMonths
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun Period.component2(): Int = months

/**
 * Return the days component of this [Period].
 *
 * @see Period.getDays
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun Period.component3(): Int = days
