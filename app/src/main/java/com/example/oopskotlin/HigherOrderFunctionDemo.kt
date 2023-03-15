package com.example.oopskotlin


fun priceCalculator(coffeeCupSize: CoffeeCupSize):(Order) -> Float{
    when(coffeeCupSize){
        CoffeeCupSize.SMALL -> return { order -> order.count * 1.0f }
        CoffeeCupSize.MEDIUM -> return { order -> order.count * 1.5f }
        CoffeeCupSize.LARGE -> return { order -> order.count * 2.5f }
        CoffeeCupSize.EXTRA_LARGE -> return { order -> order.count * 3.5f }
    }
}

fun main(){
    var order = listOf(
        Pair(CoffeeCupSize.LARGE,Order(5)),
        Pair(CoffeeCupSize.EXTRA_LARGE,Order(2)),
        Pair(CoffeeCupSize.SMALL,Order(9)),
        Pair(CoffeeCupSize.MEDIUM,Order(7))
    )

    println("Get total cost orders ${getTotalOrders(order)}")
}

fun getTotalOrders(order: List<Pair<CoffeeCupSize, Order>>):Float {
    var sum = 0f
    order.forEach { priceCalculator(it.first).invoke(it.second).also { sum += it } }
    return sum
}