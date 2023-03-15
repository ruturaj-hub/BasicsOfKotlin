package com.example.oopskotlin

//The motto behind this was that the absence of annotation @JvmInline and value class will lead the creation of two
//different objects that are resource intensive as we know that creation of the object takes time and memory consuming
//Instead of this tedious amount of effort we deal this by having @JvmInline and value class which makes the object
//of PRIMARY VALUE TYPE which will make these both lighweight and program run much more faster.

@JvmInline
value class TimePeriod private constructor(
    val milliseconds:Long
) {
    companion object{
        fun millis(milliseconds: Long) = TimePeriod(milliseconds)
        fun second(seconds:Long) = TimePeriod(seconds * 1000)
    }
}

fun displayTimePeriod(message:String,timePeriod: TimePeriod){
    println("${message} in ${timePeriod.milliseconds} will be here")
    println("The hashcode of the millisecond is ${timePeriod.hashCode()}")
}

fun main(){
    displayTimePeriod("Ruturaj", TimePeriod.millis(2000))
    displayTimePeriod("Sandesh", TimePeriod.second(2))
}