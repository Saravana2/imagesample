package com.image.sample.data.repository

import android.util.Log
import com.image.sample.data.model.animal.AnimalResponse
import com.image.sample.data.repository.datasource.AnimalRemoteDataSource
import com.image.sample.domain.repository.AnimalRepository

class AnimalRepositoryImpl(private val animalRemoteDataSource: AnimalRemoteDataSource) :
    AnimalRepository {
    override suspend fun getRandomAnimal(): AnimalResponse? {
        var animalResponse: AnimalResponse? = null
        try {
            val response = animalRemoteDataSource.getRandomAnimal()
            if (response.body() != null)
                animalResponse = response.body()
        } catch (e: Exception) {
            Log.i("Remote:Random Dog", e.message.toString())
        }
        return animalResponse
    }
}