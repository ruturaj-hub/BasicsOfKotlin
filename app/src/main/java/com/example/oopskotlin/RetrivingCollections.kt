package com.example.oopskotlin

fun main(){
    val listofcities = listOf<String>("Hubli","Banglore","Hyderabad","Mumbai","Chennai","Quechua","Delhi","Panji")

    //SLICE
//    println(listofcities.slice(0..5))
//    println(listofcities.slice(0..6 step 3))
//    println(listofcities.slice(setOf(2,4,6)))

    //take and drop
    println("take : ${listofcities.take(4)}") //It didn't dropped the but it took the only first four elements
    println("drop : ${listofcities.drop(4)}") //It dropped the first four elements

    //takewhile and dropwhile
    println("takewhile ${listofcities.takeWhile { it.length >= 5 }}") //Means you can print the list to print while/until it have length greater than 2
    println("dropwhile ${listofcities.dropWhile { it.length >= 6 }}") //Means you can print the list to print drop if length is smaller than six or take it

    //takeLast and dropLast
    println("takeLast : ${listofcities.takeLast(4)}") //It takes the last four of the list.
    println("dropLast : ${listofcities.dropLast(2)}") //It drops the last two of the list.

    //takeLastWhile and dropLastWhile
    println("takeLastWhile : ${listofcities.takeLastWhile { it.get(0) >= 'P' }}")
    println("dropLastWhile : ${listofcities.dropLastWhile { it.get(0) >= 'P' }}")

    //chunked
    println(listofcities.chunked(4)) //This makes the pieces in 4 means two pieces of 4 which is equal to 8
    println("Chunked and then folded : ${listofcities.chunked(2){list: List<String> -> list.fold("") { acc, s -> acc + s.get(0) }}}")
}