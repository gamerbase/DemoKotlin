import kotlin.math.roundToInt

fun main(arguments : Array<String>){
    println("Hello World")
// Class and Object
    var aliens=StarWars();
    aliens.aliens="Starwars"

    println("Code from java class ${aliens.aliens}")

//var and val

    var num1 :Float=10F
    var num2 : Float =4F
    var greaterNumber : Int =0

    //operators
    var result = (num1 /num2)

    //string Templates
    println(" the divisiopn of $num1 and $num2 is $result")
    var Saif =StarWars()
    Saif.aliens="Thanos"
    println("The alien  is ${Saif.aliens} ")

    //if and else...
    greaterNumber=if (num1>num2)
        num1.roundToInt()
    else
        num2.roundToInt()
    println("greater number is $greaterNumber" )

    //String Comparison
    var str1 : String="Saif"
    var str2 : String="Saiasf"
    if (str1==str2)
        println("Strings are Same")
    else{
        print("Strings are Not Same")
    }
}