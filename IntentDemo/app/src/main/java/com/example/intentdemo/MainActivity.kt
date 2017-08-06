package com.example.intentdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    companion object {
        val MY_MESSAGE = "com.example.intentdemo.MY_MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSend = findViewById<Button>(R.id.btn_send)
        btnSend.setOnClickListener {
            val displayMessageIntent = Intent(applicationContext, DisplayMessageActivity::class.java)
            val message = (findViewById<EditText>(R.id.edt_message)).text.toString()
            displayMessageIntent.putExtra(MY_MESSAGE, message)
            startActivity(displayMessageIntent)
        }
    }
}
