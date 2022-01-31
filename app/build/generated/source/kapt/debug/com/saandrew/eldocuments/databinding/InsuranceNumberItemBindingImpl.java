package com.saandrew.eldocuments.databinding;
import com.saandrew.eldocuments.R;
import com.saandrew.eldocuments.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class InsuranceNumberItemBindingImpl extends InsuranceNumberItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.insurance_number_title, 2);
        sViewsWithIds.put(R.id.number, 3);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public InsuranceNumberItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private InsuranceNumberItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            );
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.verifying.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.insuranceNumber == variableId) {
            setInsuranceNumber((com.saandrew.eldocuments.api_model.InsuranceNumberResponse) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setInsuranceNumber(@Nullable com.saandrew.eldocuments.api_model.InsuranceNumberResponse InsuranceNumber) {
        this.mInsuranceNumber = InsuranceNumber;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.insuranceNumber);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.saandrew.eldocuments.api_model.InsuranceNumberResponse insuranceNumber = mInsuranceNumber;
        java.lang.String insuranceNumberVerifying = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (insuranceNumber != null) {
                    // read insuranceNumber.verifying
                    insuranceNumberVerifying = insuranceNumber.getVerifying();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.saandrew.eldocuments.bind_adapter.BindingsAdapterKt.bindImage(this.verifying, insuranceNumberVerifying);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): insuranceNumber
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}