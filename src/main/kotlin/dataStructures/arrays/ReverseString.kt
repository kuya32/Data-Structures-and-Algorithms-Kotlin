package dataStructures.arrays

class ReverseString {
    fun reverse(string: String): String {
        var result = ""
        for (i in string.length - 1 downTo 0) {
            result +=string[i]
        }
        return result
    }

    fun reverse2(string: String): String {
        return string.reversed()
    }
}