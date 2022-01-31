package com.saandrew.eldocuments.ui.qr

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.saandrew.eldocuments.R
import com.saandrew.eldocuments.databinding.QrFragmentBinding
import com.saandrew.eldocuments.ui.qr.adapter.ExpandableTypeDocListAdapter

class QrFragment : Fragment() {
    private lateinit var fragmentBinding: QrFragmentBinding
    private var binding: QrFragmentBinding? = null
    private val viewModel: QrViewModel by viewModels()
    private lateinit var adapter: ExpandableTypeDocListAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding = QrFragmentBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter =
            ExpandableTypeDocListAdapter(requireContext(), binding!!.typeDocListView, viewModel)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            qrFragment = this@QrFragment
            qrViewModel = viewModel
            typeDocListView.setAdapter(adapter)

        }

        viewModel.typeDoc.observe(viewLifecycleOwner,
            { newData ->
                adapter.setData(newData)

            })

        viewModel.imgState.observe(viewLifecycleOwner,
            {
                newState -> when(newState){
                    true -> {
                        binding!!.qrFrame.visibility = View.VISIBLE
                        binding!!.resetFrame.visibility = View.GONE
                    }
                    else -> {
                        binding!!.resetFrame.visibility = View.VISIBLE
                        binding!!.qrFrame.visibility = View.GONE
                    }
                }
            })
    }


    fun onScanClick() {
        findNavController().navigate(R.id.action_navigation_qr_to_qrScannerFragment)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}
