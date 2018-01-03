/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

/**
 * Return the [LocalDate] of this [LocalDateTime].
 *
 * @see LocalDateTime.toLocalDate
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun LocalDateTime.component1(): LocalDate = toLocalDate()

/**
 * Return the [LocalTime] of this [LocalDateTime].
 *
 * @see LocalDateTime.toLocalTime
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun LocalDateTime.component2(): LocalTime = toLocalTime()
