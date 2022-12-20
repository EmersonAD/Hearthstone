package com.souzaemerson.domain.usecase.byclass

import com.souzaemerson.domain.mapper.CardResponseDomain
import com.souzaemerson.domain.model.CardClassDomain
import com.souzaemerson.domain.repository.cardclass.GetCardByClassRepository
import com.souzaemerson.network.heartstone.model.hearthstone.card.byclass.CardResponse
import retrofit2.Response

class GetCardByPlayerClassUseCaseImpl(
    private val repository: GetCardByClassRepository,
    private val mapper: CardResponseDomain
) : GetCardByPlayerClassUseCase {
    override suspend fun invoke(
        apikey: String,
        playerClass: String,
        locale: String
    ): List<CardClassDomain> {
        val cardResponse =
            repository.getCardByClass(apikey = apikey, playerClass = playerClass, locale = locale)
        return setContentByResponseCode(cardResponse)
    }

    private fun setContentByResponseCode(cardResponse: Response<CardResponse>): List<CardClassDomain> {
        return when (cardResponse.code()) {
            200 -> mapper.transformIntoDomain(cardResponse.body() ?: throw Exception())
            in 400..500 -> throw Exception()
            else -> throw Exception()
        }
    }
}