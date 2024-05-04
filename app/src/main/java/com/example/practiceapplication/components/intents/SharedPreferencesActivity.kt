package com.example.practiceapplication.components.intents

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.practiceapplication.databinding.ActivitySharedPreferencesBinding

class SharedPreferencesActivity : AppCompatActivity() {

    lateinit var viewBindingHelper : ActivitySharedPreferencesBinding
    lateinit var sharedPreferences : SharedPreferences

    var title : String? = null
    var description : String? = null
    var count : Int = 0
    var remember : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBindingHelper = ActivitySharedPreferencesBinding.inflate(layoutInflater)
        var view = viewBindingHelper.root
        setContentView(view)

        viewBindingHelper.buttonCounter.setOnClickListener {
            count++
            viewBindingHelper.buttonCounter.text = count.toString()
        }


    }
//    Lifecycle method: When user closes the application this method is triggered
    override fun onPause() {
        super.onPause()
        saveData()

    }
// Lifecycle method : When user re-opens the application onResume method is triggered
    override fun onResume() {
        super.onResume()
        retrieveData()
    }

    fun saveData(){
        sharedPreferences = this.getSharedPreferences("SaveData",Context.MODE_PRIVATE)
        var editor = sharedPreferences.edit()

        title = viewBindingHelper.editTextTitle.text.toString()
        description = viewBindingHelper.editTextDescription.text.toString()
        remember = viewBindingHelper.checkBoxRemenber.isChecked

        editor.putString("title",title)
        editor.putString("description",description)
        editor.putInt("count", count)
        editor.putBoolean("remember",remember)
//        IMPORTANT : to save changes apply method is used.
        editor.apply()

        Toast.makeText(applicationContext,"Data saved successfully",Toast.LENGTH_LONG).show()
    }

    fun retrieveData(){
        sharedPreferences = this.getSharedPreferences("SaveData", Context.MODE_PRIVATE)
        title = sharedPreferences.getString("title",null)
        description = sharedPreferences.getString("description",null)
        count = sharedPreferences.getInt("count",0)
        remember = sharedPreferences.getBoolean("remember",false)

        viewBindingHelper.editTextTitle.setText(title)
        viewBindingHelper.editTextDescription.setText(description)
        viewBindingHelper.buttonCounter.setText(count.toString())
        viewBindingHelper.checkBoxRemenber.isChecked = remember
    }


}