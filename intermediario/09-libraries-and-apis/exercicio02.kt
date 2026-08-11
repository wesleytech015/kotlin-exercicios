import kotlin.time.measureTime

fun main() {
    val timeTaken = measureTime {
        val data = List(1000) { it * 2 }

        val filteredData = data.filter {
            it % 3 == 0
        }

        val processedData = filteredData.map {
            it / 2
        }

        println("Processed data")
    }

    println("Time taken: $timeTaken")
}