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

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.oxitech.R
import com.example.oxitech.login.SignupActivity

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first)

        // Finding the views by their IDs
        val firstButton1: TextView = findViewById(R.id.first_button_1)
        val firstButton2: Button = findViewById(R.id.first_button_2)

        // Set click listeners
        firstButton1.setOnClickListener {
            // Add action for "How does it work?" button
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        firstButton2.setOnClickListener {
            // Add action for "Start now" button
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}
