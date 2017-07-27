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

        var personOne = Person("Russell", 30)

        personOne++
        personOne++

        Log.d(TAG, "Current age of ${personOne.name} is: ${personOne.age}")

        personOne--

        Log.d(TAG, "Current age of ${personOne.name} is: ${personOne.age}")

        Log.d(TAG, "onCreate: ends")
    }
}

data class Person(var name: String, var age: Int) {
    operator fun inc(): Person {
        this.age++

        return this
    }

    operator fun dec(): Person {
        this.age--

        return this
    }

}