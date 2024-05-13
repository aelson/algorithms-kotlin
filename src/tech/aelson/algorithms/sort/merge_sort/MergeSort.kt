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
        while (currentOfFirstArray < firstArray.size) {
            println("-> Inserting " + firstArray[currentOfFirstArray].studentName + " (" + firstArray[currentOfFirstArray].result + ") on the position " + currentOfMerged + " because it is left over from the first array")
            merged[currentOfMerged] = firstArray[currentOfFirstArray]
            currentOfFirstArray++
            currentOfMerged++
        }
        while (currentOfSecondArray < secondArray.size) {
            println("-> Inserting " + secondArray[currentOfSecondArray].studentName + " (" + secondArray[currentOfSecondArray].result + ") on the position " + currentOfMerged + " because it is left over from the second array")
            merged[currentOfMerged] = secondArray[currentOfSecondArray]
            currentOfSecondArray++
            currentOfMerged++
        }
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
        while (firstPartIndex < middle) {
            println("-> Inserting " + array[firstPartIndex].studentName + " (" + array[firstPartIndex].result + ") on the position " + sortedIndex + " because it is left over from the first part of the array")
            sorted[sortedIndex] = array[firstPartIndex]
            firstPartIndex++
            sortedIndex++
        }
        while (secondPartIndex < end) {
            println("-> Inserting " + array[secondPartIndex].studentName + " (" + array[secondPartIndex].result + ") on the position " + sortedIndex + " because it is left over from the second part of the array")
            sorted[sortedIndex] = array[secondPartIndex]
            secondPartIndex++
            sortedIndex++
        }
        if (start > 0) {
            println("Rebuilding the original array keeping the initial object(s) not ordered (because the start is greater then 0)")
            for (indexOfMerged in 0 until sortedIndex) {
                println("-> Inserting " + sorted[indexOfMerged].studentName + " (" + sorted[indexOfMerged].result + ") on the position " + indexOfMerged)
                array[start + indexOfMerged] = sorted[indexOfMerged]
            }
        }
        return array
    }
}
