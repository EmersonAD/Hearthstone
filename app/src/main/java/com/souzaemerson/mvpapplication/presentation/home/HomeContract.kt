package com.souzaemerson.mvpapplication.presentation.home

import java.util.Locale

interface HomeContract {
    interface Presenter {
        fun getHearthstoneInfo(apikey: String)
        fun getCardByClass(apikey: String, playerClass: String, locale: String)
    }

    interface View {
        fun showShimmer(isLoading: Boolean)
    }
}