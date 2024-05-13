package tech.aelson.algorithms.sort.selection_sort

import tech.aelson.algorithms.sort.selection_sort.SelectionSort.execute
import tech.aelson.algorithms.util.Util

object SelectionSortTester {
    @JvmStatic
    fun main(args: Array<String>) {
        val products = Util.unsortedProducts
        Util.printArray("Original array: ", products)

        execute(products, products.size)
        Util.printArray("Sorted array: ", products)
    }
}