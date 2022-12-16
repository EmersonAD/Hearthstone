package com.souzaemerson.mvpapplication.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.souzaemerson.mvpapplication.databinding.ActivityLoginBinding
import com.souzaemerson.mvpapplication.home.MainActivity
import com.souzaemerson.mvpapplication.register.RegisterActivity

class LoginActivity : AppCompatActivity(), LoginContract.View {

    private lateinit var binding: ActivityLoginBinding
    private val loginPresenter = LoginPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loginPresenter.view = this
        loginPresenter.context = this

        onRegisterClick()
    }

    private fun onRegisterClick() {
        binding.btnSignUp.setOnClickListener {
            loginPresenter.signUp()
        }
    }

    override fun showErrorDialog(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun goToRegisterActivity() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    override fun goToHomeActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}