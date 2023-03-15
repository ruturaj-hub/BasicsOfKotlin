package com.example.oopskotlin

fun main() {
    var people = listOf<Personi>(
        Personi("Ruturaj", "Warghade", "Indian", 23),
        Personi("Winusscshe", "Etiyo", "American", 33),
        Personi("Amish", "Patel", "Indian", 53),
        Personi("Varun", "Walia", "Indian", 13),
        Personi("Nachket", "Burani", "Indian", 44),
        Personi("Ashraf", "Gundecha", "Indian", 89),
        Personi("Belvics", "Porkanizer", "British", 34),
        Personi("Vemik", "Wanisher", "Iranian", 11)
    )

    var citystates = buildMap<String,String> {
        put("Rakesh","Jhunjhunwala")
        put("Rachit","Dhaka")
        put("Ramprit","Ayesha")
        put("Bradley","Parker")
        put("Brett","Liveett")
        put("Bruno","Ahuja")
    }

    //Filtering the people list by using list_name.filter operation
    people.filter { it.nationality.equals("Indian")}.forEach { println(it) }
    println()
    people.filter { it.age.equals(23)}.forEach { println(it) }
    println()
    people.filter { it.age > 40 }.forEach { println(it) }

    //Using the filter operation on Map
    citystates.filter { entry -> entry.key.equals("Rakesh") }.forEach { s, s2 -> println("$s,$s2") }

    //Using the filterIndexed
    println()
    people.filterIndexed { index, personi -> index%2==0 && personi.age > 18 }.forEach { println(it) }

    //Using the filterNot operation
    println()
    println("This operator works in reverse manner means it do things that are not allowed to do as we can see we mentioned the ones who have their age greater than" +
            " 25 but it printed who are smaller than 25 this is the feature of filterNot")
    people.filterNot { it.age > 25 }.forEach { println(it.firstName) }

    val animals = listOf<Animal>(Cat("Cat","Couchie","Nails"),Dog(),Tiger("Wild","Nails","Scary"))

    // Here we are getting the subset of DomesticAnimal class
    // Over here we get the values of petName variable which is declared in DomesticAnimal class and is declared in the child class of DomesticAnimal
    // That are Dog and the Cat.
    animals.filterIsInstance<DomesticAnimal>().forEach { println(it.petName) }

    // PARTITION
    //This basically makes the partition of the result in TWO cases.
    //Suppose over here we are going to give the input to get names as the output.
    //Over here the .first is giving us the O/P we want and the .second will give us a O/P which will be the opposite of the actual O/P that we want.
    println()
    people.partition { it.age > 20 }.first.forEach { println(it) }

    //TEST PREDICATES
    //So this are test predicates which are responsible for searching in three styles [any,none,all]
    println()
    //Checks whether is there any surnamed as Gundecha used .any and in curly braces it.lastName.equals("Gundecha")
    println("Is there any one surnamed as Gundecha ${ people.any { it.lastName.equals("Gundecha") }}") //Using any
    //Checks whether is there NO-ONE surnamed as phunsukvangdu used .none and it curly braces same as the above
    println("Is there no one surnamed as phunsukvangdu ${ people.none { it.lastName.equals("phunsukvangdu") }}") //Using none
    //Checks whether are there all persons named as Ruturaj used .all in this case
    println("Is there all named as Ruturaj ${ people.all { it.firstName.equals("Ruturaj") }}") //Using all

    //PLUS AND MINUS
    val listofnames1 = listOf<String>("Anil","Ajay","Aniket")
    val listofnames2 = listOf<String>("George","Json","Michelle")
    val listofnames3 = listOf<String>("Jaden","Veronica","Adam")

    //This is basically merging the list by using + sign and - sign to deduct the one single name out of the list
    val addedlist = listofnames1 + listofnames2
    println(addedlist)
    println(addedlist-"Michelle"-"Json")
}