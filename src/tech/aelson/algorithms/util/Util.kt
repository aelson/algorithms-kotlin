package tech.aelson.algorithms.util

import src.tech.aelson.algorithms.model.Product
import tech.aelson.algorithms.model.Grade


object Util {
    fun <T> swap(array: Array<T>, first: Int, second: Int) {
        println("<-> Swapping element $first with $second")

        val (firstElement, secondElement) = array[first] to array[second]

        println("<-> Swapping object $firstElement with $secondElement")

        array[first] = secondElement
        array[second] = firstElement

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

    fun getUnsortedGrades(specialGrade: Grade): Array<Grade> {
        return arrayOf(
            Grade("andre", 4.0),
            Grade("carlos", 8.5),
            Grade("ana", 10.0),
            Grade("jonas", 3.0),
            Grade("juliana", 6.7),
            Grade("lucia", 9.3),
            Grade("paulo", 9.0),
            Grade("mariana", 5.0),
            specialGrade,
        )
    }
}