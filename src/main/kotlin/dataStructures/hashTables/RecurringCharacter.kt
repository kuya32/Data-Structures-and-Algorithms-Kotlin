package dataStructures.hashTables

class RecurringCharacter {
    fun firstRecurringCharacter(array: IntArray): Int? {
        val hashSet = HashSet<Int>()
        for (i in array) {
            if (hashSet.contains(i)) {
                return i
            } else {
                hashSet.add(i)
            }
        }
        return null
    }
}