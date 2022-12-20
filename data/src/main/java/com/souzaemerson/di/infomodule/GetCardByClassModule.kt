package com.souzaemerson.di.infomodule

import com.souzaemerson.data.repository.byclass.GetCardByClassRepositoryImpl
import com.souzaemerson.domain.repository.cardclass.GetCardByClassRepository
import org.koin.dsl.module

val getCardByPlayerClass = module {
    single<GetCardByClassRepository> {
        GetCardByClassRepositoryImpl(get())
    }
}