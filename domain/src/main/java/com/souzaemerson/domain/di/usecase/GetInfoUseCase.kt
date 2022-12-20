package com.souzaemerson.domain.di.usecase

import com.souzaemerson.domain.usecase.GetHearthstoneInfoUseCase
import com.souzaemerson.domain.usecase.GetHearthstoneInfoUseCaseImpl
import org.koin.dsl.module

val getInformationAboutHearthstoneUseCase = module {
    single<GetHearthstoneInfoUseCase> {
        GetHearthstoneInfoUseCaseImpl(get())
    }
}