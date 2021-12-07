package com.akni.latihanviewgrup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class futsal: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_futsal)
        supportActionBar?.title = "futsal"
    }
}