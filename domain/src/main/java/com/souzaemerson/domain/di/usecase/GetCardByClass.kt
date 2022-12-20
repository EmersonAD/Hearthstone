package com.souzaemerson.domain.di.usecase

import com.souzaemerson.domain.usecase.byclass.GetCardByPlayerClassUseCase
import com.souzaemerson.domain.usecase.byclass.GetCardByPlayerClassUseCaseImpl
import org.koin.dsl.module

val getCardByClassModule = module {
    single<GetCardByPlayerClassUseCase> {
        GetCardByPlayerClassUseCaseImpl(get(), get())
    }
}