package com.souzaemerson.data.repository.info

import com.souzaemerson.domain.repository.info.GetHearthstoneInfoRepository
import com.souzaemerson.network.heartstone.model.hearthstone.info.InfoResponse
import com.souzaemerson.network.heartstone.service.DoNetworkCall
import retrofit2.Response

class GetHearthstoneInfoRepositoryImpl(private val api: DoNetworkCall) : GetHearthstoneInfoRepository {
    override suspend fun getHearthstoneInfo(apikey: String): Response<InfoResponse> =
        api.getHearthstoneInfo(apikey)
}