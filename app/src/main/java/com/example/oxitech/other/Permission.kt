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

package com.example.oxitech.other

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.oxitech.MainActivity
import com.example.oxitech.R

//import com.google.firebase.messaging.FirebaseMessaging

class Permission : AppCompatActivity() {

    private lateinit var btnLocation: Button
    private lateinit var btnPhoneCall: Button
    //private lateinit var btnPushNotification: Button
    private lateinit var PhoneNumber: EditText
    private lateinit var btnSendOtp: Button
    private lateinit var OtpInput: EditText
    private lateinit var btnFinish: Button

    private var generatedOtp: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_permission)

        // Initialize Views
        btnLocation = findViewById(R.id.button_location)
        btnPhoneCall = findViewById(R.id.button_calls)
        //btnPushNotification = findViewById(R.id.btnPushNotification)
        PhoneNumber = findViewById(R.id.phone_number)
        btnSendOtp = findViewById(R.id.goButton)
        OtpInput = findViewById(R.id.otp_input)
        btnFinish = findViewById(R.id.button_finish)

        // Location Permission
        btnLocation.setOnClickListener {
            requestLocationPermission()
        }

        // Call Permission
        btnPhoneCall.setOnClickListener {
            requestCallPermission()
        }

        // Push Notification
//        btnPushNotification.setOnClickListener {
//            enablePushNotifications()
//        }

        // Send OTP
        btnSendOtp.setOnClickListener {
            sendOtp()
        }

        // Finish Button (Validate OTP)
        btnFinish.setOnClickListener {
            validateOtpAndFinish()
        }
    }

    // ======================= LOCATION PERMISSION =======================
    private fun requestLocationPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), 100)
        } else {
            Toast.makeText(this, "Location Access Already Granted", Toast.LENGTH_SHORT).show()
        }
    }

    // ======================= CALL PERMISSION =======================
    private fun requestCallPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)
            != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), 101)
        } else {
            Toast.makeText(this, "Phone Call Access Already Granted", Toast.LENGTH_SHORT).show()
        }
    }

    // ======================= PUSH NOTIFICATION (Firebase) =======================
//    private fun enablePushNotifications() {
//        FirebaseMessaging.getInstance().token.addOnCompleteListener { task ->
//            if (!task.isSuccessful) {
//                Toast.makeText(this, "Failed to get FCM Token", Toast.LENGTH_SHORT).show()
//                return@addOnCompleteListener
//            }
//            val token = task.result
//            Toast.makeText(this, "FCM Token: $token", Toast.LENGTH_SHORT).show()
//        }
//    }

    // ======================= OTP SEND =======================
    private fun sendOtp() {
        val phone = PhoneNumber.text.toString().trim()
        if (phone.length == 10) {
            generatedOtp = (1000..9999).random().toString()
            Toast.makeText(this, "OTP Sent: $generatedOtp", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Enter a valid 10-digit phone number", Toast.LENGTH_SHORT).show()
        }
    }

    // ======================= OTP VALIDATE & FINISH =======================
    private fun validateOtpAndFinish() {
        val inputOtp = OtpInput.text.toString().trim()
        val phone = PhoneNumber.text.toString().trim()

        if (phone.isEmpty() || phone.length != 10) {
            Toast.makeText(this, "Enter a valid phone number", Toast.LENGTH_SHORT).show()
            return
        }

        if (inputOtp == generatedOtp && generatedOtp.isNotEmpty()) {
            // Save number
            val sharedPref = getSharedPreferences("UserPreferences", Context.MODE_PRIVATE)
            sharedPref.edit().putString("phone_number", phone).apply()

            Toast.makeText(this, "OTP Verified & Phone Number Saved!", Toast.LENGTH_LONG).show()
            // You can navigate to next screen here
            val intent = Intent(this@Permission, MainActivity::class.java)
            startActivity(intent)
            finish()

        } else {
            Toast.makeText(this, "Invalid OTP. Try again.", Toast.LENGTH_SHORT).show()
        }
    }

    // ======================= PERMISSION RESULTS =======================
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            100 -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "Location Permission Granted", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Location Permission Denied", Toast.LENGTH_SHORT).show()
                }
            }
            101 -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "Call Permission Granted", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Call Permission Denied", Toast.LENGTH_SHORT).show()
                }
            }


        }
    }
}
