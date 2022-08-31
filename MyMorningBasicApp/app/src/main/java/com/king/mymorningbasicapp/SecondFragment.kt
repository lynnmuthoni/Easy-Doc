package com.king.mymorningbasicapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.king.mymorningbasicapp.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {
    var second_button:Button?=null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var root =inflater.inflate(R.layout.fragment_second, container, false)
        second_button=root.findViewById(R.id.button_second)
        second_button!!.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)

        }


        return root

    }



    override fun onDestroyView() {
        super.onDestroyView()

    }
}