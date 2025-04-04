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

//package com.example.oxitech.openui
//
//import android.content.Intent
//import android.os.Bundle
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import com.example.oxitech.R
//import com.google.android.material.bottomnavigation.BottomNavigationView
//
//class SecondActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_second)
//
//        val bottomNavView = findViewById<BottomNavigationView>(R.id.nav_second)
//
//        bottomNavView.setOnItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.left_second_arrow -> {
//                    navigateTo(FirstActivity::class.java)
//                    true
//                }
//                R.id.right_second_arrow -> {
//                    navigateTo(ThirdActivity::class.java)
//                    true
//                }
//                else -> false
//            }
//        }
//    }
//
//    private fun navigateTo(destination: Class<*>) {
//        val intent = Intent(this, destination)
//        startActivity(intent)
//        finish() // Ensures this activity is removed from the stack
//    }
//
//    override fun onBackPressed() {
//        super.onBackPressed()
//        // When back is pressed, go directly to MainActivity
//        val intent = Intent(this, FirstActivity::class.java)
//        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
//        startActivity(intent)
//        finish()
//    }
//}





package com.example.oxitech.openui

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.oxitech.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val bottomNavView = findViewById<BottomNavigationView>(R.id.nav_second)

        bottomNavView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.left_second_arrow -> {
                    // Navigate to Previous Activity
                    val intent = Intent(this, FirstActivity::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.right_second_arrow -> {
                    // Navigate to Next Activity
                    val intent = Intent(this, ThirdActivity::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                else -> false
            }
        }
    }
}
