package com.image.sample.presentation.animal

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.image.sample.domain.usecase.GetRandomAnimalUseCase

class AnimalViewModelFactory(
    private val getRandomAnimalUseCase: GetRandomAnimalUseCase
) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AnimalViewModel(getRandomAnimalUseCase) as T
    }
}