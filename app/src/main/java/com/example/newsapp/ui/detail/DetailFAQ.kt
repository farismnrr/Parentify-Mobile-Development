package com.example.newsapp.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.newsapp.databinding.ActivityDetailFaqBinding

class DetailFAQ : AppCompatActivity() {

    private lateinit var binding: ActivityDetailFaqBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailFaqBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initFaqAction()
    }

    private fun initFaqAction() {
        binding.btnFaqBack.setOnClickListener {
            finish()
        }
    }
}