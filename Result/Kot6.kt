import java.util.Scanner


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    print("input 1~100 :")
    var input = scan.nextInt()
    if (input >100) println("It is bigger than 100!")
    if (input < 0) println("It is Smaller than 0!")
    if (input == 50) println("Your input is 50!")
    if (input <= 50) println("Your input is smaller than 50!")
    if (input >= 50) println("Your input is bigger than 50")
    else println("ERROR")
}
