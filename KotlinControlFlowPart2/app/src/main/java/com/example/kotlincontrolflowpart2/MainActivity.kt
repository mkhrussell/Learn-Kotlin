package com.example.kotlincontrolflowpart2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result = ""

//        for(index in 0..10) {
//            result += index.toString() + "\n"
//        }

//        for(index in 10 downTo 0) {
//            result += index.toString() + "\n"
//        }

//        for (index in 0..10 step 3) {
//            result += index.toString() + "\n"
//        }

//        for (index in 10 downTo 0 step 3) {
//            result += index.toString() + "\n"
//        }

//        for (index in 0 until 10) {
//            result += index.toString() + "\n"
//        }

        val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val cities = arrayOf("Dhaka", "Kolkata")
        val countries = listOf<String>("Bangladesh", "India", "Srilanka", "Pakistan")

//        for(index in 0..9) {
//            result += numbers[index].toString() + "\n"
//        }

//        for(num in numbers) {
//            result += num.toString() + "\n"
//        }

//        for(index in numbers.indices) {
//            result += numbers[index].toString() + "\n"
//        }

//        for((index, value) in numbers.withIndex()) {
//            result += "$index: $value\n"
//        }

//        for(country in countries) {
//            result += country + "\n"
//        }

        var index = 0
//        while(index < 10) {
//            result += index.toString() + "\n"
//
//            index += 2
//        }

        do {
            result += index.toString() + "\n"
            index = 10
        }while (index < 10)

        var tvResult = findViewById(R.id.tvResult) as TextView
        tvResult.text = result
    }
}
