package com.example.practiceapplication

import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.practiceapplication.databinding.ActivitySmsactivityBinding

class SMSActivity : AppCompatActivity() {
    lateinit var bindingHelper : ActivitySmsactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingHelper = ActivitySmsactivityBinding.inflate(layoutInflater)
        val view = bindingHelper.root
        setContentView(view)

        bindingHelper.buttonSendSMSMessage.setOnClickListener {
            var message : String = bindingHelper.editTextTextMultiLine.text.toString()
            var phone: String = bindingHelper.editTextPhone.text.toString()
            sendSMS(message,phone)

        }
    }

    fun sendSMS(message: String, phone : String ){
        if (
            ContextCompat.checkSelfPermission(this@SMSActivity,android.Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED
        )   {
            ActivityCompat.requestPermissions(this@SMSActivity, arrayOf(android.Manifest.permission.SEND_SMS),12)
        }
        else{
            var smsManager : SmsManager;
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                smsManager = this.getSystemService(SmsManager::class.java)
                smsManager.sendTextMessage(phone,null, message, null, null)
            }
            else{
                smsManager = SmsManager.getDefault()
                smsManager.sendTextMessage(phone,null, message, null, null)
            }
            Toast.makeText(this@SMSActivity, "Message sent", Toast.LENGTH_LONG).show()
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 12 && grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED ){
            var smsManager : SmsManager;
            var message : String = bindingHelper.editTextTextMultiLine.text.toString()
            var phone: String = bindingHelper.editTextPhone.text.toString()
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                smsManager = this.getSystemService(SmsManager::class.java)
                smsManager.sendTextMessage(phone,null, message, null, null)
            }
            else{
                smsManager = SmsManager.getDefault()
                smsManager.sendTextMessage(phone,null, message, null, null)
            }
            Toast.makeText(this@SMSActivity, "Message sent", Toast.LENGTH_LONG).show()
        }
    }
}