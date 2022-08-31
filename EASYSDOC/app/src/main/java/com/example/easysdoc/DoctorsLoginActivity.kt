package com.example.easysdoc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class DoctorsLoginActivity : AppCompatActivity() {
    private lateinit var binding: PatientSignInActivity
    private lateinit var firebaseAuth: FirebaseAuth
    var editTextEmail: EditText?=null
    var editTextPass: EditText?=null
    var buttonLogin: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patientslogin)

        editTextEmail=findViewById(R.id.medtEmail)
        editTextPass=findViewById(R.id.mEdtPassword)
        buttonLogin=findViewById(R.id.mBtnLogin)


        buttonLogin!!.setOnClickListener {
            //receive the data

            val useremail=editTextEmail!!.text.toString().trim()
            val userPass=editTextPass!!.text.toString().trim()
            val id=System.currentTimeMillis().toString()

            //Check if user field is empty

            if (useremail.isEmpty()){
                editTextEmail!!.setError("Please fill this field!!")
                editTextEmail!!.requestFocus()
            }
            else if (userPass.isEmpty()){
                editTextPass!!.setError("Please fill this field!!")
                editTextPass!!.requestFocus()
            }else{
                //Save the data
                firebaseAuth.signInWithEmailAndPassword(useremail,userPass).addOnCompleteListener{
                    if (it.isSuccessful){
                        val intent= Intent(this,HomeActivity::class.java)
                        startActivity(intent)
                    }else{
                        Toast.makeText(this,it.exception.toString(), Toast.LENGTH_LONG).show()
                    }
                }
            }


        }
    }
}