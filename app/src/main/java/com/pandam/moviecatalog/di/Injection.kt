package com.pandam.moviecatalog.di

import android.content.Context
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.data.source.local.LocalDataSource
import com.pandam.moviecatalog.data.source.local.room.CatalogDatabase
import com.pandam.moviecatalog.data.source.remote.RemoteDataSource
import com.pandam.moviecatalog.utils.AppExecutors

object Injection {
    fun provideRepository(context: Context): MovieRepository {
        val database = CatalogDatabase.getInstance(context)
        val remoteDataSource = RemoteDataSource.getInstance()
        val localDataSource = LocalDataSource.getInstance(database.catalogDao())
        val appExecutors = AppExecutors()

        return MovieRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}