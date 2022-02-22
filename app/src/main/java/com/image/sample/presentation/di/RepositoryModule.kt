package com.image.sample.presentation.di

import com.image.sample.data.repository.AnimalRepositoryImpl
import com.image.sample.data.repository.datasource.AnimalRemoteDataSource
import com.image.sample.domain.repository.AnimalRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideAnimalRepository(
        animalRemoteDataSource: AnimalRemoteDataSource
    ): AnimalRepository {
        return AnimalRepositoryImpl(
            animalRemoteDataSource
        )
    }
}