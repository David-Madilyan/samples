package com.madpickle.education

import android.app.Application
import androidx.room.Room
import com.madpickle.education.repo.AppDatabase

class App : Application() {
    private lateinit var instance : App
    private lateinit var  database : AppDatabase

    override fun onCreate() {
        super.onCreate()
        instance = this
        database = Room.databaseBuilder(this, AppDatabase::class.java, "some_name").build()
    }

    fun getInstance(): App {
        return instance
    }
    fun getDatabase(): AppDatabase {
        return  database
    }
}