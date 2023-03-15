package com.example.oopskotlin

fun main(){
    val listofcities = listOf<String>("Hubli","Banglore","Hyderabad","Mumbai","Chennai","Quechua","Delhi","Panji")

    println(listofcities.elementAt(4))
    println(listofcities.elementAtOrNull(9)) // It does not gives error even if the index is out of bound
    println(listofcities.elementAtOrElse(10){index -> "No element in the ${index}"})

    println("first : ${listofcities.first()}")
    println("first : ${listofcities.first {it.startsWith("B",ignoreCase = false)}}")
    println("first : ${listofcities.last()}")
}