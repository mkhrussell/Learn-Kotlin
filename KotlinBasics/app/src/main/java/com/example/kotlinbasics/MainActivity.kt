package com.example.kotlinbasics

// namespace:

// Domain naeme: example.com
// Project name: kotlinbasics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

import com.example.mypackage.greet

class MainActivity : AppCompatActivity() {

    private val TAG: String = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: starts")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sayHello("Hello from: com.example.kotlinbasics")
        greet("Hello!")

        Log.d(TAG, "onCreate: ends")
    }

}
