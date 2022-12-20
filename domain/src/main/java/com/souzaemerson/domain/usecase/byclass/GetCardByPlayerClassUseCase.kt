package com.souzaemerson.domain.usecase.byclass

import com.souzaemerson.domain.model.CardClassDomain

interface GetCardByPlayerClassUseCase {
    suspend operator fun invoke(
        apikey: String,
        playerClass: String,
        locale: String
    ): List<CardClassDomain>
}