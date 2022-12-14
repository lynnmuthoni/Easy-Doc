package com.example.easydoc.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.easydoc.DermatologistActivity
import com.example.easydoc.DoctorLoginActivity
import com.example.easydoc.R
import com.example.easydoc.UsersActivity
import com.example.easydoc.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val button: Button= binding.buttonOrthopedic
        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
            button.findViewById<Button>(R.id.buttonOrthopedic)
            button!!.setOnClickListener{

            }
        }
        return root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}