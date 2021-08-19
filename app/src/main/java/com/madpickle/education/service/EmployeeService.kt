package com.madpickle.education.service

import com.madpickle.education.model.Employee
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

/**
* what is Call generic???????????
* */
interface EmployeeService {
    @GET("/Employee")
    suspend fun getEmployers(@Query("position") order: Int?): Call<List<Employee>>

    @POST("/new/employee")
    suspend fun sendEmployerData(@Query("uuid") order: String?) : Call<Map<String, Any>>
}