package com.lsw.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.mToolbar)
        toolbar.run {
            setNavigationIcon(R.mipmap.ic_launcher);
            setSupportActionBar(toolbar);
            setNavigationOnClickListener { finish()
            }
        }
    }
}