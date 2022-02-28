package com.example.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class FirstActivity : AppCompatActivity() {
    // This is the loading time of the splash screen
    private val spTime:Long = 2000 // 1/3 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)


        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            startActivity(Intent(this,HomeActivity::class.java))

            // close this activity
            finish()
        }, spTime)
    }

}