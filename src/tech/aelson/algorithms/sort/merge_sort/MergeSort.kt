package tech.aelson.algorithms.sort.merge_sort

import tech.aelson.algorithms.model.Grade


object MergeSort {
    fun mergeTwoArrays(firstArray: Array<Grade>, secondArray: Array<Grade>): Array<Grade> {
        val total = firstArray.size + secondArray.size
        val merged = Array(total) { Grade("", 0.0) }
        var currentOfFirstArray = 0
        var currentOfSecondArray = 0
        var currentOfMerged = 0
        while (currentOfFirstArray < firstArray.size && currentOfSecondArray < secondArray.size) {
            val grade1 = firstArray[currentOfFirstArray]
            val grade2 = secondArray[currentOfSecondArray]

            println("Comparing " + grade1.studentName + " (" + grade1.result + ") with " + grade2.studentName + " (" + grade2.result + ")")

            if (grade1.result < grade2.result) {
                println("-> Inserting " + grade1.studentName + " (" + grade1.result + ") on the position " + currentOfMerged)
                merged[currentOfMerged] = grade1
                currentOfFirstArray++
            } else {
                println("-> Inserting " + grade2.studentName + " (" + grade2.result + ") on the position " + currentOfMerged)
                merged[currentOfMerged] = grade2
                currentOfSecondArray++
            }
            println("------------------------------------")
            currentOfMerged++
        }
        currentOfMerged = addRemainingElementsToEndOfArray(firstArray, firstArray.size, currentOfFirstArray, merged, currentOfMerged)
        addRemainingElementsToEndOfArray(secondArray, secondArray.size, currentOfSecondArray, merged, currentOfMerged)
        return merged
    }

    fun sortOneArray(array: Array<Grade>, start: Int, middle: Int, end: Int): Array<Grade> {
        val total = array.size
        val sorted = Array(total - start) { Grade("", 0.0) }
        var sortedIndex = 0
        var firstPartIndex = start
        var secondPartIndex = middle
        while (firstPartIndex < middle && secondPartIndex < end) {
            println("Comparing " + array[firstPartIndex].studentName + " (" + array[firstPartIndex].result + ") with " + array[secondPartIndex].studentName + " (" + array[secondPartIndex].result + ")")

            if (array[firstPartIndex].result < array[secondPartIndex].result) {
                println("-> Inserting " + array[firstPartIndex].studentName + " (" + array[firstPartIndex].result + ") on the position " + sortedIndex)
                sorted[sortedIndex] = array[firstPartIndex]
                firstPartIndex++
            } else {
                println("-> Inserting " + array[secondPartIndex].studentName + " (" + array[secondPartIndex].result + ") on the position " + sortedIndex)
                sorted[sortedIndex] = array[secondPartIndex]
                secondPartIndex++
            }
            println("------------------------------------")
            sortedIndex++
        }
        sortedIndex = addRemainingElementsToEndOfArray(array, middle, firstPartIndex, sorted, sortedIndex)
        addRemainingElementsToEndOfArray(array, end, secondPartIndex, sorted, sortedIndex)
        if (start + end < array.size) {
            rebuildArray(array, start, sortedIndex, sorted)
        }
        return array
    }

    private fun addRemainingElementsToEndOfArray(
        array: Array<Grade>,
        arrayEnd: Int,
        arrayIndex: Int,
        merged: Array<Grade>,
        mergedArrayIndex: Int
    ): Int {
        var currentIndex = arrayIndex
        var currentMergedIndex = mergedArrayIndex
        while (currentIndex < arrayEnd) {
            println("-> Inserting " + array[currentIndex].studentName + " (" + array[currentIndex].result + ") on the position " + currentMergedIndex + " because it is left over from the first array")
            merged[currentMergedIndex] = array[currentIndex]
            currentIndex++
            currentMergedIndex++
        }
        return currentMergedIndex
    }

    private fun rebuildArray(array: Array<Grade>, start: Int, sortedIndex: Int, sorted: Array<Grade>) {
        println("Rebuilding the original array")
        for (indexOfMerged in 0 until sortedIndex) {
            println("-> Inserting " + sorted[indexOfMerged].studentName + " (" + sorted[indexOfMerged].result + ") on the position " + indexOfMerged)
            array[start + indexOfMerged] = sorted[indexOfMerged]
        }
    }
}
