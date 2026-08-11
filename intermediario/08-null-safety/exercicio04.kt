fun validateStock(
    requested: Int?,
    available: Int?
): Int {

    val validRequested = requested ?: return -1
    val validAvailable = available ?: return -1

    if (validRequested < 0) {
        return -1
    }

    if (validRequested > validAvailable) {
        return -1
    }

    return validRequested
}

fun main() {
    println(validateStock(5, 10))
    println(validateStock(null, 10))
    println(validateStock(-2, 10))
}