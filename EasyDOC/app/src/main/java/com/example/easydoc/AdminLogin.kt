package com.example.easydoc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.example.easydoc.databinding.ActivityAdminLoginBinding
import com.example.easydoc.databinding.ActivityPatientsloginBinding

class AdminLogin : AppCompatActivity() {


    private lateinit var binding: ActivityAdminLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityAdminLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.mAdminBtnLogin.setOnClickListener{
            val adminName =binding.mAdminEdtName.text.toString()
            val adminEmail = binding.mAdminEdtEmail.text.toString()
            val adminPassword = binding.mAdminEdtPassword.text.toString()


            if (adminName.isEmpty() || adminEmail.isEmpty()||adminPassword.isEmpty()){
                messages( "Empty Fields", "Please fill in all inputs")
            }else {
                val intent= Intent(this,DermatologistActivity::class.java)
                startActivity(intent)
                finish()

            }
        }

    }

    private fun messages(Title: String, message: String) {
        var alertDialog= AlertDialog.Builder(this)
        alertDialog.setTitle(Title)
        alertDialog.setMessage(message)
        alertDialog.create().show()
    }
    }
