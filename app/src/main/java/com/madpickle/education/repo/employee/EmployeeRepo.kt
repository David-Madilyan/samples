package com.madpickle.education.repo.employee

import com.madpickle.education.model.Employee

interface EmployeeRepo {
    fun getAll() : List<Employee>

    fun findById(id: Long = 0) : Employee

    fun deleteEmployee(employee: Employee) : Int

    fun updateEmployee(employee: Employee)
}