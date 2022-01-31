package com.saandrew.eldocuments.databinding;
import com.saandrew.eldocuments.R;
import com.saandrew.eldocuments.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RegisterFragmentBindingImpl extends RegisterFragmentBinding implements com.saandrew.eldocuments.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener emailFieldandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerViewModel.email.getValue()
            //         is registerViewModel.email.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(emailField);
            // localize variables for thread safety
            // registerViewModel.email.getValue()
            java.lang.String registerViewModelEmailGetValue = null;
            // registerViewModel != null
            boolean registerViewModelJavaLangObjectNull = false;
            // registerViewModel
            com.saandrew.eldocuments.enter.RegisterViewModel registerViewModel = mRegisterViewModel;
            // registerViewModel.email
            androidx.lifecycle.MutableLiveData<java.lang.String> registerViewModelEmail = null;
            // registerViewModel.email != null
            boolean registerViewModelEmailJavaLangObjectNull = false;



            registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
            if (registerViewModelJavaLangObjectNull) {


                registerViewModelEmail = registerViewModel.getEmail();

                registerViewModelEmailJavaLangObjectNull = (registerViewModelEmail) != (null);
                if (registerViewModelEmailJavaLangObjectNull) {




                    registerViewModelEmail.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener passwordFieldandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerViewModel.password.getValue()
            //         is registerViewModel.password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(passwordField);
            // localize variables for thread safety
            // registerViewModel.password != null
            boolean registerViewModelPasswordJavaLangObjectNull = false;
            // registerViewModel != null
            boolean registerViewModelJavaLangObjectNull = false;
            // registerViewModel
            com.saandrew.eldocuments.enter.RegisterViewModel registerViewModel = mRegisterViewModel;
            // registerViewModel.password
            androidx.lifecycle.MutableLiveData<java.lang.String> registerViewModelPassword = null;
            // registerViewModel.password.getValue()
            java.lang.String registerViewModelPasswordGetValue = null;



            registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
            if (registerViewModelJavaLangObjectNull) {


                registerViewModelPassword = registerViewModel.getPassword();

                registerViewModelPasswordJavaLangObjectNull = (registerViewModelPassword) != (null);
                if (registerViewModelPasswordJavaLangObjectNull) {




                    registerViewModelPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public RegisterFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private RegisterFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.Button) bindings[3]
            );
        this.emailField.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.passwordField.setTag(null);
        this.registerConfirm.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new com.saandrew.eldocuments.generated.callback.OnClickListener(this, 1);
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
        if (BR.registerFragment == variableId) {
            setRegisterFragment((com.saandrew.eldocuments.enter.RegisterFragment) variable);
        }
        else if (BR.registerViewModel == variableId) {
            setRegisterViewModel((com.saandrew.eldocuments.enter.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRegisterFragment(@Nullable com.saandrew.eldocuments.enter.RegisterFragment RegisterFragment) {
        this.mRegisterFragment = RegisterFragment;
    }
    public void setRegisterViewModel(@Nullable com.saandrew.eldocuments.enter.RegisterViewModel RegisterViewModel) {
        this.mRegisterViewModel = RegisterViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.registerViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRegisterViewModelPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeRegisterViewModelEmail((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRegisterViewModelPassword(androidx.lifecycle.MutableLiveData<java.lang.String> RegisterViewModelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterViewModelEmail(androidx.lifecycle.MutableLiveData<java.lang.String> RegisterViewModelEmail, int fieldId) {
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
        java.lang.String registerViewModelEmailGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> registerViewModelPassword = null;
        com.saandrew.eldocuments.enter.RegisterViewModel registerViewModel = mRegisterViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> registerViewModelEmail = null;
        java.lang.String registerViewModelPasswordGetValue = null;

        if ((dirtyFlags & 0x1bL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (registerViewModel != null) {
                        // read registerViewModel.password
                        registerViewModelPassword = registerViewModel.getPassword();
                    }
                    updateLiveDataRegistration(0, registerViewModelPassword);


                    if (registerViewModelPassword != null) {
                        // read registerViewModel.password.getValue()
                        registerViewModelPasswordGetValue = registerViewModelPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (registerViewModel != null) {
                        // read registerViewModel.email
                        registerViewModelEmail = registerViewModel.getEmail();
                    }
                    updateLiveDataRegistration(1, registerViewModelEmail);


                    if (registerViewModelEmail != null) {
                        // read registerViewModel.email.getValue()
                        registerViewModelEmailGetValue = registerViewModelEmail.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.emailField, registerViewModelEmailGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.emailField, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, emailFieldandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.passwordField, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, passwordFieldandroidTextAttrChanged);
            this.registerConfirm.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.passwordField, registerViewModelPasswordGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // registerViewModel != null
        boolean registerViewModelJavaLangObjectNull = false;
        // registerViewModel
        com.saandrew.eldocuments.enter.RegisterViewModel registerViewModel = mRegisterViewModel;



        registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
        if (registerViewModelJavaLangObjectNull) {


            registerViewModel.register();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): registerViewModel.password
        flag 1 (0x2L): registerViewModel.email
        flag 2 (0x3L): registerFragment
        flag 3 (0x4L): registerViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}