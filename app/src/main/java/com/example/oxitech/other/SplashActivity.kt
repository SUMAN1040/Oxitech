package com.example.oxitech.other

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.oxitech.R
import com.example.oxitech.openui.FirstActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)



        //full screen
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


//
//        //load zoom-in animation
//        val zoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
//        val splash_things = findViewById<ImageView>(R.id.splash_things)
//        splash_things.startAnimation(zoomOut)





        //reference to imageview
        val splash_things = findViewById<ImageView>(R.id.splash_things)
        //load zoomout animation
        val zoomOutAnimation = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        //start animation
        splash_things.startAnimation(zoomOutAnimation)


        //media player
//        val mediaPlayer = MediaPlayer.create(this, R.raw.)
//        mediaPlayer.start()


        //splash screen
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@SplashActivity, FirstActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)

    }
}