package com.example.newsapp.ui

import android.app.Application
import androidx.room.Room
import com.example.newsapp.data.local.ArticleDatabase
import com.example.newsapp.data.repository.ArticleRepository

class NewsApplication : Application() {
    companion object {
        lateinit var instance: NewsApplication
            private set
    }

    val database by lazy {
        Room.databaseBuilder(
            this,
            ArticleDatabase::class.java,
            "article_database"
        ).fallbackToDestructiveMigration().build()
    }

    val articleRepository by lazy {
        ArticleRepository(database)
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}