package com.madpickle.education.di

import com.madpickle.education.service.EmployeeService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit


@Module
class RetrofitModule {

    @Provides
    fun provideEmployeeService(): EmployeeService {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://employee.dev/service")
                .build()
        return retrofit.create(EmployeeService::class.java)
    }
}