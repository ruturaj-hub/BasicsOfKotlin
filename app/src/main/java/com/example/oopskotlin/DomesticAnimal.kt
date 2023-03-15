package com.example.oopskotlin

open class DomesticAnimal(override val animalType: String,open val petName:String):Animal() {
    override fun makesound() {
        println("Make DomesticAnimal sound")
    }
}