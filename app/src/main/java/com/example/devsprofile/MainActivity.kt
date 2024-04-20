package com.example.devsprofile

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.RoundedBitmapDrawable
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
//        val rounded = RoundedBitmapDrawableFactory.create(resources, bitmap)
//        rounded.cornerRadius = 15f
//        logo.setImageDrawable(rounded)

    }
}