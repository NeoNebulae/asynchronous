package com.example.asynchronous

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.imageView)
        Picasso.get().load("https://img.etimg.com/thumb/width-640,height-480,imgsize-103824,resizemode-1,msid-96230396/news/international/us/monkey-day-heres-when-it-is-celebrated.jpg").into(imageView)
    }
}
