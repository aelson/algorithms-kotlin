package tech.aelson.algorithms.sort.merge_sort

import tech.aelson.algorithms.model.Grade
import tech.aelson.algorithms.sort.merge_sort.MergeSort.sortOneArray
import tech.aelson.algorithms.util.Util.printGradesArray

object MergeSortOneArrayTester {
    @JvmStatic
    fun main(args: Array<String>) {
        val grades: Array<Grade> = arrayOf(
            Grade("andre", 4.0),
            Grade("mariana", 5.0),
            Grade("carlos", 8.5),
            Grade("paulo", 9.0),
            Grade("jonas", 3.0),
            Grade("juliana", 6.7),
            Grade("guilherme", 7.0),
            Grade("lucia", 9.3),
            Grade("ana", 10.0),
        )
        printGradesArray("Grades array: ", grades)

        val rank = sortOneArray(grades, 0, 4, grades.size)
        printGradesArray("Sorted array: ", rank)
    }
}