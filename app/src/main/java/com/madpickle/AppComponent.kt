package com.madpickle

import com.madpickle.education.MainActivity
import com.madpickle.education.model.Computer
import com.madpickle.education.model.Motherboard
import com.madpickle.education.model.Processor
import com.madpickle.education.model.RAM
import dagger.Component
import dagger.Module
import dagger.Provides

@Component(modules = [AppModule::class])
interface AppComponent {

    fun make(mainActivity: MainActivity)

    val computer: Computer
}

@Module
object AppModule {

    @Provides
    fun provideComputer(
        processor: Processor,
        motherboard: Motherboard,
        ram: RAM
    ) : Computer {
        return  Computer(
            processor = processor,
            motherboard = motherboard,
            ram = ram,
        )
    }

    @Provides
    fun provideProcessor() : Processor {
        return  Processor()
    }
    @Provides
    fun provideMotherboard() : Motherboard {
        return  Motherboard()
    }

    @Provides
    fun provideRAM() : RAM {
        return  RAM()
    }
}