package com.saandrew.eldocuments.ui.catalog_doc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.saandrew.eldocuments.R
import com.saandrew.eldocuments.databinding.DocumentsFragmentBinding
import com.saandrew.eldocuments.ui.catalog_doc.adapter.ExpandableDocListAdapter


class DocumentsFragment : Fragment() {

    private var binding: DocumentsFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = DocumentsFragmentBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply{
            lifecycleOwner = viewLifecycleOwner
            expListView.setAdapter(ExpandableDocListAdapter(requireContext(), expListView, findNavController()))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}