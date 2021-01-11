package com.julian.data.di

import com.julian.data.ShoeCounter
import com.julian.data.repository.FakeShoeRepository
import com.julian.data.repository.ShoeRepository

class AppContainer {
    private val shoeCounterFactory: () -> ShoeCounter = { ShoeCounter(0) }

    val shoeRepository: ShoeRepository = FakeShoeRepository(shoeCounterFactory)
}