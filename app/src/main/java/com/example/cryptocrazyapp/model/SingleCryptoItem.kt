package com.example.cryptocrazyapp.model

data class SingleCryptoItem(
    val currency: String,
    val id: String,
    val logo_url: String,
    val name: String,
    val price: String,
    val symbol: String,
)