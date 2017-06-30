package com.example.kotlinhelloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        findViewById(R.id.button1).setOnClickListener(View.OnClickListener {
//            Toast.makeText(baseContext, "Hello from Button 1", Toast.LENGTH_SHORT).show()
//        })
//
//        findViewById(R.id.button2).setOnClickListener(View.OnClickListener {
//            Toast.makeText(baseContext, "Hello from Button 2", Toast.LENGTH_SHORT).show()
//        })

        var listener: View.OnClickListener = View.OnClickListener { view ->
            Toast.makeText(baseContext, "HelloWorld in Kotlin!!! from " + (view as Button).text, Toast.LENGTH_SHORT).show()
        }

        findViewById(R.id.button1).setOnClickListener(listener)
        findViewById(R.id.button2).setOnClickListener(listener)
    }
}
