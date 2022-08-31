package com.example.easysdoc

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashscreenActivity : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)


        handler=Handler()
        handler.postDelayed({
            val intent= Intent(this,DashBoardActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}
