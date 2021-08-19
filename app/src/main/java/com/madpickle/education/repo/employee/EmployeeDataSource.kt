package com.madpickle.education.repo.employee

import com.madpickle.education.model.Employee
import com.madpickle.education.repo.EmployeeDao
import javax.inject.Inject

class EmployeeDataSource @Inject constructor(var employeeDao: EmployeeDao) : EmployeeRepo {

    override fun getAll(): List<Employee> {
        return employeeDao.getAll()
    }

    override fun findById(id: Long): Employee {
        return employeeDao.getById(id)
    }

    override fun deleteEmployee(employee: Employee): Int {
        return employeeDao.delete(employee)
    }

    override fun updateEmployee(employee: Employee) {
        return  employeeDao.update(employee)
    }
}