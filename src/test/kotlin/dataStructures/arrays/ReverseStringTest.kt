package dataStructures.arrays

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class ReverseStringTest {
    private val reverseString = ReverseString()

    @Test
    fun reverseStringTest() {
        val result = reverseString.reverse("Hello")
        assertEquals("olleH", result)
    }

    @Test
    fun reverseString2Test() {
        val result = reverseString.reverse2("World")
        assertEquals("dlroW", result)
    }

    @Test
    fun reverseEmptyString() {
        val result = reverseString.reverse("")
        assertEquals("", result)
    }

    @Test
    fun reverseNullString() {
        val result = reverseString.reverse(null)
        assertNull(null, result)
    }
}