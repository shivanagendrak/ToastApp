package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ButtonUpload = findViewById<Button>(R.id.buttonUpload)
        val ButtonDownload = findViewById<Button>(R.id.buttonDownload )

        ButtonUpload.setOnClickListener{
            Toast.makeText(applicationContext,"Uploading....",Toast.LENGTH_SHORT).show()
        }
        ButtonDownload.setOnClickListener {
            Toast.makeText(applicationContext,"Downloading...",Toast.LENGTH_SHORT).show()
        }
    }
}
