package algorithms

class Recursion {

    fun findFactorialRecursive(number: Int): Int {
        return if (number < 2) {
            1
        } else {
            return number * findFactorialRecursive(number - 1)
        }

    }

    fun findFactorialIterative(number: Int): Int {
        return if (number < 2) {
            1
        } else {
            var result = 1
            for (i in 2..number) {
                result *= i
            }
            result
        }
    }
}