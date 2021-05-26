package com.example.klab6;

import retrofit2.Call

import retrofit2.http.GET;

interface Api {
    @GET("character")
    fun getRaM(): Call<RaMData>
}
