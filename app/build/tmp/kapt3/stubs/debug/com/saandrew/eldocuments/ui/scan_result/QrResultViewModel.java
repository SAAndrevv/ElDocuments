package com.saandrew.eldocuments.ui.scan_result;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0002J\u0006\u0010\u0011\u001a\u00020%J\u0011\u0010\u0017\u001a\u00020%H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0011\u0010\u001a\u001a\u00020%H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0011\u0010\u001c\u001a\u00020%H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0011\u0010\u001e\u001a\u00020%H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/saandrew/eldocuments/ui/scan_result/QrResultViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_driverLicense", "Landroidx/lifecycle/MutableLiveData;", "Lcom/saandrew/eldocuments/api_model/DriverLicenseResponse;", "_healthInsurance", "Lcom/saandrew/eldocuments/api_model/HealthInsuranceResponse;", "_insuranceNumber", "Lcom/saandrew/eldocuments/api_model/InsuranceNumberResponse;", "_passport", "Lcom/saandrew/eldocuments/api_model/UserPassportResponse;", "_status", "Lcom/saandrew/eldocuments/ui/scan_result/DocumentsApiStatus;", "data", "", "", "getData", "()Landroidx/lifecycle/MutableLiveData;", "setData", "(Landroidx/lifecycle/MutableLiveData;)V", "driverLicense", "Landroidx/lifecycle/LiveData;", "getDriverLicense", "()Landroidx/lifecycle/LiveData;", "healthInsurance", "getHealthInsurance", "insuranceNumber", "getInsuranceNumber", "passport", "getPassport", "status", "getStatus", "token", "getToken", "setToken", "getAllData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class QrResultViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> token;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> data;
    private androidx.lifecycle.MutableLiveData<com.saandrew.eldocuments.api_model.UserPassportResponse> _passport;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.saandrew.eldocuments.api_model.UserPassportResponse> passport = null;
    private androidx.lifecycle.MutableLiveData<com.saandrew.eldocuments.api_model.DriverLicenseResponse> _driverLicense;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.saandrew.eldocuments.api_model.DriverLicenseResponse> driverLicense = null;
    private androidx.lifecycle.MutableLiveData<com.saandrew.eldocuments.api_model.HealthInsuranceResponse> _healthInsurance;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.saandrew.eldocuments.api_model.HealthInsuranceResponse> healthInsurance = null;
    private androidx.lifecycle.MutableLiveData<com.saandrew.eldocuments.api_model.InsuranceNumberResponse> _insuranceNumber;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.saandrew.eldocuments.api_model.InsuranceNumberResponse> insuranceNumber = null;
    private final androidx.lifecycle.MutableLiveData<com.saandrew.eldocuments.ui.scan_result.DocumentsApiStatus> _status = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui.scan_result.DocumentsApiStatus> status = null;
    
    public QrResultViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.saandrew.eldocuments.api_model.UserPassportResponse> getPassport() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.saandrew.eldocuments.api_model.DriverLicenseResponse> getDriverLicense() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.saandrew.eldocuments.api_model.HealthInsuranceResponse> getHealthInsurance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.saandrew.eldocuments.api_model.InsuranceNumberResponse> getInsuranceNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui.scan_result.DocumentsApiStatus> getStatus() {
        return null;
    }
    
    private final void getAllData() {
    }
    
    public final void getData() {
    }
    
    private final java.lang.Object getInsuranceNumber(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getHealthInsurance(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getPassport(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getDriverLicense(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}