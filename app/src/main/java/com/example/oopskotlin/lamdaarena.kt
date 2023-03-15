package com.example.oopskotlin

//BASIC SEMANTIC OF CREATING LAMBDA
//  val lambda_name:(types of arguments) -> return_type = {arguments -> body/actual implementation/logic}

//Simple basic lambda function
val add:(Int,Int) -> Int = {a:Int,b:Int -> a+b}

//Lambda function using the (it) well known as Short hand notation
val Add:(Int) -> Int = {it + it}

//Using the ignoring parameter(_) in the arguments of the the lambda function
val lambdaparam:(String,String,String) -> Unit = { fname:String, _:String, lname:String -> println("${fname} ${lname}")}
//Now suppose we don't the middle name to display or to be asked in the arguments at such time instead of deleting
//all the mname related things we should use _ as a ignoring parameter

//lambda functions with multiple return statements
//lambda age description demo below

fun ageDescriptionfun(age:Int):String{
    if (age<13) return "Child"
    else if (age in 13..19) return "Teenage"
    else if (age in 20..60) return "Adult"
    else return "Senior citizen"
}
//here desc@ is used as mechanism this is basically a named lambda here desc@ is named type of lambda
val age:(Int) -> String = desc@ { age:Int ->
    if (age<13) return@desc "Child"
    else if(age in 13..19) return@desc "Teenage"
    else if(age in 20..60) return@desc "Adult"
    else return@desc "Senior citizen"
}

//Using the lambda for destructuring the pair
//Using Pair (Key,Value)

val nationCapital1: Pair<String,String> = Pair("New Delhi","India")
val nationCapital2: Pair<String,String> = Pair("Colombo","Srilanka")
val nationCapital3: Pair<String,String> = Pair("Kenya","Africa")

//creating lambda with destructors
val printcapitals:(Pair<String,String>) -> Unit = {pair -> println("${pair.first} is the capital of ${pair.second}") }

val listcapital = listOf<Pair<String,String>>(nationCapital1, nationCapital2, nationCapital3)


fun main(){
    println(Add(8))
    println(add(5,8))
    println(age(19))
    lambdaparam("Ruturaj","Rupesh","Warghade")
    listcapital.forEach(printcapitals)
    println()
    printKeyValuePairs(listcapital, printcapitals)
    //This below is the trailing lambda syntax
    println()
    printKeyValuePairs(listcapital) { pair -> println("${pair.first} is the capital of ${pair.second}") }

    //Example no.2 of having the trailing lambda
    val listofNumbers = listOf<Int>(23,45,28,35,46,340,6,56,22,12,546,553,24,33,5465,6,7,45,212,3435,4)
    val evennumber = listofNumbers.filter { it%2==0 }
    println("The filtered numbers are: ${evennumber}")
}

//Passing the lambda as a argument in the function
fun printKeyValuePairs(keyvaluepairlist:List<Pair<String,String>>,lambda:(Pair<String,String>) -> Unit):Unit{
    keyvaluepairlist.forEach(lambda)
}