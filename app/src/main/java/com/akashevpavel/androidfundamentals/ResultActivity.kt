package com.akashevpavel.androidfundamentals

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity: AppCompatActivity() {
    private lateinit var mResultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        mResultTextView = findViewById(R.id.result_tv)
        mResultTextView.text = "Hello!\n" + intent.getStringExtra(EXTRA_MESSAGE)

    }
}