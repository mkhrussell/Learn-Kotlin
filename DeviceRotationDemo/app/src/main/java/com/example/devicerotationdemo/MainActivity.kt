package com.example.devicerotationdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    companion object {
        val TAG: String = "MainActivity"

        val STATE_ARRAY_LIST: String = "STATE_ARRAY_LIST"
    }

    private var mLstNames: ListView? = null
    private var mArrayList: ArrayList<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: starts")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mLstNames = findViewById<ListView>(R.id.lstNames)

        if(savedInstanceState == null) {
            mArrayList = ArrayList<String>()
        }

        val edtName = findViewById<EditText>(R.id.edtName)
        findViewById<Button>(R.id.btnAdd).setOnClickListener {
            val name = edtName.text.toString()
            if(!name.isNullOrBlank()) {
                mArrayList?.add(name)
                mLstNames?.adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, mArrayList)
                edtName.setText("")
            }
        }

        Log.d(TAG, "onCreate: ends")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.d(TAG, "onSaveInstanceState: starts")
        super.onSaveInstanceState(outState)

        outState?.putStringArrayList(STATE_ARRAY_LIST, mArrayList)

        Log.d(TAG, "onSaveInstanceState: ends")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.d(TAG, "onRestoreInstanceState: starts")

        mArrayList = savedInstanceState?.getStringArrayList(STATE_ARRAY_LIST)
        mLstNames?.adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, mArrayList)

        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState: ends")
    }
}
