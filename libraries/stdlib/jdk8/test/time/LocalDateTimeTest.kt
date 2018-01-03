/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time.test

import java.time.*
import kotlin.test.*
import kotlin.time.*

class LocalDateTimeTest {
    @Test fun destructuring() {
        val (date, time) = LocalDateTime.of(2017, 12, 20, 4, 38)
        assertEquals(LocalDate.of(2017, 12, 20), date)
        assertEquals(LocalTime.of(4, 38), time)
    }
}
