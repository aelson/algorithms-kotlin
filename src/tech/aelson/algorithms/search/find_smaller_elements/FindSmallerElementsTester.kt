package tech.aelson.algorithms.search.find_smaller_elements

import tech.aelson.algorithms.model.Grade
import tech.aelson.algorithms.search.find_smaller_elements.FindSmallerElements.execute
import tech.aelson.algorithms.util.Util


object FindSmallerElementsTester {
    @JvmStatic
    fun main(args: Array<String>) {
        val guilherme = Grade("guilherme", 7.0)
        val unsortedGrades: Array<Grade> = Util.getUnsortedGrades(guilherme)

        val lowerValuesCount = execute(guilherme, unsortedGrades)
        println("Lower values count: $lowerValuesCount")
    }
}