package com.meeweel.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.meeweel.myapplication.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        savedInstanceState?.let {  } ?: refresh()
    }

    private fun refresh() {
        supportFragmentManager.beginTransaction()
            .replace(binding.container.id, MainFragment.newInstance())
            .commitNow()
    }
}