package com.example.kotlinbasics

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG: String = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myValueOne = "Apple" // Immutable variable
        val myValueThree: String
        var myValueTwo = "Apple" // Mutable
        myValueTwo = "Orange"
        myValueThree = "Apple"

        var myVar: Int = 100
        var myVar2 = 100

        Log.d(TAG, "onCreate: $myValueOne, $myValueTwo, ${myValueThree.length}")
    }
}
