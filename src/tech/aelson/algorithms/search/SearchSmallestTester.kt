package tech.aelson.algorithms.search

import src.tech.aelson.algorithms.model.Product
import tech.aelson.algorithms.search.SearchSmallest.execute

object SearchSmallestTester {
    @JvmStatic
    fun main(args: Array<String>) {
        val products = arrayOf(
            Product("Tesla Model 3", 50000.0),
            Product("Toyota Corolla", 20000.0),
            Product("Ford Escape", 30000.0),
            Product("Honda Civic", 30000.0),
            Product("Audi Q5", 45000.0)
        )

        val smallest = execute(products, 0, 4)
        println(smallest)
        println("The car " + products[smallest].name + " costs " + products[smallest].price)
    }
}