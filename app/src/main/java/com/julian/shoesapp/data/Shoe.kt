package com.julian.shoesapp.data

data class Shoe(
    val name: String,
    val maxKmWalked: Int,
    var currentKilometerWalked: ShoeCounter
)

class ShoeCounter {
    var currentWalkedKm: Int = 0
    fun increment() {
        currentWalkedKm++
    }

    fun getWearAndTear(): Int {
        return currentWalkedKm
    }
}