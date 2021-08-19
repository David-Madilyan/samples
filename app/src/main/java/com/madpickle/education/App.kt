package com.madpickle.education

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.madpickle.education.repo.AppDatabase

class App : Application() {
    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }

}

val Context.appComponent: AppComponent
    get() = when (this) {
        is App -> appComponent
        else -> applicationContext.appComponent
    }