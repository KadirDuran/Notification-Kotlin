package com.example.notification.model

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.util.Log


class NotificationListener : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent) {
        val notificationTitle = intent.getStringExtra("title") ?: "No Title"
        val notificationBody = intent.getStringExtra("body") ?: "No Body"
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                ManuelNotification(context!!, "ChannelId", "Channel_Name", "Channel_Description")
                    .SendTestNotification(notificationTitle, notificationBody)
            }

    }
}
