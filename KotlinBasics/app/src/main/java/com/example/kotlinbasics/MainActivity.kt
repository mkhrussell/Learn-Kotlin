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

//        var base: Base = Base()
//        base.sayHello()
//        Log.d(TAG, "onCreate: base.name = ${base.name}")
//
//        var derived: Derived = Derived()
//        derived.sayHello()
//        Log.d(TAG, "onCreate: derived.name = ${derived.name}")
//        derived.tellYourName()
//
//        var derivedTwo: DerivedTwo = DerivedTwo()
//        derivedTwo.sayHello()
//        Log.d(TAG, "onCreate: derivedTwo.name = ${derivedTwo.name}")
//        derivedTwo.tellYourName()

        var baseObj: Base = Base()
        baseObj.sayHello()

        baseObj = Derived()
        baseObj.sayHello()

        baseObj = DerivedTwo()
        baseObj.sayHello()


        Log.d(TAG, "onCreate: ends")
    }
}

open class Base {
    open val name: String = "Base"

    fun tellYourName() {
        Log.d(javaClass.simpleName, "My name is: ${name}.")
    }

    open fun sayHello() {
        Log.d("Base", "Hello from Base.")
    }
}

class Derived : Base() {
    val id: Int = 100
    override val name: String = "Derived"

    override fun sayHello() {
        //super.sayHello()
        Log.d(javaClass.simpleName, "My name is: ${name} and my id is: ${id}.")
    }
}

class DerivedTwo : Base() {
    override val name: String = "DerivedTwo"
    override fun sayHello() {
        //super.sayHello()
        Log.d(javaClass.simpleName, "My name is: ${name} and I do not have any id.")
    }
}