package com.example.easysdoc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class SignUpActivity : AppCompatActivity() {

    var editTextName: EditText?=null
    var editTextEmail: EditText?=null
    var editTextNumber: EditText?=null
    var editTextPass: EditText?=null
    var editTextConfirmPass: EditText?=null
    var buttonRegister: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patientslogin)
        editTextName=findViewById(R.id.medtName)
        editTextEmail=findViewById(R.id.medtEmail)
        editTextNumber=findViewById(R.id.mEdtPhoneNumber)
        editTextPass=findViewById(R.id.mEdtPassword)
        editTextConfirmPass=findViewById(R.id.mEdtConfirmPassword)
        buttonRegister=findViewById(R.id.mBtnRegister)



        buttonRegister!!.setOnClickListener {
            //receive the data
            val username=editTextName!!.text.toString().trim()
            val useremail=editTextEmail!!.text.toString().trim()
            val userPhoneNumber=editTextNumber!!.text.toString().trim()
            val userPassword=editTextPass!!.text.toString().trim()
            val userConfirmPass=editTextConfirmPass!!.text.toString().trim()
            val id=System.currentTimeMillis().toString()

            //Check if user field is empty
            if (username.isEmpty()){
                editTextName!!.setError("Please fill this field!!")
                editTextName!!.requestFocus()
            }
            else if (useremail.isEmpty()){
                editTextEmail!!.setError("Please fill this field!!")
                editTextEmail!!.requestFocus()
            }
            else if (userPhoneNumber.isEmpty()){
                editTextNumber!!.setError("Please fill this field!!")
                editTextNumber!!.requestFocus()
            }else if (userPassword.isEmpty()){
                editTextPass!!.setError("Please fill this field!!")
                editTextNumber!!.requestFocus()
            }else if (userConfirmPass.isEmpty()){
                editTextConfirmPass!!.setError("Please fill this field!!")
                editTextConfirmPass!!.requestFocus()
            }
            else{
                //Save the data
                //Start by creating the user object
                val userData=(username);useremail;userPhoneNumber;userPassword;id;

                //Create a reference to the database to store data
                val reference= FirebaseDatabase.getInstance().
                getReference().child("Users/$id")
                //Start saving userdata
                reference.setValue(userData).addOnCompleteListener{
                        task->
                    if (task.isSuccessful){
                        Toast.makeText(applicationContext,"You Have Been Registered Sucessfully",
                            Toast.LENGTH_LONG).show()
                    }
                }
            }

        }

    }
}


