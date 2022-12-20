package com.souzaemerson.di.infomodule

import com.souzaemerson.data.repository.info.GetHearthstoneInfoRepositoryImpl
import com.souzaemerson.domain.repository.info.GetHearthstoneInfoRepository
import org.koin.dsl.module

val getHearthstoneInfoModule = module {
    single<GetHearthstoneInfoRepository> {
        GetHearthstoneInfoRepositoryImpl(get())
    }
}