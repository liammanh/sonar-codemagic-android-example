package com.gogox.sonar_codemagic_example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
      val value =  SecondFragment().plus(2, 3)
        assertEquals(5, value)
    }
}