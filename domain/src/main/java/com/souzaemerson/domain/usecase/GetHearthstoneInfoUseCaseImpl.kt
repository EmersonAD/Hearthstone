package com.souzaemerson.domain.usecase

import com.souzaemerson.network.heartstone.model.hearthstone.info.InfoResponse

interface GetHearthstoneInfoUseCaseImpl {
    fun getAllInformationAboutHearthstone(apikey: String): List<InfoResponse>
}