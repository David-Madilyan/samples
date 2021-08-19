package com.madpickle.education.di

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton




@Module(includes = [NetworkModule::class, DataBaseModule::class])
class AppModule @Inject constructor(private var mApplication: Application){

    @Provides
    @Singleton
    fun providesApplication(): Application {
        return mApplication
    }

}

@Module(includes = [RoomModule::class])
class DataBaseModule

@Module(includes = [RetrofitModule::class])
class NetworkModule