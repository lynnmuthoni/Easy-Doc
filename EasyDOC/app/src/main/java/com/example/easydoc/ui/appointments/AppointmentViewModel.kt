package com.example.easydoc.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AppointmentViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Do you have an emergency?"
    }
    val text: LiveData<String> = _text
}