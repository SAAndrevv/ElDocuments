package com.saandrew.eldocuments.ui_doc.health_insurance

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.saandrew.eldocuments.databinding.HealthInsuranceFragmentBinding
import ru.tinkoff.decoro.MaskImpl
import ru.tinkoff.decoro.parser.UnderscoreDigitSlotsParser
import ru.tinkoff.decoro.watchers.FormatWatcher
import ru.tinkoff.decoro.watchers.MaskFormatWatcher
import java.text.SimpleDateFormat
import java.util.*

class HealthInsuranceFragment : Fragment() {

    private val calendar: Calendar = Calendar.getInstance()
    private var binding: HealthInsuranceFragmentBinding? = null
    lateinit var dateSetListener: DatePickerDialog.OnDateSetListener
    private val viewModel: HealthInsuranceViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = HealthInsuranceFragmentBinding.inflate(inflater, container, false)
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
            healthInsuranceViewModel = viewModel
        }

        binding?.validUntilHealthInsurance?.setOnClickListener {
            DatePickerDialog(
                requireContext(), dateSetListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),

                ).show()

        }

        val numberHealthMask = UnderscoreDigitSlotsParser().parseSlots("____ ____ ____ ____")
        val formatWatcherNumberHealth: FormatWatcher = MaskFormatWatcher(
            MaskImpl.createTerminated(numberHealthMask)
        )

        binding?.let {
            formatWatcherNumberHealth.installOn(it.numberHealthInsurance)
        }

        viewModel.status.observe(viewLifecycleOwner,
            { status ->
                Toast.makeText(context, status.toString(), Toast.LENGTH_SHORT).show()

            })
    }

    private fun updateView() {
        val format = "dd.MM.yyyy"
        val simpleDateFormat = SimpleDateFormat(format, Locale.UK)
        binding?.validUntilHealthInsurance?.setText(simpleDateFormat.format(calendar.time))
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}