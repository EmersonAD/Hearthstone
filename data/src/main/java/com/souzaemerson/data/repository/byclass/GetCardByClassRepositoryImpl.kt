package com.souzaemerson.data.repository.byclass

import com.souzaemerson.domain.repository.cardclass.GetCardByClassRepository
import com.souzaemerson.network.heartstone.model.hearthstone.card.byclass.CardResponse
import com.souzaemerson.network.heartstone.service.DoNetworkCall
import retrofit2.Response

class GetCardByClassRepositoryImpl(private val api: DoNetworkCall) : GetCardByClassRepository {
    override suspend fun getCardByClass(
        playerClass: String,
        locale: String,
        apikey: String
    ): Response<CardResponse> = api.getHearthstoneCardByClass(playerClass, apikey, locale)
}