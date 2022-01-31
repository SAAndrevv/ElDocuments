package com.saandrew.eldocuments.api_model

import com.google.gson.annotations.SerializedName

data class UserPassportRequest(
    @SerializedName("type") val type: String?,
    @SerializedName("serial_and_number") val serialAndNumber: String?,
    @SerializedName("place_of_birth") val placeOfBirth: String?,
    @SerializedName("date_of_receiving") val dateOfReceiving: String?,
    @SerializedName("issued_by") val issuedBy: String?,
    @SerializedName("department_code") val departmentCode: String?
)


