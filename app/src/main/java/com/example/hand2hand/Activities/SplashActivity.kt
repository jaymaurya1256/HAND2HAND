package com.example.hand2hand.Activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowInsets
import android.view.WindowManager
import com.example.hand2hand.Login_info.LoginData
import com.example.hand2hand.R

class SplashActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Following if else code is to remove the title bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }
        else {
            @Suppress("DEPRECATION")
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        Handler().postDelayed({
            //start the main activity if already logged in
            if (LoginData().isLogin)
            {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish() //Call this when activity is done and should be closed.
            }
            else
            {
                startActivity(Intent(this@SplashActivity, ActivityLogin::class.java))
            }
        },1500)

    }
}