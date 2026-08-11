import kotlin.properties.Delegates.observable

class Budget(val totalBudget: Int) {

    var remainingBudget: Int by observable(totalBudget) { _, oldValue, newValue ->

        if (newValue < totalBudget * 0.2) {
            println(
                "Warning: Your remaining budget ($newValue) " +
                "is below 20% of your total budget."
            )
        } else if (newValue > oldValue) {
            println(
                "Good news: Your remaining budget increased to $newValue."
            )
        }
    }
}

fun main() {
    val myBudget = Budget(totalBudget = 1000)

    myBudget.remainingBudget = 800
    myBudget.remainingBudget = 150
    myBudget.remainingBudget = 50
    myBudget.remainingBudget = 300
}