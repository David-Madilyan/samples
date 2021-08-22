package com.madpickle.education.model

class Processor{
    override fun toString(): String = "Intel core I7"
}

class Motherboard{
    override fun toString(): String = "MSI 9300"
}

class RAM{
    override fun toString(): String = "8 GB"
}

data class Computer(
    val processor: Processor,
    val motherboard: Motherboard,
    val ram: RAM
)