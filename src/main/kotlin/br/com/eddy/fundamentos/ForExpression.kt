package br.com.eddy.fundamentos

fun main(){

    for (ch in "car"){
        println("letter: $ch")
    }

    for ((index, item) in 10.rangeTo(20).step(2).withIndex()){
        println("At index $index, value: $item")
    }

    // instead of u take control of index u my use the property index to return a valid array`s index
    val myArray = arrayOf(10,20,30,40,50)
    for (item in myArray.indices){
        println("At index $item, value: ${myArray[item]}")
    }
}