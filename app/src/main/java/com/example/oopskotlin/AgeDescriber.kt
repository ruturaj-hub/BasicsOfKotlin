package com.example.oopskotlin

fun interface AgeDescriber {
    fun ageDescription(person:Person):Unit
}

//class AgeDescribeImplementer:AgeDescriber()

class Person(val name:String,val age:Int)

fun ageDescriber(people: List<Person>,ageDescriber: AgeDescriber){
    people.forEach { ageDescriber.ageDescription(it) }
}

fun main(){
    val people = listOf<Person>(
        Person("Anil Deshpande",40),
        Person("Anamika",14),
        Person("Rakesh",25)
    )
    //SAM CONVERSION
    ageDescriber(people) { person ->
        val ageDescriptor = if (person.age < 13) "Child"
        else if (person.age in 13..19) "Teenager"
        else if (person.age in 20..60) "Adult"
        else "Senior Citizen"

        println("${person.name} is $ageDescriptor his age is ${person.age}")
    }
}