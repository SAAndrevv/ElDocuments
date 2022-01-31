package com.saandrew.eldocuments.enter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saandrew.eldocuments.retrofit.Controller
import com.saandrew.eldocuments.retrofit.JWTKey
import kotlinx.coroutines.launch
import okhttp3.MediaType
import okhttp3.RequestBody
import java.net.ConnectException

enum class LoginStatus { SUCCESS, ERROR , INVALID_DATA}

class EnterViewModel : ViewModel() {
    var email = MutableLiveData<String>()

    var password = MutableLiveData<String>()

    private var _loginResult = MutableLiveData<LoginStatus>()
    val loginResult: LiveData<LoginStatus> = _loginResult


    fun login() {
        lateinit var email: RequestBody
        lateinit var password: RequestBody

        try {
            email = RequestBody.create(MediaType.parse("text/plain"), this.email.value)
            password = RequestBody.create(MediaType.parse("text/plain"), this.password.value)
        } catch (e: NullPointerException) {
            _loginResult.value = LoginStatus.INVALID_DATA
            return
        }


        viewModelScope.launch {
            try {
                val mService = Controller.retrofitServices
                val login = mService.loginUser(email, password)
                if (login.isSuccessful) {
                    val token = login.body()
                    if (token != null) {
                        JWTKey.key = token.accessToken
                    }
                    _loginResult.value = LoginStatus.SUCCESS
                } else {
                    println(login.code())
                    _loginResult.value = LoginStatus.ERROR
                }
            } catch (e: ConnectException) {
                println(e)
            }


        }

    }

}