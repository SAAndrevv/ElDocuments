package com.saandrew.eldocuments.ui.scan_result

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class QrResultFragmentArgs(
  public val token: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("token", this.token)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): QrResultFragmentArgs {
      bundle.setClassLoader(QrResultFragmentArgs::class.java.classLoader)
      val __token : String?
      if (bundle.containsKey("token")) {
        __token = bundle.getString("token")
        if (__token == null) {
          throw IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue")
      }
      return QrResultFragmentArgs(__token)
    }
  }
}
