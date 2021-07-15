package dataStructures.stacksAndQueues.stacks

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StacksUsingLinkedListTest {
    private val stacks = StacksUsingLinkedLists()

    @Test
    fun stackLinkedListsMethodTests() {
        stacks.push(10)
        stacks.push(15)
        stacks.push(20)
        var result = stacks.printList().contentToString()
        assertEquals(intArrayOf(20, 15, 10).contentToString(), result)
        stacks.pop()
        stacks.pop()
        result = stacks.printList().contentToString()
        assertEquals(intArrayOf(10).contentToString(), result)
        stacks.push(50)
        assertEquals(stacks.peek(), 50)
        assertFalse(stacks.isEmpty(), "false")
        stacks.pop()
        stacks.pop()
        assertTrue(stacks.isEmpty(), "true")
    }
}