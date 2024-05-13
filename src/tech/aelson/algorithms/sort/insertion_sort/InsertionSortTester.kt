package tech.aelson.algorithms.sort.insertion_sort

import tech.aelson.algorithms.util.Util.printProductsArray
import tech.aelson.algorithms.util.Util.unsortedProducts

object InsertionSortTester {
    @JvmStatic
    fun main(args: Array<String>) {
        val products = unsortedProducts
        printProductsArray("Original array: ", products)

        InsertionSort.execute(products, products.size)
        printProductsArray("Sorted array: ", products)
    }
}