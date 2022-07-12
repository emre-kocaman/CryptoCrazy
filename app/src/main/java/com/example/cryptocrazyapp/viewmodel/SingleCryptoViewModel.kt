package com.example.cryptocrazyapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.cryptocrazyapp.model.SingleCrypto
import com.example.cryptocrazyapp.repository.CryptoRepository
import com.example.cryptocrazyapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class SingleCryptoViewModel @Inject constructor(private val repository: CryptoRepository):ViewModel() {

    suspend fun getSingleCrypto(id: String): Resource<SingleCrypto> {
        return repository.getSingleCrypto(id)
    }


}