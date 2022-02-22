package com.image.sample.domain.repository

import com.image.sample.data.model.animal.AnimalResponse

interface AnimalRepository {
    suspend fun getRandomAnimal(): AnimalResponse?
}