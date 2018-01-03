/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time.test

import java.time.*
import kotlin.test.*
import kotlin.time.*

class LocalTimeTest {
    @Test fun destructuring() {
        val (hour, minute, second, nanos) = LocalTime.of(5, 12, 42, 55678)
        assertEquals(5, hour)
        assertEquals(12, minute)
        assertEquals(42, second)
        assertEquals(55678, nanos)
    }
}
