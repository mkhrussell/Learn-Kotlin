package com.example.simpleproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numbers = arrayOf(1, 2, 3, 4, 5)

        var sum = 0
        var index = 0

        while (index <= 4) {
            sum += numbers[index]
            index++
        }

        Log.d("MainActivity", "sum = $sum") // sum == 15
    }
}
