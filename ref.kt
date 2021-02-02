// Creafe Function
/*
fun functionName(): returnType {
    ....
    return xx;
}
*/
fun alwaysTrue(): Boolean {
    return true;
}
fun alwaysFalse(): Boolean {
    return false;
}
fun add(a: Int, b: Int): Int {
    return a+b;
}
//Immutable Variable
fun printImmutable(){
    val letter: Char = 'A'
    val tab = '\t'
    val infinity = '\u221E'

    println("letter = $letter")
    println("tab = $tab")
    println("infinity = $infinity")

    val linefeed = 10.toChar()
    println("linnfeed = $linefeed next line")

    var willExcerise = false
    val bigNumber = 1_000_000
    val smallNumber = 2
    println("Is big bigger = ${bigNumber > smallNumber}")
}



fun main() {
    //mutable
    // var count: Int = 0
    // val number: Int = 42

    // val otherNumber = 43
    // val myLong: Long = 300000000L
    // val myByte: Byte = 127
    // val myShort: Short = 32727

    // val myDouble: Double = 98.6
    // val myFloat: Float = 12.2F
    // val alsoDouble = 101.5

    // val asInt = alsoDouble.toInt()
    // val asFloat = myLong.toFloat()
    // val maxInt = 2_147_483_648
    
    // println("Executing alwaysTrue: ${alwaysTrue()}")
    // println("Executing alwaysTrue: ${alwaysFalse()}")
    // println("${add(1,2)}")
    // stringManiputation()
    // diffThanJava()
    // challenge()
    // arrayStages()
    // var fives = Array(10, ::fiver)//Array(10, ::fiver)
    // for(each in fives){
    //     println(each)
    // }
    removeDupEleChalleng()
    
}
fun fiver(num: Int): Int{
    return num * 5;
}

fun stringManiputation() {
    val greeting: String = "Hello"
    val owe = 50
    val janet = "I owe Janet \$$owe"
    println(janet)

    val some = greeting.get(2)
    println("some is $some")
    val index = greeting[1]
    println("index is $index")
    //
}

fun diffThanJava() {
    println("diffThanJava is called!")
    var func = unitReturn()
    println("func id $func")
    println("My graded is \'${switchGrade(100)}\'")
    assignAsExecuted()
}

fun unitReturn() {
    println("unitReturn is called!")
}

fun switchGrade(a: Int) : String {
    var result = when (a) {
        in 0..49 -> "F"
        in 50..59 -> "D"
        in 60..69 -> "C"
        in 70..79 -> "B"
        in 80..89 -> "A"
        in 90..100 -> "S"
        else -> "Error points input"
    }
    return result
}

fun assignAsExecuted() {
    var big = 100
    var small = 1
    var max = if(big > small) big else small
    println("Max number is $max")
}

fun challenge() {
    var cardPoints = 1000000//7_000
    val cardLevel: String = when (cardPoints) {
        in 0..999 -> "pearl"
        in 1_000..4_999 -> "silver"
        in 5_000..9_999 -> "gold"
        else -> "platinum"
    } 
    var plural = if(cardPoints > 1 || cardPoints == 0) "s" else ""
    println("You have $cardPoints point$plural and are at the $cardLevel level.") 
}

// Array and List
// Array declaration
/*
    1. Normal
        var a = arrayOf('sss','a','b',2)
    2. Array Constructor: With this, 
        we can set the size and pass the existing function to create elements

    fun fiver(num: Int){
        return index * 5
    }
    var fives = Array(10, ::fiver)
 */
// Array cannot change size
// Access to array always slower than list because element in array is always an object(not primitive)
// There're primitive array(intArray, byteArray, shortArray)
//  val pInt = intArrayOf(1,2,3)

fun removeDupEleChalleng(){
    var fruits = listOf("apple", "orange", "watermelon", "apple", "orange", "watermelon")
    
    var new = fruits.toSet()
    println(new)
    // loop
    // var new = mutableSetOf<String>()
    // for(fruit in fruits){
    //     new.add(fruit)
    // }
    // println(new)

}
