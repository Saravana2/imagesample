package com.image.sample.data.model.animal

import com.google.gson.annotations.SerializedName

data class AnimalResponse(
    @SerializedName("message")
    var message: String? = null,
    @SerializedName("status")
    var status: String? = null
)