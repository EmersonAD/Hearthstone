package com.souzaemerson.domain.repository.cardclass

import com.souzaemerson.network.heartstone.model.hearthstone.card.byclass.CardResponse
import retrofit2.Response

interface GetCardByClassRepository {
    suspend fun getCardByClass(
        playerClass: String,
        locale: String,
        apikey: String
    ): Response<CardResponse>
}