package com.saandrew.eldocuments.ui.qr

import android.graphics.Bitmap
import android.graphics.Color
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.zxing.BarcodeFormat
import com.google.zxing.qrcode.QRCodeWriter
import com.saandrew.eldocuments.api_model.AvailableDocuments
import com.saandrew.eldocuments.api_model.TokenData
import com.saandrew.eldocuments.api_model.TokenResponse
import com.saandrew.eldocuments.retrofit.Controller
import com.saandrew.eldocuments.retrofit.JWTKey
import kotlinx.coroutines.launch
import java.net.ConnectException

enum class QrApiStatus { LOADING, ERROR, DONE }

class QrViewModel : ViewModel() {

    private var _qr = MutableLiveData<Bitmap>()
    val qr: LiveData<Bitmap> = _qr

    private var _token = MutableLiveData<TokenResponse>()
    val token: LiveData<TokenResponse> = _token

    private val _status = MutableLiveData<QrApiStatus>()
    val status: LiveData<QrApiStatus> = _status

    private val _typeDoc = MutableLiveData<List<AvailableDocuments>>(listOf())
    val typeDoc: LiveData<List<AvailableDocuments>> = _typeDoc

    private val _imgState = MutableLiveData<Boolean>(false)
    val imgState: LiveData<Boolean> = _imgState

    private var onButtonPressed = false

    init {
        getDocumentsList()

    }


    private fun createQr(token: String) {
        val size = 512
        val qrCodeContent = token
        val bits = QRCodeWriter().encode(qrCodeContent, BarcodeFormat.QR_CODE, size, size)
        _qr.value = Bitmap.createBitmap(size, size, Bitmap.Config.RGB_565).also {
            for (x in 0 until size) {
                for (y in 0 until size) {
                    it.setPixel(x, y, if (bits[x, y]) Color.BLACK else Color.WHITE)
                }
            }
        }
    }

    private fun getToken(data: List<String>) {
        viewModelScope.launch {
            try {
                _status.value = QrApiStatus.LOADING
                val mService = Controller.retrofitServices
                val response = mService.createQr("Bearer ${JWTKey.key!!}", TokenData(data))
                if (response.isSuccessful) {
                    createQr(response.body()!!.accessToken)
                    _status.value = QrApiStatus.DONE
                } else {
                    Log.d("QR_GET_TOKEN", response.code().toString())
                    _status.value = QrApiStatus.ERROR
                }
            } catch (e: ConnectException) {
                Log.d("QR_GET_TOKEN", e.toString())
            }
        }
    }

    fun generateQr(){
        onButtonPressed = !onButtonPressed

        if (onButtonPressed) {
            val data = mutableListOf<String>()
            for (group in _typeDoc.value!!) {
                for (type in group.data) {
                    if (type.available)
                        data.add(type.docType)
                }
            }
            if (data.size < 1) {
                onButtonPressed = !onButtonPressed
                return
            }
            getToken(data)
        }
        else {
            _qr = MutableLiveData<Bitmap>()
        }

        _imgState.value = onButtonPressed
    }

    private fun getDocumentsList() {
        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val response = mService.getAvailableDocuments("Bearer ${JWTKey.key!!}")
                if (response.isSuccessful) {
                    _typeDoc.value = response.body()
                    println(_typeDoc.value)
                } else {
                    Log.d("GET_DOCUMENTS_LIST", response.code().toString())
                }
            } catch (e: ConnectException) {
                Log.d("\"GET_DOCUMENTS_LIST", e.toString())
            }
        }
    }


}

