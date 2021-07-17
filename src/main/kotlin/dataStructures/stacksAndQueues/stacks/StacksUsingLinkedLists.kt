package dataStructures.stacksAndQueues.stacks

class StacksUsingLinkedLists {
    private var top: Node? = null
    private var bottom: Node? = null
    private var length = 0

    fun peek(): Int? {
        return if (length > 0) {
            top!!.value
        } else {
            null
        }
    }

    fun push(value: Int) {
        val newNode = Node(value)
        if (length == 0) {
            top = newNode
            bottom = newNode
        } else {
            newNode.next = top
            top = newNode
        }
        length++

    }

    fun pop() {
        if (length <= 0) {
            println("Stack is empty")
        } else {
            top = top?.next
            length--
        }
    }

    fun isEmpty(): Boolean {
        return length == 0
    }

    fun printList(): IntArray {
        val myList = IntArray(length)
        var current: Node? = top
        var i = 0
        while (current != null) {
            myList[i] = current.value
            current = current.next
            i++
        }
        return myList
    }
}