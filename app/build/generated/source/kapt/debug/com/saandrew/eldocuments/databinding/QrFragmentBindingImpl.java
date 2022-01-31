package com.saandrew.eldocuments.databinding;
import com.saandrew.eldocuments.R;
import com.saandrew.eldocuments.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class QrFragmentBindingImpl extends QrFragmentBinding implements com.saandrew.eldocuments.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivQRCodeCard, 4);
        sViewsWithIds.put(R.id.typeDocListView, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public QrFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private QrFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) bindings[3]
            , (com.google.android.material.card.MaterialCardView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ExpandableListView) bindings[5]
            );
        this.floatingActionButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.qrFrame.setTag(null);
        this.resetFrame.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.saandrew.eldocuments.generated.callback.OnClickListener(this, 3);
        mCallback3 = new com.saandrew.eldocuments.generated.callback.OnClickListener(this, 1);
        mCallback4 = new com.saandrew.eldocuments.generated.callback.OnClickListener(this, 2);
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
        if (BR.qrViewModel == variableId) {
            setQrViewModel((com.saandrew.eldocuments.ui.qr.QrViewModel) variable);
        }
        else if (BR.qrFragment == variableId) {
            setQrFragment((com.saandrew.eldocuments.ui.qr.QrFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQrViewModel(@Nullable com.saandrew.eldocuments.ui.qr.QrViewModel QrViewModel) {
        this.mQrViewModel = QrViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.qrViewModel);
        super.requestRebind();
    }
    public void setQrFragment(@Nullable com.saandrew.eldocuments.ui.qr.QrFragment QrFragment) {
        this.mQrFragment = QrFragment;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.qrFragment);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeQrViewModelQr((androidx.lifecycle.LiveData<android.graphics.Bitmap>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeQrViewModelQr(androidx.lifecycle.LiveData<android.graphics.Bitmap> QrViewModelQr, int fieldId) {
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
        com.saandrew.eldocuments.ui.qr.QrViewModel qrViewModel = mQrViewModel;
        com.saandrew.eldocuments.ui.qr.QrFragment qrFragment = mQrFragment;
        android.graphics.Bitmap qrViewModelQrGetValue = null;
        androidx.lifecycle.LiveData<android.graphics.Bitmap> qrViewModelQr = null;

        if ((dirtyFlags & 0xbL) != 0) {



                if (qrViewModel != null) {
                    // read qrViewModel.qr
                    qrViewModelQr = qrViewModel.getQr();
                }
                updateLiveDataRegistration(0, qrViewModelQr);


                if (qrViewModelQr != null) {
                    // read qrViewModel.qr.getValue()
                    qrViewModelQrGetValue = qrViewModelQr.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.floatingActionButton.setOnClickListener(mCallback5);
            this.qrFrame.setOnClickListener(mCallback3);
            this.resetFrame.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            com.saandrew.eldocuments.bind_adapter.BindingsAdapterKt.bindImage(this.qrFrame, qrViewModelQr);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // qrFragment != null
                boolean qrFragmentJavaLangObjectNull = false;
                // qrFragment
                com.saandrew.eldocuments.ui.qr.QrFragment qrFragment = mQrFragment;



                qrFragmentJavaLangObjectNull = (qrFragment) != (null);
                if (qrFragmentJavaLangObjectNull) {


                    qrFragment.onScanClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // qrViewModel != null
                boolean qrViewModelJavaLangObjectNull = false;
                // qrViewModel
                com.saandrew.eldocuments.ui.qr.QrViewModel qrViewModel = mQrViewModel;



                qrViewModelJavaLangObjectNull = (qrViewModel) != (null);
                if (qrViewModelJavaLangObjectNull) {


                    qrViewModel.generateQr();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // qrViewModel != null
                boolean qrViewModelJavaLangObjectNull = false;
                // qrViewModel
                com.saandrew.eldocuments.ui.qr.QrViewModel qrViewModel = mQrViewModel;



                qrViewModelJavaLangObjectNull = (qrViewModel) != (null);
                if (qrViewModelJavaLangObjectNull) {


                    qrViewModel.generateQr();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): qrViewModel.qr
        flag 1 (0x2L): qrViewModel
        flag 2 (0x3L): qrFragment
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}