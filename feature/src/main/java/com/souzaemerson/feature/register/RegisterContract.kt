package com.souzaemerson.feature.register

import com.souzaemerson.data.model.user.User

interface RegisterContract {
    interface View {
        fun showDialogOnSuccess(message:String)
        fun showDialogOnError(message: String)
        fun showLoading()
        fun onCompleteRegister()
    }

    interface Presenter {
        fun createNewUser(user: User)
    }
}