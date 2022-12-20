package com.souzaemerson.mvpapplication.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.souzaemerson.core.state.State
import com.souzaemerson.domain.usecase.info.GetHearthstoneInfoUseCase
import com.souzaemerson.network.heartstone.model.hearthstone.info.InfoResponse
import kotlinx.coroutines.*

class HomePresenter(
    private val infoUseCase: GetHearthstoneInfoUseCase
) : HomeContract.Presenter {

    private lateinit var view: HomeContract.View

    private var _information = MutableLiveData<State<InfoResponse>>()
    val information: LiveData<State<InfoResponse>> = _information

    override fun getHearthstoneInfo(apikey: String) {
        try {
            CoroutineScope(Dispatchers.Main).launch {
                _information.value = State.loading(true)
                withContext(Dispatchers.IO) {
                    infoUseCase.getAllInformationAboutHearthstone(apikey)
                }.let { infoResponse ->
                    _information.value = State.success(infoResponse)
                    _information.value = State.loading(false)
                }
            }
        } catch (e: Exception) {
            _information.value = State.error(e)
            _information.value = State.loading(false)
        }
    }

    override fun getCardByClass() {
        TODO("Not yet implemented")
    }
}