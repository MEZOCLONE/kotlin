/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time

import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZoneOffset

/**
 * Return the [LocalDateTime] of this [OffsetDateTime].
 *
 * @see OffsetDateTime.toLocalDateTime
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun OffsetDateTime.component1(): LocalDateTime = toLocalDateTime()

/**
 * Return the [ZoneOffset] of this [OffsetDateTime].
 *
 * @see OffsetDateTime.getOffset
 */
@SinceKotlin("1.2")
@kotlin.internal.InlineOnly
inline operator fun OffsetDateTime.component2(): ZoneOffset = offset
