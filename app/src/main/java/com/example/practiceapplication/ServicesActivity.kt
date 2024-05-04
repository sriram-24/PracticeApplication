package com.example.practiceapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.practiceapplication.services.Action
import com.example.practiceapplication.services.MyBackgroundService

class ServicesActivity : AppCompatActivity() {
    lateinit var startBackgroundService: Button
    lateinit var endBackgroundService: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_services)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        startBackgroundService = findViewById(R.id.startBackgroundService)
        endBackgroundService = findViewById(R.id.endBackgroundService)

        startBackgroundService.setOnClickListener{
            val intent = Intent( this@ServicesActivity, MyBackgroundService::class.java)
            intent.action = Action.START.toString()
            startService(intent)
        }

        endBackgroundService.setOnClickListener{
            val intent = Intent( this@ServicesActivity, MyBackgroundService::class.java)
            intent.action = Action.STOP.toString()
            startService(intent)
        }
    }
}