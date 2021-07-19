package dataStructures.trees.binarySearchTree

class BinarySearchTree {
    var root: Node? = null

    fun insert(value: Int) {
        val newNode = Node(value)
        if (root == null) {
            root = newNode
        } else {
            var current = root
            while (true) {
                if (value < current!!.value) {
                    if (current.left != null) {
                        current = current.left
                    } else {
                        current.left = newNode
                        break
                    }
                } else {
                    if (current.right != null) {
                        current = current.right
                    } else {
                        current.right = newNode
                        break
                    }
                }
            }
        }
    }

    fun lookup(value: Int): Boolean {
        var current = root
        while (current != null) {
            current = when {
                value < current.value -> {
                    current.left
                }
                value > current.value -> {
                    current.right
                }
                else -> {
                    return true
                }
            }
        }
        return false
    }

//    fun remove(value: Int) {
//
//    }
}