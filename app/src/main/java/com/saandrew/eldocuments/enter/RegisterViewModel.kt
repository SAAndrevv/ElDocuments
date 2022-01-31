package com.saandrew.eldocuments.enter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saandrew.eldocuments.api_model.RegisterRequest
import com.saandrew.eldocuments.retrofit.Controller
import kotlinx.coroutines.launch
import okhttp3.MediaType
import okhttp3.RequestBody
import java.net.ConnectException

enum class RegisterStatus{SUCCESS, ERROR}

class RegisterViewModel : ViewModel() {
    var email = MutableLiveData<String>()

    var password = MutableLiveData<String>()

    private var _registerResult = MutableLiveData<RegisterStatus>()
    val registerResult: LiveData<RegisterStatus> = _registerResult

    fun register(){
        val user = RegisterRequest(email.value, password.value)

        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val register = mService.registerUser(user)
                if (register.isSuccessful) {
                    _registerResult.value = RegisterStatus.SUCCESS
                } else {
                    _registerResult.value = RegisterStatus.ERROR
                    println(register.code())
                }
            } catch (e: ConnectException) {
                println(e)
            }
        }
    }
}