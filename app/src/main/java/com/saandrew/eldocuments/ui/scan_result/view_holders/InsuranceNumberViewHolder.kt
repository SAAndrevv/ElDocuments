package com.saandrew.eldocuments.ui.scan_result.view_holders

import android.content.res.Resources
import androidx.recyclerview.widget.RecyclerView
import com.saandrew.eldocuments.R
import com.saandrew.eldocuments.api_model.InsuranceNumberResponse
import com.saandrew.eldocuments.databinding.InsuranceNumberItemBinding

class InsuranceNumberViewHolder(private var binding: InsuranceNumberItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(data: InsuranceNumberResponse?, resources: Resources){
        data?.let {
            binding.insuranceNumber = it
            binding.number.text =
                resources.getString(R.string.number_insurance_number, it.number)
        }
        binding.executePendingBindings()
    }

}