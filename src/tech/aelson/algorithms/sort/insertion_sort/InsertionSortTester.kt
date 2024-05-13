package tech.aelson.algorithms.sort.insertion_sort

import tech.aelson.algorithms.util.Util.printArray
import tech.aelson.algorithms.util.Util.unsortedProducts

object InsertionSortTester {
    @JvmStatic
    fun main(args: Array<String>) {
        val products = unsortedProducts
        printArray("Original array: ", products)

        InsertionSort.execute(products, products.size)
        printArray("Sorted array: ", products)
    }
}