package com.example.landscapedetecated.model

import com.google.gson.annotations.SerializedName


data class User (
    @SerializedName("id") val id: Int?,
    @SerializedName("userId") val userId: Int?,
    @SerializedName("title") val title: String?,
    @SerializedName("body") val body: String?,
)


