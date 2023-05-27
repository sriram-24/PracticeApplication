package com.example.practiceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceapplication.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity() {

    lateinit var viewBindHelper : ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBindHelper = ActivityViewBindingBinding.inflate(layoutInflater)
        var view = viewBindHelper.root
        setContentView(view)

        viewBindHelper.buttonViewResult.setOnClickListener {
            viewBindHelper.textViewResultView.text = viewBindHelper.editTextName.text.toString()
        }
    }
}