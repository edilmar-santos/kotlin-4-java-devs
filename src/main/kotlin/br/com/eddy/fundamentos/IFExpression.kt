package br.com.eddy.fundamentos

fun main() {
    val firstValue = 7
    val secondValue = 2

    // equivalente ao tern[ario em java
    val lowestValue = if (firstValue < secondValue) firstValue else secondValue
    println("The lowest value is: $lowestValue")

    val currentBalance = 150.00
    val isBankRupted = if (currentBalance <= 0) {
        println("definitely bankrupted")
        true
    }else{
        println("still surviving")
        false
    }

    println("Is bankrupted: $isBankRupted")
}