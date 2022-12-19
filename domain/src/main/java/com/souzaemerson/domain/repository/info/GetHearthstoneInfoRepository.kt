package com.souzaemerson.domain.repository.info

import com.souzaemerson.network.heartstone.model.hearthstone.info.InfoResponse
import retrofit2.Response

interface GetHearthstoneInfoRepository {
    suspend fun getHearthstoneInfo(apikey: String): Response<InfoResponse>
}