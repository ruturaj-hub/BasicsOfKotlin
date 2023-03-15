package com.example.oopskotlin

import java.util.*

fun main(){
    var lis = LinkedList<String>()
    lis.add("Ohio")
    lis.add("California")
    lis.add("Out west")
    lis.add("Alaska")
    print(lis)

    var i:Iterator<String> = lis.iterator()
    while (i.hasNext()){
        println(i.next())
    }
}