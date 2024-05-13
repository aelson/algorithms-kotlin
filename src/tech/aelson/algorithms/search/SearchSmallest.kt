package src.tech.aelson.algorithms.search

import src.tech.aelson.algorithms.model.Product

object SearchSmallest {
    fun findSmallest(products: Array<Product>, start: Int, end: Int): Int {
        var smallest = start
        for (index in start..end) {
            if (products[index].price < products[smallest].price) {
                smallest = index
            }
        }
        return smallest
    }
}
