package com.example.practiceapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CountriesAdapter(
    var countryNameList: Array<String>,
    var countrydetailsList: ArrayList<String>,
    var countryFlagList: ArrayList<Int>,
    var context: Context
) : RecyclerView.Adapter<CountriesAdapter.countryViewHolder>() {

    class  countryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var textViewCountryName : TextView = itemView.findViewById(R.id.textViewCountryName)
        var textViewCountryDetails : TextView = itemView.findViewById(R.id.textViewDetails)
        var imageViewCountry : CircleImageView = itemView.findViewById(R.id.imageView)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): countryViewHolder {
        var view : View = LayoutInflater.from(parent.context)
                            .inflate(R.layout.card_layout, parent,false)
        return countryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryNameList.size
    }

    override fun onBindViewHolder(holder: countryViewHolder, position: Int) {
        holder.textViewCountryName.text = countryNameList.get(position)
        holder.textViewCountryDetails.text = countrydetailsList.get(position)
        holder.imageViewCountry.setImageResource(countryFlagList.get(position))
    }

}