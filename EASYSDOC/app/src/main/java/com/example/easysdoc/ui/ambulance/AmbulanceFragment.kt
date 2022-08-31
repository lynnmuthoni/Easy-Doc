package com.example.easysdoc.ui.ambulance

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.easysdoc.databinding.FragmentAmbulanceBinding


class AmbulanceFragment : Fragment() {

    private var _binding: FragmentAmbulanceBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val ambulanceViewModel =
            ViewModelProvider(this).get(AmbulanceViewModel::class.java)

        _binding = FragmentAmbulanceBinding.inflate(inflater, container, false)
        val root: View = binding.root


        binding.mBtnCall.setOnClickListener {

        }



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}