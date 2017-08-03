package com.example.simpleproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: HIT")
        Log.d(TAG, "savedInstanceState = ${savedInstanceState.toString()}")
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "onStart: HIT")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResume: HIT")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "onPause: HIT")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "onStop: HIT")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "onDestroy: HIT")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, "onRestart: HIT")
    }
}
