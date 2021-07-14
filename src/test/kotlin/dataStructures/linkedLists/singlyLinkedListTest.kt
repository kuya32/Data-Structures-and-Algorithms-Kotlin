package dataStructures.linkedLists

import org.junit.Test
import kotlin.test.assertEquals

class singlyLinkedListTest {
    var singly = singlyLinkedList(10)

    @Test
    fun singlyAppendTest() {
        singly.append(15)
        singly.append(20)
        val result = singly.printList().contentToString()
        assertEquals(intArrayOf(10, 15, 20).contentToString(), result)
    }

    @Test
    fun singlyPrependTest() {
        singly.prepend(15)
        singly.prepend(20)
        val result = singly.printList().contentToString()
        assertEquals(intArrayOf(20, 15, 10).contentToString(), result)
    }
}