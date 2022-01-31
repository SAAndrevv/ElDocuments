package com.saandrew.eldocuments.databinding;
import com.saandrew.eldocuments.R;
import com.saandrew.eldocuments.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HealthInsuranceItemBindingImpl extends HealthInsuranceItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.health_insurance_title, 2);
        sViewsWithIds.put(R.id.number, 3);
        sViewsWithIds.put(R.id.valid_until, 4);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HealthInsuranceItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private HealthInsuranceItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
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
        if (BR.healthInsurance == variableId) {
            setHealthInsurance((com.saandrew.eldocuments.api_model.HealthInsuranceResponse) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHealthInsurance(@Nullable com.saandrew.eldocuments.api_model.HealthInsuranceResponse HealthInsurance) {
        this.mHealthInsurance = HealthInsurance;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.healthInsurance);
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
        com.saandrew.eldocuments.api_model.HealthInsuranceResponse healthInsurance = mHealthInsurance;
        java.lang.String healthInsuranceVerifying = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (healthInsurance != null) {
                    // read healthInsurance.verifying
                    healthInsuranceVerifying = healthInsurance.getVerifying();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.saandrew.eldocuments.bind_adapter.BindingsAdapterKt.bindImage(this.verifying, healthInsuranceVerifying);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): healthInsurance
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}