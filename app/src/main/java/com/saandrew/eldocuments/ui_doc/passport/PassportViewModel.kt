package com.saandrew.eldocuments.ui_doc.passport


import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saandrew.eldocuments.api_model.UserPassportRequest
import com.saandrew.eldocuments.api_model.UserPassportResponse
import com.saandrew.eldocuments.retrofit.Controller
import com.saandrew.eldocuments.retrofit.JWTKey
import com.saandrew.eldocuments.ui_doc.EditMode
import com.saandrew.eldocuments.ui_doc.RequestStatus
import kotlinx.coroutines.launch
import java.net.ConnectException


class PassportViewModel() : ViewModel() {

    private var _type = MutableLiveData<String>()
    val type: LiveData<String> = _type

    var serialAndNumber = MutableLiveData<String>()

    var placeOfBirth = MutableLiveData<String>()

    var dateOfReceiving = MutableLiveData<String>()

    var issuedBy = MutableLiveData<String>()

    var departmentCode = MutableLiveData<String>()

    private var _verifying = MutableLiveData<String>()
    val verifying: LiveData<String> = _verifying

    private var _available = MutableLiveData<Boolean>(true)
    val available: LiveData<Boolean> = _available

    private var _mode = MutableLiveData<EditMode>()
    val mode: LiveData<EditMode> = _mode

    private var _status = MutableLiveData<RequestStatus>()
    val status: LiveData<RequestStatus> = _status

    init {
        _type.value = "Паспорт гражданина РФ"
        getData()
    }

    private fun getData() {

        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val response = mService.getPassport("Bearer ${JWTKey.key!!}")
                if (response.isSuccessful) {
                    insertInLiveData(response.body()!!)
                } else {
                    _mode.value = EditMode.POST_DATA
                }
            } catch (e: ConnectException) {
                _status.value = RequestStatus.CONNECTION_ERROR
                Log.d("PASSPORT", e.toString())
            }
        }
    }

    private fun postData() {
        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val response = mService.addPassport("Bearer ${JWTKey.key!!}", onSubmitData())
                if (response.isSuccessful) {
                    _status.value = RequestStatus.SUCCESS
                } else {
                    _status.value = RequestStatus.REQUEST_ERROR
                }
            } catch (e: ConnectException) {
                _status.value = RequestStatus.CONNECTION_ERROR
                Log.d("PASSPORT", e.toString())
            }
        }
    }

    private fun putData() {
        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val response = mService.putPassport("Bearer ${JWTKey.key!!}", onSubmitData())
                if (response.isSuccessful) {
                    _status.value = RequestStatus.SUCCESS
                } else {
                    _status.value = RequestStatus.REQUEST_ERROR
                }
            } catch (e: ConnectException) {
                _status.value = RequestStatus.CONNECTION_ERROR
                Log.d("PASSPORT", e.toString())
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

    private fun insertInLiveData(data: UserPassportResponse) {
        serialAndNumber.value = data.serialAndNumber
        placeOfBirth.value = data.placeOfBirth
        dateOfReceiving.value = data.dateOfReceiving
        issuedBy.value = data.issuedBy
        departmentCode.value = data.departmentCode
        _verifying.value = data.verifying

        if (data.verifying in listOf("PROGRESS", "CANCELED")) {
            _mode.value = EditMode.PUT_DATA
        } else {
            _mode.value = EditMode.EDIT_DATA
            _available.value = false
        }
    }

    private fun onSubmitData(): UserPassportRequest {
        return UserPassportRequest(
            type.value,
            serialAndNumber.value,
            placeOfBirth.value,
            dateOfReceiving.value,
            issuedBy.value,
            departmentCode.value
        )
    }

}