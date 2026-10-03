package com.example.newsapp.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.newsapp.databinding.ActivityDetailParentifyBinding

class DetailParentify : AppCompatActivity() {

    private lateinit var binding: ActivityDetailParentifyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailParentifyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAboutAction()
    }

    private fun initAboutAction() {
        binding.btnAboutBack.setOnClickListener {
            finish()
        }
    }
}