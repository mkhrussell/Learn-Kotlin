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
        personOne.gender = "Male"
        Log.d(TAG, "onCreate: Person one: name = ${personOne.name}, age = ${personOne.age}")

        var personTwo = Person("John", 60)
        personTwo.height = 60.0
        personTwo.gender = "Male"
        Log.d(TAG, "onCreate: Person two: name = ${personTwo.name}, age = ${personTwo.age}, height = ${personTwo.height} inch, isTeenager = ${personTwo.isTeenager}")

        var personThree = Person("Anne")
        personThree.gender = "Female"
        Log.d(TAG, "onCreate: Person three: name = ${personThree.name}, gender = ${personThree.gender}")

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

    private var _height: Double = 0.0
    public var height: Double
        get() = _height
        set(value) {
            _height = value
        }

//    var isTeenager: Boolean = false // Readonly property
//        private set
//        get() {
//            var ret: Boolean = false
//            if(age >= 13 && age <= 19) {
//                ret = true
//            }
//
//            return ret
//        }

    var isTeenager: Boolean = false
        private set
        get() = (age >= 13 && age <= 19)

    var gender: String = ""
        get() {
            throw Exception("Gender info is private.")
        }
        set(value) {
            if (value.isNullOrBlank()) {
                throw Exception("Gender must be Male or Female")
            } else if (value.equals("Male") || value.equals("Female")) {
                field = value
            } else {
                throw Exception("Gender must be Male or Female")
            }
        }

//    private var gender: String = ""
//    public fun getGender() : String {
//        return gender
//    }
//    public fun setGender(gender: String) {
//        this.gender = gender
//    }
}