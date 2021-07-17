package dataStructures.stacksAndQueues.stacks

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StacksUsingArraysTest {
    private val stacks = StacksUsingArrays()

    @Test
    fun stackArrayMethodsTest() {
        stacks.push(5)
        stacks.push(10)
        assertEquals(stacks.peek(), 10)
        stacks.push(20)
        stacks.push(25)
        stacks.pop()
        assertEquals(stacks.peek(), 20)
        stacks.pop()
        stacks.pop()
        assertFalse(stacks.isEmpty(), "false")
        stacks.pop()
        assertTrue(stacks.isEmpty(), "true")
    }
}