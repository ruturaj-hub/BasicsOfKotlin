package com.example.oopskotlin

fun main(args: Array<String>){
    //Null Safety
    //Nullable operator(?) -> This checks whether the variable is null or not
    //Elvis operator(?:) > This checks whether the variable is null or not if its not it continues if it is it returns a string which we need to give implicitly
    var a:Any = 2.1 ?: "its null"
//    a = null
    println(a)

    var b:Int? = 32

    var stringo:String? = null
    var lengtho = stringo?.length ?: "its null bruh"
    println(stringo)
    println(lengtho)

    //This is the null safe type casting
    b = a as? Int
    println(b)
}