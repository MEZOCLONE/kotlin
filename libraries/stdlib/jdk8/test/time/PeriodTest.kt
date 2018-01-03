/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time.test

import java.time.*
import kotlin.test.*
import kotlin.time.*

class PeriodTest {
    @Test fun destructuring() {
        val (years, months, days) = Period.of(10, 3, 22)
        assertEquals(10, years)
        assertEquals(3, months)
        assertEquals(22, days)
    }
}
