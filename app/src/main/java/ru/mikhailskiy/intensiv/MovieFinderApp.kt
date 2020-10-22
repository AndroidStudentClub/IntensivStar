package ru.mikhailskiy.intensiv

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import ru.mikhailskiy.intensiv.di.dataModule
import ru.mikhailskiy.intensiv.di.domainModule
import ru.mikhailskiy.intensiv.di.presentationModule
import timber.log.Timber

class MovieFinderApp : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        initDebugTools()

        startKoin {
            androidLogger()
            androidContext(this@MovieFinderApp)
            modules(domainModule, presentationModule, dataModule)
        }
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