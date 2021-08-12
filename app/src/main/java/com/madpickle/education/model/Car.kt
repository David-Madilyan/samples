package com.madpickle.education.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "mustang_car",indices = [Index(value = ["model", "name"], unique = true)])
data class Car(@PrimaryKey var id: Long,@ColumnInfo(name = "name") var name: String, @ColumnInfo(name = "model") var model: String)
