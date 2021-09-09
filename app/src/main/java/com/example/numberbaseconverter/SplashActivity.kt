package com.example.numberbaseconverter

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import androidx.core.os.HandlerCompat.postDelayed
import kotlinx.android.synthetic.main.activity_splash.*

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        window.decorView.systemUiVisibility= SYSTEM_UI_FLAG_FULLSCREEN
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }, 2500)
    }



}