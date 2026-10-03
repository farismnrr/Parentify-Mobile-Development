package com.example.newsapp.ui.detail

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.newsapp.R
import com.example.newsapp.data.model.Article
import com.example.newsapp.databinding.FragmentDetailBinding
import com.example.newsapp.ui.NewsApplication
import com.example.newsapp.ui.news.NewsViewModel
import com.squareup.picasso.Picasso

class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    private val viewModel: NewsViewModel by viewModels {
        NewsViewModel.Factory((requireActivity().application as NewsApplication).articleRepository)
    }

    private val args: DetailFragmentArgs by navArgs()

    lateinit var article: Article

    private var isFavorite = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        article = args.article
        isFavorite = args.favorite
        bind()
        setupTopBarActions()
    }

    private fun bind() {
        binding.apply {
            newsTitle.text = article.title
            newsText.text = article.content ?: article.description
            newsSource.text = article.source?.name ?: "Edukasi Bunda"
            newsAuthor.text = article.author ?: "Tim Spesialis Anak & Gizi"
            newsDate.text = "${article.publishedAt?.take(16) ?: "Hari ini"} • 5 menit baca"

            btnDetailFavorite.setImageResource(
                if (isFavorite) R.drawable.ic_favorite else R.drawable.ic_favorite_border
            )

            if (!article.urlToImage.isNullOrBlank()) {
                Picasso.get()
                    .load(article.urlToImage)
                    .placeholder(R.drawable.ic_logo_paren)
                    .error(R.drawable.ic_logo_paren)
                    .into(newsImage)
            } else {
                newsImage.setImageResource(R.drawable.ic_logo_paren)
            }

            goToSource.setOnClickListener {
                shareArticle()
            }
        }
    }

    private fun setupTopBarActions() {
        binding.apply {
            btnDetailBack.setOnClickListener {
                findNavController().navigateUp()
            }

            btnDetailFavorite.setOnClickListener {
                toggleFavorite()
            }

            btnDetailShare.setOnClickListener {
                shareArticle()
            }
        }
    }

    private fun toggleFavorite() {
        if (isFavorite) {
            viewModel.removeArticleFromFavorites(article)
            Toast.makeText(requireContext(), "Dihapus dari artikel favorit", Toast.LENGTH_SHORT).show()
            isFavorite = false
            binding.btnDetailFavorite.setImageResource(R.drawable.ic_favorite_border)
        } else {
            viewModel.addArticleToFavorites(article)
            Toast.makeText(requireContext(), "Disimpan ke artikel favorit Bunda", Toast.LENGTH_SHORT).show()
            isFavorite = true
            binding.btnDetailFavorite.setImageResource(R.drawable.ic_favorite)
        }
    }

    private fun shareArticle() {
        val sendIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(
                Intent.EXTRA_TEXT,
                "💡 *${article.title}*\n\n${article.description}\n\nBaca selengkapnya di aplikasi Parentify: ${article.url}"
            )
            type = "text/plain"
        }
        startActivity(Intent.createChooser(sendIntent, "Bagikan Panduan Parenting"))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}