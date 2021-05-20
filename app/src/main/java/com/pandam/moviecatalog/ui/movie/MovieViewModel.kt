package com.pandam.moviecatalog.ui.movie

import androidx.lifecycle.ViewModel
import com.pandam.moviecatalog.data.MovieEntity
import com.pandam.moviecatalog.utils.DataDummy

class MovieViewModel : ViewModel() {
    fun getMovies(): List<MovieEntity> = DataDummy.generateDummyMovies()
}