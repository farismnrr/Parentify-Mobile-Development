package com.example.newsapp.ui.detection

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.newsapp.R
import com.example.newsapp.data.mock.MockData
import com.example.newsapp.databinding.FragmentCameraBinding
import com.example.newsapp.ui.detection.detail.DetailDetectionActivity
import com.squareup.picasso.Picasso

class CameraFragment : Fragment() {

    private var _binding: FragmentCameraBinding? = null
    private val binding get() = _binding!!

    private val availableFoods = listOf("sup", "bubur", "nasigoreng")
    private var currentFoodIndex = 0

    private var isFlashOn = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCameraBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadCurrentFoodPreview()

        binding.actionOpenCamera.setOnClickListener {
            triggerCaptureAndAnalyze()
        }

        binding.cardShutter.setOnClickListener {
            triggerCaptureAndAnalyze()
        }

        // Gallery vector button: cycles through showcase food dishes
        binding.btnCameraGallery.setOnClickListener {
            cycleToNextFood("Foto hidangan berhasil dimuat dari galeri")
        }

        // Switch camera vector button: cycles alternative food angle
        binding.btnCameraFlip.setOnClickListener {
            cycleToNextFood("Lensa dibalik ke sudut hidangan baru")
        }

        // Flash vector button
        binding.btnCameraFlash.setOnClickListener {
            isFlashOn = !isFlashOn
            binding.btnCameraFlash.setColorFilter(
                if (isFlashOn) ContextCompat.getColor(requireContext(), R.color.md_theme_primary)
                else ContextCompat.getColor(requireContext(), R.color.white)
            )
            Toast.makeText(
                requireContext(),
                if (isFlashOn) "Lampu kilat (Flash) Aktif" else "Lampu kilat Otomatis",
                Toast.LENGTH_SHORT
            ).show()
        }

        // Grid vector button
        binding.btnCameraGrid.setOnClickListener {
            Toast.makeText(requireContext(), "Garis panduan fokus (Grid) aktif", Toast.LENGTH_SHORT).show()
        }
    }

    private fun cycleToNextFood(toastMessage: String) {
        currentFoodIndex = (currentFoodIndex + 1) % availableFoods.size
        loadCurrentFoodPreview()
        Toast.makeText(requireContext(), toastMessage, Toast.LENGTH_SHORT).show()
    }

    private fun loadCurrentFoodPreview() {
        val foodKey = availableFoods[currentFoodIndex]
        val foodDetail = MockData.getFoodDetail(foodKey)

        binding.tvActiveFoodTag.text = when (foodKey) {
            "sup" -> "Objek Terdeteksi: Sup Ayam & Sayur (98.4%)"
            "bubur" -> "Objek Terdeteksi: Bubur Hati Sapi MPASI (99.1%)"
            else -> "Objek Terdeteksi: Nasi Goreng Balita (97.8%)"
        }

        if (!foodDetail.img.isNullOrBlank()) {
            Picasso.get()
                .load(foodDetail.img)
                .placeholder(R.drawable.ic_logo_paren)
                .error(R.drawable.ic_logo_paren)
                .into(binding.ivCameraPreview)
        }
    }

    private fun triggerCaptureAndAnalyze() {
        // Step 1: Camera Flash effect
        binding.vCameraFlash.alpha = 0.9f
        binding.vCameraFlash.animate()
            .alpha(0f)
            .setDuration(220)
            .setListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    // Step 2: Show AI scanning progress overlay
                    binding.llScanningOverlay.visibility = View.VISIBLE

                    // Step 3: Transition to detail detection after 750ms
                    Handler(Looper.getMainLooper()).postDelayed({
                        if (_binding != null) {
                            binding.llScanningOverlay.visibility = View.GONE
                            val intent = Intent(requireContext(), DetailDetectionActivity::class.java)
                            intent.putExtra(DetailDetectionActivity.ARGS_TITLE, availableFoods[currentFoodIndex])
                            startActivity(intent)
                        }
                    }, 750)
                }
            })
            .start()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}