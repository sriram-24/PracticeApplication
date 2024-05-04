package com.example.practiceapplication.services

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings

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
    }
}

enum class Action{
    START, STOP
}

