package com.saandrew.eldocuments.ui.scan_result.view_holders

import android.content.res.Resources
import androidx.recyclerview.widget.RecyclerView
import com.saandrew.eldocuments.R
import com.saandrew.eldocuments.api_model.UserPassportResponse
import com.saandrew.eldocuments.databinding.PassportItemBinding

class PassportViewHolder(
    private var binding: PassportItemBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(data: UserPassportResponse?, resources: Resources) {
        data?.let {
            binding.passport = it
            binding.typePass.text = resources.getString(R.string.type_pass_item, it.type)
            binding.serialAndNumberPass.text =
                resources.getString(R.string.serial_and_number, it.serialAndNumber)
            binding.placeOfBirthPass.text =
                resources.getString(R.string.place_of_birth_pass_item, it.placeOfBirth)
            binding.dateOfReceivingPass.text =
                resources.getString(R.string.date_of_receiving, it.dateOfReceiving)
            binding.issuedByPass.text =
                resources.getString(R.string.issued_by_pass_item, it.issuedBy)
            binding.departmentCodePass.text =
                resources.getString(R.string.department_code_pass_item, it.departmentCode)
        }

        binding.executePendingBindings()
    }
}