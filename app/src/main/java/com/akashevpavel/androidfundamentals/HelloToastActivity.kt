package com.akashevpavel.androidfundamentals

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.Thread.sleep


const val EXTRA_MESSAGE: String = "111"


class HelloToastActivity : AppCompatActivity() {
    private var mCount: Int = 0
    private lateinit var mShowCount: TextView
    private lateinit var zeroButton: Button

    private val LOG_TAG = HelloToastActivity::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(LOG_TAG, "onCreate")
        setContentView(R.layout.activity_toast)
        mShowCount = findViewById(R.id.counter_tv)
        mShowCount.setBackgroundColor(Color.MAGENTA)

        zeroButton = findViewById(R.id.zero_btn)
        zeroButton.setBackgroundColor(Color.GRAY)

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

    fun showToast(view: View) {
        Toast.makeText(this, R.string.greeting, Toast.LENGTH_SHORT).show()

        startActivity(Intent(applicationContext, ResultActivity::class.java).putExtra(EXTRA_MESSAGE, mCount.toString()))
        Log.d(LOG_TAG, "End SecondActivity")
        finish()
    }
    fun countUp(view: View) {

        if (mCount % 2 == 0) {
            view.setBackgroundColor(Color.GREEN)
        } else {
            view.setBackgroundColor(Color.YELLOW)
        }
        mCount++
        mShowCount.text = mCount.toString()
        zeroButton.setBackgroundColor(Color.RED)

        if (mCount > 50){
            startActivity(Intent(applicationContext, ScrollingTextActivity::class.java))
        }

    }

    fun resetCount(view: View) {
        mCount = 0
        mShowCount.text = mCount.toString()
        view.setBackgroundColor(Color.GRAY)
    }
}