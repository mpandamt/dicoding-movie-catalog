package com.pandam.moviecatalog.ui.tvshowdetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.pandam.moviecatalog.data.source.local.entity.TvShowEntity
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.vo.Resource

class TvShowDetailViewModel(private val movieRepository: MovieRepository) : ViewModel() {

    fun getTvShowById(tvShowId: Int): LiveData<Resource<TvShowEntity>> = movieRepository.getTvShow(tvShowId)

    fun setFavorite(tvShowId: Int, state: Boolean) = movieRepository.setFavoriteTvShow(tvShowId,state)
}