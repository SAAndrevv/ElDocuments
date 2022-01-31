package com.saandrew.eldocuments.ui.qr

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.zxing.BarcodeFormat
import com.google.zxing.ResultPoint
import com.journeyapps.barcodescanner.BarcodeCallback
import com.journeyapps.barcodescanner.BarcodeResult
import com.journeyapps.barcodescanner.DecoratedBarcodeView
import com.journeyapps.barcodescanner.DefaultDecoderFactory
import com.saandrew.eldocuments.databinding.QrScannerFragmentBinding


class QrScannerFragment : Fragment() {

    private lateinit var barcodeView: DecoratedBarcodeView
    private var binding: QrScannerFragmentBinding? = null

    private val requestPermissionLauncher =
        registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted: Boolean ->
            if (isGranted) {
                barcodeView.resume()
            } else {
                Log.d("Permission: ", "Denied")
            }
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val frameBinding = QrScannerFragmentBinding.inflate(inflater, container, false)
        binding = frameBinding
        barcodeView = frameBinding.barcodeScanner

        return frameBinding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        when {
            ContextCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.CAMERA
            ) == PackageManager.PERMISSION_GRANTED -> {
                Log.d("SCANNER_TAG", "PERMISSION_GRANTED")
            }

            ActivityCompat.shouldShowRequestPermissionRationale(
                requireActivity(),
                Manifest.permission.CAMERA
            ) -> {
                requestPermissionLauncher.launch(
                    Manifest.permission.CAMERA
                )
            }
            else -> {
                requestPermissionLauncher.launch(
                    Manifest.permission.CAMERA
                )
            }
        }
        setupScanner()

    }

    private fun setupScanner() {
        val format = listOf(BarcodeFormat.QR_CODE)
        barcodeView.barcodeView.decoderFactory = DefaultDecoderFactory(format)
        barcodeView.initializeFromIntent(activity?.intent)

        val callback = object : BarcodeCallback {
            override fun barcodeResult(result: BarcodeResult) {
                if (result.text != null) {
                    Toast.makeText(activity, result.toString(), Toast.LENGTH_SHORT).show()
                    try {
                        val action =
                            QrScannerFragmentDirections.actionNavigationQrScannerToQrResultFragment(
                                token = result.text
                            )
                        findNavController().navigate(action)
                    } catch (e: org.json.JSONException) {
                        Log.d("SCANNER_TAG", e.toString())
                    }
                }
            }

            override fun possibleResultPoints(resultPoints: MutableList<ResultPoint>?) {
            }
        }
        barcodeView.decodeContinuous(callback)
    }

    override fun onResume() {
        super.onResume()
        requestPermissionLauncher.launch(Manifest.permission.CAMERA)
    }

    override fun onPause() {
        super.onPause()
        barcodeView.pause()
    }

}
