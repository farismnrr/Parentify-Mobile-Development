package com.example.newsapp.ui.detail

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.newsapp.databinding.ActivityVerifyOtpBinding
import com.example.newsapp.ui.auth.LoginActivity

class VerifyOTP : AppCompatActivity() {
    private lateinit var binding: ActivityVerifyOtpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerifyOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val phoneNumber = intent.getStringExtra("phoneNumber") ?: "+628123456789"
        binding.tvPhoneNumber.text = phoneNumber

        // Pre-fill mock OTP for convenience
        binding.etOtp1.setText("1")
        binding.etOtp2.setText("2")
        binding.etOtp3.setText("3")
        binding.etOtp4.setText("4")
        binding.etOtp5.setText("5")
        binding.etOtp6.setText("6")

        initVerifyAction()
    }

    private fun initVerifyAction() {
        binding.btnVerifiyOtp.setOnClickListener {
            Toast.makeText(this, "Verifikasi OTP Berhasil!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@VerifyOTP, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.tvResendOtpReg.setOnClickListener {
            Toast.makeText(this, "Kode OTP baru dikirim: 123456", Toast.LENGTH_SHORT).show()
        }
    }
}