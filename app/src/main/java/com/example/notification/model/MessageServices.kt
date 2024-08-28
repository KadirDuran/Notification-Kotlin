package com.example.notification.model

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MessageServices : FirebaseMessagingService() {
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        val title = remoteMessage.notification?.title ?: "No Title"
        val body = remoteMessage.notification?.body ?: "No Body"
        val notification = ManuelNotification(
            this,
            "ChannelId",
            "Channel_Name",
            "Channel_Description"
        )
        notification.SendTestNotification(title, body)
    }
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d("FCM", "Token: $token")
    }
}
