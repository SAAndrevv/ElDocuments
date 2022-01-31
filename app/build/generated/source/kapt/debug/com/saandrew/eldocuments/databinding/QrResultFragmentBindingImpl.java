package com.saandrew.eldocuments.databinding;
import com.saandrew.eldocuments.R;
import com.saandrew.eldocuments.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class QrResultFragmentBindingImpl extends QrResultFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.result_view, 2);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public QrResultFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private QrResultFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.statusResult.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.resultViewModel == variableId) {
            setResultViewModel((com.saandrew.eldocuments.ui.scan_result.QrResultViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setResultViewModel(@Nullable com.saandrew.eldocuments.ui.scan_result.QrResultViewModel ResultViewModel) {
        this.mResultViewModel = ResultViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.resultViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeResultViewModelStatus((androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui.scan_result.DocumentsApiStatus>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeResultViewModelStatus(androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui.scan_result.DocumentsApiStatus> ResultViewModelStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        com.saandrew.eldocuments.ui.scan_result.DocumentsApiStatus resultViewModelStatusGetValue = null;
        com.saandrew.eldocuments.ui.scan_result.QrResultViewModel resultViewModel = mResultViewModel;
        androidx.lifecycle.LiveData<com.saandrew.eldocuments.ui.scan_result.DocumentsApiStatus> resultViewModelStatus = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (resultViewModel != null) {
                    // read resultViewModel.status
                    resultViewModelStatus = resultViewModel.getStatus();
                }
                updateLiveDataRegistration(0, resultViewModelStatus);


                if (resultViewModelStatus != null) {
                    // read resultViewModel.status.getValue()
                    resultViewModelStatusGetValue = resultViewModelStatus.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.saandrew.eldocuments.bind_adapter.BindingsAdapterKt.bindStatus(this.statusResult, resultViewModelStatusGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): resultViewModel.status
        flag 1 (0x2L): resultViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}