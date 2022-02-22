package com.image.sample.presentation.di.animal

import com.image.sample.domain.usecase.GetRandomAnimalUseCase
import com.image.sample.presentation.animal.AnimalViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class AnimalModule {

    @AnimalScope
    @Provides
    fun provideAnimalViewModelFactory(
        randomAnimalUseCase: GetRandomAnimalUseCase
    ) =
        AnimalViewModelFactory(randomAnimalUseCase)

}