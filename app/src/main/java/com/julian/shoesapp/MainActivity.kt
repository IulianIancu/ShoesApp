package com.julian.shoesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.julian.shoesapp.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val appContainer = (application as MyApp).appContainer
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance(appContainer.shoeRepository))
                .commitNow()
        }
    }
}