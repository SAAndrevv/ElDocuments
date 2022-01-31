package com.saandrew.eldocuments.api_model

import com.google.gson.annotations.SerializedName

data class AvailableDocuments(
    @SerializedName("id_group") val idGroup: Int,
    @SerializedName("data") val data: List<Types>
)

data class Types(
    @SerializedName("doc_type") val docType: String,
    var available: Boolean = false
)
