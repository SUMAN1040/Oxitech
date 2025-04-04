package com.example.oxitech.openui

import android.Manifest
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.oxitech.R
import com.example.oxitech.login.SignupActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class SixthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sixth)

        // Handle system bar insets for proper UI appearance
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val bottomNavView = findViewById<BottomNavigationView>(R.id.nav_sixth)

        bottomNavView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.left_second_arrow -> {
                    navigateTo(FifthActivity::class.java) // Navigate to previous activity
                    true
                }
                R.id.right_second_arrow -> {
                    navigateTo(SignupActivity::class.java) // Navigate to next activity (if exists)
                    true
                }
                else -> false
            }
        }
    }

    private fun navigateTo(destination: Class<*>) {
        val intent = Intent(this, destination)
        startActivity(intent)
        finish() // Removes current activity from stack
    }
}
