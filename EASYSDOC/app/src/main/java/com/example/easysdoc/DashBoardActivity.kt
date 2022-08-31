package com.example.easysdoc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashBoardActivity : AppCompatActivity() {
    var buttonPatientslogin: Button?=null
    var buttonDoctorslogin: Button?=null
    var buttonAdminlogin: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        buttonPatientslogin=findViewById(R.id.mBtnPatients)
        buttonPatientslogin!!.setOnClickListener {
            val intent= Intent(this,PatientSignInActivity::class.java)
            startActivity(intent)
            finish()
        }
        buttonDoctorslogin=findViewById(R.id.mBtnDoctor)
        buttonDoctorslogin!!.setOnClickListener {
            val intent= Intent(this,DoctorsLoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        buttonAdminlogin=findViewById(R.id.mBtnAdmin)
        buttonDoctorslogin!!.setOnClickListener {
            val intent= Intent(this,AdminLogin::class.java)
            startActivity(intent)
            finish()
        }
    }
    }
