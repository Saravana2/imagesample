package com.image.sample.data.repository.datasourceimpl

import com.image.sample.data.api.APIService
import com.image.sample.data.repository.datasource.AnimalRemoteDataSource

class AnimalRemoteDataSourceImpl(
    private val apiService: APIService
) : AnimalRemoteDataSource {

    override suspend fun getRandomAnimal() = apiService.getRandomDog()
}