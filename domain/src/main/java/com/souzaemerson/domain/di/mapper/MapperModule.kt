package com.souzaemerson.domain.di.mapper

import com.souzaemerson.domain.mapper.CardResponseDomain
import com.souzaemerson.domain.mapper.CardResponseDomainImpl
import org.koin.dsl.module

val setMapperModule = module {
    single<CardResponseDomain> {
        CardResponseDomainImpl()
    }
}