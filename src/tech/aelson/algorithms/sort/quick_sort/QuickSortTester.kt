package tech.aelson.algorithms.sort.quick_sort

import tech.aelson.algorithms.model.Grade
import tech.aelson.algorithms.sort.quick_sort.QuickSort.execute
import tech.aelson.algorithms.util.Util.getUnsortedGrades
import tech.aelson.algorithms.util.Util.printGradesArray

object QuickSortTester {
    @JvmStatic
    fun main(args: Array<String>) {
        val guilherme = Grade("guilherme", 7.0)
        val unsortedGrades: Array<Grade> = getUnsortedGrades(guilherme)

        execute(unsortedGrades, 0, unsortedGrades.size)
        printGradesArray("Sorted array: ", unsortedGrades)
    }
}