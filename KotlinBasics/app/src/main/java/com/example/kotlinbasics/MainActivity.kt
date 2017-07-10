package com.example.kotlinbasics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG: String = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: starts")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resutlt1 = sum(20, 30) // 50
        Log.d(TAG, "onCreate: sum of 20 and 30 is: $resutlt1")

        // Print only
        sumAndPrint(40, 50) // 90

        // Print only
        sumAndPrint2(40, 50) // 90

        // Named parameters
        var result2 = sum(b = 60, a = 20) // 80
        Log.d(TAG, "onCreate: sum of 20 and 60 is: $result2")

        var intA = 70
        var intB = 20
        Log.d(TAG, "onCreate: sum of $intA and $intB is: ${sum(b = intA, a = intB)}") // 90

        Log.d(TAG, "onCreate: max of 50 and 20 is: ${max(50, 20)}")

        Log.d(TAG, "onCreate: max of 50 and 20 is: ${max2(50, 20)}")

        Log.d(TAG, "onCreate: ends")
    }

    // Function with return value
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    // Function without return value
    fun sumAndPrint(a: Int, b: Int): Unit {
        var sum = a + b
        Log.d(TAG, "sumAndPrint: sum of $a and $b is: $sum")
    }

    // Function without return value
    fun sumAndPrint2(a: Int, b: Int) {
        var sum = a + b
        Log.d(TAG, "sumAndPrint2: sum of $a and $b is: $sum")
    }

    fun max(a: Int, b: Int): Int {
        if (a > b) return a
        else return b
    }

    // Function expression
    fun max2(a: Int, b: Int): Int = if (a > b) a else b
}
