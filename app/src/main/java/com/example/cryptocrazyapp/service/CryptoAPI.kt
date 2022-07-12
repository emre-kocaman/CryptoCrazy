package com.example.cryptocrazyapp.service

import com.example.cryptocrazyapp.model.CryptoList
import com.example.cryptocrazyapp.model.SingleCrypto
import retrofit2.http.GET
import retrofit2.http.Query

/*
const val BASE_URL = "https://api.nomics.com/v1/"
const val BASE_URL = "https://api.nomics.com/v1/currencies/ticker?key=01f08f4244ef917e29025cb2d1a622c0e7351e78&ids=BTC"
const val API_KEY = "01f08f4244ef917e29025cb2d1a622c0e7351e78"*/
interface CryptoAPI {

    @GET("currencies/ticker")
    suspend fun getCryptoList(@Query("key") key: String): CryptoList

    @GET("currencies/ticker")
    suspend fun getSingleCrypto(@Query("key") key: String, @Query("ids") id: String): SingleCrypto

}