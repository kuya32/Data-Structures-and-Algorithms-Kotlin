package dataStructures.trees.binarySearrchTree

import dataStructures.trees.binarySearchTree.BinarySearchTree
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BinarySearchTreeTest {
    var binary = BinarySearchTree()

    @Test
    fun insertTest() {
        binary.insert(32)
        binary.insert(45)
        binary.insert(23)
        assertTrue(binary.lookup(32), "true")
        assertFalse(binary.lookup(52), "false")
    }
}