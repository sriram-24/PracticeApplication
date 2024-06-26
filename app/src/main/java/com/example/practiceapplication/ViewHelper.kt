package com.example.practiceapplication

import android.content.Context
import android.content.Intent
import calculator.CalculatorActivity
import com.example.practiceapplication.components.fragments.DialogFragmentActivity
import com.example.practiceapplication.components.fragments.FragmentActivity
import com.example.practiceapplication.components.fragments.ListFragmentActivity
import com.example.practiceapplication.components.intents.CheckboxActivity
import com.example.practiceapplication.components.intents.IntentActivity
import com.example.practiceapplication.components.intents.ListViewActivity
import com.example.practiceapplication.components.intents.RecyclerViewActivity
import com.example.practiceapplication.components.intents.SharedPreferencesActivity
import com.example.practiceapplication.components.intents.ViewBindingActivity

class ViewHelper {
    fun showEditText(context: Context) : Intent {
        var intent = Intent(context,EditText::class.java)
        return intent
    }

    fun showCalculator(context: Context) : Intent {
        var intent = Intent(context,CalculatorActivity::class.java)
        return intent
    }
    fun showIntentActivity(context: Context) : Intent {
        var intent = Intent(context, IntentActivity::class.java)
        return intent
    }

    fun showCheckboxActivity(context: Context) : Intent {
        var intent = Intent(context, CheckboxActivity::class.java)
        return intent
    }

    fun showListviewActivity(context: Context) : Intent {
        var intent = Intent(context, ListViewActivity::class.java)
        return intent
    }

    fun showRecyclerViewActivity(context: Context) : Intent {
        var intent = Intent(context, RecyclerViewActivity::class.java)
        return intent
    }

    fun showViewBindingActivity(context: Context) : Intent {
        var intent = Intent(context, ViewBindingActivity::class.java)
        return intent
    }

    fun showSharedPreferencesActivity(context: Context) : Intent {
        var intent = Intent(context, SharedPreferencesActivity::class.java)
        return intent
    }

    fun showFragmentActivity(context: Context) : Intent {
        var intent = Intent(context, FragmentActivity::class.java)
        return intent
    }

    fun showListFragmentActivity(context: Context) : Intent {
        var intent = Intent(context, ListFragmentActivity::class.java)
        return intent
    }
    fun showDialogFragmentActivity(context: Context) : Intent {
        var intent = Intent(context, DialogFragmentActivity::class.java)
        return intent
    }

    fun showSendSMSActivity(context: Context) : Intent {
        var intent = Intent(context,SMSActivity::class.java)
        return intent
    }

    fun showServicesActivity(context: Context) : Intent {
        var intent = Intent(context,ServicesActivity::class.java)
        return intent
    }

}