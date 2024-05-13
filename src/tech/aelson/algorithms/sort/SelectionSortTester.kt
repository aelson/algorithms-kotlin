package tech.aelson.algorithms.sort

import src.tech.aelson.algorithms.model.Product
import tech.aelson.algorithms.sort.SelectionSort.execute

object SelectionSortTester {
    @JvmStatic
    fun main(args: Array<String>) {
        val products = arrayOf(
            Product("Ford Escape", 30000.0),
            Product("Toyota Corolla", 20000.0),
            Product("Audi Q5", 45000.0),
            Product("Honda Civic", 30000.0),
            Product("Tesla Model 3", 50000.0),
        )
        println("Original array: ")
        for (product in products) {
            println(product.name + " costs " + product.price)
        }

        execute(products, products.size)

        println("Sorted array: ")
        for (product in products) {
            println(product.name + " costs " + product.price)
        }
    }
}