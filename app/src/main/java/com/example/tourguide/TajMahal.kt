package com.example.tourguide

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TajMahal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taj_mahal)
        var button : Button = findViewById(R.id.go)
        val longitude: Float = 78.04207F
        var latitude: Float = 27.172892F

        button.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:0,0?q=27.174966,78.042154")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")

            startActivity(mapIntent)
        }
    }
}