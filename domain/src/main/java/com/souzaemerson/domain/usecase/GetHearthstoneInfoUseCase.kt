package com.souzaemerson.domain.usecase

import com.souzaemerson.network.heartstone.model.hearthstone.info.InfoResponse

interface GetHearthstoneInfoUseCase {
    suspend fun getAllInformationAboutHearthstone(apikey: String): InfoResponse
}