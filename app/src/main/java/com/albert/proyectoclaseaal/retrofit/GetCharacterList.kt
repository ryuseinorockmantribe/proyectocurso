package com.albert.proyectoclaseaal.retrofit
import retrofit2.Call
import retrofit2.http.GET


interface GetCharacterList {
    //https://rickandmortyapi.com/api/

    @GET("character")
    fun getCharacters() : Call<GetCharacterResponse>



}