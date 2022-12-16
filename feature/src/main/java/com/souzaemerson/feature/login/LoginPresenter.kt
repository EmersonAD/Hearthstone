package com.souzaemerson.feature.login

import android.content.Context
import android.widget.Toast
import com.souzaemerson.data.model.user.User
import com.souzaemerson.feature.R

class LoginPresenter : LoginContract.Presenter {

    private lateinit var view: LoginContract.View
    private lateinit var context: Context

    override fun checkUsername(username: String): Boolean {
        if (username.length >= 6 && username.isNotEmpty()) {
            return true
        }
        Toast.makeText(context, context.getString(R.string.invalid_username), Toast.LENGTH_SHORT)
            .show()
        return false
    }

    override fun checkPassword(password: String): Boolean {
        if (password.length >= 6 && password.isNotEmpty()) {
            return true
        }
        Toast.makeText(context, context.getString(R.string.invalid_password), Toast.LENGTH_SHORT)
            .show()
        return false
    }

    override fun signIn(user: User) {

    }
}