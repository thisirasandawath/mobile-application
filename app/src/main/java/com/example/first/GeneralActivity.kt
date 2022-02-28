package com.example.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GeneralActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general)

        val next : Button = findViewById(R.id.Button_next)

        next.setOnClickListener{
            val intent = Intent(this,CommissionActivity::class.java)
            startActivity(intent)

        }
    }
}