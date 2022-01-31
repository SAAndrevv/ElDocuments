package com.saandrew.eldocuments.ui.catalog_doc

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.saandrew.eldocuments.R

public class DocumentsFragmentDirections private constructor() {
  public companion object {
    public fun actionNavigationDocumentsToPassportFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_documents_to_passportFragment)

    public fun actionNavigationDocumentsToDriverLicenseFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_documents_to_driverLicenseFragment)

    public fun actionNavigationDocumentsToHealthInsuranceFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_documents_to_healthInsuranceFragment)

    public fun actionNavigationDocumentsToInsuranceNumberFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_documents_to_insuranceNumberFragment)
  }
}
