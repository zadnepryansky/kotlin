fun main() {
    val x: Int = 30
    val y: Int = 2
    val operation: String = "add" // chose arithmetic operation

    // "add" == "+" and "minus" == "-"

    val result = when (operation) {
        "add" -> {
           x + y   // 1 example without val r = x + y
                                        // r
        }

        "minus" -> x - y  // 2 example

        else -> {
            val r = x * y  // 3 example
            r
        }
    }
    println("Result: $result")
    println("End of program")
}

