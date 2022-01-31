package com.saandrew.eldocuments.ui.qr.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J4\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\'\u001a\u00020\u0019H\u0016J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J,\u0010)\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010*\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010+\u001a\u00020 H\u0016J\u0018\u0010,\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u001b\u0010\u0010\u001a\u00020-2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007\u00a2\u0006\u0002\b.R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006/"}, d2 = {"Lcom/saandrew/eldocuments/ui/qr/adapter/ExpandableTypeDocListAdapter;", "Landroid/widget/BaseExpandableListAdapter;", "context", "Landroid/content/Context;", "expandableListView", "Landroid/widget/ExpandableListView;", "viewModel", "Lcom/saandrew/eldocuments/ui/qr/QrViewModel;", "(Landroid/content/Context;Landroid/widget/ExpandableListView;Lcom/saandrew/eldocuments/ui/qr/QrViewModel;)V", "getContext", "()Landroid/content/Context;", "data", "", "Lcom/saandrew/eldocuments/api_model/AvailableDocuments;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getExpandableListView", "()Landroid/widget/ExpandableListView;", "getViewModel", "()Lcom/saandrew/eldocuments/ui/qr/QrViewModel;", "getChild", "Lcom/saandrew/eldocuments/api_model/Types;", "groupPosition", "", "childPosition", "getChildId", "", "getChildView", "Landroid/view/View;", "isLastChild", "", "convertView", "parent", "Landroid/view/ViewGroup;", "getChildrenCount", "getGroup", "", "getGroupCount", "getGroupId", "getGroupView", "isExpanded", "hasStableIds", "isChildSelectable", "", "setData1", "app_debug"})
public final class ExpandableTypeDocListAdapter extends android.widget.BaseExpandableListAdapter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.ExpandableListView expandableListView = null;
    @org.jetbrains.annotations.NotNull()
    private final com.saandrew.eldocuments.ui.qr.QrViewModel viewModel = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.saandrew.eldocuments.api_model.AvailableDocuments> data;
    
    public ExpandableTypeDocListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.widget.ExpandableListView expandableListView, @org.jetbrains.annotations.NotNull()
    com.saandrew.eldocuments.ui.qr.QrViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ExpandableListView getExpandableListView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.saandrew.eldocuments.ui.qr.QrViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.saandrew.eldocuments.api_model.AvailableDocuments> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.saandrew.eldocuments.api_model.AvailableDocuments> p0) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @kotlin.jvm.JvmName(name = "setData1")
    public final void setData1(@org.jetbrains.annotations.NotNull()
    java.util.List<com.saandrew.eldocuments.api_model.AvailableDocuments> data) {
    }
    
    @java.lang.Override()
    public int getGroupCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getChildrenCount(int groupPosition) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getGroup(int groupPosition) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.saandrew.eldocuments.api_model.Types getChild(int groupPosition, int childPosition) {
        return null;
    }
    
    @java.lang.Override()
    public long getGroupId(int groupPosition) {
        return 0L;
    }
    
    @java.lang.Override()
    public long getChildId(int groupPosition, int childPosition) {
        return 0L;
    }
    
    @java.lang.Override()
    public boolean hasStableIds() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getGroupView(int groupPosition, boolean isExpanded, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getChildView(int groupPosition, int childPosition, boolean isLastChild, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}