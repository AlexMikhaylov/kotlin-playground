package basics

fun main() {
    val result = addictionJava(2, 4)
    println(result)
}

// return type Integer
fun addictionJava(x: Int, y: Int): Int {
    return x + y
}

fun addictionShort(x: Int, y: Int) = x + y

// Unit corresponds to void in Java, when a function doesn't return anything, return kotlin.Unit, default, it can be ingored in the function signature
fun printName(name: String): Unit {
    println("Name is $name")
}