package com.example.cryptocrazyapp.repository

import com.example.cryptocrazyapp.model.CryptoList
import com.example.cryptocrazyapp.model.SingleCrypto
import com.example.cryptocrazyapp.service.CryptoAPI
import com.example.cryptocrazyapp.util.Constants
import com.example.cryptocrazyapp.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import java.lang.Exception
import javax.inject.Inject
import javax.inject.Singleton


@ActivityScoped
class CryptoRepository @Inject constructor(private val api: CryptoAPI) {


    suspend fun getCryptoList(): Resource<CryptoList> {
        val response = try {
            api.getCryptoList(Constants.API_KEY)
        } catch (e: Exception) {
            return Resource.Error(e.message ?: "Error")
        }

        return Resource.Success(response)
    }


    suspend fun getSingleCrypto(id: String): Resource<SingleCrypto> {
        val response = try {
            api.getSingleCrypto(Constants.API_KEY, id)
        } catch (e: Exception) {
            return Resource.Error(e.message ?: "Error")
        }

        return Resource.Success(response)
    }


}