package com.saandrew.eldocuments.ui.qr

import android.os.Bundle
import androidx.navigation.NavDirections
import com.saandrew.eldocuments.R
import kotlin.Int
import kotlin.String

public class QrScannerFragmentDirections private constructor() {
  private data class ActionNavigationQrScannerToQrResultFragment(
    public val token: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_navigation_qr_scanner_to_qrResultFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("token", this.token)
      return result
    }
  }

  public companion object {
    public fun actionNavigationQrScannerToQrResultFragment(token: String): NavDirections =
        ActionNavigationQrScannerToQrResultFragment(token)
  }
}
