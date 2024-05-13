package tech.aelson.algorithms.search.find_smallest

import src.tech.aelson.algorithms.model.Product

object FindSmallest {
    fun execute(products: Array<Product>, start: Int, end: Int): Int {
        var smallest = start
        for (index in start..end) {
            if (products[index].price < products[smallest].price) {
                smallest = index
            }
        }
        return smallest
    }
}
