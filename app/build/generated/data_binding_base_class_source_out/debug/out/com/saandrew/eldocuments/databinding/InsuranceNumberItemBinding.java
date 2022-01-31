// Generated by data binding compiler. Do not edit!
package com.saandrew.eldocuments.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.saandrew.eldocuments.R;
import com.saandrew.eldocuments.api_model.InsuranceNumberResponse;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class InsuranceNumberItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView insuranceNumberTitle;

  @NonNull
  public final TextView number;

  @NonNull
  public final ImageView verifying;

  @Bindable
  protected InsuranceNumberResponse mInsuranceNumber;

  protected InsuranceNumberItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView insuranceNumberTitle, TextView number, ImageView verifying) {
    super(_bindingComponent, _root, _localFieldCount);
    this.insuranceNumberTitle = insuranceNumberTitle;
    this.number = number;
    this.verifying = verifying;
  }

  public abstract void setInsuranceNumber(@Nullable InsuranceNumberResponse insuranceNumber);

  @Nullable
  public InsuranceNumberResponse getInsuranceNumber() {
    return mInsuranceNumber;
  }

  @NonNull
  public static InsuranceNumberItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.insurance_number_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static InsuranceNumberItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<InsuranceNumberItemBinding>inflateInternal(inflater, R.layout.insurance_number_item, root, attachToRoot, component);
  }

  @NonNull
  public static InsuranceNumberItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.insurance_number_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static InsuranceNumberItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<InsuranceNumberItemBinding>inflateInternal(inflater, R.layout.insurance_number_item, null, false, component);
  }

  public static InsuranceNumberItemBinding bind(@NonNull View view) {
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
  public static InsuranceNumberItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (InsuranceNumberItemBinding)bind(component, view, R.layout.insurance_number_item);
  }
}