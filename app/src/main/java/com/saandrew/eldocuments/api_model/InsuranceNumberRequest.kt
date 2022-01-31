package com.saandrew.eldocuments.api_model

import com.google.gson.annotations.SerializedName

data class InsuranceNumberRequest(
    @SerializedName("number") val number: String?
)
