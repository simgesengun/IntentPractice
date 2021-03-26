package com.simgesengun.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class YPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_y_page)
    }

    override fun onBackPressed() {
        val intent = Intent(this@YPageActivity,MainActivity::class.java)
        startActivity(intent)
    }
}