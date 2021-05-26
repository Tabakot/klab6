package com.example.klab6

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkService {
    private val BASE_URL = "https://rickandmortyapi.com/api/"
    private var retrofit = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getApi(): Api {
        return retrofit.create(Api::class.java)
    }

}