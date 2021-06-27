package com.pandam.moviecatalog.ui.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.data.source.local.entity.TvShowEntity
import com.pandam.moviecatalog.vo.Resource

class TvShowViewModel(private val movieRepository: MovieRepository) : ViewModel() {
    fun getTvShow(): LiveData<Resource<PagedList<TvShowEntity>>> = movieRepository.getAllTvShows()
}