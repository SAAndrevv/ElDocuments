package com.saandrew.eldocuments.api_model

import com.google.gson.annotations.SerializedName

data class InsuranceNumberResponse(
    @SerializedName("number") val number: String,
    @SerializedName("verifying") val verifying: String
)
