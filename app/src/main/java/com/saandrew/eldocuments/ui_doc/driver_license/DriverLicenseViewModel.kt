package com.saandrew.eldocuments.ui_doc.driver_license

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saandrew.eldocuments.api_model.DriverLicenseRequest
import com.saandrew.eldocuments.api_model.DriverLicenseResponse
import com.saandrew.eldocuments.retrofit.Controller
import com.saandrew.eldocuments.retrofit.JWTKey
import com.saandrew.eldocuments.ui_doc.EditMode
import com.saandrew.eldocuments.ui_doc.RequestStatus
import kotlinx.coroutines.launch
import java.net.ConnectException

class DriverLicenseViewModel : ViewModel() {

    var serialAndNumber = MutableLiveData<String>()

    var dateOfIssue = MutableLiveData<String>()

    var validUntil = MutableLiveData<String>()

    private var _verifying = MutableLiveData<String>()
    val verifying: LiveData<String> = _verifying

    private var _available = MutableLiveData<Boolean>(true)
    val available: LiveData<Boolean> = _available

    private var _mode = MutableLiveData<EditMode>()
    val mode: LiveData<EditMode> = _mode

    private var _status = MutableLiveData<RequestStatus>()
    val status: LiveData<RequestStatus> = _status


    init {
        getData()
    }

    fun onBtnClick() {
        println(_mode.value)
        when (_mode.value) {
            EditMode.POST_DATA -> {
                postData()
                _mode.value = EditMode.PUT_DATA
            }
            EditMode.EDIT_DATA -> {
                _mode.value = EditMode.PUT_DATA
                _available.value = true
            }
            EditMode.PUT_DATA -> putData()
        }
    }

    private fun postData() {
        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val response = mService.addDriverLicense("Bearer ${JWTKey.key!!}", onSubmitData())
                if (response.isSuccessful) {
                    _status.value = RequestStatus.SUCCESS
                } else {
                    _status.value = RequestStatus.REQUEST_ERROR
                }
            } catch (e: ConnectException) {
                _status.value = RequestStatus.CONNECTION_ERROR
                Log.d("DRIVER_LICENSE", e.toString())
            }
        }
    }

    private fun putData() {
        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val response = mService.putDriverLicense("Bearer ${JWTKey.key!!}", onSubmitData())
                if (response.isSuccessful) {
                    _status.value = RequestStatus.SUCCESS
                } else {
                    _status.value = RequestStatus.REQUEST_ERROR
                }
            } catch (e: ConnectException) {
                _status.value = RequestStatus.CONNECTION_ERROR
                Log.d("DRIVER_LICENSE", e.toString())
            }
        }
    }

    private fun getData() {

        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val response = mService.getDriverLicense("Bearer ${JWTKey.key!!}")
                if (response.isSuccessful) {
                    insertInLiveData(response.body()!!)
                } else {
                    _mode.value = EditMode.POST_DATA
                }
            } catch (e: ConnectException) {
                _status.value = RequestStatus.CONNECTION_ERROR
                Log.d("DRIVER_LICENSE", e.toString())
            }
        }
    }

    private fun insertInLiveData(data: DriverLicenseResponse) {
        serialAndNumber.value = data.serialAndNumber
        dateOfIssue.value = data.dateOfIssue
        validUntil.value = data.validUntil
        _verifying.value = data.verifying

        if (data.verifying in listOf("PROGRESS", "CANCELED")) {
            _mode.value = EditMode.PUT_DATA
        } else {
            _mode.value = EditMode.EDIT_DATA
            _available.value = false
        }
    }

    private fun onSubmitData(): DriverLicenseRequest {
        return DriverLicenseRequest(
            serialAndNumber.value,
            dateOfIssue.value,
            validUntil.value
        )
    }
}