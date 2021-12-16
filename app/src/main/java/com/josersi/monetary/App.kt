package com.josersi.monetary

import android.app.Application
import com.josersi.monetary.data.di.DataModules
import com.josersi.monetary.domain.di.DomainModule
import com.josersi.monetary.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModules.load()
        DomainModule.load()
        PresentationModule.load()
    }
}