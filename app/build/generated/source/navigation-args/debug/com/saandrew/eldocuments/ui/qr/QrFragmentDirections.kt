package com.saandrew.eldocuments.ui.qr

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.saandrew.eldocuments.R

public class QrFragmentDirections private constructor() {
  public companion object {
    public fun actionNavigationQrToQrScannerFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_qr_to_qrScannerFragment)
  }
}
