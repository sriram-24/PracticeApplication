package com.example.practiceapplication.components.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import com.example.practiceapplication.R

class DialogFragmentActivity : AppCompatActivity() {
    lateinit var buttonDialog : Button
    lateinit var textViewDialogName : TextView
    lateinit var textViewDialogAge : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_fragment)

        buttonDialog = findViewById(R.id.buttonDialog)
        textViewDialogAge = findViewById(R.id.textViewDialogAge)
        textViewDialogName = findViewById(R.id.textViewDialogName)

        buttonDialog.setOnClickListener {
            val fragmentManager : FragmentManager = supportFragmentManager
            val dialogFragment = DialogFragmentPractice()
            dialogFragment.isCancelable = false
            dialogFragment.show(fragmentManager,"DialogFragmentPractice")

        }
    }

    fun getUserDataFromDialogFragment(username: String, age: Int){
        textViewDialogName.text = username.toString()
        textViewDialogAge.text = age.toString()
    }
}