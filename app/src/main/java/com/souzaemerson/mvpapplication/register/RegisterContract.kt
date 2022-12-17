package com.souzaemerson.mvpapplication.register


interface RegisterContract {
    interface View {
        fun showToastOnSuccess(message:String)
        fun showToastError(message: String)
        fun showDialogUserExists(title: String, message: String)
        fun onCompleteRegister()
    }

    interface Presenter {
        fun checkUsername(username: String): Boolean
        fun checkPassword(password: String): Boolean
        fun checkEmail(email: String): Boolean
        fun createNewUser(username: String, password: String, email: String)
    }
}