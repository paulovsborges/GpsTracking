package com.pvsb.gpstracking

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build

class LocationApp: Application() {

    override fun onCreate() {
        super.onCreate()

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as  NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){

            val notificationChannel = NotificationChannel( "location_service",
                "location_service",
                NotificationManager.IMPORTANCE_LOW)

            notificationManager.createNotificationChannel(notificationChannel)
        }
    }
}