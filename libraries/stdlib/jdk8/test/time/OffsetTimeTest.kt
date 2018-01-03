/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time.test

import java.time.*
import kotlin.test.*
import kotlin.time.*

class OffsetTimeTest {
    @Test fun destructuring() {
        val (time, offset) = OffsetTime.of(5, 16, 42, 0, ZoneOffset.UTC)
        assertEquals(LocalTime.of(5, 16, 42), time)
        assertEquals(ZoneOffset.UTC, offset)
    }
}
