package com.example.practiceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var editTextButton: Button;
    lateinit var calculatorButton: Button;
    lateinit var  checkboxButton: Button;
    lateinit var  buttonListView : Button
    lateinit var buttonRecyclerView : Button
    lateinit var buttonIntent : Button
    lateinit var buttonViewBinding : Button
    lateinit var buttonSharedPreferences : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var helper : ViewHelper = ViewHelper();

        editTextButton = findViewById(R.id.editButton)
        calculatorButton = findViewById(R.id.buttonCalculator)
        checkboxButton = findViewById(R.id.buttonCheck)
        buttonListView = findViewById(R.id.buttonListView)
        buttonRecyclerView = findViewById(R.id.buttonRecyclerView)
        buttonIntent = findViewById(R.id.buttonIntent)
        buttonViewBinding = findViewById(R.id.buttonViewBinding)
        buttonSharedPreferences = findViewById(R.id.buttonSharedPreferences)

        editTextButton.setOnClickListener{
            startActivity(helper.showEditText(context = this))
        }
        calculatorButton.setOnClickListener{
            startActivity(helper.showCalculator(this))
        }

        checkboxButton.setOnClickListener(){
        startActivity(helper.showCheckboxActivity(this))
        }

        buttonListView.setOnClickListener(){
            startActivity(helper.showListviewActivity(this))
        }

        buttonRecyclerView.setOnClickListener(){
            startActivity(helper.showRecyclerViewActivity(this))
        }

        buttonIntent.setOnClickListener{
            startActivity(helper.showIntentActivity(this))
        }

        buttonViewBinding.setOnClickListener{
            startActivity(helper.showViewBindingActivity(this@MainActivity))
        }

        buttonSharedPreferences.setOnClickListener{
            startActivity(helper.showSharedPreferencesActivity(this@MainActivity))
        }

    }
}