package com.saandrew.eldocuments.ui.scan_result.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saandrew.eldocuments.databinding.DriverLicenseItemBinding
import com.saandrew.eldocuments.databinding.HealthInsuranceItemBinding
import com.saandrew.eldocuments.databinding.InsuranceNumberItemBinding
import com.saandrew.eldocuments.databinding.PassportItemBinding
import com.saandrew.eldocuments.ui.TypesOfDocuments
import com.saandrew.eldocuments.ui.scan_result.QrResultViewModel
import com.saandrew.eldocuments.ui.scan_result.view_holders.DriverLicenseViewHolder
import com.saandrew.eldocuments.ui.scan_result.view_holders.InsuranceNumberViewHolder
import com.saandrew.eldocuments.ui.scan_result.view_holders.PassportViewHolder
import com.saandrew.eldocuments.ui.scan_result.view_holders.HealthInsuranceViewHolder


class QrResultAdapter(
    private val viewModel: QrResultViewModel,
    context: Context
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var docs: List<String> = listOf()
    private val resources = context.resources

    @SuppressLint("NotifyDataSetChanged")
    fun setData(docs: List<String>) {
        this.docs = docs
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getItemCount(): Int {
        return docs.size

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (docs[position]) {
            TypesOfDocuments.PASSPORT -> {
                holder as PassportViewHolder
                holder.bind(viewModel.passport.value, resources)
            }
            TypesOfDocuments.DRIVER_LICENSE -> {
                holder as DriverLicenseViewHolder
                holder.bind(viewModel.driverLicense.value, resources)
            }
            TypesOfDocuments.MANDATORY_HEALTH_INSURANCE -> {
                holder as HealthInsuranceViewHolder
                holder.bind(viewModel.healthInsurance.value, resources)
            }
            TypesOfDocuments.INSUR_NUM_OF_AN_INDIVID_PERSON_ACCOUNT -> {
                holder as InsuranceNumberViewHolder
                holder.bind(viewModel.insuranceNumber.value, resources)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (docs[viewType]) {
            TypesOfDocuments.PASSPORT -> {
                return PassportViewHolder(
                    PassportItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            TypesOfDocuments.DRIVER_LICENSE -> {
                return DriverLicenseViewHolder(
                    DriverLicenseItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            TypesOfDocuments.MANDATORY_HEALTH_INSURANCE -> {
                return HealthInsuranceViewHolder(
                    HealthInsuranceItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }

            else -> {
                return InsuranceNumberViewHolder(
                    InsuranceNumberItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
        }
    }


}


