package com.souzaemerson.domain.mapper

import com.souzaemerson.domain.model.CardClassDomain
import com.souzaemerson.network.heartstone.model.hearthstone.card.byclass.CardResponseItem

interface CardResponseDomain {
    fun transformIntoDomain(cardResponseList: List<CardResponseItem>): List<CardClassDomain>
}

class CardResponseDomainImpl : CardResponseDomain {
    override fun transformIntoDomain(cardResponseList: List<CardResponseItem>): List<CardClassDomain> =
        cardResponseList.map { cardResponse ->
            CardClassDomain(
                name = cardResponse.name,
                rarity = cardResponse.rarity,
                img = cardResponse.img,
                imgGold = cardResponse.imgGold,
                playerClass = cardResponse.playerClass,
                locale = cardResponse.locale
            )
        }
}

