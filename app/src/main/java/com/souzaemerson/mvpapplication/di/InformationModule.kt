package com.souzaemerson.mvpapplication.di

import com.souzaemerson.di.infomodule.getHearthstoneInfoModule
import com.souzaemerson.domain.di.usecase.getInformationAboutHearthstoneUseCase
import com.souzaemerson.mvpapplication.presentation.home.HomePresenter
import com.souzaemerson.network.di.retrofitModule
import org.koin.core.component.KoinComponent
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

object InformationModule : KoinComponent {

    private val getInformationPresenter = module {
        factory {
            HomePresenter(get(), get())
        }
    }

    fun inject() = loadKoinModules(
        listOf(
            retrofitModule,
            getHearthstoneInfoModule,
            getInformationAboutHearthstoneUseCase,
            getInformationPresenter
        )
    )
}