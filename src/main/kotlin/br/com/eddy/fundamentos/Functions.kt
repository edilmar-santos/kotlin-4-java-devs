package br.com.eddy.fundamentos

fun main() {
    println("10 + 10 is : ${sum(10, 10)}")
    println("10 + 10 with inference return function is : ${sumWihInferenceReturn(10, 10)}")
    println("Default values sum is : ${sum()}")
    println("5 + 5  with expression body function is: ${sum(5, 5)}")
    println("15 + 10 specifying just the last param is: ${sumWithMessage(message = "Please give me the right result")}")
}

fun sum(value1: Int = 2, value2: Int = 2) : Int{
    return value1 + value2
}

fun sumWihInferenceReturn(value1: Int, value2: Int) = value1 + value2

fun expressionBodySum(value1: Int = 2, value2: Int = 2) : Int = value1 + value2

fun sumWithMessage(value1: Int = 2, value2: Int = 2, message: String = "sum expression") : Int{
    println(message)
    return value1 + value2
}