package com.example.customnotifications

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action) {
            "ACTION_1" -> {
                Toast.makeText(context, "Button one clicked...", Toast.LENGTH_SHORT).show()
            }

            "ACTION_2" -> {
                Toast.makeText(context, "Button two clicked...", Toast.LENGTH_SHORT).show()
            }
        }
    }
}