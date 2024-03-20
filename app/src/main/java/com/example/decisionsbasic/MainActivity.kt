package com.example.decisionsbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editText)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        button.setOnClickListener {
            val input = editText.text.toString()
            // Check if the input is empty7
            if(input.isEmpty()) {
                resultTextView.text = "Please enter a number"
                return@setOnClickListener
            }

//Convert the input to an integer
            val number = input.toInt()
            if (number > 10) {
                resultTextView.text = "The number is greater than 10"
            } else
                resultTextView.text = "The number is NOT greater than 10"
        }
    }
}