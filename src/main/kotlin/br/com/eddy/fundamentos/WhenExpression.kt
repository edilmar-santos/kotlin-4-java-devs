package br.com.eddy.fundamentos

fun main() {
    val pizzasOrdered = 6

    when(pizzasOrdered){
        0 -> println("I`m OK")
        1 -> println("Hungry")
        2,3 -> println("Starving")
        in 5 .. 8 -> println("getting crazy")
        else -> {
            println(" who is counting")
        }
    }

    when {
        pizzasOrdered % 2 == 0 -> println("Even pizzas ordered")
        pizzasOrdered % 2 == 1 -> println("Odd pizzas ordered")
    }
}