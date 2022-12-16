package com.souzaemerson.mvpapplication.login

import com.souzaemerson.data.model.user.User

interface LoginContract {
    interface View {
        fun showErrorDialog(message: String)
        fun goToRegisterActivity()
        fun goToHomeActivity()
    }

    interface Presenter {
        fun checkUsername(username: String): Boolean
        fun checkPassword(password: String): Boolean
        fun signIn(user: User)
        fun signUp()
    }
}