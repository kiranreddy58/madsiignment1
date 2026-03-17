package com.example.studentprofile

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * MainActivity for the Student Profile App.
 * Displays student details and a button to show a Toast message.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the layout for the activity
        setContentView(R.layout.activity_main)

        // Initialize the "Show Details" button
        val button = findViewById<Button>(R.id.showBtn)

        // Set a click listener to the button
        button.setOnClickListener {
            // Display a Toast message when the button is clicked
            Toast.makeText(this, "Student Details Displayed Successfully!", Toast.LENGTH_SHORT).show()
        }
    }
}