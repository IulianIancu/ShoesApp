package com.julian.shoesapp

import android.app.Application
import com.julian.data.di.AppContainer

class MyApp : Application() {
    val appContainer = AppContainer()
}