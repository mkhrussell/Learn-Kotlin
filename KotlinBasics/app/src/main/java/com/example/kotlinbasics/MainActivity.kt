package com.example.kotlinbasics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private val TAG: String = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countries = mutableListOf<String>("Bangladesh", "India") //, "Pakistan", "Srilanka", "Bhutan", "Nepal", "Afganistan", "Maldives")
        val adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, countries)

        val lstCountries = findViewById(R.id.lstCountries) as ListView
        lstCountries.adapter = adapter

        var edtCountry = findViewById(R.id.edtCountry) as EditText
        findViewById(R.id.btnAdd).setOnClickListener {
            var countryValue = edtCountry.text.toString()

            if (!countryValue.isNullOrBlank()) {
                adapter.add(countryValue)
                adapter.notifyDataSetChanged()
                edtCountry.setText("")
            }
        }
    }
}
