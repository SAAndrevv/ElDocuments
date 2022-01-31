package com.saandrew.eldocuments.api_model

import com.google.gson.annotations.SerializedName

data class DriverLicenseResponse(
    @SerializedName("serial_and_number") val serialAndNumber: String,
    @SerializedName("date_of_issue") val dateOfIssue: String,
    @SerializedName("valid_until") val validUntil: String,
    @SerializedName("verifying") val verifying: String

)
