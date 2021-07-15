package dataStructures.stacksAndQueues.stacks

import dataStructures.stacksAndQueues.Node

class StacksUsingArrays {
    private val stackArray: ArrayList<Int> = ArrayList()

    fun peek(): Int? {
        return if (stackArray.size > 0) {
            stackArray[stackArray.size - 1]
        } else {
            null
        }
    }

    fun push(value: Int) {
        stackArray.add(value)
    }

    fun pop() {
        stackArray.removeAt(stackArray.size - 1)
    }

    fun isEmpty(): Boolean {
        return stackArray.size == 0
    }
}