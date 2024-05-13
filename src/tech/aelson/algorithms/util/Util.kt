package tech.aelson.algorithms.util

import src.tech.aelson.algorithms.model.Product

object Util {
    fun swap(products: Array<Product>, first: Int, second: Int) {
        println("<-> Swapping element $first with $second")

        val (firstProduct, secondProduct) = products[first] to products[second]

        println("<-> Swapping product " + firstProduct.name + " with " + secondProduct.name)

        products[first] = secondProduct
        products[second] = firstProduct

        println("------------------------------------")
    }

    fun printArray(arrayTitle: String?, products: Array<Product>) {
        println(arrayTitle)
        for (product: Product in products) {
            println(product.name + " costs " + product.price)
        }
    }

    val unsortedProducts: Array<Product>
        get() = arrayOf(
            Product("Ford Escape", 30000.0),
            Product("Toyota Corolla", 20000.0),
            Product("Audi Q5", 45000.0),
            Product("Honda Civic", 30000.0),
            Product("Tesla Model 3", 50000.0),
        )
}