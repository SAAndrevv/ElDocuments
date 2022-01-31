package com.saandrew.eldocuments.api_interface;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0014H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\'\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ!\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ+\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010%\u001a\u00020&2\b\b\u0001\u0010\'\u001a\u00020&H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J+\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ+\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ+\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J+\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0014H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J!\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\b\u0001\u0010/\u001a\u000200H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00062"}, d2 = {"Lcom/saandrew/eldocuments/api_interface/HolderApi;", "", "addDriverLicense", "Lretrofit2/Response;", "Lcom/saandrew/eldocuments/api_model/DriverLicenseResponse;", "token", "", "userDataRequest", "Lcom/saandrew/eldocuments/api_model/DriverLicenseRequest;", "(Ljava/lang/String;Lcom/saandrew/eldocuments/api_model/DriverLicenseRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addHealthInsurance", "Lcom/saandrew/eldocuments/api_model/HealthInsuranceResponse;", "Lcom/saandrew/eldocuments/api_model/HealthInsuranceRequest;", "(Ljava/lang/String;Lcom/saandrew/eldocuments/api_model/HealthInsuranceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addInsuranceNumber", "Lcom/saandrew/eldocuments/api_model/InsuranceNumberResponse;", "Lcom/saandrew/eldocuments/api_model/InsuranceNumberRequest;", "(Ljava/lang/String;Lcom/saandrew/eldocuments/api_model/InsuranceNumberRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addPassport", "Lcom/saandrew/eldocuments/api_model/UserPassportResponse;", "Lcom/saandrew/eldocuments/api_model/UserPassportRequest;", "(Ljava/lang/String;Lcom/saandrew/eldocuments/api_model/UserPassportRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createQr", "Lcom/saandrew/eldocuments/api_model/Token;", "data", "Lcom/saandrew/eldocuments/api_model/TokenData;", "(Ljava/lang/String;Lcom/saandrew/eldocuments/api_model/TokenData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAvailableDocuments", "", "Lcom/saandrew/eldocuments/api_model/AvailableDocuments;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDriverLicense", "getHealthInsurance", "getInsuranceNumber", "getPassport", "getQrData", "loginUser", "username", "Lokhttp3/RequestBody;", "password", "(Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putDriverLicense", "putHealthInsurance", "putInsuranceNumber", "putPassport", "registerUser", "Lcom/saandrew/eldocuments/api_model/RegisterResponse;", "user", "Lcom/saandrew/eldocuments/api_model/RegisterRequest;", "(Lcom/saandrew/eldocuments/api_model/RegisterRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface HolderApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/login")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object loginUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "username")
    okhttp3.RequestBody username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "password")
    okhttp3.RequestBody password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.saandrew.eldocuments.api_model.Token>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/user/create")
    public abstract java.lang.Object registerUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.saandrew.eldocuments.api_model.RegisterRequest user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.saandrew.eldocuments.api_model.RegisterResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/qr/")
    public abstract java.lang.Object createQr(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.saandrew.eldocuments.api_model.TokenData data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.saandrew.eldocuments.api_model.Token>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/qr/")
    public abstract java.lang.Object getQrData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.saandrew.eldocuments.api_model.TokenData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/passport/")
    public abstract java.lang.Object addPassport(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.saandrew.eldocuments.api_model.UserPassportRequest userDataRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.saandrew.eldocuments.api_model.UserPassportResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "/passport/")
    public abstract java.lang.Object putPassport(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.saandrew.eldocuments.api_model.UserPassportRequest userDataRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.saandrew.eldocuments.api_model.UserPassportResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/passport/")
    public abstract java.lang.Object getPassport(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.saandrew.eldocuments.api_model.UserPassportResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/driver_license/")
    public abstract java.lang.Object getDriverLicense(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.saandrew.eldocuments.api_model.DriverLicenseResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/driver_license/")
    public abstract java.lang.Object addDriverLicense(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.saandrew.eldocuments.api_model.DriverLicenseRequest userDataRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.saandrew.eldocuments.api_model.DriverLicenseResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "/driver_license/")
    public abstract java.lang.Object putDriverLicense(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.saandrew.eldocuments.api_model.DriverLicenseRequest userDataRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.saandrew.eldocuments.api_model.DriverLicenseResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/health_insurance/")
    public abstract java.lang.Object addHealthInsurance(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.saandrew.eldocuments.api_model.HealthInsuranceRequest userDataRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.saandrew.eldocuments.api_model.HealthInsuranceResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/health_insurance/")
    public abstract java.lang.Object getHealthInsurance(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.saandrew.eldocuments.api_model.HealthInsuranceResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "/health_insurance/")
    public abstract java.lang.Object putHealthInsurance(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.saandrew.eldocuments.api_model.HealthInsuranceRequest userDataRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.saandrew.eldocuments.api_model.HealthInsuranceResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/insurance_number/")
    public abstract java.lang.Object addInsuranceNumber(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.saandrew.eldocuments.api_model.InsuranceNumberRequest userDataRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.saandrew.eldocuments.api_model.InsuranceNumberResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/insurance_number/")
    public abstract java.lang.Object getInsuranceNumber(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.saandrew.eldocuments.api_model.InsuranceNumberResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "/insurance_number/")
    public abstract java.lang.Object putInsuranceNumber(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.saandrew.eldocuments.api_model.InsuranceNumberRequest userDataRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.saandrew.eldocuments.api_model.InsuranceNumberResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/available_doc/")
    public abstract java.lang.Object getAvailableDocuments(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.saandrew.eldocuments.api_model.AvailableDocuments>>> continuation);
}