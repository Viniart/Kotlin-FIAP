package com.example.myapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun registerUser(view: View) {

        val user = findViewById<EditText>(R.id.username);
        val email = findViewById<EditText>(R.id.email);
        val password = findViewById<EditText>(R.id.password);
        val repass = findViewById<EditText>(R.id.repassword);

        val userInput = user.text.toString();
        val userEmail = email.text.toString();
        val userPassword = password.text.toString();
        val userRepass = repass.text.toString();

        var result = "Failed to Register User";

        if(userPassword == userRepass){
            result = "User Has Been Successfully Registered";
        }

    }
}