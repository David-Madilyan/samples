package com.madpickle.education.repo

import androidx.room.Database
import androidx.room.RoomDatabase
import com.madpickle.education.model.Employee

@Database(entities = [Employee::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getEmployeeDao(): EmployeeDao
    abstract fun carDao(): CarDao
}