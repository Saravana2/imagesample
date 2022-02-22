package com.image.sample.presentation.animal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.image.sample.data.model.animal.AnimalResponse
import com.image.sample.domain.usecase.GetRandomAnimalUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnimalViewModel(
    private val getRandomAnimalUseCase: GetRandomAnimalUseCase
) : ViewModel() {

    private val _animalResponse = MutableLiveData<AnimalResponse>()
    val animalResponse: LiveData<AnimalResponse>
        get() = _animalResponse

    fun getRandomAnimal() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = getRandomAnimalUseCase.execute()
            response?.let {
                _animalResponse.postValue(it)
            }
        }
    }

}