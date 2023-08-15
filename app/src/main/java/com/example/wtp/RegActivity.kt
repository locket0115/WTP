package com.example.wtp

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.ComponentActivity
import kotlinx.android.synthetic.main.activity_reg.btnBack
import kotlinx.android.synthetic.main.activity_reg.btnReg

class RegActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_reg)

        btnBack.setOnClickListener() {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnReg.setOnClickListener() {
            //add login information to server

            Log.d("user", "registered with user")

            var intent = Intent(this, RootActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}