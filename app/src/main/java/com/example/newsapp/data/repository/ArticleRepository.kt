package com.example.newsapp.data.repository

import com.example.newsapp.data.local.ArticleDatabase
import com.example.newsapp.data.mock.MockData
import com.example.newsapp.data.model.Article
import com.example.newsapp.data.model.News
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import retrofit2.Response

class ArticleRepository(
    private val database: ArticleDatabase,
) {

    suspend fun getAllArticles(searchQuery: String, pageNumber: Int): Response<News> {
        delay(100)
        val query = searchQuery.trim()
        val filtered = if (query.isEmpty() || query.equals("Kids", ignoreCase = true)) {
            MockData.articles
        } else {
            MockData.articles.filter {
                (it.title?.contains(query, ignoreCase = true) == true) ||
                (it.description?.contains(query, ignoreCase = true) == true) ||
                (it.content?.contains(query, ignoreCase = true) == true) ||
                (it.author?.contains(query, ignoreCase = true) == true)
            }.toMutableList()
        }

        val news = News(
            articles = filtered.toMutableList(),
            status = "ok",
            totalResults = filtered.size
        )
        return Response.success(news)
    }

    fun getFavoriteArticles() = database.articleDao().getArticles()

    suspend fun insert(article: Article) = withContext(Dispatchers.IO) {
        database.articleDao().insertArticle(article)
    }

    suspend fun deleteArticle(article: Article) = withContext(Dispatchers.IO) {
        database.articleDao().deleteArticle(article)
    }
}