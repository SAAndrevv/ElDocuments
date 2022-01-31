package com.saandrew.eldocuments.ui.user_profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.saandrew.eldocuments.databinding.UserProfileFragmentBinding

class UserProfileFragment : Fragment() {


    private var binding: UserProfileFragmentBinding? = null
    //private val viewModel: UserProfileViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = UserProfileFragmentBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}