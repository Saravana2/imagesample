package com.image.sample.presentation.di

import com.image.sample.presentation.di.animal.AnimalSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetModule::class,
        RemoteDataModule::class,
        RepositoryModule::class,
        UseCaseModule::class
    ]
)
interface AppComponent {
    fun animalSubComponent(): AnimalSubComponent.Factory
}