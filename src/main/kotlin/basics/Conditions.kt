package basics

fun main() {
    // if-else
    // when

    val name = "Alex";
    val random = Math.random()
    val result = if(random > 0.5){
        println("Name is $name and random is $random")
        random
    }else{
        println("Random number is $random")
        random
    }

    println("The result is $result")
}