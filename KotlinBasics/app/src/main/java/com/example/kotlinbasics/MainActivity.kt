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

        var dog: Dog = Dog()
        dog.bark()

        var human: Human = Human()
        Log.d(LOG_TAG, "I am ${human.javaClass.simpleName}, I have life.")

        var robot: Robot = Robot()
        var talkingRobot = TalkingRobot()

        var moveable: Moveable = dog
        moveable.move()
        moveable = human
        moveable.move()
        moveable = robot
        moveable.move()
        moveable = talkingRobot
        moveable.move()

        var eatable: Eatable = dog
        eatable.eat()
        eatable = human
        eatable.eat()

        var speakable: Speakable = human
        speakable.speak()
        speakable = talkingRobot
        speakable.speak()


        Log.d(TAG, "onCreate: ends")
    }
}

val LOG_TAG = "DemoLogs"

interface Moveable {
    fun move()
}

interface Eatable {
    fun eat()
}

interface Speakable {
    fun speak()
}

abstract class Animal : Moveable, Eatable {
    val hasLife: Boolean = true

    override fun move() {
        Log.d(LOG_TAG, "I am ${javaClass.simpleName}, I can move.")
    }

    override fun eat() {
        Log.d(LOG_TAG, "I am ${javaClass.simpleName}, I can eat.")
    }
}

class Dog : Animal() {
    fun bark() {
        Log.d(LOG_TAG, "I am ${javaClass.simpleName}, I can bark.")
    }
}

class Human : Animal(), Speakable {
    override fun speak() {
        Log.d(LOG_TAG, "I am ${javaClass.simpleName}, I can speak.")
    }
}

open class Robot : Moveable {
    override fun move() {
        Log.d(LOG_TAG, "I am ${javaClass.simpleName}, I can move.")
    }
}

class TalkingRobot : Robot(), Speakable {
    override fun speak() {
        Log.d(LOG_TAG, "I am ${javaClass.simpleName}, I can speak.")
    }
}