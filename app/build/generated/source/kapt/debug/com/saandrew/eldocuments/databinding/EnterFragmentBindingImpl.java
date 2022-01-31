package com.saandrew.eldocuments.databinding;
import com.saandrew.eldocuments.R;
import com.saandrew.eldocuments.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EnterFragmentBindingImpl extends EnterFragmentBinding implements com.saandrew.eldocuments.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.emailField, 5);
        sViewsWithIds.put(R.id.passwordField, 6);
        sViewsWithIds.put(R.id.textView, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView1;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of enterViewModel.email.getValue()
            //         is enterViewModel.email.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // enterViewModel != null
            boolean enterViewModelJavaLangObjectNull = false;
            // enterViewModel.email != null
            boolean enterViewModelEmailJavaLangObjectNull = false;
            // enterViewModel.email.getValue()
            java.lang.String enterViewModelEmailGetValue = null;
            // enterViewModel
            com.saandrew.eldocuments.enter.EnterViewModel enterViewModel = mEnterViewModel;
            // enterViewModel.email
            androidx.lifecycle.MutableLiveData<java.lang.String> enterViewModelEmail = null;



            enterViewModelJavaLangObjectNull = (enterViewModel) != (null);
            if (enterViewModelJavaLangObjectNull) {


                enterViewModelEmail = enterViewModel.getEmail();

                enterViewModelEmailJavaLangObjectNull = (enterViewModelEmail) != (null);
                if (enterViewModelEmailJavaLangObjectNull) {




                    enterViewModelEmail.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of enterViewModel.password.getValue()
            //         is enterViewModel.password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // enterViewModel != null
            boolean enterViewModelJavaLangObjectNull = false;
            // enterViewModel.password
            androidx.lifecycle.MutableLiveData<java.lang.String> enterViewModelPassword = null;
            // enterViewModel.password.getValue()
            java.lang.String enterViewModelPasswordGetValue = null;
            // enterViewModel.password != null
            boolean enterViewModelPasswordJavaLangObjectNull = false;
            // enterViewModel
            com.saandrew.eldocuments.enter.EnterViewModel enterViewModel = mEnterViewModel;



            enterViewModelJavaLangObjectNull = (enterViewModel) != (null);
            if (enterViewModelJavaLangObjectNull) {


                enterViewModelPassword = enterViewModel.getPassword();

                enterViewModelPasswordJavaLangObjectNull = (enterViewModelPassword) != (null);
                if (enterViewModelPasswordJavaLangObjectNull) {




                    enterViewModelPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public EnterFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private EnterFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (android.widget.Button) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (android.widget.TextView) bindings[7]
            );
        this.enterBtn.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputEditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.registerBtn.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.saandrew.eldocuments.generated.callback.OnClickListener(this, 1);
        mCallback8 = new com.saandrew.eldocuments.generated.callback.OnClickListener(this, 2);
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
        if (BR.enterFragment == variableId) {
            setEnterFragment((com.saandrew.eldocuments.enter.EnterFragment) variable);
        }
        else if (BR.enterViewModel == variableId) {
            setEnterViewModel((com.saandrew.eldocuments.enter.EnterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEnterFragment(@Nullable com.saandrew.eldocuments.enter.EnterFragment EnterFragment) {
        this.mEnterFragment = EnterFragment;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.enterFragment);
        super.requestRebind();
    }
    public void setEnterViewModel(@Nullable com.saandrew.eldocuments.enter.EnterViewModel EnterViewModel) {
        this.mEnterViewModel = EnterViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.enterViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeEnterViewModelPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeEnterViewModelEmail((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeEnterViewModelPassword(androidx.lifecycle.MutableLiveData<java.lang.String> EnterViewModelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEnterViewModelEmail(androidx.lifecycle.MutableLiveData<java.lang.String> EnterViewModelEmail, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.String> enterViewModelPassword = null;
        java.lang.String enterViewModelPasswordGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> enterViewModelEmail = null;
        java.lang.String enterViewModelEmailGetValue = null;
        com.saandrew.eldocuments.enter.EnterFragment enterFragment = mEnterFragment;
        com.saandrew.eldocuments.enter.EnterViewModel enterViewModel = mEnterViewModel;

        if ((dirtyFlags & 0x1bL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (enterViewModel != null) {
                        // read enterViewModel.password
                        enterViewModelPassword = enterViewModel.getPassword();
                    }
                    updateLiveDataRegistration(0, enterViewModelPassword);


                    if (enterViewModelPassword != null) {
                        // read enterViewModel.password.getValue()
                        enterViewModelPasswordGetValue = enterViewModelPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (enterViewModel != null) {
                        // read enterViewModel.email
                        enterViewModelEmail = enterViewModel.getEmail();
                    }
                    updateLiveDataRegistration(1, enterViewModelEmail);


                    if (enterViewModelEmail != null) {
                        // read enterViewModel.email.getValue()
                        enterViewModelEmailGetValue = enterViewModelEmail.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.enterBtn.setOnClickListener(mCallback7);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            this.registerBtn.setOnClickListener(mCallback8);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, enterViewModelEmailGetValue);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, enterViewModelPasswordGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // enterViewModel != null
                boolean enterViewModelJavaLangObjectNull = false;
                // enterViewModel
                com.saandrew.eldocuments.enter.EnterViewModel enterViewModel = mEnterViewModel;



                enterViewModelJavaLangObjectNull = (enterViewModel) != (null);
                if (enterViewModelJavaLangObjectNull) {


                    enterViewModel.login();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // enterFragment != null
                boolean enterFragmentJavaLangObjectNull = false;
                // enterFragment
                com.saandrew.eldocuments.enter.EnterFragment enterFragment = mEnterFragment;



                enterFragmentJavaLangObjectNull = (enterFragment) != (null);
                if (enterFragmentJavaLangObjectNull) {


                    enterFragment.onRegistrationButton();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): enterViewModel.password
        flag 1 (0x2L): enterViewModel.email
        flag 2 (0x3L): enterFragment
        flag 3 (0x4L): enterViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}