package com.example.newsapp.ui.news

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.R
import com.example.newsapp.data.model.Article
import com.example.newsapp.databinding.NewsItemBinding
import com.squareup.picasso.Picasso

class NewsAdapter(private val onItemClicked: (Article) -> Unit) :
    ListAdapter<Article, NewsAdapter.ArticleViewHolder>(DIFF_CALLBACK) {

    inner class ArticleViewHolder(private val binding: NewsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(article: Article) {
            binding.apply {
                newsTitle.text = article.title
                newsText.text = article.description ?: article.content
                newsSource.text = article.source?.name ?: "Parentify"
                newsDate.text = article.publishedAt?.take(10) ?: "Hari ini"

                if (!article.urlToImage.isNullOrBlank()) {
                    Picasso.get()
                        .load(article.urlToImage)
                        .placeholder(R.drawable.ic_logo_paren)
                        .error(R.drawable.ic_logo_paren)
                        .into(newsImage)
                } else {
                    newsImage.setImageResource(R.drawable.ic_logo_paren)
                }
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ArticleViewHolder {
        return ArticleViewHolder(
            NewsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = differ.currentList[position]
        holder.bind(article)
        holder.itemView.setOnClickListener {
            onItemClicked(article)
        }
    }

    val differ = AsyncListDiffer(this, DIFF_CALLBACK)

    override fun getItemCount() = differ.currentList.size

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Article>() {
            override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem.articleId == newItem.articleId || oldItem.url == newItem.url
            }

            override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem == newItem
            }
        }
    }
}