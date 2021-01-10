package com.julian.shoesapp.di

import com.julian.shoesapp.data.ShoeCounter
import com.julian.shoesapp.repository.FakeShoeRepository
import com.julian.shoesapp.repository.ShoeRepository

class AppContainer {
    private val shoeCounterFactory: () -> ShoeCounter = { ShoeCounter(0) }

    val shoeRepository: ShoeRepository = FakeShoeRepository(shoeCounterFactory)
}