package com.example.first

<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
=======
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
>>>>>>> 2b8519896d8f69d8ea7e60b1922b566ca6b9bda2

class CustomerDashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_dashboard)
<<<<<<< HEAD
=======

        val view : Button = findViewById(R.id.userprofile)

        view.setOnClickListener {
            val intent = Intent(this, UserActivity::class.java)
            startActivity(intent)
        }
>>>>>>> 2b8519896d8f69d8ea7e60b1922b566ca6b9bda2
    }
}