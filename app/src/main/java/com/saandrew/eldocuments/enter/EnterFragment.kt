package com.saandrew.eldocuments.enter


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputLayout
import com.saandrew.eldocuments.R
import com.saandrew.eldocuments.databinding.EnterFragmentBinding


class EnterFragment : Fragment() {
    private val viewModel: EnterViewModel by viewModels()
    private var binding: EnterFragmentBinding? = null
    private lateinit var emailInput: TextInputLayout
    private lateinit var passwordInput: TextInputLayout


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = EnterFragmentBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            enterFragment = this@EnterFragment
            enterViewModel = viewModel

        }
        emailInput = binding!!.emailField
        passwordInput = binding!!.passwordField

        emailInput.editText?.doOnTextChanged { _, _, _, _ ->
            emailInput.error = null
            passwordInput.error = null
        }

        passwordInput.editText?.doOnTextChanged { _, _, _, _ ->
            emailInput.error = null
            passwordInput.error = null
        }

        viewModel.loginResult.observe(viewLifecycleOwner,
            { newData ->
                when (newData) {
                    LoginStatus.SUCCESS -> {
                        findNavController().navigate(R.id.action_enterFragment_to_mainActivity)
                        activity?.finish()
                    }
                    LoginStatus.ERROR -> {
                        emailInput.error = getString(R.string.wrong_auth)
                    }
                    LoginStatus.INVALID_DATA -> {
                        passwordInput.error = getString(R.string.empty_field_error)
                    }
                }
            })
    }

    fun onRegistrationButton() {
        findNavController().navigate(R.id.action_enterFragment_to_registerFragment)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}