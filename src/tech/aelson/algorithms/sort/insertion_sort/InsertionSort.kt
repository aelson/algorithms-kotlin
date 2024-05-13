package tech.aelson.algorithms.sort.insertion_sort

import src.tech.aelson.algorithms.model.Product
import tech.aelson.algorithms.util.Util.swap

object InsertionSort {
    fun execute(products: Array<Product>, numberOfElements: Int) {
        for (current in 1 until numberOfElements) {
            println("I am in the element $current")
            var elementBeingAnalysed = current
            while (elementBeingAnalysed > 0 && products[elementBeingAnalysed].price < products[elementBeingAnalysed - 1].price) {
                swap(products, elementBeingAnalysed, elementBeingAnalysed - 1)
                elementBeingAnalysed--
            }
        }
    }
}