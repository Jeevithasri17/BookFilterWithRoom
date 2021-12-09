package com.example.bookfilterwithroom.data

import com.example.bookfilterwithroom.data.AllBooks

import retrofit2.http.GET

interface BookInterface {
    @GET("/books")
    suspend fun getBooks():List<AllBooks>
}