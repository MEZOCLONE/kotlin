/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time.test

import java.time.*
import kotlin.test.*
import kotlin.time.*

class ZonedDateTimeTest {
    @Test fun destructuring() {
        val paris = ZoneId.of("Europe/Paris")
        val (dateTime, offset) = ZonedDateTime.of(2017, 12, 20, 5, 16, 42, 0, paris)
        assertEquals(LocalDateTime.of(2017, 12, 20, 5, 16, 42), dateTime)
        assertEquals(paris, offset)
    }
}
