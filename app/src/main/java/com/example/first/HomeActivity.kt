package com.example.first

import android.content.Intent
import android.os.Bundle
import android.widget.*
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import android.widget.Spinner

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val user : ImageButton = findViewById(R.id.user)
        val beauty : ImageView = findViewById(R.id.beauty)
        val cloths : ImageView = findViewById(R.id.cloths)
        val computer : ImageView = findViewById(R.id.computer)
        val toys : ImageView = findViewById(R.id.toys)

        user.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        beauty.setOnClickListener {
            val intent = Intent(this, UserActivity::class.java)
            startActivity(intent)
        }

        cloths.setOnClickListener {
            val intent = Intent(this, UserActivity::class.java)
            startActivity(intent)
        }

        computer.setOnClickListener {
            val intent = Intent(this, UserActivity::class.java)
            startActivity(intent)
        }

        toys.setOnClickListener {
            val intent = Intent(this, UserActivity::class.java)
            startActivity(intent)
        }

    }
}