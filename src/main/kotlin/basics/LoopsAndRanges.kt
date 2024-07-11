package basics

fun main(){

    // from 1 up to 10
    val range = 1..10;
    for(i in range){
        println("range: $i")
    }

    // from 10 down to 1
    val reversedRange = 10 downTo 1;
    for(i in reversedRange){
        println("reversedRange: $i")
    }

    // skipping 1 value
    for(i in reversedRange step 2){
        println("reversedRange with skip step 2: $i")
    }

    exploreWhile()
    exploreDoWhile()

}

fun exploreWhile(){
    val name = "Alex"
    var random = Math.random();
    while(random > 0.5){
        println("While: Name is $name and random is ${random}")
        random = Math.random();
    }
}

fun exploreDoWhile() {
    val name = "Alex"
    var random = Math.random();
    do{
        println("Do While: Name is $name and random is ${random}")
        random = Math.random();
    }while(random > 0.5)
}
