package basics

fun main() {
    // immutable variables
    val name: String = "John Doe"
    println("Hello, $name!") // string interpolation

    // mutable variables
    var age: Int = 35
    println("Your age is $age years old. Your age has ${age.toString().length} digits")
    age = 366
    println("Your age is $age years old. Your age has ${age.toString().length}")

    var multiline = "ABC\nDEF"
    println(multiline)

    multiline = """
        ABC
        DEF
    """.trimIndent()
    println(multiline)

}