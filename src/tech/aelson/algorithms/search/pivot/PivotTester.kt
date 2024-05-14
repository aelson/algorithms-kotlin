package tech.aelson.algorithms.search.pivot

import tech.aelson.algorithms.model.Grade
import tech.aelson.algorithms.search.pivot.Pivot.execute

object PivotTester {
    @JvmStatic
    fun main(args: Array<String>) {
        val guilherme = Grade("guilherme", 7.0)
        val unsortedGrades = arrayOf(
            Grade("andre", 4.0),
            Grade("carlos", 8.5),
            Grade("ana", 10.0),
            Grade("jonas", 3.0),
            Grade("juliana", 6.7),
            Grade("lucia", 9.3),
            Grade("paulo", 9.0),
            Grade("mariana", 5.0),
            guilherme,
        )

        val pivotPosition = execute(unsortedGrades, unsortedGrades.size)
        println("The Pivot is in the position $pivotPosition")
        for ((studentName, result) in unsortedGrades) {
            println("$studentName $result")
        }
    }
}