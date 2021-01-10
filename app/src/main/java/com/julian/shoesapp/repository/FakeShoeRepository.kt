package com.julian.shoesapp.repository

import com.julian.shoesapp.data.Shoe
import com.julian.shoesapp.data.ShoeCounter

class FakeShoeRepository(val shoeCounterFactory: () -> ShoeCounter) : ShoeRepository {
    override fun getNewShoe(): Shoe {
        return Shoe("New Shoe", 100, shoeCounterFactory())
    }

    override fun getListOfShoes(): List<Shoe> {
        val shoes = mutableListOf<Shoe>()
        for (shoeCounter in 1..10) {
            shoes.add(getNewShoe())
        }
        return shoes
    }
}