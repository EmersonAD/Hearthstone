package com.souzaemerson.domain.usecase.info

import com.souzaemerson.domain.repository.info.GetHearthstoneInfoRepository
import com.souzaemerson.network.heartstone.model.hearthstone.info.InfoResponse
import retrofit2.Response

class GetHearthstoneInfoUseCaseImpl(
    private val repository: GetHearthstoneInfoRepository
) : GetHearthstoneInfoUseCase {
    override suspend fun getAllInformationAboutHearthstone(apikey: String): InfoResponse {
        val response = repository.getHearthstoneInfo(apikey)

        return setContentByResponseCode(response)
    }

    private fun setContentByResponseCode(response: Response<InfoResponse>): InfoResponse {
        return when (response.code()) {
            200 -> response.body() ?: throw Exception()
            in 400..500 -> throw Exception()
            else -> throw Exception()
        }
    }
}