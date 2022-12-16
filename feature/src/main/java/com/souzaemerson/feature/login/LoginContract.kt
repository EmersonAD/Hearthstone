package com.souzaemerson.feature.login

import com.souzaemerson.data.model.user.User

interface LoginContract {
    interface View {
        fun showLoadingDialog()
        fun hideLoadingDialog()
        fun showErrorDialog(message: String)
        fun goToRegisterActivity()
        fun goToHomeActivity()
    }

    interface Presenter {
        fun checkUsername(username: String): Boolean
        fun checkPassword(password: String): Boolean
        fun signIn(user: User)
    }
}