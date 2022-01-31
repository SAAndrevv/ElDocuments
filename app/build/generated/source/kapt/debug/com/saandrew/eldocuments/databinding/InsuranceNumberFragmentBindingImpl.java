package com.saandrew.eldocuments.databinding;
import com.saandrew.eldocuments.R;
import com.saandrew.eldocuments.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class InsuranceNumberFragmentBindingImpl extends InsuranceNumberFragmentBinding implements com.saandrew.eldocuments.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener numberInsuranceNumberandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of insuranceNumberViewModel.number.getValue()
            //         is insuranceNumberViewModel.number.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(numberInsuranceNumber);
            // localize variables for thread safety
            // insuranceNumberViewModel
            com.saandrew.eldocuments.ui_doc.insurance_number.InsuranceNumberViewModel insuranceNumberViewModel = mInsuranceNumberViewModel;
            // insuranceNumberViewModel.number.getValue()
            java.lang.String insuranceNumberViewModelNumberGetValue = null;
            // insuranceNumberViewModel.number
            androidx.lifecycle.MutableLiveData<java.lang.String> insuranceNumberViewModelNumber = null;
            // insuranceNumberViewModel.number != null
            boolean insuranceNumberViewModelNumberJavaLangObjectNull = false;
            // insuranceNumberViewModel != null
            boolean insuranceNumberViewModelJavaLangObjectNull = false;



            insuranceNumberViewModelJavaLangObjectNull = (insuranceNumberViewModel) != (null);
            if (insuranceNumberViewModelJavaLangObjectNull) {


                insuranceNumberViewModelNumber = insuranceNumberViewModel.getNumber();

                insuranceNumberViewModelNumberJavaLangObjectNull = (insuranceNumberViewModelNumber) != (null);
                if (insuranceNumberViewModelNumberJavaLangObjectNull) {




                    insuranceNumberViewModelNumber.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public InsuranceNumberFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private InsuranceNumberFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.EditText) bindings[1]
            , (android.widget.Button) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.numberInsuranceNumber.setTag(null);
        this.sendBtn.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.saandrew.eldocuments.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.insuranceNumberViewModel == variableId) {
            setInsuranceNumberViewModel((com.saandrew.eldocuments.ui_doc.insurance_number.InsuranceNumberViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setInsuranceNumberViewModel(@Nullable com.saandrew.eldocuments.ui_doc.insurance_number.InsuranceNumberViewModel InsuranceNumberViewModel) {
        this.mInsuranceNumberViewModel = InsuranceNumberViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.insuranceNumberViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeInsuranceNumberViewModelMode((androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui_doc.EditMode>) object, fieldId);
            case 1 :
                return onChangeInsuranceNumberViewModelNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeInsuranceNumberViewModelMode(androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui_doc.EditMode> InsuranceNumberViewModelMode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeInsuranceNumberViewModelNumber(androidx.lifecycle.MutableLiveData<java.lang.String> InsuranceNumberViewModelNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        com.saandrew.eldocuments.ui_doc.insurance_number.InsuranceNumberViewModel insuranceNumberViewModel = mInsuranceNumberViewModel;
        java.lang.String insuranceNumberViewModelNumberGetValue = null;
        androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui_doc.EditMode> insuranceNumberViewModelMode = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> insuranceNumberViewModelNumber = null;
        com.saandrew.eldocuments.ui_doc.EditMode insuranceNumberViewModelModeGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (insuranceNumberViewModel != null) {
                        // read insuranceNumberViewModel.mode
                        insuranceNumberViewModelMode = insuranceNumberViewModel.getMode();
                    }
                    updateLiveDataRegistration(0, insuranceNumberViewModelMode);


                    if (insuranceNumberViewModelMode != null) {
                        // read insuranceNumberViewModel.mode.getValue()
                        insuranceNumberViewModelModeGetValue = insuranceNumberViewModelMode.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (insuranceNumberViewModel != null) {
                        // read insuranceNumberViewModel.number
                        insuranceNumberViewModelNumber = insuranceNumberViewModel.getNumber();
                    }
                    updateLiveDataRegistration(1, insuranceNumberViewModelNumber);


                    if (insuranceNumberViewModelNumber != null) {
                        // read insuranceNumberViewModel.number.getValue()
                        insuranceNumberViewModelNumberGetValue = insuranceNumberViewModelNumber.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.numberInsuranceNumber, insuranceNumberViewModelNumberGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.numberInsuranceNumber, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, numberInsuranceNumberandroidTextAttrChanged);
            this.sendBtn.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.saandrew.eldocuments.bind_adapter.BindingsAdapterKt.setText(this.sendBtn, insuranceNumberViewModelMode);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // insuranceNumberViewModel
        com.saandrew.eldocuments.ui_doc.insurance_number.InsuranceNumberViewModel insuranceNumberViewModel = mInsuranceNumberViewModel;
        // insuranceNumberViewModel != null
        boolean insuranceNumberViewModelJavaLangObjectNull = false;



        insuranceNumberViewModelJavaLangObjectNull = (insuranceNumberViewModel) != (null);
        if (insuranceNumberViewModelJavaLangObjectNull) {


            insuranceNumberViewModel.onBtnClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): insuranceNumberViewModel.mode
        flag 1 (0x2L): insuranceNumberViewModel.number
        flag 2 (0x3L): insuranceNumberViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}