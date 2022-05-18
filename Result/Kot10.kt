import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    print("input a number :")
    var input:Int = scan.nextInt()

    var one:Int = 1
    while(one<=input){
        println("$one")
        one++
    }

    println("Program End")
}
