package com.example.crud_api_amalia_priliantini

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DataItem(
    @field:SerializedName("staff_name")
    val staffName: String? = null,

    @field:SerializedName("staff_jekel")
    val staffJenkel: String? = null,

    @field:SerializedName("staff_ps")
    val staffPS: String? = null,

    @field:SerializedName("staff_id")
    val staffId: String? = null,

    @field:SerializedName("staff_hp")
    val staffHp: String? = null,

    @field:SerializedName("staff_alamat")
    val staffAlamat: String? = null
) : Serializable
