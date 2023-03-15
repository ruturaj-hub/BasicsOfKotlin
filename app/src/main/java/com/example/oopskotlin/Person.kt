package com.example.oopskotlin

class Manus(val name:String?,
             var address:Address?){
    inner class Address(val buildingNumber:Int,
    val streetName:String?,
    val locality:String?,
    val pincode:String?){
        val contextName = name
        fun displayAddress(){
            println("$contextName lives in $streetName is where he live in $locality under the pincode $pincode")
        }
    }
}

fun main(){
    val m = Manus("Anil",null)
    m.address = m.Address(123,"Budwest street","Boston","342l2")
    m.address?.displayAddress()
}