package com.souzaemerson.mvpapplication.register

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.souzaemerson.mvpapplication.databinding.ActivityRegisterBinding
import com.souzaemerson.mvpapplication.home.HomeActivity
import com.souzaemerson.ui.dialog.genericDialog

class RegisterActivity : AppCompatActivity(), RegisterContract.View {

    private lateinit var binding: ActivityRegisterBinding
    private val registerPresenter by lazy { RegisterPresenter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        registerPresenter.context = this
        registerPresenter.view = this

        with(binding) {
            btnSignup.setOnClickListener {

                val username = etUsername.text.toString()
                val password = etPassword.text.toString()
                val email = etEmail.text.toString()

                registerPresenter.createNewUser(username, password, email)
            }
        }
    }

    override fun showToastOnSuccess(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun showToastError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun showDialogUserExists(title: String, message: String) {
        genericDialog(this, title, message)
    }

    override fun onCompleteRegister() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}