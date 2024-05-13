package tech.aelson.algorithms.util

import src.tech.aelson.algorithms.model.Product
import tech.aelson.algorithms.model.Grade

object Util {
    fun swap(products: Array<Product>, first: Int, second: Int) {
        println("<-> Swapping element $first with $second")

        val (firstProduct, secondProduct) = products[first] to products[second]

        println("<-> Swapping product " + firstProduct.name + " with " + secondProduct.name)

        products[first] = secondProduct
        products[second] = firstProduct

        println("------------------------------------")
    }

    fun printProductsArray(arrayTitle: String, products: Array<Product>) {
        println(arrayTitle)
        for (product: Product in products) {
            println(product.name + " costs " + product.price)
        }
    }

    fun printGradesArray(arrayTitle: String, grades: Array<Grade>) {
        println(arrayTitle)
        for (grade: Grade in grades) {
            println(grade.studentName + " " + grade.result)
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