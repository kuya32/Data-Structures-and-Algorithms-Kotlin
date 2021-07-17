package dataStructures.linkedLists

class SinglyLinkedList(value: Int) {
    private var head: Node? = Node(value)
    private var tail: Node? = head
    var length: Int = 1

    fun append(value: Int) {
        val newNode = Node(value)
        tail?.next = newNode
        tail = newNode
        length++
    }

    fun prepend(value: Int) {
        val newNode = Node(value)
        newNode.next = head
        head = newNode
        length++
    }

    fun printList(): IntArray {
        val myList = IntArray(length)
        var current: Node? = head
        var i = 0
        while (current != null) {
            myList[i] = current.value
            current = current.next
            i++
        }
        return myList
    }

    fun insert(index: Int, value: Int) {
        if (index < 0 || index > (length - 1)) {
            println("Index is out of bounds for length $length")
        } else if (index == 0) {
            prepend(value)
        } else if (index == (length - 1)) {
            append(value)
        } else {
            var current: Node? = head
            for (i in 0 until index - 1) {
                current = current?.next
            }
            val newNode = Node(value)
            newNode.next = current?.next
            current?.next = newNode
            length++
        }
    }

    fun remove(index: Int) {
        if (index < 0 || index > (length - 1)) {
            println("Index is out of bounds for length $length")
        } else if (index == 0) {
            head = head?.next
            length--
        } else {
            var current: Node? = head
            var i = 0
            while (i < index - 1) {
                current = current?.next
                i++
            }
            current?.next = current?.next?.next
            length--
        }
    }

    fun reverse(linkedList: SinglyLinkedList): SinglyLinkedList {
        val newLink = SinglyLinkedList(linkedList.head!!.value)
        var current: Node? = linkedList.head
        while (current?.next != null) {
            current = current.next
            val newNode = Node(current!!.value)
            newNode.next = newLink.head
            newLink.head = newNode
            newLink.length++
        }
        return newLink
    }
}