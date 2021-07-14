package dataStructures.linkedLists

class singlyLinkedList(value: Int) {
    private var head: Node? = Node(value)
    private var tail: Node? = head
    var length: Int = 1

    fun append(value: Int) {
        var newNode = Node(value)
        tail?.next = newNode
        tail = newNode
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
}