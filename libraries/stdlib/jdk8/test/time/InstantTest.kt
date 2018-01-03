/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time.test

import java.time.*
import kotlin.test.*
import kotlin.time.*

class InstantTest {
    @Test fun destructuring() {
        val (seconds, nanos) = Instant.ofEpochSecond(12, 3456789)
        assertEquals(12L, seconds)
        assertEquals(3456789, nanos)
    }
}
