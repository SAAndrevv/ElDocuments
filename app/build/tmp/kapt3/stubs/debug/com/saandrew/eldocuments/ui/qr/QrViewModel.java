package com.saandrew.eldocuments.ui.qr;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u001eH\u0002J\u0006\u0010\u001f\u001a\u00020\u001dJ\b\u0010 \u001a\u00020\u001dH\u0002J\u0016\u0010\u0019\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\rH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012\u00a8\u0006\""}, d2 = {"Lcom/saandrew/eldocuments/ui/qr/QrViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_imgState", "Landroidx/lifecycle/MutableLiveData;", "", "_qr", "Landroid/graphics/Bitmap;", "_status", "Lcom/saandrew/eldocuments/ui/qr/QrApiStatus;", "_token", "Lcom/saandrew/eldocuments/api_model/TokenResponse;", "_typeDoc", "", "Lcom/saandrew/eldocuments/api_model/AvailableDocuments;", "imgState", "Landroidx/lifecycle/LiveData;", "getImgState", "()Landroidx/lifecycle/LiveData;", "onButtonPressed", "qr", "getQr", "status", "getStatus", "token", "getToken", "typeDoc", "getTypeDoc", "createQr", "", "", "generateQr", "getDocumentsList", "data", "app_debug"})
public final class QrViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> _qr;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<android.graphics.Bitmap> qr = null;
    private androidx.lifecycle.MutableLiveData<com.saandrew.eldocuments.api_model.TokenResponse> _token;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.saandrew.eldocuments.api_model.TokenResponse> token = null;
    private final androidx.lifecycle.MutableLiveData<com.saandrew.eldocuments.ui.qr.QrApiStatus> _status = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui.qr.QrApiStatus> status = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.saandrew.eldocuments.api_model.AvailableDocuments>> _typeDoc = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.saandrew.eldocuments.api_model.AvailableDocuments>> typeDoc = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _imgState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> imgState = null;
    private boolean onButtonPressed = false;
    
    public QrViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.graphics.Bitmap> getQr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.saandrew.eldocuments.api_model.TokenResponse> getToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui.qr.QrApiStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.saandrew.eldocuments.api_model.AvailableDocuments>> getTypeDoc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getImgState() {
        return null;
    }
    
    private final void createQr(java.lang.String token) {
    }
    
    private final void getToken(java.util.List<java.lang.String> data) {
    }
    
    public final void generateQr() {
    }
    
    private final void getDocumentsList() {
    }
}