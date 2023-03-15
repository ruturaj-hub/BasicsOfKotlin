package com.example.oopskotlin

open class Vehicle(){
    open fun runsOn(){
        println("Runs on petrol")
    }
}

abstract class Truck(){
    abstract fun RunsON()

    companion object{
        fun getVehicle():Vehicle{
            return object : Vehicle(),Bike{
                override fun RUNSon() {
                    println("This is the message from the companion object which is static of kotlin")
                }

                override fun runsOn() {
                    println("This is the runsOn method of Vehicle class")
                }
            }
        }
    }
}

interface Bike{
    fun RUNSon()
}

fun main(){
    val companionsample = Truck.getVehicle()

    val sampleVehicle = object : Truck(),Bike{
        override fun RUNSon() {
            println("This is RUNSon interface.")
        }

        override fun RunsON() {
            println("Fuel is from truck")
        }

        fun runsOn() {
            println("This is running on object expression")
        }
    }
    println(sampleVehicle is Bike)
    sampleVehicle.RUNSon()
}