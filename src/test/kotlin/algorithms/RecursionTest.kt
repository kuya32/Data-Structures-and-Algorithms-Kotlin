package algorithms

import org.junit.Test
import kotlin.test.assertEquals

class RecursionTest {
    private val recursion = Recursion()

    @Test
    fun factorialTest() {
        var result = recursion.findFactorialRecursive(4)
        assertEquals(24, result)
        result = recursion.findFactorialRecursive(5)
        assertEquals(120, result)
        result = recursion.findFactorialIterative(6)
        assertEquals(720, result)
        result = recursion.findFactorialIterative(0)
        assertEquals(1, result)
    }
}