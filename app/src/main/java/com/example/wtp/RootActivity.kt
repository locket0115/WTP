package com.example.wtp

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import kotlinx.android.synthetic.main.activity_root.btnCam
import kotlinx.android.synthetic.main.activity_root.btnStore
import kotlinx.android.synthetic.main.activity_root.btnlo

class RootActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_root)

        btnStore.setOnClickListener() {
            var intent = Intent(this, StoreActivity::class.java)
            startActivity(intent)
        }

        btnCam.setOnClickListener() {
            var intent = Intent(this, CamActivity::class.java)
            startActivity(intent)
        }

        btnlo.setOnClickListener() {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}