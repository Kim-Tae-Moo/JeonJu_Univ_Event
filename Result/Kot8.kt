import java.util.Scanner


fun main() {
    val scan = Scanner(System.`in`)
    print("input 1~9 :")
    var input:Int = scan.nextInt()

    when(input){
        1,2,3,4 -> println("Smaller than 5!")
        5->println("5!!!")
        6,7,8,9,10 -> println("Bigger than 5!")
        else -> println("Error")
    }

}
