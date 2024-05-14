package tech.aelson.algorithms.search.pivot

import tech.aelson.algorithms.model.Grade
import tech.aelson.algorithms.search.pivot.Pivot.execute
import tech.aelson.algorithms.util.Util

object PivotTester {
    @JvmStatic
    fun main(args: Array<String>) {
        val guilherme = Grade("guilherme", 7.0)
        val unsortedGrades: Array<Grade> = Util.getUnsortedGrades(guilherme)

        val pivotPosition = execute(unsortedGrades, unsortedGrades.size)
        println("The Pivot is in the position $pivotPosition")
        for ((studentName, result) in unsortedGrades) {
            println("$studentName $result")
        }
    }
}