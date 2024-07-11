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

    demonstrateWhen()
}


fun demonstrateWhen(){
    // equal to switch-case in Java
    val dayOfWeek = 3
    when(dayOfWeek){
        1 -> println("Today is Monday")
        2 -> println("Today is Tuesday")
        3 -> println("Today is Wednesday")
        4 -> println("Today is Thursday")
        5 -> println("Today is Friday")
        6 -> println("Today is Saturday")
        7 -> println("Today is Sunday")
        else -> println("Invalid day of the week")
    }
}