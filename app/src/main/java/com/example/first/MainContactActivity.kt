package com.example.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_contact)

        val next : Button = findViewById(R.id.next)

        next.setOnClickListener{
            val intent = Intent(this,GeneralActivity::class.java)
            startActivity(intent)

        }

    }
}
