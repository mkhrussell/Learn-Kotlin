package com.example.kotlinbasics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

enum class Answers {
    YES, NO, NOT_ANSWERED
}

enum class States {
    SUCCEEDED,
    FAILED
}

enum class Weekdays {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

class MainActivity : AppCompatActivity() {

    private val TAG: String = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: starts")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, giveAnswer(Answers.NO))
        Log.d(TAG, giveAnswer(Answers.YES))
        Log.d(TAG, giveAnswer(Answers.NOT_ANSWERED))

        if (checkState(49) == States.FAILED) Log.d(TAG, "FAILED")
        if (checkState(51) == States.SUCCEEDED) Log.d(TAG, "SUCCEEDED")

        for (day in Weekdays.values()) {
            Log.d(TAG, "${day.name} = ${day.ordinal}")
        }

        Log.d(TAG, "onCreate: ends")
    }

    fun giveAnswer(ans: Answers): String {
        when (ans) {
            Answers.YES -> return "Answered: Yes"
            Answers.NO -> return "Answered: No"
            Answers.NOT_ANSWERED -> return "Not answered"
        }
    }

    fun checkState(value: Int): States {
        if (value <= 50) return States.FAILED
        else return States.SUCCEEDED
    }
}
