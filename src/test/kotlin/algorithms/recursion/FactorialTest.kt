package algorithms.recursion

import algorithms.recursion.Factorial
import org.junit.Test
import kotlin.test.assertEquals

class FactorialTest {
    private val factorial = Factorial()

    @Test
    fun factorialTest() {
        var result = factorial.findFactorialRecursive(4)
        assertEquals(24, result)
        result = factorial.findFactorialRecursive(5)
        assertEquals(120, result)
        result = factorial.findFactorialIterative(6)
        assertEquals(720, result)
        result = factorial.findFactorialIterative(0)
        assertEquals(1, result)
    }
}