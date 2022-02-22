package com.image.sample.presentation.di

import com.image.sample.presentation.di.animal.AnimalSubComponent

interface Injector {
    fun createAnimalSubComponent(): AnimalSubComponent
}