package com.madpickle.education.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Employee( @PrimaryKey var id: Int, var name: String, var salary: Int)