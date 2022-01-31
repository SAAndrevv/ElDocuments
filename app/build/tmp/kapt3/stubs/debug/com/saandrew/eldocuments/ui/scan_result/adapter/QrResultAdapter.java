package com.saandrew.eldocuments.ui.scan_result.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\u0016\u0010\u0019\u001a\u00020\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/saandrew/eldocuments/ui/scan_result/adapter/QrResultAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewModel", "Lcom/saandrew/eldocuments/ui/scan_result/QrResultViewModel;", "context", "Landroid/content/Context;", "(Lcom/saandrew/eldocuments/ui/scan_result/QrResultViewModel;Landroid/content/Context;)V", "docs", "", "", "resources", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "app_debug"})
public final class QrResultAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.saandrew.eldocuments.ui.scan_result.QrResultViewModel viewModel = null;
    private java.util.List<java.lang.String> docs;
    private final android.content.res.Resources resources = null;
    
    public QrResultAdapter(@org.jetbrains.annotations.NotNull()
    com.saandrew.eldocuments.ui.scan_result.QrResultViewModel viewModel, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> docs) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
}