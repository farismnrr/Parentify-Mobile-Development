package com.example.newsapp.ui.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.newsapp.databinding.ActivityForgotPasswordBinding

class ForgotActivity : AppCompatActivity() {
    private lateinit var binding: ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initForgotAction()
    }

    private fun initForgotAction() {
        binding.btnForgotBack.setOnClickListener {
            back()
        }

        binding.tvBackToLogin.setOnClickListener {
            back()
        }

        binding.btnReset.setOnClickListener {
            reset()
        }
    }

    private fun back() {
        val intent = Intent(this@ForgotActivity, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun reset() {
        val userInput = binding.etForgotUname.text.toString().trim()
        val newPassword = binding.etForgotSandi.text.toString().trim()
        val confirmPassword = binding.etConfirmSandi.text.toString().trim()

        if (userInput.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()) {
            Toast.makeText(this, "Harap lengkapi semua kolom", Toast.LENGTH_SHORT).show()
            return
        }

        if (newPassword != confirmPassword) {
            Toast.makeText(this, "Konfirmasi kata sandi baru tidak cocok", Toast.LENGTH_SHORT).show()
            return
        }

        Toast.makeText(this, "Kata sandi berhasil diperbarui! Silakan masuk kembali", Toast.LENGTH_SHORT).show()
        val intent = Intent(this@ForgotActivity, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
