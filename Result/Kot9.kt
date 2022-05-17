import java.util.Scanner


fun main() {
    val scan = Scanner(System.`in`)
    print("input 1~5 :")
    var input:Int = scan.nextInt()
    for (i in 1..input){
        if (input<1) break
        when(i){
            1->println("It is ${i}st loop.")
            2->println("It is ${i}nd loop.")
            3->println("It is ${i}rd loop.")
            else->println("It is ${i}th loop.")
        }
    }
    
    println("Program End")

}
