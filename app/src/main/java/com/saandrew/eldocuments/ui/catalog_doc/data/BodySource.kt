package com.saandrew.eldocuments.ui.catalog_doc.data

import com.saandrew.eldocuments.R
import com.saandrew.eldocuments.ui.catalog_doc.model.TypeDoc


object BodySource {
    private val passport: List<TypeDoc> = listOf(
        TypeDoc(
            R.string.passport,
            R.id.action_navigation_documents_to_passportFragment
        ),
        TypeDoc(
            R.string.driver_license,
            R.id.action_navigation_documents_to_driverLicenseFragment
        ),
        TypeDoc(
            R.string.health_insurance,
            R.id.action_navigation_documents_to_healthInsuranceFragment
        ),
        TypeDoc(
            R.string.insurance_number,
            R.id.action_navigation_documents_to_insuranceNumberFragment
        )
    )


    val data: List<List<TypeDoc>> = listOf(
        passport,
    )


}