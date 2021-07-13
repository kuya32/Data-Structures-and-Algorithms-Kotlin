package dataStructures.hashTables

import org.junit.Test
import kotlin.test.assertEquals

class RecurringCharacterTest {
    private val recurring = RecurringCharacter()

    @Test
    fun firstRecurringCharacterTest() {
        val firstRecurring = recurring.firstRecurringCharacter(intArrayOf(2, 5, 1, 2, 3, 5, 1, 2,
            4))
        assertEquals(firstRecurring, 2)
    }

    @Test
    fun emptyArrayTest() {
        val firstRecurring = recurring.firstRecurringCharacter(intArrayOf())
        assertEquals(firstRecurring, null)
    }

    @Test
    fun noRecurringCharacterTest() {
        val firstRecurring = recurring.firstRecurringCharacter(intArrayOf(1, 2, 3, 4, 5))
        assertEquals(firstRecurring, null)
    }

    @Test
    fun multipleRecurringCharacterTest() {
        val firstRecurring = recurring.firstRecurringCharacter(intArrayOf(1, 1, 1, 1, 1, 1, 1))
        assertEquals(firstRecurring, 1)
    }
}