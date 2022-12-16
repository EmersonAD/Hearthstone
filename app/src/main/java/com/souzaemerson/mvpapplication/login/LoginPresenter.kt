package com.souzaemerson.mvpapplication.login

import android.content.Context
import com.souzaemerson.data.model.user.User
import com.souzaemerson.mvpapplication.R

class LoginPresenter : LoginContract.Presenter {

     lateinit var view: LoginContract.View
     lateinit var context: Context

    override fun checkUsername(username: String): Boolean {
        if (username.length >= 6 && username.isNotEmpty()) {
            return true
        }
        view.showErrorDialog(context.getString(R.string.invalid_username))
        return false
    }

    override fun checkPassword(password: String): Boolean {
        if (password.length >= 8 && password.isNotEmpty()) {
            return true
        }
        view.showErrorDialog(context.getString(R.string.invalid_password))
        return false
    }

    override fun signIn(user: User) {

    }

    override fun signUp() {
        view.goToRegisterActivity()
    }

}