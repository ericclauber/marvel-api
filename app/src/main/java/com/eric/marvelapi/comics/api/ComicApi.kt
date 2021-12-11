package com.eric.marvelapi.comics.api

import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ComicApi {

    @Headers("Content-Type: appication/json")
    @GET("v1/public/comics")
    fun getComics(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int,
        @Query("ts") timestamp: String,
        @Query("apikey") apikey: String,
        @Query("hash") hash: String
    ): Flow<Response>
}