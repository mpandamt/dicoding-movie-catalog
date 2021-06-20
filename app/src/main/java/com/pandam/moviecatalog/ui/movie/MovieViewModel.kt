package com.pandam.moviecatalog.ui.movie

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pandam.moviecatalog.BuildConfig
import com.pandam.moviecatalog.BuildConfig.API_KEY
import com.pandam.moviecatalog.api.ApiConfig
import com.pandam.moviecatalog.data.MovieEntity
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.data.source.remote.MovieItem
import com.pandam.moviecatalog.data.source.remote.MovieResponse
import com.pandam.moviecatalog.utils.DataDummy
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieViewModel(private val movieRepository: MovieRepository) : ViewModel() {
    fun getMovies(): LiveData<List<MovieEntity>> = movieRepository.getAllMovies()
}