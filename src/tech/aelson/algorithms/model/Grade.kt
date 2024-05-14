package tech.aelson.algorithms.model

@JvmRecord
data class Grade(val studentName: String, val result: Double) {
    override fun toString(): String {
        return "$studentName: $result"
    }
}