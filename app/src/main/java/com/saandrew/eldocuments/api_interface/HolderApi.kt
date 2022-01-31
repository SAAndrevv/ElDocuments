package com.saandrew.eldocuments.api_interface


import com.saandrew.eldocuments.api_model.*
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.*


interface HolderApi {
    @Multipart
    @POST("/login")
    suspend fun loginUser(
        @Part("username") username: RequestBody,
        @Part("password") password: RequestBody
    ): Response<Token>

    @POST("/user/create")
    suspend fun registerUser(@Body user: RegisterRequest) : Response<RegisterResponse>

    @POST("/qr/")
    suspend fun createQr(
        @Header("Authorization") token: String,
        @Body data: TokenData): Response<Token>

    @GET("/qr/")
    suspend fun getQrData(
        @Header("Authorization") token: String): Response<TokenData>


    @POST("/passport/")
    suspend fun addPassport(@Header("Authorization") token: String,
                     @Body userDataRequest: UserPassportRequest) : Response<UserPassportResponse>

    @PUT("/passport/")
    suspend fun putPassport(@Header("Authorization") token: String,
                            @Body userDataRequest: UserPassportRequest) : Response<UserPassportResponse>

    @GET("/passport/")
    suspend fun getPassport(@Header("Authorization") token: String): Response<UserPassportResponse>

    @GET("/driver_license/")
    suspend fun getDriverLicense(@Header("Authorization") token: String): Response<DriverLicenseResponse>

    @POST("/driver_license/")
    suspend fun addDriverLicense(@Header("Authorization") token: String,
                            @Body userDataRequest: DriverLicenseRequest) : Response<DriverLicenseResponse>

    @PUT("/driver_license/")
    suspend fun putDriverLicense(@Header("Authorization") token: String,
                            @Body userDataRequest: DriverLicenseRequest) : Response<DriverLicenseResponse>

    @POST("/health_insurance/")
    suspend fun addHealthInsurance(@Header("Authorization") token: String,
                                    @Body userDataRequest: HealthInsuranceRequest): Response<HealthInsuranceResponse>

    @GET("/health_insurance/")
    suspend fun getHealthInsurance(@Header("Authorization") token: String): Response<HealthInsuranceResponse>

    @PUT("/health_insurance/")
    suspend fun putHealthInsurance(@Header("Authorization") token: String,
                                    @Body userDataRequest: HealthInsuranceRequest): Response<HealthInsuranceResponse>

    @POST("/insurance_number/")
    suspend fun addInsuranceNumber(@Header("Authorization") token: String,
                                   @Body userDataRequest: InsuranceNumberRequest): Response<InsuranceNumberResponse>

    @GET("/insurance_number/")
    suspend fun getInsuranceNumber(@Header("Authorization") token: String, ): Response<InsuranceNumberResponse>

    @PUT("/insurance_number/")
    suspend fun putInsuranceNumber(@Header("Authorization") token: String,
                                   @Body userDataRequest: InsuranceNumberRequest): Response<InsuranceNumberResponse>

    @GET("/available_doc/")
    suspend fun getAvailableDocuments(@Header("Authorization") token: String): Response<List<AvailableDocuments>>

}