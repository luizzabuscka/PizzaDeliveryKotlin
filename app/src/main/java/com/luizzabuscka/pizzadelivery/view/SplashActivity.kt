package com.luizzabuscka.pizzadelivery.view

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.luizzabuscka.pizzadelivery.R
import java.util.*
import kotlin.concurrent.schedule

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Timer("schedule", true).schedule(2000) {
            startActivity(Intent(baseContext, LoginActivity::class.java))
            finish()
        }
    }
}
