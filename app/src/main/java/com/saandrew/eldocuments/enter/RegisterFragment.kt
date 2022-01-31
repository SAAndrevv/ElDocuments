package com.saandrew.eldocuments.enter

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.saandrew.eldocuments.R
import com.saandrew.eldocuments.databinding.EnterFragmentBinding
import com.saandrew.eldocuments.databinding.RegisterFragmentBinding

class RegisterFragment : Fragment() {
    private val viewModel: RegisterViewModel by viewModels()
    private var binding: RegisterFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = RegisterFragmentBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            registerViewModel = viewModel
            registerFragment = this@RegisterFragment
        }
        viewModel.registerResult.observe(viewLifecycleOwner,
            { newData ->
                when(newData){
                    RegisterStatus.SUCCESS -> {
                        findNavController().popBackStack()
                        Toast.makeText(context, "Registration success", Toast.LENGTH_SHORT).show()

                    }
                    RegisterStatus.ERROR -> Toast.makeText(context, "Registration error", Toast.LENGTH_SHORT).show()
                }
            })
    }



    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }


}