package com.souzaemerson

import android.app.Application
import com.souzaemerson.cache.CacheManager

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()

        CacheManager.init(applicationContext)
    }
}