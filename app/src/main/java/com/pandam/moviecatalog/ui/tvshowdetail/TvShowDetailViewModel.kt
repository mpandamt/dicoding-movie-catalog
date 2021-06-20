package com.pandam.moviecatalog.ui.tvshowdetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.pandam.moviecatalog.data.TvShowEntity
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.utils.DataDummy

class TvShowDetailViewModel(private val movieRepository: MovieRepository) : ViewModel() {

    fun getTvShowById(tvShowId: Int): LiveData<TvShowEntity> = movieRepository.getTvShow(tvShowId)
}