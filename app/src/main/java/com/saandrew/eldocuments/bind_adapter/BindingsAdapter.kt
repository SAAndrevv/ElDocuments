package com.saandrew.eldocuments.bind_adapter

import android.graphics.Bitmap
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import com.saandrew.eldocuments.R
import com.saandrew.eldocuments.ui.scan_result.DocumentsApiStatus
import com.saandrew.eldocuments.ui_doc.EditMode



enum class Verify {CANCELED , PROGRESS, VERIFY}

@BindingAdapter("bitmapImg")
fun bindImage(imgView: ImageView, bitmap: LiveData<Bitmap>?) {

    bitmap?.let {
        bitmap.value?.let {
            imgView.setImageBitmap(bitmap.value)
        } ?: imgView.setImageResource(R.drawable.loading_animation)
    }

}

@BindingAdapter("verifyImg")
fun bindImage(imgView: ImageView, verify: String?) {
    when(verify){
        Verify.CANCELED.name -> imgView.setImageResource(R.drawable.ic_denied)
        Verify.PROGRESS.name -> imgView.setImageResource(R.drawable.ic_error)
        Verify.VERIFY.name -> imgView.setImageResource(R.drawable.ic_done)

    }
}

@BindingAdapter("apiStatus")
fun bindStatus(statusImageView: ImageView,
               status: DocumentsApiStatus?) {
    when (status) {
        DocumentsApiStatus.LOADING -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.loading_animation)
        }
        DocumentsApiStatus.ERROR -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.ic_connection_error)
        }
        DocumentsApiStatus.DONE -> {
            statusImageView.visibility = View.GONE
        }

    }
}

@BindingAdapter("btnStatus")
fun setText(button: Button, mode: LiveData<EditMode>) {
    when(mode.value){
        EditMode.EDIT_DATA -> button.text = "Изменить"
        else -> button.text = "Отправить"

    }
}

