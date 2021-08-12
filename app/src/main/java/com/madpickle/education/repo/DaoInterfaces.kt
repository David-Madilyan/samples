package com.madpickle.education.repo

import androidx.room.*
import com.madpickle.education.model.Car
import com.madpickle.education.model.Employee

@Dao
interface EmployeeDao {
    @Query("SELECT * FROM Employee")
    fun getAll() : List<Employee>

    @Query("SELECT * FROM Employee WHERE id = :id")
    fun getById(id: Long): Employee?

    @Insert
    fun insert(employee: Employee?)

    @Update
    fun update(employee: Employee?)

    @Delete
    fun delete(employee: Employee?)
}

@Dao
interface CarDao {
    @Query("SELECT * FROM mustang_car")
    fun getAll(): List<Car>

    @Insert
    fun insert(car: Car?)

    @Delete
    fun delete(car: Car?)

    @Update
    fun update(car: Car?)


}