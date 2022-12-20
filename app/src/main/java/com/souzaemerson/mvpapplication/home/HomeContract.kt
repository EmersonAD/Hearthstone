package com.souzaemerson.mvpapplication.home

interface HomeContract {
    interface Presenter {
        fun getHearthstoneInfo(apikey: String)
        fun getCardByClass()
    }

    interface View {
       fun setShimmer()
    }
}