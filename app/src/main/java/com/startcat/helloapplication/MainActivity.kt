package com.startcat.helloapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.startcat.mylibrary.Tools

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Tools.Name
    }
}