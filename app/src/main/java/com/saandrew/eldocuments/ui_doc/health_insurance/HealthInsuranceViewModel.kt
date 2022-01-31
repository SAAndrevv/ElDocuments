package com.saandrew.eldocuments.ui_doc.health_insurance

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saandrew.eldocuments.api_model.HealthInsuranceRequest
import com.saandrew.eldocuments.api_model.HealthInsuranceResponse
import com.saandrew.eldocuments.retrofit.Controller
import com.saandrew.eldocuments.retrofit.JWTKey
import com.saandrew.eldocuments.ui_doc.EditMode
import com.saandrew.eldocuments.ui_doc.RequestStatus
import kotlinx.coroutines.launch
import java.net.ConnectException

class HealthInsuranceViewModel : ViewModel() {

    var number = MutableLiveData<String>()

    var validUntil = MutableLiveData<String?>()

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

    private fun getData() {
        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val response = mService.getHealthInsurance("Bearer ${JWTKey.key!!}")
                if (response.isSuccessful) {
                    insertInLiveData(response.body()!!)
                } else {
                    _mode.value = EditMode.POST_DATA
                }
            } catch (e: ConnectException) {
                _status.value = RequestStatus.CONNECTION_ERROR
                Log.d("HEALTH_INSURANCE", e.toString())
            }
        }
    }

    private fun postData() {
        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val response = mService.addHealthInsurance("Bearer ${JWTKey.key!!}", onSubmitData())
                if (response.isSuccessful) {
                    _status.value = RequestStatus.SUCCESS
                } else {
                    _status.value = RequestStatus.REQUEST_ERROR
                }
            } catch (e: ConnectException) {
                _status.value = RequestStatus.CONNECTION_ERROR
                Log.d("HEALTH_INSURANCE", e.toString())
            }
        }
    }

    private fun putData() {
        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val response = mService.putHealthInsurance("Bearer ${JWTKey.key!!}", onSubmitData())
                if (response.isSuccessful) {
                    _status.value = RequestStatus.SUCCESS
                } else {
                    _status.value = RequestStatus.REQUEST_ERROR
                }
            } catch (e: ConnectException) {
                _status.value = RequestStatus.CONNECTION_ERROR
                Log.d("HEALTH_INSURANCE", e.toString())
            }
        }
    }


    fun onBtnClick() {
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

    private fun insertInLiveData(data: HealthInsuranceResponse) {
        number.value = data.number
        validUntil.value = data.validUntil
        _verifying.value = data.verifying

        if (data.verifying in listOf("PROGRESS", "CANCELED")) {
            _mode.value = EditMode.PUT_DATA
        } else {
            _mode.value = EditMode.EDIT_DATA
            _available.value = false
        }
    }

    private fun onSubmitData(): HealthInsuranceRequest {
        return HealthInsuranceRequest(
            number.value,
            validUntil.value
        )
    }
}