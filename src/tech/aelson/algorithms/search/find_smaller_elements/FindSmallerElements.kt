package tech.aelson.algorithms.search.find_smaller_elements

import tech.aelson.algorithms.model.Grade

object FindSmallerElements {
    fun execute(reference: Grade, unsortedGradle: Array<Grade>): Int {
        var lowerValuesCount = 0
        for ((_, result) in unsortedGradle) {
            if (result < reference.result) {
                lowerValuesCount++
            }
        }
        return lowerValuesCount
    }
}