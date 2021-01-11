package com.julian.data.repository

import com.julian.data.Shoe

interface ShoeRepository {
    fun getNewShoe(): Shoe
    fun getListOfShoes(): List<Shoe>
}