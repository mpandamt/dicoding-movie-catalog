package com.pandam.moviecatalog.ui.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.pandam.moviecatalog.data.TvShowEntity
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.utils.DataDummy

class TvShowViewModel(private val movieRepository: MovieRepository) : ViewModel() {
    fun getTvShow(): LiveData<List<TvShowEntity>> = movieRepository.getAllTvShows()
}