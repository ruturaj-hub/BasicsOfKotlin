package com.example.oopskotlin

import java.lang.StringBuilder

class Radio(val frequency:String){
    fun play(){
        print("Playing the radio on : ${frequency}")
    }
}

class Car(val radio: Radio,val carname:String){
    fun printName(){
        print(carname)
    }
    fun Radio.audioDetails(){
        printName()
        print(" : ")
        radio.play()
    }
    fun showCarAudioDetails(){
        radio.audioDetails()
    }
}

class Fuel(val type:String){
    fun burst(){
        print("Bursting ${type} of fuel for combustion")
    }
}
class Biike(val fuel: Fuel,val bikename:String){
    fun printname(){
        print(bikename)
    }
    fun Fuel.fueltype(){
        printname()
        print(" : ")
        fuel.burst()
    }
    fun showBiikeFuelDetails(){
        fuel.fueltype()
    }
}

fun String.toreverse() :String{
    if (this!!.length > 0) {
        var splitString = this.split(" ")
        var newString = StringBuilder()
        for (i in splitString.indices.reversed()) {
            newString.append(splitString[i] + " ")
        }
        return newString.toString()
    }else{
        return this
    }
}

fun Int.toconvert() : Float {
    var num = this.toFloat()
    return num
}

fun String.toreplaceit() : String {
    if (this.length > 0){
        var newString:String = this.replace(".","_",ignoreCase = false)
        return newString
    }
    return this
}

fun String.evenUpper():String {
    if (this.length > 0){
        var newString = StringBuilder()
        for (i in this.indices){
            if (i%2==0) {
                newString.append(this[i].toUpperCase())
            }else{
                newString.append(this[i])
            }
        }
        return newString.toString()
    }else{
        return this
    }
}


fun main(){
    val car = Car(Radio("93.5"),"Evoque")
    car.showCarAudioDetails()
    println()
    val byk = Biike(Fuel("White Petrol"),"Bugaati")
    byk.showBiikeFuelDetails()
    println()
    var smpl = "Ruturaj is honest guy"
    println(smpl.toreverse())
    var a = 2121
    println(a.toconvert())
    var s:String = "R.U.T.U.R.A.J"
    println(s.toreplaceit())
    var g = "ruturaj"
    println(g.evenUpper())
}