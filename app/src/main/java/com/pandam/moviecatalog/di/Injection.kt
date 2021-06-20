package com.pandam.moviecatalog.di

import android.content.Context
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.data.source.remote.RemoteDataSource

object Injection {
    fun provideRepository(context: Context): MovieRepository {
        val remoteDataSource = RemoteDataSource.getInstance()
        return MovieRepository.getInstance(remoteDataSource)
    }
}