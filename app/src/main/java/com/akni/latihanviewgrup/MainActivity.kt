package com.example.latihanviewgroup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.akni.latihanviewgrup.R
import com.akni.latihanviewgrup.bolakaki
import com.akni.latihanviewgrup.futsal
import com.akni.latihanviewgrup.sneakers

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "sepatu ortusight"

        val btnTteokbokki: Button = findViewById(R.id.btn_tteokbokki)
        btnTteokbokki.setOnClickListener(this)

        val btnSamyang: Button = findViewById(R.id.btn_samyang)
        btnSamyang.setOnClickListener(this)

        val btnJjajangmyeon: Button = findViewById(R.id.btn_jjajangmyeon)
        btnJjajangmyeon.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_tteokbokki -> {
                val mTteokbokki = Intent(this@MainActivity, futsal::class.java)
                startActivity(mTteokbokki)
            }

            R.id.btn_samyang -> {
                val mSamyang = Intent(this@MainActivity, sneakers::class.java)
                startActivity(mSamyang)
            }

            R.id.btn_jjajangmyeon -> {
                val mJjajangmyeon = Intent(this@MainActivity, bolakaki::class.java)
                startActivity(mJjajangmyeon)
            }
        }
    }
}