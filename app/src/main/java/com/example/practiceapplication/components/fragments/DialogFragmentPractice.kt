package com.example.practiceapplication.components.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment
import com.example.practiceapplication.R

class DialogFragmentPractice : DialogFragment() {
    lateinit var  buttonOk : Button
    lateinit var  buttonCancel : Button
    lateinit var  personName : android.widget.EditText
    lateinit var personAge : EditText
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dialog, container, false)

        buttonOk = view.findViewById(R.id.buttonDialogOk)
        buttonCancel = view.findViewById(R.id.buttonDialogCancel)
        personName = view.findViewById(R.id.editTextPersonName)
        personAge = view.findViewById(R.id.editTextPersonAge)

        dialog!!.window!!.setBackgroundDrawableResource(android.R.color.transparent)

        buttonCancel.setOnClickListener {
            dialog!!.dismiss()
        }

        buttonOk.setOnClickListener {
            val username : String = personName.text.toString()
            val age : Int = personAge.text.toString().toInt()

            val  dialogActivity : DialogFragmentActivity = activity as DialogFragmentActivity
            dialogActivity.getUserDataFromDialogFragment(username,age)

            dialog!!.dismiss()

        }
        return view
    }

}