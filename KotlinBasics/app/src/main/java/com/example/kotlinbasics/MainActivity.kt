package com.example.kotlinbasics

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private val TAG: String = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countries: Array<String> = arrayOf("Bangladesh", "India", "Pakistan", "Srilanka", "Bhutan", "Nepal", "Afganistan", "Maldives")
        val adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, countries)

        val lstCountries = findViewById(R.id.lstCountries) as ListView
        lstCountries.adapter = adapter
    }
}
