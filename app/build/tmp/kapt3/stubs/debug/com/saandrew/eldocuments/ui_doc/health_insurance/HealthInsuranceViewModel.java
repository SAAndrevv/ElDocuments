package com.saandrew.eldocuments.ui_doc.health_insurance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0002J\u0006\u0010#\u001a\u00020\u001fJ\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u001fH\u0002J\b\u0010\'\u001a\u00020\u001fH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\"\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000f\u00a8\u0006("}, d2 = {"Lcom/saandrew/eldocuments/ui_doc/health_insurance/HealthInsuranceViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_available", "Landroidx/lifecycle/MutableLiveData;", "", "_mode", "Lcom/saandrew/eldocuments/ui_doc/EditMode;", "_status", "Lcom/saandrew/eldocuments/ui_doc/RequestStatus;", "_verifying", "", "available", "Landroidx/lifecycle/LiveData;", "getAvailable", "()Landroidx/lifecycle/LiveData;", "mode", "getMode", "number", "getNumber", "()Landroidx/lifecycle/MutableLiveData;", "setNumber", "(Landroidx/lifecycle/MutableLiveData;)V", "status", "getStatus", "validUntil", "getValidUntil", "setValidUntil", "verifying", "getVerifying", "getData", "", "insertInLiveData", "data", "Lcom/saandrew/eldocuments/api_model/HealthInsuranceResponse;", "onBtnClick", "onSubmitData", "Lcom/saandrew/eldocuments/api_model/HealthInsuranceRequest;", "postData", "putData", "app_debug"})
public final class HealthInsuranceViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> number;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> validUntil;
    private androidx.lifecycle.MutableLiveData<java.lang.String> _verifying;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> verifying = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _available;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> available = null;
    private androidx.lifecycle.MutableLiveData<com.saandrew.eldocuments.ui_doc.EditMode> _mode;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui_doc.EditMode> mode = null;
    private androidx.lifecycle.MutableLiveData<com.saandrew.eldocuments.ui_doc.RequestStatus> _status;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui_doc.RequestStatus> status = null;
    
    public HealthInsuranceViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNumber() {
        return null;
    }
    
    public final void setNumber(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getValidUntil() {
        return null;
    }
    
    public final void setValidUntil(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getVerifying() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui_doc.EditMode> getMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui_doc.RequestStatus> getStatus() {
        return null;
    }
    
    private final void getData() {
    }
    
    private final void postData() {
    }
    
    private final void putData() {
    }
    
    public final void onBtnClick() {
    }
    
    private final void insertInLiveData(com.saandrew.eldocuments.api_model.HealthInsuranceResponse data) {
    }
    
    private final com.saandrew.eldocuments.api_model.HealthInsuranceRequest onSubmitData() {
        return null;
    }
}