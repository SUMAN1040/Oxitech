/*
 * Name: Suman Kumar Dey
 * LinkedIn: www.linkedin.com/in/suman1040
 * Github: SUMAN1040
 */

/*
 * Name: Suman Kumar Dey
 * LinkedIn: www.linkedin.com/in/suman1040
 * Github: SUMAN1040
 */

/*
 * Name: Suman Kumar Dey
 * LinkedIn: www.linkedin.com/in/suman1040
 * Github: SUMAN1040
 */

/*
 * Name: Suman Kumar Dey
 * LinkedIn: www.linkedin.com/in/suman1040
 * Github: SUMAN1040
 */

/*
 * Name: Suman Kumar Dey
 * Linkedln: www.linkedin.com/in/suman1040
 * Github: SUMAN1040
 */

package com.example.oxitech.openui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.oxitech.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class ThirdActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        // Handle system bar insets for proper UI appearance
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val bottomNavView = findViewById<BottomNavigationView>(R.id.nav_third)

        bottomNavView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.left_second_arrow -> {
                    navigateTo(SecondActivity::class.java) // Navigate to previous activity
                    true
                }
                R.id.right_second_arrow -> {
                    navigateTo(FourthActivity::class.java) // Navigate to next activity (if exists)
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
