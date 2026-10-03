package com.example.newsapp.ui.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.newsapp.databinding.ActivityLoginBinding
import com.example.newsapp.ui.MainActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    companion object {
        var refreshToken: String? = null
        const val DUMMY_EMAIL = "bunda.sarah@parentify.id"
        const val DUMMY_PASSWORD = "bunda123"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Pre-fill dummy credentials so the user can log in with a single tap
        fillDummyCredentials()

        initLoginAction()
    }

    private fun fillDummyCredentials() {
        binding.etLoginEmail.setText(DUMMY_EMAIL)
        binding.etLoginPassword.setText(DUMMY_PASSWORD)
    }

    private fun initLoginAction() {
        binding.btnLogin.setOnClickListener {
            login()
        }

        binding.btnFillDemo.setOnClickListener {
            fillDummyCredentials()
            Toast.makeText(this, "Akun demo terisi otomatis!", Toast.LENGTH_SHORT).show()
        }

        binding.tvForgotPassword.setOnClickListener {
            forgot()
        }

        binding.tvRegister.setOnClickListener {
            register()
        }
    }

    private fun login() {
        val userInput = binding.etLoginEmail.text.toString().trim()
        val password = binding.etLoginPassword.text.toString().trim()

        if (userInput.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Silakan isi email/username dan kata sandi", Toast.LENGTH_SHORT).show()
            return
        }

        refreshToken = "mock-token-parentify"
        Toast.makeText(this, "Selamat datang, Bunda!", Toast.LENGTH_SHORT).show()

        val intent = Intent(this@LoginActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun register() {
        val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun forgot() {
        val intent = Intent(this@LoginActivity, ForgotActivity::class.java)
        startActivity(intent)
        finish()
    }
}
