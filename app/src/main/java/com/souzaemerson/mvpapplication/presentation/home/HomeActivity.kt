package com.souzaemerson.mvpapplication.presentation.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.souzaemerson.core.state.Status
import com.souzaemerson.mvpapplication.R
import com.souzaemerson.mvpapplication.di.InformationModule
import org.koin.android.ext.android.inject

class HomeActivity : AppCompatActivity() {

    private val presenter by inject<HomePresenter>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)

        init()
    }

    private fun init() {
        InformationModule.inject()
    }
}