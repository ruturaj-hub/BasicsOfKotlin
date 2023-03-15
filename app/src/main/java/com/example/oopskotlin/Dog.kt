package com.example.oopskotlin

class Dog:DomesticAnimal("Dog","Rocky") {
    override fun makesound() {
        super.makesound()
        println("${this.animalType} and ${this.petName} from the Dog class")
    }
}