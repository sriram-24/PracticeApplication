package com.example.practiceapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import calculator.CalculatorActivity

class ViewHelper {
    fun showEditText(context: Context) : Intent {
        var intent = Intent(context,EditText::class.java)
        return intent
    }

    fun showCalculator(context: Context) : Intent {
        var intent = Intent(context,CalculatorActivity::class.java)
        return intent
    }

    fun showCheckboxActivity(context: Context) : Intent {
        var intent = Intent(context,CheckboxActivity::class.java)
        return intent
    }

    fun showListviewActivity(context: Context) : Intent {
        var intent = Intent(context,ListViewActivity::class.java)
        return intent
    }

    fun showRecyclerViewActivity(context: Context) : Intent {
        var intent = Intent(context,RecyclerViewActivity::class.java)
        return intent
    }

}