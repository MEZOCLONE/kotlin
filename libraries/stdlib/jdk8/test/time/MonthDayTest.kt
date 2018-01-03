/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time.test

import java.time.*
import kotlin.test.*
import kotlin.time.*

class MonthDayTest {
    @Test fun destructuring() {
        val (month, day) = MonthDay.of(Month.DECEMBER, 20)
        assertEquals(Month.DECEMBER, month)
        assertEquals(20, day)
    }
}
