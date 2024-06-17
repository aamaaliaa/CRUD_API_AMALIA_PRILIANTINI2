package com.example.crud_api_amalia_priliantini

import com.google.gson.annotations.SerializedName

data class ResultStatus(
    @field:SerializedName("pesan")
    val pesan: String? = null,

    @field:SerializedName("status")
    val status: Int? = null
)
