package src.tech.aelson.algorithms.model

@JvmRecord
data class Product(val name: String, val price: Double) {
    override fun toString(): String {
        return "$name $$price"
    }
}