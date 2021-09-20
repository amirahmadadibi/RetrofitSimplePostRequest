package com.example.landscapedetecated.network

import com.example.landscapedetecated.model.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RestApiServices {

    fun addUser(userData: User, onResult: (User?) -> Unit) {
        val retrofit = ServiceBuilder.buildService(RestApi::class.java)

        retrofit.addUser(userData).enqueue(object : Callback<User> {
            override fun onResponse(call: Call<User>, response: Response<User>) {
                onResult(response.body())
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                onResult(null)
            }

        })
    }
}