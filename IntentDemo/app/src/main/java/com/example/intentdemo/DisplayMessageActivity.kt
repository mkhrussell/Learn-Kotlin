package com.example.intentdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val message = intent.getStringExtra(MainActivity.MY_MESSAGE)
        val txvMessage = findViewById<TextView>(R.id.txv_message)
        txvMessage.text =  message
        //Log.d("DisplayMessageActivity", "message = $message")
    }
}
