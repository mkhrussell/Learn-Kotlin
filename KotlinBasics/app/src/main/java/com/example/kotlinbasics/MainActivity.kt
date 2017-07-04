package com.example.kotlinbasics

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG: String = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        var countries: Array<String> = Array<String>(6) {"Bangladesh"}
//        countries[1] = "India"
//        countries[2] = "Pakistan"

        var countries: Array<String> = arrayOf("Bangladesh", "India", "Pakistan")

        Log.d(TAG, "onCreate: ${ countries[0] }, ${ countries[2] }")
    }
}
