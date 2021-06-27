package com.pandam.moviecatalog.ui.moviedetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.data.source.local.entity.MovieEntity
import com.pandam.moviecatalog.vo.Resource

class MovieDetailViewModel(private val movieRepository: MovieRepository) : ViewModel() {

    fun getMovieById(movieId: Int): LiveData<Resource<MovieEntity>> =
        movieRepository.getMovie(movieId)

    fun setFavorite(movieId: Int, state: Boolean) {
        movieRepository.setFavoriteMovie(movieId, state)
    }
}