package com.example.infocovid_19novenia.api

import com.example.infocovid_19novenia.model.IndonesiaResponse
import com.example.infocovid_19novenia.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("indonesia")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET("indonesia/provinsi")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}