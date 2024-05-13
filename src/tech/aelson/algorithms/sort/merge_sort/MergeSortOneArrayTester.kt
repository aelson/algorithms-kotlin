package tech.aelson.algorithms.sort.merge_sort

import tech.aelson.algorithms.model.Grade
import tech.aelson.algorithms.util.Util

object MergeSortOneArrayTester {
    @JvmStatic
    fun main(args: Array<String>) {
//        val sortedHalfOfGrades: Array<Grade> = arrayOf(
//            Grade("mariana", 5.0),
//            Grade("carlos", 8.5),
//            Grade("lucia", 9.3),
//            Grade("ana", 10.0),
//            Grade("jonas", 3.0),
//            Grade("andre", 4.0),
//            Grade("juliana", 6.7),
//            Grade("guilherme", 7.0),
//            Grade("paulo", 9.0),
//        )
        val unsortedGrades: Array<Grade> = arrayOf(
            Grade("mariana", 5.0),
            Grade("ana", 10.0),
            Grade("carlos", 8.5),
            Grade("lucia", 9.3),
            Grade("andre", 4.0),
            Grade("paulo", 9.0),
            Grade("juliana", 6.7),
            Grade("jonas", 3.0),
            Grade("guilherme", 7.0),
        )
        //Util.printGradesArray("Grades array: ", sortedHalfOfGrades);
        Util.printGradesArray("Grades array: ", unsortedGrades)

        //MergeSort.sortOneArrayWithTwoOrderedHalf(sortedHalfOfGrades, 0, 4, 8);
        MergeSort.mergeSort(unsortedGrades, 0, unsortedGrades.size)
        Util.printGradesArray("Sorted array: ", unsortedGrades)
    }
}