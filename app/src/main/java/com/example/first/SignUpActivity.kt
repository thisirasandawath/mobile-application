package com.example.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    lateinit var email : EditText
    lateinit var pwd : EditText
    lateinit var cpwd : EditText
    val len= 8

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        viewInitialization()
    }

    private fun viewInitialization(){
        email = findViewById(R.id.Email)
        pwd = findViewById(R.id.Password)
        cpwd = findViewById(R.id.cmPassword)
        val buttonJoin: Button = findViewById(R.id.signup)

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
        if (cpwd.text.toString() == "") {
            cpwd.error = "Please Re-Enter Password"
            return false
        }
        //checking the proper email format
        if (!isEmailValid(email.text.toString().trim())) {
            email.error = "Please Enter Valid Email"
            return false
        }
        //Check minimum password length
        if(pwd.text.trim().length<len){
            pwd.error="Password Length must be " + len + "characters"
            return false
        }
        if(pwd.text.toString().trim() != cpwd.text.toString()){
            cpwd.error = "Please Enter Correct Password"
            return false
        }
        return true
    }
    private fun isEmailValid(email:String?):Boolean{
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
    // Hook Click Event
    fun performSignUp(v: View) {
        if (validateInput()) {

            // Input is valid, here send data to your server
            //val email = email!!.text.toString()
            //val password = pwd!!.text.toString()
            Toast.makeText(this@SignUpActivity, "Login Success", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        else
            Toast.makeText(this@SignUpActivity,"LOGIN UNSUCCESSFUL", Toast.LENGTH_LONG).show()
    }

    fun goToLogin(v: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}
