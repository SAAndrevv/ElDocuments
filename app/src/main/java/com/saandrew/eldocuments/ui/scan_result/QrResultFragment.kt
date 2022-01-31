package com.saandrew.eldocuments.ui.scan_result

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.saandrew.eldocuments.databinding.QrResultFragmentBinding
import com.saandrew.eldocuments.ui.scan_result.adapter.QrResultAdapter


class QrResultFragment : Fragment() {

    private var binding: QrResultFragmentBinding? = null
    private val viewModel: QrResultViewModel by viewModels()
    lateinit var scanResult: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            scanResult = it.getString("token")!!
        }

        SharedJWT.key = scanResult
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = QrResultFragmentBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = QrResultAdapter(viewModel, requireContext())

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            resultViewModel = viewModel
            viewModel.token.value = SharedJWT.key
            resultView.adapter = adapter
        }

        viewModel.token.observe(viewLifecycleOwner, {
            viewModel.getData()
        })

        viewModel.status.observe(viewLifecycleOwner,
            { newData ->
                if (newData == DocumentsApiStatus.DONE)
                    adapter.setData(viewModel.data.value!!)
            })

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null

    }

}