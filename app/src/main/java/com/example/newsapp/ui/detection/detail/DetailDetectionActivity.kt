package com.example.newsapp.ui.detection.detail

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.newsapp.R
import com.example.newsapp.data.mock.MockData
import com.example.newsapp.databinding.ActivityDetailDetectionBinding
import com.squareup.picasso.Picasso

class DetailDetectionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailDetectionBinding
    private var listAdapter: DetailDetectionAdapter = DetailDetectionAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailDetectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nameFood = intent.getStringExtra(ARGS_TITLE) ?: "sup"

        with(binding) {
            back.setOnClickListener {
                onBackPressedDispatcher.onBackPressed()
            }

            rvItem.apply {
                adapter = listAdapter
            }

            btnSaveToLog.setOnClickListener {
                Toast.makeText(
                    this@DetailDetectionActivity,
                    "✓ Menu hidangan berhasil dicatat ke Jurnal Gizi Anak!",
                    Toast.LENGTH_SHORT
                ).show()
                finish()
            }

            btnShareDetection.setOnClickListener {
                shareDetectionResult()
            }
        }

        getDetailFood(nameFood)
    }

    private fun getDetailFood(keyword: String) {
        val dataResponse = MockData.getFoodDetail(keyword)
        binding.dataItemBind = dataResponse
        listAdapter.submitList(dataResponse.data)

        if (!dataResponse.img.isNullOrBlank()) {
            Picasso.get()
                .load(dataResponse.img)
                .placeholder(R.drawable.ic_logo_paren)
                .error(R.drawable.ic_logo_paren)
                .into(binding.ivFood)
        } else {
            binding.ivFood.setImageResource(R.drawable.ic_logo_paren)
        }
    }

    private fun shareDetectionResult() {
        val food = binding.dataItemBind
        val sendIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(
                Intent.EXTRA_TEXT,
                "🍲 *Laporan Analisis Gizi Parentify AI*\n\n" +
                        "Menu: ${food?.name ?: "Hidangan Sehat Balita"}\n" +
                        "Kategori: ${food?.type ?: "Gizi Seimbang"}\n" +
                        "${food?.nutrition ?: ""}\n\n" +
                        "Dianalisis menggunakan Parentify - Sahabat Tumbuh Kembang Buah Hati."
            )
            type = "text/plain"
        }
        startActivity(Intent.createChooser(sendIntent, "Bagikan Hasil Analisis Nutrisi"))
    }

    companion object {
        const val ARGS_TITLE = "Name Food"
    }
}