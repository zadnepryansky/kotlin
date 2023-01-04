//fun main() {
//    val phoneLang: String = "uk" // this is language on phone
//
//    if (phoneLang == "uk") {
//        println("Привiт свiт")
//    } else if (phoneLang == "fr") {
//        println("Bonjour")
//    } else {
//        println("Hello world")
//    }
//    if (true) {
//        println("true")
//    }
//    println("The end of program.")
//}


//Homework change type of code
fun main(){
    val phoneLang : String = "uk"

    when{
        phoneLang == "uk" ->{
            println("Привin свiт")
        }
        phoneLang == "eng" -> {
            println("Hello World")
        }
        else ->{
            println("1223_3322")
        }

    }
    println("Ending program")
}


