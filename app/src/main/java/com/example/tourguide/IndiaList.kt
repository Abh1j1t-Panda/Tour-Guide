package com.example.tourguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tourguide.databinding.ActivityIndiaListBinding

class IndiaList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityIndiaListBinding>(this, R.layout.activity_india_list)
        binding.tajMahalText.setOnClickListener {
            val intent = Intent(this, TajMahal::class.java)
            startActivity(intent)
        }
    }
}