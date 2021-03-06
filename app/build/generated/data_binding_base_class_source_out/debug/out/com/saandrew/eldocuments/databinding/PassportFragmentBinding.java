// Generated by data binding compiler. Do not edit!
package com.saandrew.eldocuments.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.saandrew.eldocuments.R;
import com.saandrew.eldocuments.ui_doc.passport.PassportViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PassportFragmentBinding extends ViewDataBinding {
  @NonNull
  public final EditText dateOfReceivingPass;

  @NonNull
  public final EditText departmentCodePass;

  @NonNull
  public final EditText issuedByPass;

  @NonNull
  public final EditText placeOfBirthPass;

  @NonNull
  public final Button sendBtn;

  @NonNull
  public final EditText serialAndNumberPass;

  @NonNull
  public final EditText typePass;

  @Bindable
  protected PassportViewModel mPassportViewModel;

  protected PassportFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText dateOfReceivingPass, EditText departmentCodePass, EditText issuedByPass,
      EditText placeOfBirthPass, Button sendBtn, EditText serialAndNumberPass, EditText typePass) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dateOfReceivingPass = dateOfReceivingPass;
    this.departmentCodePass = departmentCodePass;
    this.issuedByPass = issuedByPass;
    this.placeOfBirthPass = placeOfBirthPass;
    this.sendBtn = sendBtn;
    this.serialAndNumberPass = serialAndNumberPass;
    this.typePass = typePass;
  }

  public abstract void setPassportViewModel(@Nullable PassportViewModel passportViewModel);

  @Nullable
  public PassportViewModel getPassportViewModel() {
    return mPassportViewModel;
  }

  @NonNull
  public static PassportFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.passport_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PassportFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PassportFragmentBinding>inflateInternal(inflater, R.layout.passport_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static PassportFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.passport_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PassportFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PassportFragmentBinding>inflateInternal(inflater, R.layout.passport_fragment, null, false, component);
  }

  public static PassportFragmentBinding bind(@NonNull View view) {
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
  public static PassportFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (PassportFragmentBinding)bind(component, view, R.layout.passport_fragment);
  }
}
