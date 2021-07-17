package dataStructures.stacksAndQueues.queues

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class QueuesTest {
    var que = Queues()

    @Test
    fun queueMethodTests() {
        que.enqueue("New Westminster")
        que.enqueue("Mount Vernon")
        assertEquals(que.peek(), "New Westminster")
        que.dequeue()
        assertEquals(que.peek(), "Mount Vernon")
        assertFalse(que.isEmpty(), "false")
        que.dequeue()
        assertTrue(que.isEmpty(), "true")
    }
}