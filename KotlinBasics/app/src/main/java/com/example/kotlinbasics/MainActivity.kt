package com.example.kotlinbasics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    public val TAG: String = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: starts")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val original = 2000
        var addedTwo = original.plusTwo()

        Log.d(TAG, "$addedTwo")

        val myCLass1 = MyClass()
        myCLass1.internalFunc()
        myCLass1.internalFunc(200)

        Log.d(TAG, "onCreate: ends")
    }
}

fun Int.plusTwo() = this + 2

class MyClass {
    fun internalFunc() {
        Log.d("MainActivity", "I am internal function.")
    }
}

fun MyClass.internalFunc(value: Int) {
    Log.d("MainActivity", "I am extension function. Value = $value")
}
