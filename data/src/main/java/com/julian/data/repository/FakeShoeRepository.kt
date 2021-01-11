package com.julian.data.repository

import com.julian.data.Shoe
import com.julian.data.ShoeCounter

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