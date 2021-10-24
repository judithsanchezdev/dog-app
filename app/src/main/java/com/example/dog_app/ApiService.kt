package com.example.dog_app

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    @GET
    fun getCharacterByName(@Url url:String): Call<DogsResponse>
}