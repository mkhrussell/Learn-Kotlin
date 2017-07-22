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

        var countryList = mutableListOf<Country>()
        countryList.add(Country("Bangladesh", "Dhaka"))

        val countryIndia = Country("", "")
        countryIndia.name = "India"
        countryIndia.capital = "Delhi"

        countryList.add(countryIndia)
        countryList.add(Country("Nepal", "Kathmandu"))

//        for(country in countryList) {
//            Log.d(TAG, "onCreate: name = ${country.name}, capital = ${country.capital}")
//        }

        val (name, capital) = countryIndia // Destructuring

        var countrySrilanka = countryIndia.copy(name = "Sri Lanka")
        countrySrilanka.capital = "Kotte"

        countryList.add(countrySrilanka)

        for ((name, capital) in countryList) {
            Log.d(TAG, "onCreate: name = $name, capital = $capital")
        }

        Log.d(TAG, "onCreate: ends")
    }
}

data class Country(var name: String, var capital: String)

//class Person(name: String, age: Int)