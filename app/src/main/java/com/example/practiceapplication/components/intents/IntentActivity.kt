package com.example.practiceapplication.components.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.practiceapplication.R

class IntentActivity : AppCompatActivity() {

    lateinit var editTextUsername : EditText
    lateinit var  editTextAge : EditText
    lateinit var  buttonSubmit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        editTextUsername =  findViewById(R.id.editTextUserName)
        editTextAge = findViewById(R.id.editTextAge)
        buttonSubmit = findViewById(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener{
            var intent : Intent = Intent(this@IntentActivity, ResultPageIntent::class.java);

            intent.putExtra("username",editTextUsername.text.toString())
            intent.putExtra("userage",editTextAge.text.toString().toInt())

            startActivity(intent)

        }

    }

}