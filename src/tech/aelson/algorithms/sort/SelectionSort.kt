package tech.aelson.algorithms.sort

import src.tech.aelson.algorithms.model.Product
import tech.aelson.algorithms.search.SearchSmallest

object SelectionSort {
    fun execute(products: Array<Product>, numberOfElements: Int) {
        for (current in 0 until numberOfElements - 1) {
            println("I am in the element $current")

            val smallest: Int = SearchSmallest.execute(products, current, products.size - 1)

            println("<-> Swapping element $current with element $smallest")

            val currentProduct = products[current]
            val smallestProduct = products[smallest]

            println("<-> Swapping product " + currentProduct.name + " with product " + smallestProduct.name)

            products[current] = smallestProduct
            products[smallest] = currentProduct
            println("------------------------------------")
        }
    }
}