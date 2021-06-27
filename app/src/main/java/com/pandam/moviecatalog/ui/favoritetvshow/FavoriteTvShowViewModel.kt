package com.pandam.moviecatalog.ui.favoritetvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.pandam.moviecatalog.data.source.local.entity.TvShowEntity
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.vo.Resource

class FavoriteTvShowViewModel(private val movieRepository: MovieRepository) : ViewModel() {
    fun getTvShow(): LiveData<PagedList<TvShowEntity>> = movieRepository.getFavoriteTvShows()
}