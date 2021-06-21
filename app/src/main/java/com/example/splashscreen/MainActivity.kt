package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import androidx.appcompat.app.ActionBar
import com.example.splashscreen.databinding.ActivityMainBinding

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private val splashScreen = 10000
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val animation1 = AnimationUtils.loadAnimation(this, R.anim.animation1)
        val animation2 = AnimationUtils.loadAnimation(this, R.anim.animation2)
        val animation3 = AnimationUtils.loadAnimation(this, R.anim.animation3)

        val imageView = binding.imageView
        val imageView2 = binding.imageView2
        val textView= binding.textView
        val textView2 = binding.textView2

        imageView.animation = animation1
        imageView2.animation = animation2
        textView.animation = animation3
        textView2.animation = animation3

        Handler().postDelayed({
         val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }, splashScreen.toLong())
    }
}