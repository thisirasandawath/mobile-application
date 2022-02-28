package com.example.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var email : EditText
    lateinit var pwd : EditText
    val len= 8

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        viewInitialization()
    }

    private fun viewInitialization(){
        email = findViewById(R.id.Email)
        pwd = findViewById(R.id.Password)

    }
    //checking if the input in form is valid
    private fun validateInput(): Boolean {

        if (email.text.toString() == "") {
            email.error = "Please Enter Email"
            return false
        }
        if (pwd.text.toString() == "") {
            pwd.error = "Please Enter Password"
            return false
        }
        //checking the proper email format
        if (!isEmailValid(email.text.toString().trim())) {
            email.error = "Please Enter Valid Email"
            return false
        }
        //Check minimum password length
        if(pwd.text.trim().length<len){
            pwd.error="Password Length must be " + len + " characters"
            return false
        }
        return true
    }
    private fun isEmailValid(email:String?):Boolean{
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
    // Hook Click Event
    fun performUserLogin(v: View) {
        if (validateInput()) {

            Toast.makeText(this@LoginActivity, "Login Success", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CustomerDashboard::class.java)
            startActivity(intent)
        }
        else
            Toast.makeText(this@LoginActivity,"LOGIN UNSUCCESSFUL", Toast.LENGTH_LONG).show()
    }

    fun performSellerLogin(v: View) {
        if (validateInput()) {

            Toast.makeText(this@LoginActivity, "Login Success", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SellerDashboard::class.java)
            startActivity(intent)
        }
        else
            Toast.makeText(this@LoginActivity,"LOGIN UNSUCCESSFUL", Toast.LENGTH_LONG).show()
    }


    fun goToSignup(v: View) {
    val intent = Intent(this, SignUpActivity::class.java)
    startActivity(intent)
    }
}