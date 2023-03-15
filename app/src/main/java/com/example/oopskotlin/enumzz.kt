package com.example.oopskotlin

//ENUM CLASS -> This is the defined category of the parameters.Means we declare here the parameters that we want to allow to the users.
//This class have the feature of ordinal means each defined parameter have its own index number

enum class CoffeeCupSize(val quantity:Int){
    SMALL(100){
        override fun getInfo():String {
            return "You choosed ${this.name} & the quantity is ${quantity}"
        }
    },
    MEDIUM(250){
        override fun getInfo():String {
            return "You choosed ${this.name} & the quantity is ${quantity}"
        }
    },
    LARGE(400){
        override fun getInfo():String {
            return "You choosed ${this.name} & the quantity is ${quantity}"
        }
    },
    EXTRA_LARGE(750){
        override fun getInfo():String {
            return "You choosed ${this.name} & the quantity is ${quantity}"        }
    };

abstract fun getInfo():String
}
//class Order(coffeeCupSize: CoffeeCupSize)
class Order(var count:Int)
fun main(){

}