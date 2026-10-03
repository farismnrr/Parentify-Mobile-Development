package com.example.newsapp.ui.favorites

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.newsapp.databinding.FragmentFavoritesBinding
import com.example.newsapp.ui.auth.LogoutActivity
import com.example.newsapp.ui.detail.DetailFAQ
import com.example.newsapp.ui.detail.DetailParentify
import com.example.newsapp.ui.detail.DetailSetting

class FavoritesFragment : Fragment() {

    private var _binding: FragmentFavoritesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavoritesBinding.inflate(inflater, container, false)
        initProfileAction()
        return binding.root
    }

    private fun initProfileAction() {
        binding.llLogout.setOnClickListener {
            val intent = Intent(requireContext(), LogoutActivity::class.java)
            startActivity(intent)
        }

        binding.llSetting.setOnClickListener {
            val intent = Intent(requireContext(), DetailSetting::class.java)
            startActivity(intent)
        }

        binding.llFaq.setOnClickListener {
            val intent = Intent(requireContext(), DetailFAQ::class.java)
            startActivity(intent)
        }

        binding.llAboutApk.setOnClickListener {
            val intent = Intent(requireContext(), DetailParentify::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}