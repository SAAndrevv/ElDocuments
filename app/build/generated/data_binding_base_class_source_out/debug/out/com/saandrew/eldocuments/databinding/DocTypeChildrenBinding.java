// Generated by data binding compiler. Do not edit!
package com.saandrew.eldocuments.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.saandrew.eldocuments.R;
import com.saandrew.eldocuments.api_model.Types;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DocTypeChildrenBinding extends ViewDataBinding {
  @NonNull
  public final SwitchMaterial docSwitch;

  @Bindable
  protected Types mType;

  protected DocTypeChildrenBinding(Object _bindingComponent, View _root, int _localFieldCount,
      SwitchMaterial docSwitch) {
    super(_bindingComponent, _root, _localFieldCount);
    this.docSwitch = docSwitch;
  }

  public abstract void setType(@Nullable Types type);

  @Nullable
  public Types getType() {
    return mType;
  }

  @NonNull
  public static DocTypeChildrenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.doc_type_children, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DocTypeChildrenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DocTypeChildrenBinding>inflateInternal(inflater, R.layout.doc_type_children, root, attachToRoot, component);
  }

  @NonNull
  public static DocTypeChildrenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.doc_type_children, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DocTypeChildrenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DocTypeChildrenBinding>inflateInternal(inflater, R.layout.doc_type_children, null, false, component);
  }

  public static DocTypeChildrenBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static DocTypeChildrenBinding bind(@NonNull View view, @Nullable Object component) {
    return (DocTypeChildrenBinding)bind(component, view, R.layout.doc_type_children);
  }
}
