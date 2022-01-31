package com.saandrew.eldocuments.retrofit


import com.saandrew.eldocuments.api_interface.HolderApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Controller {
    fun okHttpClient(): OkHttpClient{
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
        return client

    }

    private var retrofit: Retrofit? = null
    private const val baseUrl: String = "http://109.184.83.181:2525"

    private fun connect(): Retrofit {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient())
                .build()
        }
        return retrofit!!
    }

    val retrofitServices: HolderApi
        get() = connect().create(HolderApi::class.java)

}