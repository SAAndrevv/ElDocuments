package com.saandrew.eldocuments.api_model

import com.google.gson.annotations.SerializedName

data class TokenData(@SerializedName("data") val data: List<String>)
