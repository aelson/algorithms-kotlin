package src.tech.aelson.algorithms.search

import src.tech.aelson.algorithms.model.Product
import src.tech.aelson.algorithms.search.SearchSmallest.findSmallest

object TestSmallestPrice {
    @JvmStatic
    fun main(args: Array<String>) {
        val products = arrayOf(
            Product("Tesla Model 3", 50000.0),
            Product("Toyota Corolla", 20000.0),
            Product("Ford Escape", 30000.0),
            Product("Honda Civic", 30000.0),
            Product("Audi Q5", 45000.0)
        )

        val smallest = findSmallest(products, 0, 4)
        println(smallest)
        println(("The car " + products[smallest].name).toString() + " costs " + products[smallest].price)
    }
}