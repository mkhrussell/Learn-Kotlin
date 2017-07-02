package com.example.kotlincontrolflowpart3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG: String = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: starts")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        for(i in 1..5) {
//
////            if(i == 3) {
////                break
////            }
//
////            if(i == 3) {
////                continue
////            }
//
//            Log.d(TAG, "onCreate: i = " + i)
//        }


//        outerLoop@for (i in 1..3) {
//            for (j in 1..4) {
//
//                if(i == 2 && j == 2) {
//                    break@outerLoop
//                }
//
//                Log.d(TAG, "onCreate: i = " + i + " j = " + j)
//            }
//        }

//        outerLoop@for(i in 1..3) {
//            for(j in 1..4) {
//
//                if(i == 1 && j == 3) {
//                    continue@outerLoop
//                }
//
//                Log.d(TAG, "onCreate: i = " + i + " j = " + j)
//            }
//        }

        var i = 1
        while (i < 6) {

//            if(i % 2 == 0) {
//                i++
//                continue
//            }

            if(i * 5 == 15) {
                break
            }

            Log.d(TAG, "onCreate: i = " + i)

            i++
        }

        Log.d(TAG, "onCreate: ends")
    }
}
