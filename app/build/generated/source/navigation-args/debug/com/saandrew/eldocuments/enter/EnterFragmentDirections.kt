package com.saandrew.eldocuments.enter

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.saandrew.eldocuments.R

public class EnterFragmentDirections private constructor() {
  public companion object {
    public fun actionEnterFragmentToRegisterFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_enterFragment_to_registerFragment)

    public fun actionEnterFragmentToMainActivity(): NavDirections =
        ActionOnlyNavDirections(R.id.action_enterFragment_to_mainActivity)
  }
}
