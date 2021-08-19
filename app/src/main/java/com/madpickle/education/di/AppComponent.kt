package com.madpickle.education

import android.app.Application
import com.madpickle.education.di.AppModule
import com.madpickle.education.di.RoomModule
import com.madpickle.education.repo.AppDatabase
import com.madpickle.education.repo.EmployeeDao
import com.madpickle.education.repo.employee.EmployeeRepo
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
    fun inject(fragment: BlankFragment)

    fun employeeDao(): EmployeeDao

    fun appDatabase(): AppDatabase

    fun employeeRepository(): EmployeeRepo

    fun application(): Application
}
