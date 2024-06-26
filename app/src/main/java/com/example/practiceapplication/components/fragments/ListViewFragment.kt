package com.example.practiceapplication.components.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.ListFragment
import com.example.practiceapplication.R


class ListViewFragment : ListFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val arrayAdapter =
            activity?.let {
                ArrayAdapter.createFromResource(it, R.array.countries,android.R.layout.simple_list_item_1)

            }

        listAdapter = arrayAdapter

        listView.setOnItemClickListener { adapterView, view, position, l ->
            val intent = Intent(activity, ListViewSecondFragmentActivity::class.java)
            intent.putExtra("position",position)
            startActivity(intent)
        }
    }

}