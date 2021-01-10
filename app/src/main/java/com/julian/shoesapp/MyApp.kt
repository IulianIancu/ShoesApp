package com.julian.shoesapp

import android.app.Application
import com.julian.shoesapp.di.AppContainer

class MyApp : Application() {
    val appContainer = AppContainer()
}