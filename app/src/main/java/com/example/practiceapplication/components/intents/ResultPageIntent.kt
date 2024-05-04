package com.example.practiceapplication.components.intents


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.practiceapplication.R

class ResultPageIntent : AppCompatActivity() {
    lateinit var viewResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_page_intent)
        viewResult = findViewById(R.id.textViewResult)
        var username : String = intent.getStringExtra("username").toString()
        var userage : Int = intent.getIntExtra("userage",0)
        viewResult.text = "username is ${username} and your age is ${userage}"
    }
}