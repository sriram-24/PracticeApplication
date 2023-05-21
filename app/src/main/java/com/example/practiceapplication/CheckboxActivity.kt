package com.example.practiceapplication

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import androidx.navigation.ui.AppBarConfiguration

import com.example.practiceapplication.databinding.ActivityCheckboxBinding
import com.google.android.material.snackbar.Snackbar

class CheckboxActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener {

    lateinit var genderText : TextView
    lateinit var checkMale : CheckBox
    lateinit var  checkFemale : CheckBox
    lateinit var textCountries : TextView
    lateinit var  spinnerCountries : Spinner
    lateinit var snackbarButton : Button
    lateinit var checkboxLayout : View
    lateinit var  buttonDialog : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox)
        genderText = findViewById(R.id.textGender)
        checkMale = findViewById(R.id.checkMale)
        checkFemale = findViewById(R.id.checkFemale)

        checkMale.setOnClickListener(){
            if (checkMale.isChecked){
                genderText.text = "gender is male"
                checkFemale.isChecked = false
            }
            else{
                genderText.text = "whats your gender?"
            }
        }

        checkFemale.setOnClickListener(){
            if (checkFemale.isChecked){
                genderText.text = "gender is female"
                checkMale.isChecked = false

            }
            else{
                genderText.text = "Whats your gender?"
            }
        }

//        spinner code below
        textCountries = findViewById(R.id.textCountries)
        spinnerCountries = findViewById(R.id.spinnerCountries)
        checkboxLayout = findViewById(R.id.checkboxLayout)

        spinnerCountries.onItemSelectedListener = this

        var arrayAdapter = ArrayAdapter.createFromResource(
            this,
            R.array.countries,
            android.R.layout.simple_spinner_item
        )

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinnerCountries.adapter = arrayAdapter

        //    snackbar code below

        snackbarButton = findViewById(R.id.buttonSnackbar)
        snackbarButton.setOnClickListener(){
            Snackbar.make(
                checkboxLayout,
                "This is a snackbar message",
                Snackbar.LENGTH_INDEFINITE // snackbar will stay forever until closed
            )
                .setAction(
                    "close",
                    {
//                        listener when close is clicked on snackbar
                    }
                ).show()
        }

        // dialog message code below
        buttonDialog = findViewById(R.id.buttonDialogMessage)

        buttonDialog.setOnClickListener(){
            showDialogMessage()
        }


    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
         if(parent !==null){
             textCountries.text = parent.getItemAtPosition(position).toString()
         }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    // code for dialog message below

    fun showDialogMessage(){
        var alertDialog = AlertDialog.Builder(this@CheckboxActivity)

        alertDialog.setTitle("Alert")
            .setIcon(R.drawable.round_warning_24)
            .setCancelable(false)
            .setMessage("Do you want to change the button text?")
            .setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, which ->
                dialogInterface.cancel()
            })
            .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, which ->
                buttonDialog.text = "Dialog button text changed"
            })
            .create().show()

    }


}