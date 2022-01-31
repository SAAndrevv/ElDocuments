package com.saandrew.eldocuments.ui.scan_result.view_holders

import android.content.res.Resources
import androidx.recyclerview.widget.RecyclerView
import com.saandrew.eldocuments.R
import com.saandrew.eldocuments.api_model.HealthInsuranceResponse
import com.saandrew.eldocuments.databinding.HealthInsuranceItemBinding

class HealthInsuranceViewHolder(private var binding: HealthInsuranceItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
        fun bind(data: HealthInsuranceResponse?, resources: Resources){
            data?.let {
                binding.healthInsurance = it
                binding.number.text =
                    resources.getString(R.string.number_health_insurance, it.number)
                binding.validUntil.text =
                    resources.getString(R.string.valid_until_health_insurance, it.validUntil ?: "")
            }
            binding.executePendingBindings()
        }

}