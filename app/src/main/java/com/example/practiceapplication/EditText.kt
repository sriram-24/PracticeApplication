package com.example.practiceapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class EditText : AppCompatActivity() {

    lateinit var editText: android.widget.EditText;
    lateinit var okButton: Button;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)

        editText = findViewById<android.widget.EditText>(R.id.editTextRandom)
        okButton = findViewById<Button>(R.id.buttonOk)
        okButton.setOnClickListener{
            Toast.makeText(this, editText.text, Toast.LENGTH_SHORT).show()
        }

    }
}