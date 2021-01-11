package com.julian.shoesapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.julian.data.repository.ShoeRepository
import com.julian.shoesapp.R
import com.julian.shoesapp.observe

class MainFragment(private val shoeRepository: ShoeRepository) : Fragment() {

    companion object {
        fun newInstance(shoeRepository: ShoeRepository) = MainFragment(shoeRepository)
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.apply {
            observe(listOfShoes, ::onNewListOfShoes)
            observe(latestShoe, ::onNewLatestShoes)
        }

        viewModel.useShoeRepository(shoeRepository)
    }

    private fun onNewListOfShoes(list: List<com.julian.data.Shoe>?) {
        //TODO do something with the shoes
    }

    private fun onNewLatestShoes(shoe: com.julian.data.Shoe?) {
        //TODO do something with shoes
    }

}