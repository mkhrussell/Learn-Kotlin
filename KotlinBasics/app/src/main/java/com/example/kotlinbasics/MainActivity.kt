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

        doSomething() // Inline function call

        debugPrint("Welcome from normal function.")

        pringString("Welcome from Higher Order Funstion.", this::debugPrint) // Higher order function

        pringString("Welcome from anonymous function.",
                fun(message: String): Unit { // Anonymous function
                    Log.d(TAG, message)
                }
        )

        pringString("Welcome from Lambda expression # 1", { message: String -> Log.d(TAG, message) }) // Lambda expression # 1

        pringString("Welcome from Lambda expression # 2", { message -> Log.d(TAG, message) })

        pringString("Welcome from Lambda expression # 3", { Log.d(TAG, it) }) // implicit name of single parameter

        val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        var sumOfEvens = 0
        numbers.filter { it % 2 == 0 }.forEach {
            // Use lambda as closure
            sumOfEvens += it
        }

        val returnedFunc = twoParamFunction({
            Log.d(TAG, "From param 1 Lambda")
        }, {
            Log.d(TAG, "From param 2 Lambda which will be returned")
        })

        returnedFunc()

        Log.d(TAG, "sumOfEvens = $sumOfEvens")

        Log.d(TAG, "onCreate: ends")
    }

    // Function Type: fun1: (param1: T1) -> T2
    // Higher order functions take another funcion as parameter

    inline fun pringString(str: String, execFun: (msg: String) -> Unit) {
        return execFun(str)
    }

    inline fun twoParamFunction(func1: () -> Unit, noinline func2: () -> Unit): () -> Unit {
        func1()
        return func2
    }

    fun debugPrint(msg: String): Unit {

        Log.d(TAG, msg)
    }

    inline fun doSomething() {
        Log.d(TAG, "Doing something.")
    }
}