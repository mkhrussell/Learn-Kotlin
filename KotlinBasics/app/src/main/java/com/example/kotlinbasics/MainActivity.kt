package com.example.kotlinbasics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG: String = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var nonNullName = "Russell"
//        var nullableName: String? = "Russell"
//        nullableName = null
//        var nonNullVar2 = "John"
//        nonNullName = nullableName ?: nonNullVar2 // Elvis operator

//        var countryName: String? = null
//        countryName = "Bangladesh"
//        Log.d(TAG, "onCreate: " + countryName?.toUpperCase()) // good way
//        Log.d(TAG, "onCreate: " + countryName!!.toUpperCase()) // Dangerous

        /*
        if(countryName != null) {
            Log.d(TAG, "onCreate: " + countryName.toUpperCase())
        }
        */

        var intValue = 8000000
        var strValue = intValue as? String

        Log.d(TAG, "onCreate: " + strValue?.toUpperCase())
    }
}
