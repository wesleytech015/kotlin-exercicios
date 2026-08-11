interface Order {
    val orderId: String
    val customerName: String
    val orderTotal: Double
}

data object OrderOne : Order {
    override val orderId = "001"
    override val customerName = "Alice"
    override val orderTotal = 15.50
}

data object OrderTwo : Order {
    override val orderId = "002"
    override val customerName = "Bob"
    override val orderTotal = 12.75
}

fun main() {
    println("Order name: $OrderOne")
    println("Order name: $OrderTwo")

    println("Are the two orders identical? ${OrderOne == OrderTwo}")

    if (OrderOne == OrderTwo) {
        println("The orders are identical.")
    } else {
        println("The orders are unique.")
    }

    println(
        "Do the orders have the same customer name? " +
        "${OrderOne.customerName == OrderTwo.customerName}"
    )
}