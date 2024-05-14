package tech.aelson.algorithms.search.find_smaller_elements

import tech.aelson.algorithms.model.Grade
import tech.aelson.algorithms.search.find_smaller_elements.FindSmallerElements.execute

object FindSmallerElementsTester {
    @JvmStatic
    fun main(args: Array<String>) {
        val guilherme = Grade("guilherme", 7.0)
        val unsortedGrades = arrayOf(
            Grade("andre", 4.0),
            Grade("carlos", 8.5),
            Grade("ana", 10.0),
            Grade("jonas", 3.0),
            Grade("juliana", 6.7),
            guilherme,
            Grade("paulo", 9.0),
            Grade("mariana", 5.0),
            Grade("lucia", 9.3),
        )

        val lowerValuesCount = execute(guilherme, unsortedGrades)
        println("Lower values count: $lowerValuesCount")
    }
}