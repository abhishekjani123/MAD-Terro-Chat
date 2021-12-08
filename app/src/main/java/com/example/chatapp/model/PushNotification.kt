package com.example.chatapp.model

import com.example.chatapp.model.NotificationData

data class PushNotification(
    var data: NotificationData,
    var to:String
)