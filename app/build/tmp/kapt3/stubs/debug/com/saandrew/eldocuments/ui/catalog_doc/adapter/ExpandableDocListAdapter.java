package com.saandrew.eldocuments.ui.catalog_doc.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0016J4\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\"2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0013H\u0016J\u0015\u0010)\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0013H\u0016\u00a2\u0006\u0002\u0010*J\b\u0010+\u001a\u00020\u0013H\u0016J\u0010\u0010,\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016J,\u0010-\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010.\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\"2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010/\u001a\u00020$H\u0016J\u0018\u00100\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0016R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u00061"}, d2 = {"Lcom/saandrew/eldocuments/ui/catalog_doc/adapter/ExpandableDocListAdapter;", "Landroid/widget/BaseExpandableListAdapter;", "context", "Landroid/content/Context;", "expandableListView", "Landroid/widget/ExpandableListView;", "navController", "Landroidx/navigation/NavController;", "(Landroid/content/Context;Landroid/widget/ExpandableListView;Landroidx/navigation/NavController;)V", "body", "", "Lcom/saandrew/eldocuments/ui/catalog_doc/model/TypeDoc;", "getBody", "()Ljava/util/List;", "getContext", "()Landroid/content/Context;", "getExpandableListView", "()Landroid/widget/ExpandableListView;", "header", "", "getHeader", "getNavController", "()Landroidx/navigation/NavController;", "resources", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "getResources", "()Landroid/content/res/Resources;", "getChild", "groupPosition", "childPosition", "getChildId", "", "getChildView", "Landroid/view/View;", "isLastChild", "", "convertView", "parent", "Landroid/view/ViewGroup;", "getChildrenCount", "getGroup", "(I)Ljava/lang/Integer;", "getGroupCount", "getGroupId", "getGroupView", "isExpanded", "hasStableIds", "isChildSelectable", "app_debug"})
public final class ExpandableDocListAdapter extends android.widget.BaseExpandableListAdapter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.ExpandableListView expandableListView = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavController navController = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Integer> header = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.util.List<com.saandrew.eldocuments.ui.catalog_doc.model.TypeDoc>> body = null;
    private final android.content.res.Resources resources = null;
    
    public ExpandableDocListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.widget.ExpandableListView expandableListView, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController) {
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
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getHeader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.List<com.saandrew.eldocuments.ui.catalog_doc.model.TypeDoc>> getBody() {
        return null;
    }
    
    public final android.content.res.Resources getResources() {
        return null;
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
    public java.lang.Integer getGroup(int groupPosition) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.saandrew.eldocuments.ui.catalog_doc.model.TypeDoc getChild(int groupPosition, int childPosition) {
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