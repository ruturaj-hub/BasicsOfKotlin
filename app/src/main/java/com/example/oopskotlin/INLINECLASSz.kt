package com.example.oopskotlin

//Inline classes are a subset of value based classes.They don't have an identity and can only hold values.

inline class Width(val width: Long)
inline class Height(val height: Long)

inline class Name(val fname:String)
inline class SName(val sname:String)

class Rectangle(width:Width,height:Height){
    private val width:Width? = width
    private val height:Height? = height

    fun printit(){
        println("${this.width} is the horizontal one and ${this.height} is the vertical one")
    }
}

class Identity(name:Name,lname:SName){
    private val name:Name? = name
    private val lname:SName? = lname

    fun printitall(){
        println("His name was ${this.name} ${this.lname}")
    }
}

fun main(){
    val width = Width(100L)
    val height = Height(50L)
    var r = Rectangle(width,height)
    r.printit()

    val nameo = Name("Ruturaj")
    val lasteo = SName("Warghade")
    val s = Identity(nameo,lasteo)
    s.printitall()
}