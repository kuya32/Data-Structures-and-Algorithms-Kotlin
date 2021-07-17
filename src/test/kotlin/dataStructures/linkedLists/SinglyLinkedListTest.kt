package dataStructures.linkedLists

import org.junit.Test
import kotlin.test.assertEquals

class SinglyLinkedListTest {
    var singly = SinglyLinkedList(10)

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

    @Test
    fun singlyInsertTest() {
        singly.prepend(15)
        singly.prepend(20)
        singly.insert(0, 25)
        var result = singly.printList().contentToString()
        assertEquals(intArrayOf(25, 20, 15, 10).contentToString(), result)
        singly.insert(3, 5)
        result = singly.printList().contentToString()
        assertEquals(intArrayOf(25, 20, 15, 10, 5).contentToString(), result)
        singly.insert(1, 23)
        result = singly.printList().contentToString()
        assertEquals(intArrayOf(25, 23, 20, 15, 10, 5).contentToString(), result)
    }

    @Test
    fun singlyRemoveTest() {
        singly.prepend(15)
        singly.prepend(20)
        singly.insert(0, 25)
        singly.remove(0)
        var result = singly.printList().contentToString()
        assertEquals(intArrayOf(20, 15, 10).contentToString(), result)
        singly.remove(2)
        result = singly.printList().contentToString()
        assertEquals(intArrayOf(20, 15).contentToString(), result)
    }

    @Test
    fun reverseSinglyTest() {
        singly.prepend(15)
        singly.prepend(20)
        singly.insert(0, 25)
        var result = singly.reverse(singly).printList().contentToString()
        assertEquals(intArrayOf(10, 15, 20, 25).contentToString(), result)
    }
}