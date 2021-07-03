package com.kotlin.firmniqassignmemttask.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.firmniqassignmemttask.R
import kotlin.concurrent.thread

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalash)
        callingSplash()

    }


    private fun callingSplash() {
        thread {
            Thread.sleep(3000)
            val intent = Intent(this, LoginFormActivity::class.java)
            startActivity(intent)

        }
    }
}