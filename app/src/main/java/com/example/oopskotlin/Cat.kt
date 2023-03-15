package com.example.oopskotlin

class Cat(override val animalType: String, override val petName: String,
          override val climberOf: String
):DomesticAnimal(animalType,petName),Climber,Cats {
    override fun makesound() {
        super.makesound()
        println("${this.animalType} & ${this.petName} from the Cat class")
    }

    override fun climb() {
        println("I climb as a cat from the cat class ${climberOf}")
    }
}