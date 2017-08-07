package com.example.intentdemo

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG = "MainActivity"
        val MY_MESSAGE = "com.example.intentdemo.MY_MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (findViewById<Button>(R.id.btn_send)).setOnClickListener(buttonClickListener)
        (findViewById<Button>(R.id.btn_implicit_telephone)).setOnClickListener(buttonClickListener)
        (findViewById<Button>(R.id.btn_implicit_custom)).setOnClickListener(buttonClickListener)
    }

    private val buttonClickListener: (View) -> Unit = { view ->
        when(view.id) {
            R.id.btn_send -> {
                val displayMessageIntent = Intent(applicationContext, DisplayMessageActivity::class.java)
                val message = (findViewById<EditText>(R.id.edt_message)).text.toString()
                displayMessageIntent.putExtra(MY_MESSAGE, message)
                startActivity(displayMessageIntent)
            }

            R.id.btn_implicit_telephone -> {
                val phoneNumber: Uri = Uri.parse("tel:+16465648568")
                val dialIntent: Intent = Intent(Intent.ACTION_DIAL, phoneNumber)
                startActivity(dialIntent)

                Log.d(TAG, "btn_implicit_telephone: Clicked")
            }

            R.id.btn_implicit_custom -> {
                val customIntent = Intent("dummy.intent.action.MY_ACTION")
                startActivity(customIntent)

                Log.d(TAG, "btn_implicit_custom: Clicked")
            }
        }

    }
}
