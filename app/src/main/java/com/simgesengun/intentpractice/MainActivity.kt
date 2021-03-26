package com.simgesengun.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstButton.setOnClickListener {
            val intent = Intent(this@MainActivity,APageActivity::class.java)
            startActivity(intent)
        }
        secondButton.setOnClickListener {
            val intent = Intent(this@MainActivity,XPageActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        val endIntent = Intent(Intent.ACTION_MAIN)
        endIntent.addCategory(Intent.CATEGORY_HOME)
        endIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(endIntent)
    }
}