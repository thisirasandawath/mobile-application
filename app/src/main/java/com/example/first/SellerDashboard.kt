package com.example.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SellerDashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seller_dashboard)

        val view : Button = findViewById(R.id.view)
        val currentPromotion : Button = findViewById(R.id.currentPromotion)
        val history : Button = findViewById(R.id.history)
        val add : Button = findViewById(R.id.add)

        view.setOnClickListener {
            val intent = Intent(this, UserActivity::class.java)
            startActivity(intent)
        }
    }

}