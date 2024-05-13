package tech.aelson.algorithms.sort.selection_sort

import src.tech.aelson.algorithms.model.Product
import tech.aelson.algorithms.search.SearchSmallest
import tech.aelson.algorithms.util.Util

object SelectionSort {
    fun execute(products: Array<Product>, numberOfElements: Int) {
        for (current in 0 until numberOfElements - 1) {
            println("I am in the element $current")
            val smallest: Int = SearchSmallest.execute(products, current, products.size - 1)
            Util.swap(products, current, smallest);
        }
    }
}