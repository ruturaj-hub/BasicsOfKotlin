package com.example.oopskotlin

import java.util.*

fun main(){
    var sc:Scanner = Scanner(System.`in`)
    var n:Int = sc.nextInt()
    var temp:Int = n
    var result:String = ""
    var last:Int
    var checker:Int = 0

    while (n>0){
        last = n%10
        checker += last*last*last
        n = n/10
    }
    if (temp == checker){
        result = "This is an armstrong number"
    }else{
        result = "This is not an armstrong number"
    }
    println(result)
}