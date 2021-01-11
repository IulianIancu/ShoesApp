package com.julian.shoesapp.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.julian.data.Shoe
import com.julian.data.repository.ShoeRepository

class MainViewModel : ViewModel() {
    var shoeRepository: ShoeRepository? = null

    private val _listOfShoes: MutableLiveData<List<Shoe>> = MutableLiveData()
    private val _latestShoe: MutableLiveData<Shoe> = MutableLiveData()

    val listOfShoes: LiveData<List<Shoe>> = _listOfShoes
    val latestShoe: LiveData<Shoe> = _latestShoe

    fun useShoeRepository(shoeRepository: ShoeRepository) {
        this.shoeRepository = shoeRepository
        refreshShoes()
    }

    fun refreshShoes() {
        shoeRepository?.let {
            _listOfShoes.postValue(it.getListOfShoes())
            _latestShoe.postValue(it.getNewShoe())
        }

    }

}