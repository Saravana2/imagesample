package com.image.sample.presentation.di.animal

import com.image.sample.presentation.animal.AnimalViewModelFactory
import dagger.Subcomponent

@AnimalScope
@Subcomponent(modules = [AnimalModule::class])
interface AnimalSubComponent {

    fun getAnimalViewModelFactory(): AnimalViewModelFactory

    @Subcomponent.Factory
    interface Factory {
        fun create(): AnimalSubComponent
    }
}