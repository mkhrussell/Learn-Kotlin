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

        var outerObj = Outer()
        outerObj.doSomething()

        var nestedObj = Outer.Nested() // act like java's static member class
        nestedObj.doSomething()

        var innerObj1 = outerObj.Inner() // Outer().Inner()
        innerObj1.doSomething()

        Log.d(TAG, "onCreate: ends")
    }
}

class Outer {
    private val name: String = "Outer"

    fun doSomething() {
        Log.d("MainActivity", "I am from outer class and my name is $name.")
    }

    var abc: Int = 200

    class Nested {
        private val name: String = "Nested"

        fun doSomething() {
            Log.d("MainActivity", "I am from nested class and my name is $name.")
        }
    }

    inner class Inner {
        private val name: String = "Inner"

        fun doSomething() {
            Log.d("MainActivity", "I am from inner class and my name is $name. My parent's name is ${this@Outer.name}, property: abc = $abc.")
        }
    }

}
