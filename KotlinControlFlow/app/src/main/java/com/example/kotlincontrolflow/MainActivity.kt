package com.example.kotlincontrolflow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listener: View.OnClickListener = View.OnClickListener{view ->
            var textView: TextView = findViewById(R.id.textView) as TextView
            var button: Button = view as Button

//            if(button.id == R.id.button1) {
//                textView.text = "Try again. You clicked: " + button.text
//            } else if(view.id == R.id.button2){
//                textView.text = "You won the prize!!!"
//            } else if(view.id == R.id.button3){
//                textView.text = "Wrong button? You pressed: " + button.text
//            } else {
//                textView.text = "You lost."
//            }

            when(button.id) {
                R.id.button1 -> textView.text = "Try again. You clicked: " + button.text
                R.id.button2 -> textView.text = "You won the prize!!!"
                R.id.button3 -> textView.text = "Wrong button? You pressed: " + button.text
                else -> {
                    textView.text = "You lost."
                }
            }
        }

        var button1 = findViewById(R.id.button1) as Button
        var button2 = findViewById(R.id.button2) as Button
        var button3 = findViewById(R.id.button3) as Button
        var button4 = findViewById(R.id.button4) as Button

        button1.setOnClickListener(listener)
        button2.setOnClickListener(listener)
        button3.setOnClickListener(listener)
        button4.setOnClickListener(listener)
    }
}
