package com.saandrew.eldocuments.ui_doc.insurance_number

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.saandrew.eldocuments.databinding.InsuranceNumberFragmentBinding
import ru.tinkoff.decoro.MaskImpl
import ru.tinkoff.decoro.parser.UnderscoreDigitSlotsParser
import ru.tinkoff.decoro.watchers.FormatWatcher
import ru.tinkoff.decoro.watchers.MaskFormatWatcher

class InsuranceNumberFragment : Fragment() {

    private var binding: InsuranceNumberFragmentBinding? = null
    private val viewModel: InsuranceNumberViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = InsuranceNumberFragmentBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            insuranceNumberViewModel = viewModel
        }

        val insuranceNumberMask = UnderscoreDigitSlotsParser().parseSlots("___-___-___ __")
        val formatWatcherInsuranceNumber: FormatWatcher = MaskFormatWatcher(
            MaskImpl.createTerminated(insuranceNumberMask)
        )

        binding?.let {
            formatWatcherInsuranceNumber.installOn(it.numberInsuranceNumber)
        }

        viewModel.status.observe(viewLifecycleOwner,
            { status ->
                Toast.makeText(context, status.toString(), Toast.LENGTH_SHORT).show()
            })
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}