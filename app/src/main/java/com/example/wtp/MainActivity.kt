package com.example.wtp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import kotlinx.android.synthetic.main.activity_main.btnLogin
import kotlinx.android.synthetic.main.activity_main.btnReg

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener() {
            //check if this is an valid login

            Log.d("user", "login with user")
            var intent = Intent(this, RootActivity::class.java)
            startActivity(intent)
        }

        btnReg.setOnClickListener() {
            var intent = Intent(this, RegActivity::class.java)
            startActivity(intent)
        }
    }
}