package com.saandrew.eldocuments.databinding;
import com.saandrew.eldocuments.R;
import com.saandrew.eldocuments.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DriverLicenseFragmentBindingImpl extends DriverLicenseFragmentBinding implements com.saandrew.eldocuments.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener dateOfIssueDriveLicenseandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of driverLicenseViewModel.dateOfIssue.getValue()
            //         is driverLicenseViewModel.dateOfIssue.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(dateOfIssueDriveLicense);
            // localize variables for thread safety
            // driverLicenseViewModel.dateOfIssue.getValue()
            java.lang.String driverLicenseViewModelDateOfIssueGetValue = null;
            // driverLicenseViewModel != null
            boolean driverLicenseViewModelJavaLangObjectNull = false;
            // driverLicenseViewModel
            com.saandrew.eldocuments.ui_doc.driver_license.DriverLicenseViewModel driverLicenseViewModel = mDriverLicenseViewModel;
            // driverLicenseViewModel.dateOfIssue != null
            boolean driverLicenseViewModelDateOfIssueJavaLangObjectNull = false;
            // driverLicenseViewModel.dateOfIssue
            androidx.lifecycle.MutableLiveData<java.lang.String> driverLicenseViewModelDateOfIssue = null;



            driverLicenseViewModelJavaLangObjectNull = (driverLicenseViewModel) != (null);
            if (driverLicenseViewModelJavaLangObjectNull) {


                driverLicenseViewModelDateOfIssue = driverLicenseViewModel.getDateOfIssue();

                driverLicenseViewModelDateOfIssueJavaLangObjectNull = (driverLicenseViewModelDateOfIssue) != (null);
                if (driverLicenseViewModelDateOfIssueJavaLangObjectNull) {




                    driverLicenseViewModelDateOfIssue.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener serialAndNumberDriveLicenseandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of driverLicenseViewModel.serialAndNumber.getValue()
            //         is driverLicenseViewModel.serialAndNumber.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(serialAndNumberDriveLicense);
            // localize variables for thread safety
            // driverLicenseViewModel.serialAndNumber != null
            boolean driverLicenseViewModelSerialAndNumberJavaLangObjectNull = false;
            // driverLicenseViewModel.serialAndNumber
            androidx.lifecycle.MutableLiveData<java.lang.String> driverLicenseViewModelSerialAndNumber = null;
            // driverLicenseViewModel.serialAndNumber.getValue()
            java.lang.String driverLicenseViewModelSerialAndNumberGetValue = null;
            // driverLicenseViewModel != null
            boolean driverLicenseViewModelJavaLangObjectNull = false;
            // driverLicenseViewModel
            com.saandrew.eldocuments.ui_doc.driver_license.DriverLicenseViewModel driverLicenseViewModel = mDriverLicenseViewModel;



            driverLicenseViewModelJavaLangObjectNull = (driverLicenseViewModel) != (null);
            if (driverLicenseViewModelJavaLangObjectNull) {


                driverLicenseViewModelSerialAndNumber = driverLicenseViewModel.getSerialAndNumber();

                driverLicenseViewModelSerialAndNumberJavaLangObjectNull = (driverLicenseViewModelSerialAndNumber) != (null);
                if (driverLicenseViewModelSerialAndNumberJavaLangObjectNull) {




                    driverLicenseViewModelSerialAndNumber.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener validUntilDriveLicenseandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of driverLicenseViewModel.validUntil.getValue()
            //         is driverLicenseViewModel.validUntil.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(validUntilDriveLicense);
            // localize variables for thread safety
            // driverLicenseViewModel != null
            boolean driverLicenseViewModelJavaLangObjectNull = false;
            // driverLicenseViewModel
            com.saandrew.eldocuments.ui_doc.driver_license.DriverLicenseViewModel driverLicenseViewModel = mDriverLicenseViewModel;
            // driverLicenseViewModel.validUntil.getValue()
            java.lang.String driverLicenseViewModelValidUntilGetValue = null;
            // driverLicenseViewModel.validUntil != null
            boolean driverLicenseViewModelValidUntilJavaLangObjectNull = false;
            // driverLicenseViewModel.validUntil
            androidx.lifecycle.MutableLiveData<java.lang.String> driverLicenseViewModelValidUntil = null;



            driverLicenseViewModelJavaLangObjectNull = (driverLicenseViewModel) != (null);
            if (driverLicenseViewModelJavaLangObjectNull) {


                driverLicenseViewModelValidUntil = driverLicenseViewModel.getValidUntil();

                driverLicenseViewModelValidUntilJavaLangObjectNull = (driverLicenseViewModelValidUntil) != (null);
                if (driverLicenseViewModelValidUntilJavaLangObjectNull) {




                    driverLicenseViewModelValidUntil.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public DriverLicenseFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private DriverLicenseFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.EditText) bindings[2]
            , (android.widget.Button) bindings[4]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[3]
            );
        this.dateOfIssueDriveLicense.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.sendBtn.setTag(null);
        this.serialAndNumberDriveLicense.setTag(null);
        this.validUntilDriveLicense.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.saandrew.eldocuments.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.driverLicenseViewModel == variableId) {
            setDriverLicenseViewModel((com.saandrew.eldocuments.ui_doc.driver_license.DriverLicenseViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDriverLicenseViewModel(@Nullable com.saandrew.eldocuments.ui_doc.driver_license.DriverLicenseViewModel DriverLicenseViewModel) {
        this.mDriverLicenseViewModel = DriverLicenseViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.driverLicenseViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDriverLicenseViewModelMode((androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui_doc.EditMode>) object, fieldId);
            case 1 :
                return onChangeDriverLicenseViewModelAvailable((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeDriverLicenseViewModelValidUntil((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeDriverLicenseViewModelDateOfIssue((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeDriverLicenseViewModelSerialAndNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDriverLicenseViewModelMode(androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui_doc.EditMode> DriverLicenseViewModelMode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDriverLicenseViewModelAvailable(androidx.lifecycle.LiveData<java.lang.Boolean> DriverLicenseViewModelAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDriverLicenseViewModelValidUntil(androidx.lifecycle.MutableLiveData<java.lang.String> DriverLicenseViewModelValidUntil, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDriverLicenseViewModelDateOfIssue(androidx.lifecycle.MutableLiveData<java.lang.String> DriverLicenseViewModelDateOfIssue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDriverLicenseViewModelSerialAndNumber(androidx.lifecycle.MutableLiveData<java.lang.String> DriverLicenseViewModelSerialAndNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui_doc.EditMode> driverLicenseViewModelMode = null;
        java.lang.Boolean driverLicenseViewModelAvailableGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> driverLicenseViewModelAvailable = null;
        java.lang.String driverLicenseViewModelSerialAndNumberGetValue = null;
        java.lang.String driverLicenseViewModelValidUntilGetValue = null;
        java.lang.String driverLicenseViewModelDateOfIssueGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDriverLicenseViewModelAvailableGetValue = false;
        com.saandrew.eldocuments.ui_doc.EditMode driverLicenseViewModelModeGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> driverLicenseViewModelValidUntil = null;
        com.saandrew.eldocuments.ui_doc.driver_license.DriverLicenseViewModel driverLicenseViewModel = mDriverLicenseViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> driverLicenseViewModelDateOfIssue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> driverLicenseViewModelSerialAndNumber = null;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (driverLicenseViewModel != null) {
                        // read driverLicenseViewModel.mode
                        driverLicenseViewModelMode = driverLicenseViewModel.getMode();
                    }
                    updateLiveDataRegistration(0, driverLicenseViewModelMode);


                    if (driverLicenseViewModelMode != null) {
                        // read driverLicenseViewModel.mode.getValue()
                        driverLicenseViewModelModeGetValue = driverLicenseViewModelMode.getValue();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (driverLicenseViewModel != null) {
                        // read driverLicenseViewModel.available
                        driverLicenseViewModelAvailable = driverLicenseViewModel.getAvailable();
                    }
                    updateLiveDataRegistration(1, driverLicenseViewModelAvailable);


                    if (driverLicenseViewModelAvailable != null) {
                        // read driverLicenseViewModel.available.getValue()
                        driverLicenseViewModelAvailableGetValue = driverLicenseViewModelAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(driverLicenseViewModel.available.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDriverLicenseViewModelAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(driverLicenseViewModelAvailableGetValue);
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (driverLicenseViewModel != null) {
                        // read driverLicenseViewModel.validUntil
                        driverLicenseViewModelValidUntil = driverLicenseViewModel.getValidUntil();
                    }
                    updateLiveDataRegistration(2, driverLicenseViewModelValidUntil);


                    if (driverLicenseViewModelValidUntil != null) {
                        // read driverLicenseViewModel.validUntil.getValue()
                        driverLicenseViewModelValidUntilGetValue = driverLicenseViewModelValidUntil.getValue();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (driverLicenseViewModel != null) {
                        // read driverLicenseViewModel.dateOfIssue
                        driverLicenseViewModelDateOfIssue = driverLicenseViewModel.getDateOfIssue();
                    }
                    updateLiveDataRegistration(3, driverLicenseViewModelDateOfIssue);


                    if (driverLicenseViewModelDateOfIssue != null) {
                        // read driverLicenseViewModel.dateOfIssue.getValue()
                        driverLicenseViewModelDateOfIssueGetValue = driverLicenseViewModelDateOfIssue.getValue();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (driverLicenseViewModel != null) {
                        // read driverLicenseViewModel.serialAndNumber
                        driverLicenseViewModelSerialAndNumber = driverLicenseViewModel.getSerialAndNumber();
                    }
                    updateLiveDataRegistration(4, driverLicenseViewModelSerialAndNumber);


                    if (driverLicenseViewModelSerialAndNumber != null) {
                        // read driverLicenseViewModel.serialAndNumber.getValue()
                        driverLicenseViewModelSerialAndNumberGetValue = driverLicenseViewModelSerialAndNumber.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            this.dateOfIssueDriveLicense.setEnabled(androidxDatabindingViewDataBindingSafeUnboxDriverLicenseViewModelAvailableGetValue);
            this.serialAndNumberDriveLicense.setEnabled(androidxDatabindingViewDataBindingSafeUnboxDriverLicenseViewModelAvailableGetValue);
            this.validUntilDriveLicense.setEnabled(androidxDatabindingViewDataBindingSafeUnboxDriverLicenseViewModelAvailableGetValue);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dateOfIssueDriveLicense, driverLicenseViewModelDateOfIssueGetValue);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.dateOfIssueDriveLicense, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, dateOfIssueDriveLicenseandroidTextAttrChanged);
            this.sendBtn.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.serialAndNumberDriveLicense, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, serialAndNumberDriveLicenseandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.validUntilDriveLicense, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, validUntilDriveLicenseandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            com.saandrew.eldocuments.bind_adapter.BindingsAdapterKt.setText(this.sendBtn, driverLicenseViewModelMode);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.serialAndNumberDriveLicense, driverLicenseViewModelSerialAndNumberGetValue);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.validUntilDriveLicense, driverLicenseViewModelValidUntilGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // driverLicenseViewModel != null
        boolean driverLicenseViewModelJavaLangObjectNull = false;
        // driverLicenseViewModel
        com.saandrew.eldocuments.ui_doc.driver_license.DriverLicenseViewModel driverLicenseViewModel = mDriverLicenseViewModel;



        driverLicenseViewModelJavaLangObjectNull = (driverLicenseViewModel) != (null);
        if (driverLicenseViewModelJavaLangObjectNull) {


            driverLicenseViewModel.onBtnClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): driverLicenseViewModel.mode
        flag 1 (0x2L): driverLicenseViewModel.available
        flag 2 (0x3L): driverLicenseViewModel.validUntil
        flag 3 (0x4L): driverLicenseViewModel.dateOfIssue
        flag 4 (0x5L): driverLicenseViewModel.serialAndNumber
        flag 5 (0x6L): driverLicenseViewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}