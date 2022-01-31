package com.saandrew.eldocuments.databinding;
import com.saandrew.eldocuments.R;
import com.saandrew.eldocuments.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DriverLicenseItemBindingImpl extends DriverLicenseItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.driver_license_title, 2);
        sViewsWithIds.put(R.id.serial_and_number, 3);
        sViewsWithIds.put(R.id.date_of_issue, 4);
        sViewsWithIds.put(R.id.valid_until, 5);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DriverLicenseItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private DriverLicenseItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
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
        if (BR.driverLicense == variableId) {
            setDriverLicense((com.saandrew.eldocuments.api_model.DriverLicenseResponse) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDriverLicense(@Nullable com.saandrew.eldocuments.api_model.DriverLicenseResponse DriverLicense) {
        this.mDriverLicense = DriverLicense;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.driverLicense);
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
        com.saandrew.eldocuments.api_model.DriverLicenseResponse driverLicense = mDriverLicense;
        java.lang.String driverLicenseVerifying = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (driverLicense != null) {
                    // read driverLicense.verifying
                    driverLicenseVerifying = driverLicense.getVerifying();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.saandrew.eldocuments.bind_adapter.BindingsAdapterKt.bindImage(this.verifying, driverLicenseVerifying);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): driverLicense
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}