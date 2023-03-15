package com.example.oopskotlin

data class Bloodbank(val fName:String,val lName:String) {
    var gender:String? = null
}
fun main(){
    val me = Bloodbank("VIP","Blooder")
    val (fname,sname) = me //This is destructing of the arguments of me member!
    println(me)

    //Creating new variable to use the copy method of the data class
    var metoo = me.copy(fName = "Idiotic")
    val (FNAME,SNAME) = metoo //Destructing the arguments of the metoo member
    println(metoo)
    println("$fname $sname") //Advantage of having them we can print them in separate line as we want
    println("$FNAME $SNAME")
}