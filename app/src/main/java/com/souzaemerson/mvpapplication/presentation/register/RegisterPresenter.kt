package com.souzaemerson.mvpapplication.presentation.register

import android.content.Context
import android.util.Patterns
import com.souzaemerson.cache.CacheManager
import com.souzaemerson.data.model.user.User
import com.souzaemerson.mvpapplication.R

class RegisterPresenter : RegisterContract.Presenter {

    lateinit var view: RegisterContract.View
    lateinit var context: Context

    override fun checkUsername(username: String): Boolean {
        if (username.length >= 6 && username.isNotEmpty()) {
            return true
        }
        view.showToastError(context.getString(R.string.invalid_username))
        return false
    }

    override fun checkPassword(password: String): Boolean {
        if (password.length >= 8 && password.isNotEmpty()) {
            return true
        }
        view.showToastError(context.getString(R.string.invalid_password))
        return false
    }

    override fun checkEmail(email: String): Boolean {
        if (Patterns.EMAIL_ADDRESS.matcher(email).matches() && email.isNotEmpty()) {
            return true
        }
        view.showToastError(context.getString(R.string.invalid_email))
        return false
    }

    override fun createNewUser(username: String, password: String, email: String) {
        if (checkUsername(username) && checkPassword(password) && checkEmail(email)) {

            val user = User(username = username, password = password, email = email)

            if (CacheManager.exists(username.uppercase())) {
                view.showDialogUserExists("Nome de usuário já existe", context.getString(R.string.user_exists))
            } else {
                CacheManager.put(username.uppercase(), user)
                view.showToastOnSuccess(context.getString(R.string.success_user_register))
                view.onCompleteRegister()
            }
        }
    }
}