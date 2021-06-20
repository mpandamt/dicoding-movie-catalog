package com.pandam.moviecatalog.ui.moviedetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.pandam.moviecatalog.data.MovieEntity
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.utils.DataDummy

class MovieDetailViewModel(private val movieRepository: MovieRepository) : ViewModel() {

    fun getMovieById(movieId: Int): LiveData<MovieEntity> = movieRepository.getMovie(movieId)
}