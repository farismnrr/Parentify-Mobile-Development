package com.example.newsapp.ui.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.newsapp.databinding.ActivityRegisterBinding
import com.example.newsapp.ui.MainActivity

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    companion object {
        var refreshToken: String? = null
        const val DUMMY_UNAME = "Bunda Sarah"
        const val DUMMY_EMAIL = "bunda.sarah@parentify.id"
        const val DUMMY_PASS = "bunda123"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Pre-fill dummy credentials so the user can register/enter with one tap
        binding.registerUname.setText(DUMMY_UNAME)
        binding.registerEmail.setText(DUMMY_EMAIL)
        binding.registerPassword.setText(DUMMY_PASS)
        binding.registerConfirmPassword.setText(DUMMY_PASS)

        initRegisterAction()
    }

    private fun initRegisterAction() {
        binding.btnSignup.setOnClickListener {
            register()
        }

        binding.tvLogin.setOnClickListener {
            login()
        }
    }

    private fun register() {
        val username = binding.registerUname.text.toString().trim()
        val email = binding.registerEmail.text.toString().trim()
        val password = binding.registerPassword.text.toString().trim()
        val confirmPassword = binding.registerConfirmPassword.text.toString().trim()

        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            Toast.makeText(this, "Harap lengkapi semua kolom pendaftaran", Toast.LENGTH_SHORT).show()
            return
        }

        if (password != confirmPassword) {
            Toast.makeText(this, "Konfirmasi kata sandi tidak cocok", Toast.LENGTH_SHORT).show()
            return
        }

        LoginActivity.refreshToken = "mock-token-registered"
        Toast.makeText(this, "Pendaftaran berhasil! Selamat datang, $username", Toast.LENGTH_SHORT).show()

        val intent = Intent(this@RegisterActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun login() {
        val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
