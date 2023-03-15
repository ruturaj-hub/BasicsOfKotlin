package com.example.oopskotlin

fun main(){
    //IMMUTABLES MAP

    val nameslist = mapOf<String,String>("Ruturaj" to "Warghade","Rashmika" to "Mandanna")
    // Way 1 to print the map
//    for (i in nameslist){
//        println("${i.key} => ${i.value}")
//    }
    // Way 2 to print the map
//    for ((key,value) in nameslist){
//        println("$key => $value")
//    }
    // Way 3 to print the map using forEach()
    //nameslist.forEach { key, value -> println("$key => $value") }
    //println(nameslist)

    //Using iterator on map
    var mapitera = nameslist.iterator()
    while (mapitera.hasNext()){
        val item = mapitera.next()
        print("${item.key} => ${item.value} ")
    }

    var nameo = buildMap<String,String> {
        put("Rakesh","Jhunjhunwala")
        put("Rachit","Dhaka")
        put("Ramprit","Ayesha")
        put("Bradley","Parker")
    }
    println()
    println(nameo)

    //This listOf over here the duplicates are allowed
    var listio = listOf<String>("Ranchester","Tinnie","Quechua","Norton","Norton")
    println(listio.indexOf("Norton"))
    println(listio)

    var setuse = setOf<String>("Yemen","Eren","Mikasa","Levi","Armin")
    println(setuse)

    //----------------------------------------------------------------------------------------//

    //MUTABLES

    //this is mutable map of no duplicates are allowed
    var nameso = mutableSetOf<String>("Naomi","Matts","Walter","Oprah","Hiddleston")
    nameso.add("Honey")
    nameso.add("Honey") //duplicates are not allowed
    nameso.remove("Matts") //Using remove ALERT IT ONLY WORKS WITH mutableSetOf
    //Usage of iterator object to iterate over a set
    var NameIterator = nameso.iterator()
    while (NameIterator.hasNext()){
        print("${NameIterator.next()} ")
    }
    //println(nameso)
}