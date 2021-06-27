package com.pandam.moviecatalog.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.data.source.local.entity.MovieEntity
import com.pandam.moviecatalog.vo.Resource

class MovieViewModel(private val movieRepository: MovieRepository) : ViewModel() {
    fun getMovies(): LiveData<Resource<PagedList<MovieEntity>>> = movieRepository.getAllMovies()
}