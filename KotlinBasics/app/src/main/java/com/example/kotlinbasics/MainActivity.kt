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

        Log.d(TAG, "onCreate: ends")
    }
}

class MyClass constructor() : Any() {
    // Body

    // Members:
    // 1. Constructors
    // 2. Variables
    // 3. Properties
    // 4. Functions
    // 5. Nested classes / inner classes
    // 6. object declarations with 'object' keyword
}

// Constructor
/*
class Person public constructor(name: String) : Any() { // All kotlin classes are subclass of 'Any' class
    // Body
}

// same as above: removed 'Any' constructor call
class Person public constructor(name: String) {
    // Body
}

//same as above: only one public constructor:
class Person constructor(name: String) {
    // Body
}

// same as above: removed 'constructor' keyword
class Person(name: String) {
    // Body
}

// same as above: removed empty body '{}'
class Person(name: String)
*/

class Person(name: String)
