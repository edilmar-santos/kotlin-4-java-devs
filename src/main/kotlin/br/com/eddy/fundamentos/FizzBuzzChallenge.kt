package br.com.eddy.fundamentos

fun fizzBuzz(n: Int): List<String> {
    val result = mutableListOf<String>()

    for (item in 1..n){
        var response = when{
            item % 3 == 0 && item % 5 == 0 -> "FizzBuzz"
            item % 3 == 0 -> "Fizz"
            item % 5 == 0 -> "Buzz"
            else -> item.toString()
        }
        result.add(response)
    }
    return result
}