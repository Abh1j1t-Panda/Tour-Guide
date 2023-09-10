package com.example.tourguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.KeyEventDispatcher
import androidx.databinding.DataBindingUtil
import com.example.tourguide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState:   Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.indiaText.setOnClickListener { view: View ->
            val intent = Intent(this, IndiaList::class.java)
            startActivity(intent)
        }
        binding.usText.setOnClickListener { view: View ->
            val intent = Intent(this, USList::class.java)
            startActivity(intent)
        }
        binding.japanText.setOnClickListener { view: View ->
            val intent = Intent(this, JapanList::class.java)
            startActivity(intent)
        }
        binding.chinaText.setOnClickListener { view: View ->
            val intent = Intent(this, ChinaList::class.java)
            startActivity(intent)
        }

    }
}