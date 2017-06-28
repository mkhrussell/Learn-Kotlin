package com.example.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHello = findViewById(R.id.btnHello)
        val tvHello = findViewById(R.id.tvHello) as TextView

        btnHello.setOnClickListener {
            tvHello.text = "Hello from Kotlin. Enjoy simplicity!"
        }
    }
}
