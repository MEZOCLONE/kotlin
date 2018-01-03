/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time

import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime

/**
 * Return the [LocalDateTime] for this [ZonedDateTime].
 *
 * @see ZonedDateTime.toLocalDateTime
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun ZonedDateTime.component1(): LocalDateTime = toLocalDateTime()

/**
 * Return the [ZoneId] for this [ZonedDateTime].
 *
 * @see ZonedDateTime.getZone
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun ZonedDateTime.component2(): ZoneId = zone
