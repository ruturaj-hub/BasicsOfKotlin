package com.example.oopskotlin

fun typecheck(b:Any):String{
    val mess:String?
    mess = when (b){
        is Float -> return "Its a float"
        is Int -> return "Its a Int"
        is Double -> return "Its a Double"
        is Char -> return "Its a Char"
        else -> return "Unknown"
    }
}

fun starprint(){
    for (i in 5.downTo(1)){
        for (j in 1.rangeTo(i)){
            print("*")
        }
        println()
    }
    for (k in 1..5){
        for (l in 1.rangeTo(k)){
            print("*")
        }
        println()
    }
}

fun main(){
    println(typecheck(21))
    var a:Int? = 1
    var message:String?

    message = when(a) {
        in 1..12 -> "Just a child"
        in 13..19 -> "Just a Teenager"
        in 20..60 -> "Adult"
        else -> "he is dead"
    }
    starprint()
    println(message)

    //Iterating over an array
    val samplearray = arrayOf(23,45,23,56,34,76,87,45,34,563,2,34,565)
    for (i in samplearray){
        print("$i\t")
    }
    println()
    // Using return
    // This makes the printing excluding 3!!
    listOf(1,2,3,4,5,6,7,8,9,10).forEach {
        if(it==3) return@forEach
        println(it)
    }

    // Using return@forEach
    // This makes the till 7 only
    listOf(1,2,3,4,5,6,7,8,9,10,11,12,23,34,56).forEach {
        if (it==7) return
        print("$it\t")

    }
}