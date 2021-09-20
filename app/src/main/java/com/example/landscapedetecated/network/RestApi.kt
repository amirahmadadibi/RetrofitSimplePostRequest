package com.example.landscapedetecated.network

import com.example.landscapedetecated.model.User
import retrofit2.Call

import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface RestApi {

    @Headers("Content-Type: application/json")
    @POST("posts")
    fun addUser(@Body userData: User): Call<User>
}