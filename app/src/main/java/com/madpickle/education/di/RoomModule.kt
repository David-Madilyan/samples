package com.madpickle.education.di

import android.app.Application
import androidx.room.Room
import com.madpickle.education.repo.AppDatabase
import com.madpickle.education.repo.EmployeeDao
import com.madpickle.education.repo.employee.EmployeeDataSource
import com.madpickle.education.repo.employee.EmployeeRepo
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton


@Module
class RoomModule @Inject constructor(mApplication: Application) {
    private var database : AppDatabase = Room
            .databaseBuilder(mApplication, AppDatabase::class.java, "demo-db")
            .build()

    @Singleton
    @Provides
    fun providesRoomDatabase(): EmployeeDao? {
        return database.getEmployeeDao()
    }

    @Singleton
    @Provides
    fun employeeRepository(employeeDao: EmployeeDao): EmployeeRepo {
        return EmployeeDataSource(employeeDao)
    }
}