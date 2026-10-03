package com.example.newsapp.ui.detail

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.newsapp.databinding.ActivityDetailSettingBinding

class DetailSetting : AppCompatActivity() {
    private lateinit var binding: ActivityDetailSettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailSettingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        prefillUserData()
        initSettingAction()
    }

    private fun prefillUserData() {
        binding.etEditUname.setText("Bunda Sarah")
        binding.etEditEmail.setText("bunda.sarah@parentify.id")
        binding.etEditOldPass.setText("bunda123")
        binding.etEditPass.setText("bunda123")
    }

    private fun initSettingAction() {
        binding.btnProfileBack.setOnClickListener {
            finish()
        }

        binding.btnProfileSave.setOnClickListener {
            save()
        }
    }

    private fun save() {
        val newUsername = binding.etEditUname.text.toString().trim()
        val newEmail = binding.etEditEmail.text.toString().trim()
        val oldPassword = binding.etEditOldPass.text.toString().trim()
        val newPassword = binding.etEditPass.text.toString().trim()

        if (newUsername.isEmpty() || newEmail.isEmpty() || oldPassword.isEmpty() || newPassword.isEmpty()) {
            Toast.makeText(this, "Harap lengkapi semua kolom pengaturan", Toast.LENGTH_SHORT).show()
            return
        }

        Toast.makeText(this, "Profil Bunda berhasil diperbarui!", Toast.LENGTH_SHORT).show()
        finish()
    }
}