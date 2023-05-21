package com.example.practiceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {
    lateinit var recyclerView : RecyclerView
    lateinit var countryNameList:  Array<String>
    var countrydetailsList = ArrayList<String>();
    var countryFlagList = ArrayList<Int>();
    lateinit var adapter: CountriesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this@RecyclerViewActivity)

        countryNameList = resources.getStringArray(R.array.countries)
        countrydetailsList.add("first country description")
        countrydetailsList.add("second country description")
        countrydetailsList.add("third country description")
        countrydetailsList.add("fourth country description")
        countrydetailsList.add("fifth country description")

        countryFlagList.add(R.drawable.india)
        countryFlagList.add(R.drawable.south_africa)
        countryFlagList.add(R.drawable.australia)
        countryFlagList.add(R.drawable.netherlands)
        countryFlagList.add(R.drawable.united_arab_emirates)

        adapter = CountriesAdapter(countryNameList,countrydetailsList,countryFlagList,this@RecyclerViewActivity)
        recyclerView.adapter = adapter

    }
}