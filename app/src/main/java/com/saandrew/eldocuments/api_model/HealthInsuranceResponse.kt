package com.saandrew.eldocuments.api_model

import com.google.gson.annotations.SerializedName

data class HealthInsuranceResponse(
    @SerializedName("number") val number: String,
    @SerializedName("valid_until") val validUntil: String?,
    @SerializedName("verifying") val verifying: String
)
