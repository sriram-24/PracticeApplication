package com.example.practiceapplication.components.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.practiceapplication.R

class ListViewCountryFragment : Fragment() {

    lateinit var imageViewCountry : ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_list_view_country, container, false)
        imageViewCountry = view.findViewById(R.id.imageViewCountry);

        val position = arguments?.getInt("position",0)
        when(position){
            0 -> imageViewCountry.setImageResource(R.drawable.india)
            1 -> imageViewCountry.setImageResource(R.drawable.south_africa)
            2 -> imageViewCountry.setImageResource(R.drawable.australia)
            3 -> imageViewCountry.setImageResource(R.drawable.netherlands)
            4 -> imageViewCountry.setImageResource(R.drawable.united_arab_emirates)
        }
        return view
    }

}