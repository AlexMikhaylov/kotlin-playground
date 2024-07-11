package basics

fun main() {

    for (i in 1..5){
        println("i: $i")
        if(i == 3) break
    }

    label()

    returnLoop()

    continueLoop()

    println("End of Program")

}

fun continueLoop() {

    for (i in 1..5){
        println("i in continue loop: $i")
        if(i == 3) continue
        println("This line will not be executed for i = 3")
    }
}

fun returnLoop() {
    for (i in 1..5){
        println("i in return loop: $i")
        if(i == 3) return
    }
    println("This line will not be executed")
}

fun label() {
    loop@ for (i in 1..5){
        println("i in label: $i")
        if(i == 3) break@loop
        innerloop@ for (j in 1..5){
            println("j in inner loop: $j")
            if(j == 3) break@innerloop
        }
    }
}
