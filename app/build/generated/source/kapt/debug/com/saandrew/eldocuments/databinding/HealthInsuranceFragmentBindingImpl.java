package com.saandrew.eldocuments.databinding;
import com.saandrew.eldocuments.R;
import com.saandrew.eldocuments.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HealthInsuranceFragmentBindingImpl extends HealthInsuranceFragmentBinding implements com.saandrew.eldocuments.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener numberHealthInsuranceandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of healthInsuranceViewModel.number.getValue()
            //         is healthInsuranceViewModel.number.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(numberHealthInsurance);
            // localize variables for thread safety
            // healthInsuranceViewModel.number != null
            boolean healthInsuranceViewModelNumberJavaLangObjectNull = false;
            // healthInsuranceViewModel != null
            boolean healthInsuranceViewModelJavaLangObjectNull = false;
            // healthInsuranceViewModel.number
            androidx.lifecycle.MutableLiveData<java.lang.String> healthInsuranceViewModelNumber = null;
            // healthInsuranceViewModel
            com.saandrew.eldocuments.ui_doc.health_insurance.HealthInsuranceViewModel healthInsuranceViewModel = mHealthInsuranceViewModel;
            // healthInsuranceViewModel.number.getValue()
            java.lang.String healthInsuranceViewModelNumberGetValue = null;



            healthInsuranceViewModelJavaLangObjectNull = (healthInsuranceViewModel) != (null);
            if (healthInsuranceViewModelJavaLangObjectNull) {


                healthInsuranceViewModelNumber = healthInsuranceViewModel.getNumber();

                healthInsuranceViewModelNumberJavaLangObjectNull = (healthInsuranceViewModelNumber) != (null);
                if (healthInsuranceViewModelNumberJavaLangObjectNull) {




                    healthInsuranceViewModelNumber.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener validUntilHealthInsuranceandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of healthInsuranceViewModel.validUntil.getValue()
            //         is healthInsuranceViewModel.validUntil.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(validUntilHealthInsurance);
            // localize variables for thread safety
            // healthInsuranceViewModel != null
            boolean healthInsuranceViewModelJavaLangObjectNull = false;
            // healthInsuranceViewModel.validUntil.getValue()
            java.lang.String healthInsuranceViewModelValidUntilGetValue = null;
            // healthInsuranceViewModel.validUntil
            androidx.lifecycle.MutableLiveData<java.lang.String> healthInsuranceViewModelValidUntil = null;
            // healthInsuranceViewModel
            com.saandrew.eldocuments.ui_doc.health_insurance.HealthInsuranceViewModel healthInsuranceViewModel = mHealthInsuranceViewModel;
            // healthInsuranceViewModel.validUntil != null
            boolean healthInsuranceViewModelValidUntilJavaLangObjectNull = false;



            healthInsuranceViewModelJavaLangObjectNull = (healthInsuranceViewModel) != (null);
            if (healthInsuranceViewModelJavaLangObjectNull) {


                healthInsuranceViewModelValidUntil = healthInsuranceViewModel.getValidUntil();

                healthInsuranceViewModelValidUntilJavaLangObjectNull = (healthInsuranceViewModelValidUntil) != (null);
                if (healthInsuranceViewModelValidUntilJavaLangObjectNull) {




                    healthInsuranceViewModelValidUntil.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public HealthInsuranceFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private HealthInsuranceFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.EditText) bindings[1]
            , (android.widget.Button) bindings[3]
            , (android.widget.EditText) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.numberHealthInsurance.setTag(null);
        this.sendBtn.setTag(null);
        this.validUntilHealthInsurance.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.saandrew.eldocuments.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.healthInsuranceViewModel == variableId) {
            setHealthInsuranceViewModel((com.saandrew.eldocuments.ui_doc.health_insurance.HealthInsuranceViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHealthInsuranceViewModel(@Nullable com.saandrew.eldocuments.ui_doc.health_insurance.HealthInsuranceViewModel HealthInsuranceViewModel) {
        this.mHealthInsuranceViewModel = HealthInsuranceViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.healthInsuranceViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHealthInsuranceViewModelNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeHealthInsuranceViewModelValidUntil((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeHealthInsuranceViewModelMode((androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui_doc.EditMode>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHealthInsuranceViewModelNumber(androidx.lifecycle.MutableLiveData<java.lang.String> HealthInsuranceViewModelNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHealthInsuranceViewModelValidUntil(androidx.lifecycle.MutableLiveData<java.lang.String> HealthInsuranceViewModelValidUntil, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHealthInsuranceViewModelMode(androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui_doc.EditMode> HealthInsuranceViewModelMode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String healthInsuranceViewModelValidUntilGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> healthInsuranceViewModelNumber = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> healthInsuranceViewModelValidUntil = null;
        com.saandrew.eldocuments.ui_doc.health_insurance.HealthInsuranceViewModel healthInsuranceViewModel = mHealthInsuranceViewModel;
        androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui_doc.EditMode> healthInsuranceViewModelMode = null;
        java.lang.String healthInsuranceViewModelNumberGetValue = null;
        com.saandrew.eldocuments.ui_doc.EditMode healthInsuranceViewModelModeGetValue = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (healthInsuranceViewModel != null) {
                        // read healthInsuranceViewModel.number
                        healthInsuranceViewModelNumber = healthInsuranceViewModel.getNumber();
                    }
                    updateLiveDataRegistration(0, healthInsuranceViewModelNumber);


                    if (healthInsuranceViewModelNumber != null) {
                        // read healthInsuranceViewModel.number.getValue()
                        healthInsuranceViewModelNumberGetValue = healthInsuranceViewModelNumber.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (healthInsuranceViewModel != null) {
                        // read healthInsuranceViewModel.validUntil
                        healthInsuranceViewModelValidUntil = healthInsuranceViewModel.getValidUntil();
                    }
                    updateLiveDataRegistration(1, healthInsuranceViewModelValidUntil);


                    if (healthInsuranceViewModelValidUntil != null) {
                        // read healthInsuranceViewModel.validUntil.getValue()
                        healthInsuranceViewModelValidUntilGetValue = healthInsuranceViewModelValidUntil.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (healthInsuranceViewModel != null) {
                        // read healthInsuranceViewModel.mode
                        healthInsuranceViewModelMode = healthInsuranceViewModel.getMode();
                    }
                    updateLiveDataRegistration(2, healthInsuranceViewModelMode);


                    if (healthInsuranceViewModelMode != null) {
                        // read healthInsuranceViewModel.mode.getValue()
                        healthInsuranceViewModelModeGetValue = healthInsuranceViewModelMode.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.numberHealthInsurance, healthInsuranceViewModelNumberGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.numberHealthInsurance, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, numberHealthInsuranceandroidTextAttrChanged);
            this.sendBtn.setOnClickListener(mCallback6);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.validUntilHealthInsurance, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, validUntilHealthInsuranceandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            com.saandrew.eldocuments.bind_adapter.BindingsAdapterKt.setText(this.sendBtn, healthInsuranceViewModelMode);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.validUntilHealthInsurance, healthInsuranceViewModelValidUntilGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // healthInsuranceViewModel != null
        boolean healthInsuranceViewModelJavaLangObjectNull = false;
        // healthInsuranceViewModel
        com.saandrew.eldocuments.ui_doc.health_insurance.HealthInsuranceViewModel healthInsuranceViewModel = mHealthInsuranceViewModel;



        healthInsuranceViewModelJavaLangObjectNull = (healthInsuranceViewModel) != (null);
        if (healthInsuranceViewModelJavaLangObjectNull) {


            healthInsuranceViewModel.onBtnClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): healthInsuranceViewModel.number
        flag 1 (0x2L): healthInsuranceViewModel.validUntil
        flag 2 (0x3L): healthInsuranceViewModel.mode
        flag 3 (0x4L): healthInsuranceViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}