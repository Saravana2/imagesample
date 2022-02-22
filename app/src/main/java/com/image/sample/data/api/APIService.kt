package com.image.sample.data.api

import com.image.sample.data.model.animal.AnimalResponse
import retrofit2.Response
import retrofit2.http.GET

interface APIService {

    companion object {
        const val BASE_URL = "https://dog.ceo/"
        private const val SUB_PATH = "api/breeds"
    }

    @GET("$SUB_PATH/image/random")
    suspend fun getRandomDog(): Response<AnimalResponse>

}