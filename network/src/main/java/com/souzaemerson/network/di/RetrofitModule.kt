package com.souzaemerson.network.di

import com.google.gson.GsonBuilder
import com.souzaemerson.network.heartstone.service.DoNetworkCall
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val retrofitModule = module {
    single {

        val gson = GsonBuilder().setLenient().create()
        val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

        Retrofit.Builder()
            .baseUrl("https://omgvamp-hearthstone-v1.p.rapidapi.com")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build()
            .create(DoNetworkCall::class.java)
    }
}