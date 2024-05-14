package tech.aelson.algorithms.sort.quick_sort

import tech.aelson.algorithms.model.Grade
import tech.aelson.algorithms.search.pivot.Pivot.execute

object QuickSort {
    fun execute(grades: Array<Grade>, start: Int, end: Int) {
        println("Executing for $start - $end")
        val numberOfElements = end - start
        if (numberOfElements > 1) {
            val pivotIndex = execute(grades, end)
            execute(grades, start, pivotIndex)
            execute(grades, pivotIndex + 1, end)
        }
    }
}