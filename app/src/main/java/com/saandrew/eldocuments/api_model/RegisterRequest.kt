package com.saandrew.eldocuments.api_model

import com.google.gson.annotations.SerializedName

data class RegisterRequest(
    @SerializedName("email") val email: String?,
    @SerializedName("password") val password: String?
    )




