package com.souzaemerson.domain.di.usecase

import com.souzaemerson.domain.usecase.info.GetHearthstoneInfoUseCase
import com.souzaemerson.domain.usecase.info.GetHearthstoneInfoUseCaseImpl
import org.koin.dsl.module

val getInformationAboutHearthstoneUseCase = module {
    single<GetHearthstoneInfoUseCase> {
        GetHearthstoneInfoUseCaseImpl(get())
    }
}