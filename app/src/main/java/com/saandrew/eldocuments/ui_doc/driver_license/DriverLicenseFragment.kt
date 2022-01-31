package com.saandrew.eldocuments.ui_doc.driver_license

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.saandrew.eldocuments.databinding.DriverLicenseFragmentBinding
import ru.tinkoff.decoro.MaskImpl
import ru.tinkoff.decoro.parser.UnderscoreDigitSlotsParser
import ru.tinkoff.decoro.watchers.FormatWatcher
import ru.tinkoff.decoro.watchers.MaskFormatWatcher
import java.text.SimpleDateFormat
import java.util.*

class DriverLicenseFragment : Fragment() {

    private val calendar: Calendar = Calendar.getInstance()
    private var binding: DriverLicenseFragmentBinding? = null
    lateinit var dateSetListener: DatePickerDialog.OnDateSetListener
    private val viewModel: DriverLicenseViewModel by viewModels()
    private var typeEditText = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = DriverLicenseFragmentBinding.inflate(inflater, container, false)
        binding = fragmentBinding

        dateSetListener =
            DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                calendar.set(Calendar.YEAR, year)
                calendar.set(Calendar.MONTH, month)
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)

                updateView()
            }

        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            driverLicenseViewModel = viewModel
        }

        binding?.dateOfIssueDriveLicense?.setOnClickListener {
            DatePickerDialog(
                requireContext(), dateSetListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),

                ).show()
            typeEditText = true
        }

        binding?.validUntilDriveLicense?.setOnClickListener {
            DatePickerDialog(
                requireContext(), dateSetListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),

                ).show()

            typeEditText = false
        }

        val serialAndNumberMask = UnderscoreDigitSlotsParser().parseSlots("__ __ ______")
        val formatWatcherSerialAndNumber: FormatWatcher = MaskFormatWatcher(
            MaskImpl.createTerminated(serialAndNumberMask)
        )

        binding?.let {
            formatWatcherSerialAndNumber.installOn(it.serialAndNumberDriveLicense)
        }

        viewModel.status.observe(viewLifecycleOwner,
            { status ->
                Toast.makeText(context, status.toString(), Toast.LENGTH_SHORT).show()

            })
    }

    private fun updateView() {
        val format = "dd.MM.yyyy"
        val simpleDateFormat = SimpleDateFormat(format, Locale.UK)

        if (typeEditText) {
            binding?.dateOfIssueDriveLicense?.setText(simpleDateFormat.format(calendar.time))
        } else {
            binding?.validUntilDriveLicense?.setText(simpleDateFormat.format(calendar.time))
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}