package com.souzaemerson.mvpapplication.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.souzaemerson.core.state.State
import com.souzaemerson.domain.model.CardClassDomain
import com.souzaemerson.domain.usecase.byclass.GetCardByPlayerClassUseCase
import com.souzaemerson.domain.usecase.info.GetHearthstoneInfoUseCase
import com.souzaemerson.network.heartstone.model.hearthstone.info.InfoResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HomePresenter(
    private val infoUseCase: GetHearthstoneInfoUseCase,
    private val cardClassUseCase: GetCardByPlayerClassUseCase
) : HomeContract.Presenter {

    private lateinit var view: HomeContract.View

    private var _information = MutableLiveData<State<InfoResponse>>()
    val information: LiveData<State<InfoResponse>> = _information

    private var _cardClass = MutableLiveData<State<List<CardClassDomain>>>()
    val cardClass: LiveData<State<List<CardClassDomain>>> = _cardClass

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

    override fun getCardByClass(apikey: String, playerClass: String, locale: String) {
        CoroutineScope(Dispatchers.Main).launch {
            try {
                _cardClass.value = State.loading(true)
                withContext(Dispatchers.IO) {
                    cardClassUseCase.invoke(apikey, playerClass, locale)
                }.let {
                    _cardClass.value = State.success(it)
                    _cardClass.value = State.loading(false)
                }
            } catch (e: Exception) {
                _cardClass.value = State.error(e)
                _cardClass.value = State.loading(false)
            }
        }
    }
}