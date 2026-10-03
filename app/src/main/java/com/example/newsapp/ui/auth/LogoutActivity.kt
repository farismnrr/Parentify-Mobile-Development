package com.example.newsapp.ui.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.newsapp.databinding.ActivityLogoutBinding

class LogoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLogoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initLogoutAction()
    }

    private fun initLogoutAction() {
        binding.btnLogout.setOnClickListener {
            logout()
        }

        binding.btnCancelLogout.setOnClickListener {
            finish()
        }
    }

    private fun logout() {
        LoginActivity.refreshToken = null
        RegisterActivity.refreshToken = null

        Toast.makeText(this, "Berhasil keluar dari akun", Toast.LENGTH_SHORT).show()
        val intent = Intent(this@LogoutActivity, LoginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        finish()
    }
}
