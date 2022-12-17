package com.souzaemerson.mvpapplication.login

interface LoginContract {
    interface View {
        fun onSuccess(message: String)
        fun showErrorDialog(message: String)
        fun goToRegisterActivity()
        fun goToHomeActivity()
    }

    interface Presenter {
        fun checkUsername(username: String): Boolean
        fun checkPassword(password: String): Boolean
        fun signIn(username: String, password: String)
        fun signUp()
    }
}