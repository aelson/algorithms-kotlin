package tech.aelson.algorithms.search.pivot

import tech.aelson.algorithms.model.Grade

object Pivot {
    fun execute(grades: Array<Grade>, end: Int): Int {
        val pivot = grades[end - 1]
        var lowerValuesCount = 0
        for (index in 0 until end - 1) {
            val current = grades[index]
            if (current.result <= pivot.result) {
                swap(grades, index, lowerValuesCount)
                lowerValuesCount++
            }
        }
        swap(grades, end - 1, lowerValuesCount)
        return lowerValuesCount
    }

    private fun swap(grades: Array<Grade>, from: Int, to: Int) {
        val grade1 = grades[from]
        val grade2 = grades[to]
        grades[to] = grade1
        grades[from] = grade2
    }
}