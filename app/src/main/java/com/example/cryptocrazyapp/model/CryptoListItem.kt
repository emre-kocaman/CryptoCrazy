package com.example.cryptocrazyapp.model

data class CryptoListItem(
    val currency: String,
    val id: String,
    val logo_url: String,
    val name: String,
    val price: String,
    val symbol: String,
)