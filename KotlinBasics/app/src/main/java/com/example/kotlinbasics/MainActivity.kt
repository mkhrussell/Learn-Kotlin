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

        var personOne = Person("Russell")
        personOne.age = 30
        Log.d(TAG, "onCreate: Person one: name = ${personOne.name}, age = ${personOne.age}")

        var personTwo = Person("John", 35)
        Log.d(TAG, "onCreate: Person two: name = ${personTwo.name}, age = ${personTwo.age}")


        Log.d(TAG, "onCreate: ends")
    }
}

class Person(name: String) {
    var name: String
    var age: Int = 0

    init {
        this.name = name
    }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }
}