package ru.androidschool.intensiv

import android.app.Application
import timber.log.Timber

class MovieFinderApp : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        initDebugTools()
    }
    private fun initDebugTools() {
        if (BuildConfig.DEBUG) {
            initTimber()
        }
    }

    private fun initTimber() {
        Timber.plant(Timber.DebugTree())
    }

    companion object {
        var instance: MovieFinderApp? = null
            private set
    }
}
