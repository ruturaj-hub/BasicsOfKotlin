package com.example.oopskotlin

interface Engine{
    fun runsOn()
    fun getTransmissionType()
}

class ElectricEngine:Engine{
    override fun runsOn() {
        println("Runs on the fuel")
    }

    override fun getTransmissionType() {
        println("Runs on sixth gear transmission")
    }
}

class TeslaEngine(val engine: Engine):Engine by engine

fun main(){
    val shample = TeslaEngine(ElectricEngine())
    shample.runsOn()
    shample.getTransmissionType()
}