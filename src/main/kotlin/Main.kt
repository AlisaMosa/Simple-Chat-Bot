

fun main() {
    hello()
    age()
    number()
test()
    end()
}
fun hello() {
    println("Hello! My name is Aid.\nI was created in 2024.\nPlease, remind me your name.")
    val name = readln()
    println("What a great name you have, $name!")
}
fun age(){
    println("Let me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.")
    var (a,b,c)=readln().split(" ") //1 2 1
    var age=(a.toInt() * 70 + b.toInt() * 21 + c.toInt() * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}
fun number(){
    println("Now I will prove to you that I can count to any number you want.")
    for( i in 0 .. readln().toInt()) {
        println("$i!")
    }
}
fun test() {
    println("Let's test your programming knowledge.")
    println("Why do we use methods?\n" +
            "1. To repeat a statement multiple times.\n" +
            "2. To decompose a program into several small subroutines.\n" +
            "3. To determine the execution time of a program.\n" +
            "4. To interrupt the execution of a program.")
    var z=readln().toInt()
    while(z!=2){
        println("Please, try again.")
        z=readln().toInt()
    }
}
fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}