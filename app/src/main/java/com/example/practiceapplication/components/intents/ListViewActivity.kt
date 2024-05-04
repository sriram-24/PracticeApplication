package com.example.practiceapplication.components.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.practiceapplication.R

class ListViewActivity : AppCompatActivity() {
    lateinit var listViewCountries : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        listViewCountries = findViewById(R.id.listViewCountries)

        var countriesList  = resources.getStringArray(R.array.countries)

        var listViewAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,countriesList)

        listViewCountries.adapter = listViewAdapter

        listViewCountries.setOnItemClickListener { parent, view, position, id ->
            val country : String = parent.getItemAtPosition(position).toString()
            Toast.makeText(applicationContext, "You selected $country", Toast.LENGTH_LONG).show()
        }
    }
}