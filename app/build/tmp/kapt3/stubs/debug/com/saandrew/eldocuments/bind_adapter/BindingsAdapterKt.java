package com.saandrew.eldocuments.bind_adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007\u001a\u001a\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007\u001a\u001e\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005H\u0007\u00a8\u0006\u0012"}, d2 = {"bindImage", "", "imgView", "Landroid/widget/ImageView;", "bitmap", "Landroidx/lifecycle/LiveData;", "Landroid/graphics/Bitmap;", "verify", "", "bindStatus", "statusImageView", "status", "Lcom/saandrew/eldocuments/ui/scan_result/DocumentsApiStatus;", "setText", "button", "Landroid/widget/Button;", "mode", "Lcom/saandrew/eldocuments/ui_doc/EditMode;", "app_debug"})
public final class BindingsAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"bitmapImg"})
    public static final void bindImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imgView, @org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<android.graphics.Bitmap> bitmap) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"verifyImg"})
    public static final void bindImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imgView, @org.jetbrains.annotations.Nullable()
    java.lang.String verify) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"apiStatus"})
    public static final void bindStatus(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView statusImageView, @org.jetbrains.annotations.Nullable()
    com.saandrew.eldocuments.ui.scan_result.DocumentsApiStatus status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"btnStatus"})
    public static final void setText(@org.jetbrains.annotations.NotNull()
    android.widget.Button button, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui_doc.EditMode> mode) {
    }
}