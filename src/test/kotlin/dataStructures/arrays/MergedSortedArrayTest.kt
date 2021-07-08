package dataStructures.arrays

import org.junit.Test
import kotlin.test.assertEquals

class MergedSortedArrayTest {
    private val merge = MergeSortedArrays()

    @Test
    fun mergedSortedArrayTest() {
        val array1 = intArrayOf(0, 3, 10, 55, 100)
        val array2 = intArrayOf(2, 4, 32, 75, 101)
        val mergedArray = intArrayOf(0, 2, 3, 4, 10, 32, 55, 75, 100, 101)
        val result = merge.mergeSortedArrays(array1, array2)
        assertEquals(mergedArray.contentToString(), result.contentToString())
    }

    @Test
    fun arr1LargerMergeTest() {
        val array1 = intArrayOf(0, 3, 10, 55, 100)
        val array2 = intArrayOf(2, 4, 32)
        val mergedArray = intArrayOf(0, 2, 3, 4, 10, 32, 55, 100)
        val result = merge.mergeSortedArrays(array1, array2)
        assertEquals(mergedArray.contentToString(), result.contentToString())
    }

    @Test
    fun arr2LargerMergeTest() {
        val array1 = intArrayOf(0, 3, 100)
        val array2 = intArrayOf(2, 4, 32, 54, 87, 197)
        val mergedArray = intArrayOf(0, 2, 3, 4, 32, 54, 87, 100, 197)
        val result = merge.mergeSortedArrays(array1, array2)
        assertEquals(mergedArray.contentToString(), result.contentToString())
    }

    @Test
    fun arr1EmptyMergeTest() {
        val array1 = intArrayOf()
        val array2 = intArrayOf(2, 4, 32, 54, 87, 197)
        val mergedArray = intArrayOf(2, 4, 32, 54, 87, 197)
        val result = merge.mergeSortedArrays(array1, array2)
        assertEquals(mergedArray.contentToString(), result.contentToString())
    }

    @Test
    fun arr2EmptyMergeTest() {
        val array1 = intArrayOf(0, 3, 100)
        val array2 = intArrayOf()
        val mergedArray = intArrayOf(0, 3, 100)
        val result = merge.mergeSortedArrays(array1, array2)
        assertEquals(mergedArray.contentToString(), result.contentToString())
    }
}