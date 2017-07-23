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

        //Log.d(TAG, "MyDbConnection: dbName = ${MyDbConnection.dbName}, isOpen = ${MyDbConnection.isOpen()}")

        //var cookieOne = Cookie()
        //var cookieTwo = Cookie.create()

        //Log.d(TAG, "Cookie: myName = ${Cookie.myName}")

        var cookieThree = Cookie.Factory.create("Cookie Three")
        Log.d(TAG, "cookieThree: name = ${cookieThree.name}")

        var cookieFour = Cookie.Factory.create("Cookie Four")
        Log.d(TAG, "cookieThree: name = ${cookieFour.name}")

        Log.d(TAG, "onCreate: ends")
    }
}

//open class DbConnection(dbName: String) {
//    var dbName: String = dbName
//}
//
//
//object MyDbConnection: DbConnection("connection1") {
//    fun isOpen() = true
//}

//class Cookie {
//    companion object {
//        fun create() = Cookie()
//        var myName: String = javaClass.simpleName
//    }
//}

class Cookie {
    private constructor()

    var name: String = ""

    companion object Factory {
        fun create(name: String): Cookie {
            var ret = Cookie()
            ret.name = name
            return ret
        }
    }
}