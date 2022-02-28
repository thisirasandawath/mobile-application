package com.example.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CustomerDashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_dashboard)

        val view : Button = findViewById(R.id.userprofile)
        val search :Button =findViewById(R.id.search)

        view.setOnClickListener {
            val intent = Intent(this, UserActivity::class.java)
            startActivity(intent)
        }
        search.setOnClickListener {
            val intent = Intent(this,discountActivity::class.java)
            startActivity(intent)
        }

    }
}