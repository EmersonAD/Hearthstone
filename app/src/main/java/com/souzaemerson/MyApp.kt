package com.souzaemerson

import android.app.Application
import com.souzaemerson.cache.CacheManager
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.koinApplication

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()

        CacheManager.init(applicationContext)
        startKoin {
            androidContext(this@MyApp)
            androidLogger()
        }
    }
}