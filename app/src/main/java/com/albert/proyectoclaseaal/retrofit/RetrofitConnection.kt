package com.albert.proyectoclaseaal.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitConnection {

    val retrofit  = Retrofit.Builder().apply {
        baseUrl("https://rickandmortyapi.com/api/")
        addConverterFactory(GsonConverterFactory.create())
    }.build()

    val apiService: GetCharacterList = retrofit.create(GetCharacterList::class.java)

}