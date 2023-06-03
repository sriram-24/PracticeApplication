package com.example.practiceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager

class ListViewSecondFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_second_fragment)
        val position = intent.getIntExtra("position",0)
        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val countryFragment = ListViewCountryFragment()
//      Creates bundle and set it as fragment argument to recieve it on the fragment
        var bundle = Bundle()
        bundle.putInt("position",position)
        countryFragment.arguments = bundle

        fragmentTransaction.add(R.id.frameLayoutToShowCountry, countryFragment)
        fragmentTransaction.commit()
    }
}