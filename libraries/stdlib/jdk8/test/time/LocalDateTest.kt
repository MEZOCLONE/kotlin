/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time.test

import java.time.*
import kotlin.test.*
import kotlin.time.*

class LocalDateTest {
    @Test fun destructuring() {
        val (year, month, day) = LocalDate.of(2017, 12, 20)
        assertEquals(2017, year)
        assertEquals(Month.DECEMBER, month)
        assertEquals(20, day)
    }
}
