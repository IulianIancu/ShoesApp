package com.julian.shoesapp.repository

import com.julian.shoesapp.data.Shoe

interface ShoeRepository {
    fun getNewShoe(): Shoe
    fun getListOfShoes(): List<Shoe>
}