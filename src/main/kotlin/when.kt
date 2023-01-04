
// Common example declaration
//fun main() {
//    val x: Int = 1
//    val y: Int = 10
//    val operation: String = "minus" // chose arithmetic operation
//
//    val result: Int = when (operation) {
//        "add" -> x + y
//        "minus" -> x - y
//        else -> x * y
//    }
//    println("Result: $result")
//    println("End of program")
//}

// Second example declaration
//fun main() {
//    val x: Int = 10
//    val y: Int = 5
//    val operation: String = "minus" // chose arithmetic operation
//
//    val result: Int = when (operation) {
//        "add" -> {
//            val r = x + y
//            r
//        }
//
//        "minus" -> {
//            val r = x - y
//            r
//        }
//
//        else -> {
//            var r = x * y
//            r
//        }
//    }
//    println("Result: $result")
//    println("End of program")
//}


// Third example declaration
//fun main() {
//    val x: Int = 8
//    val y: Int = 4
//    val operation: String = "add" // chose arithmetic operation
//
//    when {
//        operation == "add" -> {
//            println(x + y)
//        }
//
//        operation == "minus" -> {
//            println(x - y)
//        }
//        else -> {
//            println(x * y)
//        }
//    }
//    println("Ending program")
//}

//Homework change type of code
fun main(){
    val x: Int = 1
    val y: Int = 10
    val operation: String = "add"

    if(operation == "minus") {
        println(x - y)
    }
    else if (operation == "add"){
        println(x + y)
    }
    else {
        println(x * y)
    }
    println("Ending program")
    }
