package com.example.practiceapplication.components.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.practiceapplication.R
import com.example.practiceapplication.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    lateinit var viewBindingHelper : ActivityFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBindingHelper = ActivityFragmentBinding.inflate(layoutInflater)
        var view = viewBindingHelper.root
        setContentView(view)

        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()
        val firstTabFragment = FirstTabFragment()
        fragmentTransaction.add(R.id.frameFragment,firstTabFragment)
        fragmentTransaction.commit()

        viewBindingHelper.buttonSwitchFragment.setOnClickListener {
            val fragmentManager : FragmentManager = supportFragmentManager
            val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()
            val secondTabFragment = SecondTabFragment()
            fragmentTransaction.replace(R.id.frameFragment,secondTabFragment)
            fragmentTransaction.commit()
        }
    }
}