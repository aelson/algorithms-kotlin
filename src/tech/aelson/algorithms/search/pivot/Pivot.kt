package tech.aelson.algorithms.search.pivot

import tech.aelson.algorithms.model.Grade
import tech.aelson.algorithms.util.Util

object Pivot {
    fun execute(grades: Array<Grade>, end: Int): Int {
        val pivot = grades[end - 1]
        var lowerValuesCount = 0
        for (index in 0 until end - 1) {
            val current = grades[index]
            if (current.result < pivot.result) {
                if (index != lowerValuesCount) {
                    Util.swap(grades, index, lowerValuesCount)
                }
                lowerValuesCount++
            }
        }
        if (end - 1 != lowerValuesCount) {
            Util.swap(grades, end - 1, lowerValuesCount)
        }
        return lowerValuesCount
    }
}