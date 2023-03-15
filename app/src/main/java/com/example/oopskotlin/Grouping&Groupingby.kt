package com.example.oopskotlin

fun main(){

    var people = listOf<Personi>(
        Personi("Ruturaj","Warghade","Indian",23),
        Personi("Winusscshe","Etiyo","American",33),
        Personi("Amish","Patel","Indian",53),
        Personi("Varun","Walia","Indian",13),
        Personi("Nachket","Burani","Indian",44),
        Personi("Ashraf","Gundecha","Indian",89),
        Personi("Belvics","Porkanizer","British",34),
        Personi("Vemik","Wanisher","Iranian",11)
    )

    //groupBy
    //this function takes a lambda and returns map
    println("So over here this function made the nationality values in uppercase and at that same time returned the maps" +
            " means the maps related to that particular nationality!")
//    people.groupBy { it.nationality }.forEach { println("${it.key} -> ${it.value}") }

    val groupbyage = people.groupBy { it.age > 18 }
//    println(groupbyage)

    println()
    val groupbyfirstalphabet = people.groupBy { it.firstName.get(0) }
//    println(groupbyfirstalphabet)

    println()
    println("Using the groupingBy\nTo use the eachCount() you need to use the groupingBy")
    val groupingbynationality = people.groupingBy { it.nationality }.eachCount()
//    println(groupingbynationality)

    println()
    val groupingbyage = people.groupingBy { it.age > 18 }.eachCount()
//    println(groupbyage)

    println()
    val transformedmap = people.groupBy(keySelector = {if (it.age > 18) "Major" else "Minor"}, valueTransform = {it})
//    println(transformedmap)

//    people.groupBy(keySelector = {it.firstName+" "+it.age}, valueTransform = {it.firstName + " " + it.lastName}).forEach { println("${it.key} -> ${it.value}") }

    //fold
    println()
//    println("${people.fold(0){ acc, personi -> acc+personi.age }}")

    val listfonumbers = listOf<Int>(3,45,23,12,34,56,67,4,2,123,45,56,67,453)
    println(listfonumbers.fold(0){acc, i -> acc + i })
//    println(listfonumbers.fold(1){acc, i -> acc * i })

    //reduce
    println(listfonumbers.reduce{acc, i -> i + acc })

    //aggregate -> max,min,sum,avg,count
    println(listfonumbers.average())
    println(listfonumbers.sum())
    println(listfonumbers.minOrNull())
    println(listfonumbers.maxOrNull())
    println(listfonumbers.count())
}