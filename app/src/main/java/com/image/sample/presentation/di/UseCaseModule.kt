package com.image.sample.presentation.di

import com.image.sample.domain.repository.AnimalRepository
import com.image.sample.domain.usecase.GetRandomAnimalUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetRandomAnimalUseCase(repository: AnimalRepository) =
        GetRandomAnimalUseCase(repository)

}