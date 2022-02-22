package com.image.sample.presentation.di

import com.image.sample.data.api.APIService
import com.image.sample.data.repository.datasource.AnimalRemoteDataSource
import com.image.sample.data.repository.datasourceimpl.AnimalRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideAnimalRemoteDataSource(apiService: APIService): AnimalRemoteDataSource {
        return AnimalRemoteDataSourceImpl(apiService)
    }

}