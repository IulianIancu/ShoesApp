package com.julian.data

data class Shoe(
    val name: String,
    val maxKmWalked: Int,
    var currentKilometerWalked: ShoeCounter
)

class ShoeCounter(startingKm: Int) {
    var currentWalkedKm = startingKm
    fun increment() {
        currentWalkedKm++
    }

    fun getWearAndTear(): Int {
        return currentWalkedKm
    }
}