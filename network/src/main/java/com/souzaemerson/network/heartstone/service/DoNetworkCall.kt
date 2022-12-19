package com.souzaemerson.network.heartstone.service

import com.souzaemerson.network.heartstone.model.hearthstone.card.byclass.CardResponse
import com.souzaemerson.network.heartstone.model.hearthstone.info.InfoResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface DoNetworkCall {

    @GET("/info")
    suspend fun getHearthstoneInfo(
        @Query("apikey") apikey: String
    ): Response<InfoResponse>

    @GET("/cards/classes/{clazz}")
    suspend fun getHearthstoneCardByClass(
        @Path("class") playerClass: String,
        @Query("apikey") apikey: String,
        @Query("locale") locale: String
    ): Response<CardResponse>
}