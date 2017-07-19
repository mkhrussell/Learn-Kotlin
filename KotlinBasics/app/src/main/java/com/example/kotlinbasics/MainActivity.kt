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

        var shapeOne: Shape = Circle(0, 0)
        var shapeTwo: Shape = Rectangle(100, 100)

        shapeOne.draw()
        shapeTwo.draw()

        Log.d(TAG, "onCreate: ends")
    }
}

var DRAW_TAG: String = "SampleDrawing"


// IS-A relationship

abstract class Shape(xPos: Int, yPos: Int) {
    var x: Int = xPos
    var y: Int = yPos

    abstract fun draw()
}

class Circle(xPos: Int, yPos: Int) : Shape(xPos, yPos) {
    override fun draw() {
        Log.d(DRAW_TAG, "Drawing circle using circle drawing formula at position (${x}, ${y}).")
    }
}

class Rectangle(xPos: Int, yPos: Int) : Shape(xPos, yPos) {
    override fun draw() {
        Log.d(DRAW_TAG, "Drawing rectangle using rectangle drawing formula at position (${x}, ${y}).")
    }
}

