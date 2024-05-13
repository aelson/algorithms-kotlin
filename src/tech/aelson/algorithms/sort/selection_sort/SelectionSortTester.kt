package tech.aelson.algorithms.sort.selection_sort

import tech.aelson.algorithms.sort.selection_sort.SelectionSort.execute
import tech.aelson.algorithms.util.Util.printProductsArray
import tech.aelson.algorithms.util.Util.unsortedProducts

object SelectionSortTester {
    @JvmStatic
    fun main(args: Array<String>) {
        val products = unsortedProducts
        printProductsArray("Original array: ", products)

        execute(products, products.size)
        printProductsArray("Sorted array: ", products)
    }
}