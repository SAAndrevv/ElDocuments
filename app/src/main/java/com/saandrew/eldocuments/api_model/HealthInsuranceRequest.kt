package com.saandrew.eldocuments.api_model

import com.google.gson.annotations.SerializedName

data class HealthInsuranceRequest(
    @SerializedName("number") val number: String?,
    @SerializedName("valid_until") val validUntil: String?,
)
