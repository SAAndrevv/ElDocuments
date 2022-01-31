package com.saandrew.eldocuments.databinding;
import com.saandrew.eldocuments.R;
import com.saandrew.eldocuments.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class UserProfileFragmentBindingImpl extends UserProfileFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.user_image, 1);
        sViewsWithIds.put(R.id.user_surname, 2);
        sViewsWithIds.put(R.id.user_name, 3);
        sViewsWithIds.put(R.id.user_patronymic, 4);
        sViewsWithIds.put(R.id.telephone_icon, 5);
        sViewsWithIds.put(R.id.telephone_title, 6);
        sViewsWithIds.put(R.id.telephone_number, 7);
        sViewsWithIds.put(R.id.email_icon, 8);
        sViewsWithIds.put(R.id.email_title, 9);
        sViewsWithIds.put(R.id.email_address, 10);
        sViewsWithIds.put(R.id.notification_icon, 11);
        sViewsWithIds.put(R.id.notification_title, 12);
        sViewsWithIds.put(R.id.permission_icon, 13);
        sViewsWithIds.put(R.id.permission_title, 14);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UserProfileFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private UserProfileFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[10]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}