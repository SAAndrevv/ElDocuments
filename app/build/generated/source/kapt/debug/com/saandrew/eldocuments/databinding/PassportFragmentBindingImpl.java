package com.saandrew.eldocuments.databinding;
import com.saandrew.eldocuments.R;
import com.saandrew.eldocuments.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PassportFragmentBindingImpl extends PassportFragmentBinding implements com.saandrew.eldocuments.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener dateOfReceivingPassandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of passportViewModel.dateOfReceiving.getValue()
            //         is passportViewModel.dateOfReceiving.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(dateOfReceivingPass);
            // localize variables for thread safety
            // passportViewModel != null
            boolean passportViewModelJavaLangObjectNull = false;
            // passportViewModel.dateOfReceiving.getValue()
            java.lang.String passportViewModelDateOfReceivingGetValue = null;
            // passportViewModel.dateOfReceiving != null
            boolean passportViewModelDateOfReceivingJavaLangObjectNull = false;
            // passportViewModel
            com.saandrew.eldocuments.ui_doc.passport.PassportViewModel passportViewModel = mPassportViewModel;
            // passportViewModel.dateOfReceiving
            androidx.lifecycle.MutableLiveData<java.lang.String> passportViewModelDateOfReceiving = null;



            passportViewModelJavaLangObjectNull = (passportViewModel) != (null);
            if (passportViewModelJavaLangObjectNull) {


                passportViewModelDateOfReceiving = passportViewModel.getDateOfReceiving();

                passportViewModelDateOfReceivingJavaLangObjectNull = (passportViewModelDateOfReceiving) != (null);
                if (passportViewModelDateOfReceivingJavaLangObjectNull) {




                    passportViewModelDateOfReceiving.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener departmentCodePassandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of passportViewModel.departmentCode.getValue()
            //         is passportViewModel.departmentCode.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(departmentCodePass);
            // localize variables for thread safety
            // passportViewModel != null
            boolean passportViewModelJavaLangObjectNull = false;
            // passportViewModel.departmentCode != null
            boolean passportViewModelDepartmentCodeJavaLangObjectNull = false;
            // passportViewModel.departmentCode.getValue()
            java.lang.String passportViewModelDepartmentCodeGetValue = null;
            // passportViewModel.departmentCode
            androidx.lifecycle.MutableLiveData<java.lang.String> passportViewModelDepartmentCode = null;
            // passportViewModel
            com.saandrew.eldocuments.ui_doc.passport.PassportViewModel passportViewModel = mPassportViewModel;



            passportViewModelJavaLangObjectNull = (passportViewModel) != (null);
            if (passportViewModelJavaLangObjectNull) {


                passportViewModelDepartmentCode = passportViewModel.getDepartmentCode();

                passportViewModelDepartmentCodeJavaLangObjectNull = (passportViewModelDepartmentCode) != (null);
                if (passportViewModelDepartmentCodeJavaLangObjectNull) {




                    passportViewModelDepartmentCode.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener issuedByPassandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of passportViewModel.issuedBy.getValue()
            //         is passportViewModel.issuedBy.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(issuedByPass);
            // localize variables for thread safety
            // passportViewModel.issuedBy
            androidx.lifecycle.MutableLiveData<java.lang.String> passportViewModelIssuedBy = null;
            // passportViewModel != null
            boolean passportViewModelJavaLangObjectNull = false;
            // passportViewModel.issuedBy != null
            boolean passportViewModelIssuedByJavaLangObjectNull = false;
            // passportViewModel.issuedBy.getValue()
            java.lang.String passportViewModelIssuedByGetValue = null;
            // passportViewModel
            com.saandrew.eldocuments.ui_doc.passport.PassportViewModel passportViewModel = mPassportViewModel;



            passportViewModelJavaLangObjectNull = (passportViewModel) != (null);
            if (passportViewModelJavaLangObjectNull) {


                passportViewModelIssuedBy = passportViewModel.getIssuedBy();

                passportViewModelIssuedByJavaLangObjectNull = (passportViewModelIssuedBy) != (null);
                if (passportViewModelIssuedByJavaLangObjectNull) {




                    passportViewModelIssuedBy.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener placeOfBirthPassandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of passportViewModel.placeOfBirth.getValue()
            //         is passportViewModel.placeOfBirth.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(placeOfBirthPass);
            // localize variables for thread safety
            // passportViewModel.placeOfBirth
            androidx.lifecycle.MutableLiveData<java.lang.String> passportViewModelPlaceOfBirth = null;
            // passportViewModel != null
            boolean passportViewModelJavaLangObjectNull = false;
            // passportViewModel.placeOfBirth.getValue()
            java.lang.String passportViewModelPlaceOfBirthGetValue = null;
            // passportViewModel.placeOfBirth != null
            boolean passportViewModelPlaceOfBirthJavaLangObjectNull = false;
            // passportViewModel
            com.saandrew.eldocuments.ui_doc.passport.PassportViewModel passportViewModel = mPassportViewModel;



            passportViewModelJavaLangObjectNull = (passportViewModel) != (null);
            if (passportViewModelJavaLangObjectNull) {


                passportViewModelPlaceOfBirth = passportViewModel.getPlaceOfBirth();

                passportViewModelPlaceOfBirthJavaLangObjectNull = (passportViewModelPlaceOfBirth) != (null);
                if (passportViewModelPlaceOfBirthJavaLangObjectNull) {




                    passportViewModelPlaceOfBirth.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener serialAndNumberPassandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of passportViewModel.serialAndNumber.getValue()
            //         is passportViewModel.serialAndNumber.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(serialAndNumberPass);
            // localize variables for thread safety
            // passportViewModel != null
            boolean passportViewModelJavaLangObjectNull = false;
            // passportViewModel.serialAndNumber
            androidx.lifecycle.MutableLiveData<java.lang.String> passportViewModelSerialAndNumber = null;
            // passportViewModel.serialAndNumber.getValue()
            java.lang.String passportViewModelSerialAndNumberGetValue = null;
            // passportViewModel.serialAndNumber != null
            boolean passportViewModelSerialAndNumberJavaLangObjectNull = false;
            // passportViewModel
            com.saandrew.eldocuments.ui_doc.passport.PassportViewModel passportViewModel = mPassportViewModel;



            passportViewModelJavaLangObjectNull = (passportViewModel) != (null);
            if (passportViewModelJavaLangObjectNull) {


                passportViewModelSerialAndNumber = passportViewModel.getSerialAndNumber();

                passportViewModelSerialAndNumberJavaLangObjectNull = (passportViewModelSerialAndNumber) != (null);
                if (passportViewModelSerialAndNumberJavaLangObjectNull) {




                    passportViewModelSerialAndNumber.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public PassportFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private PassportFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[3]
            , (android.widget.Button) bindings[7]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            );
        this.dateOfReceivingPass.setTag(null);
        this.departmentCodePass.setTag(null);
        this.issuedByPass.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.placeOfBirthPass.setTag(null);
        this.sendBtn.setTag(null);
        this.serialAndNumberPass.setTag(null);
        this.typePass.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new com.saandrew.eldocuments.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
        if (BR.passportViewModel == variableId) {
            setPassportViewModel((com.saandrew.eldocuments.ui_doc.passport.PassportViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPassportViewModel(@Nullable com.saandrew.eldocuments.ui_doc.passport.PassportViewModel PassportViewModel) {
        this.mPassportViewModel = PassportViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.passportViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePassportViewModelIssuedBy((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangePassportViewModelType((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangePassportViewModelDepartmentCode((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangePassportViewModelDateOfReceiving((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangePassportViewModelPlaceOfBirth((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangePassportViewModelMode((androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui_doc.EditMode>) object, fieldId);
            case 6 :
                return onChangePassportViewModelAvailable((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangePassportViewModelSerialAndNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangePassportViewModelIssuedBy(androidx.lifecycle.MutableLiveData<java.lang.String> PassportViewModelIssuedBy, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePassportViewModelType(androidx.lifecycle.LiveData<java.lang.String> PassportViewModelType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePassportViewModelDepartmentCode(androidx.lifecycle.MutableLiveData<java.lang.String> PassportViewModelDepartmentCode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePassportViewModelDateOfReceiving(androidx.lifecycle.MutableLiveData<java.lang.String> PassportViewModelDateOfReceiving, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePassportViewModelPlaceOfBirth(androidx.lifecycle.MutableLiveData<java.lang.String> PassportViewModelPlaceOfBirth, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePassportViewModelMode(androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui_doc.EditMode> PassportViewModelMode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePassportViewModelAvailable(androidx.lifecycle.LiveData<java.lang.Boolean> PassportViewModelAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePassportViewModelSerialAndNumber(androidx.lifecycle.MutableLiveData<java.lang.String> PassportViewModelSerialAndNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        androidx.lifecycle.MutableLiveData<java.lang.String> passportViewModelIssuedBy = null;
        java.lang.String passportViewModelDateOfReceivingGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> passportViewModelType = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> passportViewModelDepartmentCode = null;
        java.lang.Boolean passportViewModelAvailableGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> passportViewModelDateOfReceiving = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> passportViewModelPlaceOfBirth = null;
        java.lang.String passportViewModelSerialAndNumberGetValue = null;
        androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui_doc.EditMode> passportViewModelMode = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxPassportViewModelAvailableGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> passportViewModelAvailable = null;
        java.lang.String passportViewModelPlaceOfBirthGetValue = null;
        com.saandrew.eldocuments.ui_doc.EditMode passportViewModelModeGetValue = null;
        java.lang.String passportViewModelIssuedByGetValue = null;
        java.lang.String passportViewModelTypeGetValue = null;
        com.saandrew.eldocuments.ui_doc.passport.PassportViewModel passportViewModel = mPassportViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> passportViewModelSerialAndNumber = null;
        java.lang.String passportViewModelDepartmentCodeGetValue = null;

        if ((dirtyFlags & 0x3ffL) != 0) {


            if ((dirtyFlags & 0x301L) != 0) {

                    if (passportViewModel != null) {
                        // read passportViewModel.issuedBy
                        passportViewModelIssuedBy = passportViewModel.getIssuedBy();
                    }
                    updateLiveDataRegistration(0, passportViewModelIssuedBy);


                    if (passportViewModelIssuedBy != null) {
                        // read passportViewModel.issuedBy.getValue()
                        passportViewModelIssuedByGetValue = passportViewModelIssuedBy.getValue();
                    }
            }
            if ((dirtyFlags & 0x302L) != 0) {

                    if (passportViewModel != null) {
                        // read passportViewModel.type
                        passportViewModelType = passportViewModel.getType();
                    }
                    updateLiveDataRegistration(1, passportViewModelType);


                    if (passportViewModelType != null) {
                        // read passportViewModel.type.getValue()
                        passportViewModelTypeGetValue = passportViewModelType.getValue();
                    }
            }
            if ((dirtyFlags & 0x304L) != 0) {

                    if (passportViewModel != null) {
                        // read passportViewModel.departmentCode
                        passportViewModelDepartmentCode = passportViewModel.getDepartmentCode();
                    }
                    updateLiveDataRegistration(2, passportViewModelDepartmentCode);


                    if (passportViewModelDepartmentCode != null) {
                        // read passportViewModel.departmentCode.getValue()
                        passportViewModelDepartmentCodeGetValue = passportViewModelDepartmentCode.getValue();
                    }
            }
            if ((dirtyFlags & 0x308L) != 0) {

                    if (passportViewModel != null) {
                        // read passportViewModel.dateOfReceiving
                        passportViewModelDateOfReceiving = passportViewModel.getDateOfReceiving();
                    }
                    updateLiveDataRegistration(3, passportViewModelDateOfReceiving);


                    if (passportViewModelDateOfReceiving != null) {
                        // read passportViewModel.dateOfReceiving.getValue()
                        passportViewModelDateOfReceivingGetValue = passportViewModelDateOfReceiving.getValue();
                    }
            }
            if ((dirtyFlags & 0x310L) != 0) {

                    if (passportViewModel != null) {
                        // read passportViewModel.placeOfBirth
                        passportViewModelPlaceOfBirth = passportViewModel.getPlaceOfBirth();
                    }
                    updateLiveDataRegistration(4, passportViewModelPlaceOfBirth);


                    if (passportViewModelPlaceOfBirth != null) {
                        // read passportViewModel.placeOfBirth.getValue()
                        passportViewModelPlaceOfBirthGetValue = passportViewModelPlaceOfBirth.getValue();
                    }
            }
            if ((dirtyFlags & 0x320L) != 0) {

                    if (passportViewModel != null) {
                        // read passportViewModel.mode
                        passportViewModelMode = passportViewModel.getMode();
                    }
                    updateLiveDataRegistration(5, passportViewModelMode);


                    if (passportViewModelMode != null) {
                        // read passportViewModel.mode.getValue()
                        passportViewModelModeGetValue = passportViewModelMode.getValue();
                    }
            }
            if ((dirtyFlags & 0x340L) != 0) {

                    if (passportViewModel != null) {
                        // read passportViewModel.available
                        passportViewModelAvailable = passportViewModel.getAvailable();
                    }
                    updateLiveDataRegistration(6, passportViewModelAvailable);


                    if (passportViewModelAvailable != null) {
                        // read passportViewModel.available.getValue()
                        passportViewModelAvailableGetValue = passportViewModelAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(passportViewModel.available.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxPassportViewModelAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(passportViewModelAvailableGetValue);
            }
            if ((dirtyFlags & 0x380L) != 0) {

                    if (passportViewModel != null) {
                        // read passportViewModel.serialAndNumber
                        passportViewModelSerialAndNumber = passportViewModel.getSerialAndNumber();
                    }
                    updateLiveDataRegistration(7, passportViewModelSerialAndNumber);


                    if (passportViewModelSerialAndNumber != null) {
                        // read passportViewModel.serialAndNumber.getValue()
                        passportViewModelSerialAndNumberGetValue = passportViewModelSerialAndNumber.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x340L) != 0) {
            // api target 1

            this.dateOfReceivingPass.setEnabled(androidxDatabindingViewDataBindingSafeUnboxPassportViewModelAvailableGetValue);
            this.departmentCodePass.setEnabled(androidxDatabindingViewDataBindingSafeUnboxPassportViewModelAvailableGetValue);
            this.issuedByPass.setEnabled(androidxDatabindingViewDataBindingSafeUnboxPassportViewModelAvailableGetValue);
            this.placeOfBirthPass.setEnabled(androidxDatabindingViewDataBindingSafeUnboxPassportViewModelAvailableGetValue);
            this.serialAndNumberPass.setEnabled(androidxDatabindingViewDataBindingSafeUnboxPassportViewModelAvailableGetValue);
        }
        if ((dirtyFlags & 0x308L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dateOfReceivingPass, passportViewModelDateOfReceivingGetValue);
        }
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.dateOfReceivingPass, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, dateOfReceivingPassandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.departmentCodePass, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, departmentCodePassandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.issuedByPass, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, issuedByPassandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.placeOfBirthPass, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, placeOfBirthPassandroidTextAttrChanged);
            this.sendBtn.setOnClickListener(mCallback10);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.serialAndNumberPass, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, serialAndNumberPassandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x304L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.departmentCodePass, passportViewModelDepartmentCodeGetValue);
        }
        if ((dirtyFlags & 0x301L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.issuedByPass, passportViewModelIssuedByGetValue);
        }
        if ((dirtyFlags & 0x310L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.placeOfBirthPass, passportViewModelPlaceOfBirthGetValue);
        }
        if ((dirtyFlags & 0x320L) != 0) {
            // api target 1

            com.saandrew.eldocuments.bind_adapter.BindingsAdapterKt.setText(this.sendBtn, passportViewModelMode);
        }
        if ((dirtyFlags & 0x380L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.serialAndNumberPass, passportViewModelSerialAndNumberGetValue);
        }
        if ((dirtyFlags & 0x302L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.typePass, passportViewModelTypeGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // passportViewModel != null
        boolean passportViewModelJavaLangObjectNull = false;
        // passportViewModel
        com.saandrew.eldocuments.ui_doc.passport.PassportViewModel passportViewModel = mPassportViewModel;



        passportViewModelJavaLangObjectNull = (passportViewModel) != (null);
        if (passportViewModelJavaLangObjectNull) {


            passportViewModel.onBtnClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): passportViewModel.issuedBy
        flag 1 (0x2L): passportViewModel.type
        flag 2 (0x3L): passportViewModel.departmentCode
        flag 3 (0x4L): passportViewModel.dateOfReceiving
        flag 4 (0x5L): passportViewModel.placeOfBirth
        flag 5 (0x6L): passportViewModel.mode
        flag 6 (0x7L): passportViewModel.available
        flag 7 (0x8L): passportViewModel.serialAndNumber
        flag 8 (0x9L): passportViewModel
        flag 9 (0xaL): null
    flag mapping end*/
    //end
}