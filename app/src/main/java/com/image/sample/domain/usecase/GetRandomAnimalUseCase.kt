package com.image.sample.domain.usecase

import com.image.sample.domain.repository.AnimalRepository

class GetRandomAnimalUseCase(private val animalRepository: AnimalRepository) {
    suspend fun execute() = animalRepository.getRandomAnimal()
}