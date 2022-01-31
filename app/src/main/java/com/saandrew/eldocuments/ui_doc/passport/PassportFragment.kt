package com.saandrew.eldocuments.ui_doc.passport

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.saandrew.eldocuments.databinding.PassportFragmentBinding
import ru.tinkoff.decoro.MaskImpl
import ru.tinkoff.decoro.parser.UnderscoreDigitSlotsParser
import ru.tinkoff.decoro.slots.PredefinedSlots
import ru.tinkoff.decoro.watchers.FormatWatcher
import ru.tinkoff.decoro.watchers.MaskFormatWatcher
import java.text.SimpleDateFormat
import java.util.*


class PassportFragment : Fragment() {

    private val calendar: Calendar = Calendar.getInstance()
    private var binding: PassportFragmentBinding? = null
    lateinit var dateSetListener: DatePickerDialog.OnDateSetListener
    private val viewModel: PassportViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = PassportFragmentBinding.inflate(inflater, container, false)
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
            passportViewModel = viewModel
        }

        binding?.dateOfReceivingPass?.setOnClickListener {
            DatePickerDialog(
                requireContext(), dateSetListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),

                ).show()

        }

        val formatWatcherPassport: FormatWatcher = MaskFormatWatcher(
            MaskImpl.createTerminated(PredefinedSlots.RUS_PASSPORT)
        )

        val departmentCodeMask = UnderscoreDigitSlotsParser().parseSlots("___-___")
        val formatWatcherDepartmentCode: FormatWatcher = MaskFormatWatcher(
            MaskImpl.createTerminated(departmentCodeMask)
        )

        binding?.let {
            formatWatcherPassport.installOn(it.serialAndNumberPass)
            formatWatcherDepartmentCode.installOn(it.departmentCodePass)
        }

        viewModel.status.observe(viewLifecycleOwner,
            { status ->
                Toast.makeText(context, status.toString(), Toast.LENGTH_SHORT).show()
            })


    }

    private fun updateView() {
        val format = "dd.MM.yyyy"
        val simpleDateFormat = SimpleDateFormat(format, Locale.UK)
        binding?.dateOfReceivingPass?.setText(simpleDateFormat.format(calendar.time))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}