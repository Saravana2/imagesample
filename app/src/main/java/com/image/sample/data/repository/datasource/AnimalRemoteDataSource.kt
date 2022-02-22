package com.image.sample.data.repository.datasource

import com.image.sample.data.model.animal.AnimalResponse
import retrofit2.Response

interface AnimalRemoteDataSource {
    suspend fun getRandomAnimal(): Response<AnimalResponse>
}