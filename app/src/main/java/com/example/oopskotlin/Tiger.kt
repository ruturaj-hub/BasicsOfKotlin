package com.example.oopskotlin

class Tiger(override val animalType: String, override val climberOf: String,
            override val animalvibe: String):WildAnimal(animalvibe),Climber,Cats {
    override fun makesound() {
        println("I am tiger i roar")
    }

    override fun climb() {
        println("I climb as a tiger from tiger class")
    }
    fun printthevibe(){
        println("The vibe of ${animalType} is ${animalvibe}")
    }
}

