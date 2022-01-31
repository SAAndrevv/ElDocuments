package com.saandrew.eldocuments.ui.scan_result.view_holders

import android.content.res.Resources
import androidx.recyclerview.widget.RecyclerView
import com.saandrew.eldocuments.R
import com.saandrew.eldocuments.api_model.DriverLicenseResponse
import com.saandrew.eldocuments.databinding.DriverLicenseItemBinding

class DriverLicenseViewHolder(private var binding: DriverLicenseItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(data: DriverLicenseResponse?, resources: Resources) {

        data?.let {
            binding.driverLicense = it
            binding.serialAndNumber.text =
                resources.getString(R.string.serial_and_number, it.serialAndNumber)
            binding.dateOfIssue.text =
                resources.getString(R.string.date_of_receiving, it.dateOfIssue)
            binding.validUntil.text =
                resources.getString(R.string.valid_until_driver_license, it.validUntil)
        }
        binding.executePendingBindings()
    }
}