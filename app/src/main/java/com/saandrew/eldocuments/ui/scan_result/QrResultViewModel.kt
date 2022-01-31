package com.saandrew.eldocuments.ui.scan_result

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saandrew.eldocuments.api_model.DriverLicenseResponse
import com.saandrew.eldocuments.api_model.HealthInsuranceResponse
import com.saandrew.eldocuments.api_model.InsuranceNumberResponse
import com.saandrew.eldocuments.api_model.UserPassportResponse
import com.saandrew.eldocuments.retrofit.Controller
import com.saandrew.eldocuments.ui.TypesOfDocuments
import kotlinx.coroutines.launch
import java.net.ConnectException

enum class DocumentsApiStatus { LOADING, ERROR, DONE }

class QrResultViewModel : ViewModel() {

    var token = MutableLiveData<String>()

    var data = MutableLiveData<List<String>>()

    private var _passport = MutableLiveData<UserPassportResponse>()
    val passport: LiveData<UserPassportResponse> = _passport

    private var _driverLicense = MutableLiveData<DriverLicenseResponse>()
    val driverLicense: LiveData<DriverLicenseResponse> = _driverLicense

    private var _healthInsurance = MutableLiveData<HealthInsuranceResponse>()
    val healthInsurance: LiveData<HealthInsuranceResponse> = _healthInsurance

    private var _insuranceNumber = MutableLiveData<InsuranceNumberResponse>()
    val insuranceNumber: LiveData<InsuranceNumberResponse> = _insuranceNumber

    private val _status = MutableLiveData<DocumentsApiStatus>()
    val status: LiveData<DocumentsApiStatus> = _status


    private fun getAllData() {
        viewModelScope.launch {
            try {
                for (type in data.value!!) {
                    when (type) {
                        TypesOfDocuments.PASSPORT -> getPassport()
                        TypesOfDocuments.DRIVER_LICENSE -> getDriverLicense()
                        TypesOfDocuments.MANDATORY_HEALTH_INSURANCE -> getHealthInsurance()
                        TypesOfDocuments.INSUR_NUM_OF_AN_INDIVID_PERSON_ACCOUNT -> getInsuranceNumber()
                    }
                }

            } finally {
                _status.value = DocumentsApiStatus.DONE
            }
        }
    }

    fun getData() {
        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val response = mService.getQrData("Bearer ${SharedJWT.key}")
                if (response.isSuccessful) {
                    data.value = response.body()?.data
                    getAllData()
                }
            } catch (e: ConnectException) {
                Log.d("QR_SCAN_RESULT", e.toString())
            }
        }
    }

    private suspend fun getInsuranceNumber() {
        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val response = mService.getInsuranceNumber("Bearer ${SharedJWT.key}")
                _insuranceNumber.value = response.body()
            } catch (e: ConnectException) {
                Log.d("QR_SCAN_RESULT", e.toString())
            }
        }.join()
    }

    private suspend fun getHealthInsurance() {
        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val response = mService.getHealthInsurance("Bearer ${SharedJWT.key}")
                _healthInsurance.value = response.body()
            } catch (e: ConnectException) {
                Log.d("QR_SCAN_RESULT", e.toString())
            }
        }.join()
    }


    private suspend fun getPassport() {
        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val response = mService.getPassport("Bearer ${SharedJWT.key}")
                _passport.value = response.body()
            } catch (e: ConnectException) {
                println(e)
            }

        }.join()
    }


    private suspend fun getDriverLicense() {
        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val response = mService.getDriverLicense("Bearer ${SharedJWT.key}")
                _driverLicense.value = response.body()
            } catch (e: ConnectException) {
                Log.d("QR_SCAN_RESULT", e.toString())
            }
        }.join()
    }

}