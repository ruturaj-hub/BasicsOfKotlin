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

    //Map function
    var transformedlistmap = people.map { it.firstName + " " + it.lastName }
    println(transformedlistmap)
    println(people)

    //Using buildMap
    var citystates = buildMap<String,String> {
        put("Rakesh","Jhunjhunwala")
        put("Rachit","Dhaka")
        put("Ramprit","Ayesha")
        put("Bradley","Parker")
        put("Brett","Liveett")
        put("Bruno","Ahuja")
    }
    //Way 1 to print the key-value pair.Using map
    println(citystates.map { entry: Map.Entry<String, String> -> entry.key })

    //Way 2 to print the key-value pair.Using mapKeys
    //map operation DOESN'T GIVES YOU THE CHANGED IT DO NOT WORKS ON THE ORIGINAL ONE AND CHANGES IT. IT ONLY WORKS ON THE COPY OF THAT(buildMap)
    println(citystates.mapKeys { it.key.toUpperCase()})

    /* ZIPPING */
    var liist = listOf<String>("Mumbai","Canada","USA","Russia","Veloca","Uganda","Pondicherry","Yemen")
    println()
    val zippedliist = liist.zip(people)
    println(zippedliist)
    println(zippedliist.unzip()) //Unzipping means separating the both list from each other
    println(zippedliist.unzip().first)
    println(zippedliist.unzip().second)
}