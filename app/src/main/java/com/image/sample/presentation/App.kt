package com.image.sample.presentation

import android.app.Application
import com.image.sample.data.api.APIService
import com.image.sample.presentation.di.*
import com.image.sample.presentation.di.animal.AnimalSubComponent

class App : Application(), Injector {
    private lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().apply {
            appModule(AppModule(applicationContext))
            netModule(NetModule(APIService.BASE_URL))
            remoteDataModule(RemoteDataModule())
        }.also {
            appComponent = it.build()
        }
    }

    override fun createAnimalSubComponent(): AnimalSubComponent {
        return appComponent.animalSubComponent().create()
    }
}