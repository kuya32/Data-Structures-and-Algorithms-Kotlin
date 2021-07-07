package dataStructures.arrays

import org.junit.Test
import kotlin.test.assertEquals

class ReverseStringTest {
    @Test
    fun reverseStringTest() {
        val reverseString = ReverseString()
        val result = reverseString.reverse("Hello")
        assertEquals("olleH", result)
    }

    @Test
    fun reverseString2Test() {
        val reverseString = ReverseString()
        val result = reverseString.reverse2("World")
        assertEquals("dlroW", result)
    }
}