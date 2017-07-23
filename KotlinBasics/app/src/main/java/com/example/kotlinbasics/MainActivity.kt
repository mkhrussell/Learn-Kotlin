package com.example.kotlinbasics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val TAG: String = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: starts")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var myObject = object {
//            var x = "X"
//            fun getName() = "My Object"
//        }
//
//        Log.d(TAG, "myObject: x = ${myObject.x}, getName() = ${myObject.getName()}")
//
//        var widgetOne = Widget("Widget 1")

        var btnAdd = findViewById(R.id.btnAdd) as Button
        var onClickListener = object : View.OnClickListener {
            override fun onClick(View: View) {
                Toast.makeText(applicationContext, "Hello from Add Button", Toast.LENGTH_LONG).show()
            }
        }

        btnAdd.setOnClickListener(onClickListener)

        Log.d(TAG, "onCreate: ends")
    }
}

//open class Widget(text: String) {
//    var text: String = text
//}
//
//interface Clickable {
//    fun onClick()
//}
//
//class ClickableWidget(text: String): Widget(text), Clickable {
//    override fun onClick() {
//        //do something
//    }
//}

