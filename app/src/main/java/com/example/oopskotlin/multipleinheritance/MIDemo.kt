package com.example.oopskotlin.multipleinheritance

interface A {
    fun foo()
}

interface B:A {
    override fun foo() {
        println("B from A")
    }
}

interface C: A {
    override fun foo() {
        println("C from A")
    }
}

class D:B,C {
    override fun foo() {
        super<C>.foo()
        super<B>.foo()
        println("From D")
    }
}

fun main(){
    val depp = D()
    depp.foo()
}