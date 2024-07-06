package basics

// Integer types
val byteValue: Byte = 127 // 8-bit signed integer
val shortValue: Short = 32767 // 16-bit signed integer
val intValue: Int = 2147483647 // 32-bit signed integer
val longValue: Long = 9223372036854775807 // 64-bit signed integer
val anotherLong = 9223372036853875807L // 64-bit signed integer

// Unsigned integer types
val unsignedByteValue: UByte = 255u // 8-bit unsigned integer
val unsignedShortValue: UShort = 65535u // 16-bit unsigned integer
val unsignedIntValue: UInt = 4294967295u // 32-bit unsigned integer
val unsignedLongValue: ULong = 1844674407370955161u // 64-bit unsigned integer

// Floating-point types
val floatValue: Float = 3.141558F // 32-bit floating-point number
val doubleValue: Double = 2.718281828459045 // 64-bit floating-point number

// Characters
val charValue: Char = 'A' // 16-bit Unicode character

// Booleans
val booleanValue: Boolean = true // true or false

fun main() {
    println("Byte Value: $byteValue")
    println("Short Value: $shortValue")
    println("Int Value: $intValue")
    println("Long Value: $longValue")
    println("Another Long Value: $anotherLong")
    println("Unsigned Byte Value: $unsignedByteValue")
    println("Unsigned Short Value: $unsignedShortValue")
    println("Unsigned Int Value: $unsignedIntValue")
    println("Unsigned Long Value: $unsignedLongValue")
    println("Float Value: $floatValue")
    println("Double Value: $doubleValue")
    println("Char Value: $charValue")
    println("Boolean Value: $booleanValue")
}