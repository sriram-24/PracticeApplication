package com.example.practiceapplication.services

import android.app.Notification
import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import androidx.core.app.NotificationCompat
import com.example.practiceapplication.R

class MyBackgroundService : Service() {
    lateinit var mediaPlayer: MediaPlayer
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        when(intent?.action){
            Action.START.toString() -> {
                startMyService()
            }

            Action.STOP.toString() -> {
                mediaPlayer.stop()
                stopSelf()
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }

    private fun startMyService(){
        mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)
        mediaPlayer.start()
        mediaPlayer.isLooping = true
        val notification = NotificationCompat.Builder(this,"FOREGROUND_CHANNEL")
            .setOngoing(true)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle("Indian Flag")
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentText("This is a foreground service notification")
            .build()
        notification.flags = Notification.FLAG_ONGOING_EVENT
        startForeground(2, notification)
    }
}

enum class Action{
    START, STOP
}

