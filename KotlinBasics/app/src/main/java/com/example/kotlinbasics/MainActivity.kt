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

        var myList: List<String> = listOf("John", "Russell", "Mac") // Immutable
        var myList2: List<String> = listOf<String>("Dhaka", "Khulna", "Tangail") // Immutable

        var mutableList: MutableList<String> = mutableListOf("Bangladesh", "India", "Nepal") // Mutable
        mutableList[1] = "Pakistan"
        mutableList.add("Srilanka")

        var arrayList = ArrayList<String>()
        arrayList.add("Apple")
        arrayList.add("Orange")
        arrayList[0] = "Pitch"

//        for(index in 0..mutableList.size - 1) {
//            Log.d(TAG, "${mutableList[index]}")
//        }

//        for(item in arrayList) {
//            Log.d(TAG, "${item}")
//        }

//        val countries: Array<String> = arrayOf("Bangladesh", "India", "Pakistan", "Srilanka", "Bhutan", "Nepal", "Afganistan", "Maldives")
//        val adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, countries)
//
//        val lstCountries = findViewById(R.id.lstCountries) as ListView
//        lstCountries.adapter = adapter
    }
}
