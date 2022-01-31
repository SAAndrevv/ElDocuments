package com.saandrew.eldocuments.ui_doc.insurance_number

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saandrew.eldocuments.api_model.InsuranceNumberRequest
import com.saandrew.eldocuments.api_model.InsuranceNumberResponse
import com.saandrew.eldocuments.retrofit.Controller
import com.saandrew.eldocuments.retrofit.JWTKey
import com.saandrew.eldocuments.ui_doc.EditMode
import com.saandrew.eldocuments.ui_doc.RequestStatus
import kotlinx.coroutines.launch
import java.net.ConnectException

class InsuranceNumberViewModel : ViewModel() {
    var number = MutableLiveData<String>()

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
                val response = mService.getInsuranceNumber("Bearer ${JWTKey.key!!}")
                if (response.isSuccessful) {
                    insertInLiveData(response.body()!!)
                } else {
                    _mode.value = EditMode.POST_DATA
                }
            } catch (e: ConnectException) {
                _status.value = RequestStatus.CONNECTION_ERROR
                Log.d("INSURANCE_NUMBER", e.toString())
            }
        }
    }

    private fun postData() {
        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val response = mService.addInsuranceNumber("Bearer ${JWTKey.key!!}", onSubmitData())
                if (response.isSuccessful) {
                    _status.value = RequestStatus.SUCCESS
                } else {
                    _status.value = RequestStatus.REQUEST_ERROR
                }
            } catch (e: ConnectException) {
                _status.value = RequestStatus.CONNECTION_ERROR
                Log.d("INSURANCE_NUMBER", e.toString())
            }
        }
    }

    private fun putData() {
        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val response = mService.putInsuranceNumber("Bearer ${JWTKey.key!!}", onSubmitData())
                if (response.isSuccessful) {
                    _status.value = RequestStatus.SUCCESS
                } else {
                    _status.value = RequestStatus.REQUEST_ERROR
                }
            } catch (e: ConnectException) {
                _status.value = RequestStatus.CONNECTION_ERROR
                Log.d("INSURANCE_NUMBER", e.toString())
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

    private fun insertInLiveData(data: InsuranceNumberResponse) {
        number.value = data.number
        _verifying.value = data.verifying

        if (data.verifying in listOf("PROGRESS", "CANCELED")) {
            _mode.value = EditMode.PUT_DATA
        } else {
            _mode.value = EditMode.EDIT_DATA
            _available.value = false
        }
    }

    private fun onSubmitData(): InsuranceNumberRequest {
        return InsuranceNumberRequest(
            number.value
        )
    }
}