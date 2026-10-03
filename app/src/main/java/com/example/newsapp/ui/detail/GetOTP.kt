package com.example.newsapp.ui.detail

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.newsapp.databinding.ActivityGetOtpBinding
import com.example.newsapp.ui.auth.ForgotActivity

class GetOTP : AppCompatActivity() {
    private lateinit var binding: ActivityGetOtpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initGetOTPAction()
    }

    private fun initGetOTPAction() {
        binding.btnGetOtp.setOnClickListener {
            getOtp()
        }

        binding.btnOtpBack.setOnClickListener {
            back()
        }
    }

    private fun back() {
        val intent = Intent(this@GetOTP, ForgotActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun getOtp() {
        val userInput = binding.etNoTelp.text.toString().trim()

        if (userInput.isEmpty()) {
            Toast.makeText(this, "Silakan masukkan nomor telepon", Toast.LENGTH_SHORT).show()
            return
        }

        val phoneNumber = if (userInput.startsWith("+")) userInput else "+$userInput"
        Toast.makeText(this, "Kode OTP terkirim: 123456", Toast.LENGTH_LONG).show()

        val intent = Intent(this@GetOTP, VerifyOTP::class.java)
        intent.putExtra("phoneNumber", phoneNumber)
        startActivity(intent)
    }
}
