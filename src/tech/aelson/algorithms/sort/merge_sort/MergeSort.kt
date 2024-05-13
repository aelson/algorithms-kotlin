package tech.aelson.algorithms.sort.merge_sort

import tech.aelson.algorithms.model.Grade

object MergeSort {
    fun execute(firstArray: Array<Grade>, secondArray: Array<Grade>): Array<Grade> {
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
}