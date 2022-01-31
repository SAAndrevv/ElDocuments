package com.saandrew.eldocuments.databinding;
import com.saandrew.eldocuments.R;
import com.saandrew.eldocuments.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DocTypeChildrenBindingImpl extends DocTypeChildrenBinding  {

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
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DocTypeChildrenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private DocTypeChildrenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.switchmaterial.SwitchMaterial) bindings[1]
            );
        this.docSwitch.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.type == variableId) {
            setType((com.saandrew.eldocuments.api_model.Types) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setType(@Nullable com.saandrew.eldocuments.api_model.Types Type) {
        this.mType = Type;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.type);
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
        com.saandrew.eldocuments.api_model.Types type = mType;
        boolean typeAvailable = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (type != null) {
                    // read type.available
                    typeAvailable = type.getAvailable();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.docSwitch, typeAvailable);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): type
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}