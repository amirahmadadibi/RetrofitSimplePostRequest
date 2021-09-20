package com.example.landscapedetecated.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceBuilder {
    private val client = OkHttpClient.Builder().build()
    private val baseUrl = "https://jsonplaceholder.typicode.com/"

                private val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl) // change this IP for testing by your actual machine IP
            .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    fun<T> buildService(service: Class<T>): T{
        return retrofit.create(service)
    }
}