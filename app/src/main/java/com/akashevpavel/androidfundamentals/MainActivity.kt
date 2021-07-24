package com.akashevpavel.androidfundamentals


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import java.lang.Thread.sleep


class MainActivity : AppCompatActivity() {
    private val LOG_TAG = MainActivity::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(LOG_TAG, "--------")
        Log.d(LOG_TAG, "onCreate")

        try { 2 / 0 } catch (e: ArithmeticException) {
            Log.e(LOG_TAG, "division by zero")}
        Log.d(LOG_TAG, "HelloWorld)))")

    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy")
    }

    fun nextActivity(view: View) {
        startActivity(Intent(applicationContext, HelloToastActivity::class.java))
    }
}