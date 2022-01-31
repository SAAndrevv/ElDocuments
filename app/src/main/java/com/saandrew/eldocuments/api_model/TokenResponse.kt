package com.saandrew.eldocuments.api_model

import com.google.gson.annotations.SerializedName

data class TokenResponse(@SerializedName("token") var info: String? = null)