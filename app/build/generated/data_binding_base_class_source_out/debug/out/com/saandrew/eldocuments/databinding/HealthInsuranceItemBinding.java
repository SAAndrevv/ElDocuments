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
import com.saandrew.eldocuments.api_model.HealthInsuranceResponse;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class HealthInsuranceItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView healthInsuranceTitle;

  @NonNull
  public final TextView number;

  @NonNull
  public final TextView validUntil;

  @NonNull
  public final ImageView verifying;

  @Bindable
  protected HealthInsuranceResponse mHealthInsurance;

  protected HealthInsuranceItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView healthInsuranceTitle, TextView number, TextView validUntil, ImageView verifying) {
    super(_bindingComponent, _root, _localFieldCount);
    this.healthInsuranceTitle = healthInsuranceTitle;
    this.number = number;
    this.validUntil = validUntil;
    this.verifying = verifying;
  }

  public abstract void setHealthInsurance(@Nullable HealthInsuranceResponse healthInsurance);

  @Nullable
  public HealthInsuranceResponse getHealthInsurance() {
    return mHealthInsurance;
  }

  @NonNull
  public static HealthInsuranceItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.health_insurance_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static HealthInsuranceItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<HealthInsuranceItemBinding>inflateInternal(inflater, R.layout.health_insurance_item, root, attachToRoot, component);
  }

  @NonNull
  public static HealthInsuranceItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.health_insurance_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static HealthInsuranceItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<HealthInsuranceItemBinding>inflateInternal(inflater, R.layout.health_insurance_item, null, false, component);
  }

  public static HealthInsuranceItemBinding bind(@NonNull View view) {
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
  public static HealthInsuranceItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (HealthInsuranceItemBinding)bind(component, view, R.layout.health_insurance_item);
  }
}