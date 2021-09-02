package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mSeeMoreTV = findViewById<TextView>(R.id.seeMore)
        val mImageTwo = findViewById<ImageView>(R.id.imageView2)
        mSeeMoreTV.setOnClickListener {
            mSeeMoreTV.text = ("I am a passionate, driven and committed to finish Kodecamp as one of the best")
            mImageTwo.visibility = View.VISIBLE
        }

    }
}