package com.example.oopskotlin

fun main(){
    val animal:Animal = Tiger("Cat","Bob","Cozy")
    animal.makesound()
    (animal as Climber).climb() //The (animal as Climber) is called as typecast we needed it here because we declare it,
    //before as a animal:Animal type so new needed it to declare explicitly.

    // Why we can't invoke the method printthevibe(Declared on own by child class Tiger)?
    // Ans -> Because the class instantiated above is of Animal type after the colon so it does not
    // give the invoke to the printthevibe() method as the Tiger class is child so the Animal the parent class
    // will not be aware of its child method that it has created on his own
//    val tiver = Tiger("BOka","bokarao","cozy")
//    tiver.printthevibe()

    //So there is another solution that we can typecast the already created object of Animal class as use it to invoke
    // printthevibe method of Tiger.
    //ALERT WE NEEDED TO TYPECAST THE VARIABLE TO INVOKE THE METHOD
    (animal as Tiger).printthevibe()
}