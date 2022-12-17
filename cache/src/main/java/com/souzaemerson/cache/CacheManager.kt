package com.souzaemerson.cache

import android.content.Context
import com.orhanobut.hawk.Hawk

object CacheManager {

    fun init(context: Context) {
        Hawk.init(context).build()
    }

    fun <T> put(key: String, value: T) = Hawk.put(key, value)

    fun <T> get(key: String): T = Hawk.get(key)

    fun exists(key: String): Boolean = Hawk.contains(key)


    fun delete(key: String) {
        if (Hawk.contains(key)) {
            Hawk.delete(key)
        }
    }

    fun deleteAll() = Hawk.deleteAll()
}