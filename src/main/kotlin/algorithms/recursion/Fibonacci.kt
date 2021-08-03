package algorithms.recursion

class Fibonacci {
    fun fibonacciIterative(index: Int): Int {
        return if (index == 0) {
            0
        } else if (index == 1 || index == 2){
            1
        } else {
            val array = intArrayOf(1, 1)
            for (i in 3..index) {
                val temp = array[1]
                array[1] = array[0] + array[1]
                array[0] = temp
            }
            array[1]
        }
    }

    fun fibonacciRecursive(index: Int): Int {
        if (index == 0) {
            return 0
        } else if (index == 1 || index == 2){
            return 1
        }
        return fibonacciRecursive(index - 1) + fibonacciRecursive(index - 2)
    }
}