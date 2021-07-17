package dataStructures.stacksAndQueues.queues

import dataStructures.stacksAndQueues.queues.Node

class Queues {
    private var first: Node? = null
    private var last: Node? = null
    private var length: Int = 0

    fun peek(): String? {
        return if (length > 0) {
            first?.value
        } else {
            null
        }
    }

    fun enqueue(value: String) {
        val newNode = Node(value)
        if (length == 0) {
            first = newNode
        } else {
            last?.next = newNode
        }
        last = newNode
        length++
    }

    fun dequeue() {
        if (length > 0) {
            if (length == 1) {
                last = null
            } else {
                first = first?.next
            }
            length--
        }
    }

    fun isEmpty(): Boolean {
        return length == 0
    }

//    fun printList(): Array<String> {
//        val myList: Array<String> = Array()
//        var current: Node? = first
//        var i = 0
//        while (i < length - 1) {
//            myList[i] = current!!.value
//            current = current.next
//            i++
//        }
//        return myList
//    }
}