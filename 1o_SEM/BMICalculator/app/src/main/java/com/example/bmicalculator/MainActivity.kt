package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val btn = findViewById<Button>(R.id.button)
        // btn.setOnClickListener {
        //    codeBMI()
        //}

    }

    fun codeBMI()
    {
        val weightText = findViewById<EditText>(R.id.weight)
        val heightText = findViewById<EditText>(R.id.height)
        val resultText = findViewById<TextView>(R.id.result)

        val w = (weightText.text).toString().toFloat()
        val h = (heightText.text).toString().toFloat() / 100

        val bmi = w / (h * h)
        resultText.text = getBMIText(bmi)
    }

    fun getBMIText(bmi: Float): String {
        if(bmi <= 18.5){
            return "$bmi Magro"
        }
        if(bmi > 18.5 && bmi <= 24.9) {
            return "$bmi Ideal"
        }
        if(bmi > 25 && bmi <= 29.9){
            return "$bmi Sobrepeso"
        }
        if(bmi > 30 && bmi <= 34){
            return "$bmi Obesidade nível 1"
        }
        if( bmi > 35 && bmi <= 39.9){
            return "$bmi Obesidade nível 2"
        }
        return "$bmi Obesidade nível 3"
    }

    fun calculateBMI(view: View)
    {
        codeBMI()
    }

}