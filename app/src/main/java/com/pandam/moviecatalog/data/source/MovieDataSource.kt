package com.pandam.moviecatalog.data.source

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.pandam.moviecatalog.data.source.local.entity.MovieEntity
import com.pandam.moviecatalog.data.source.local.entity.TvShowEntity
import com.pandam.moviecatalog.vo.Resource

interface MovieDataSource {

    fun getAllMovies(): LiveData<Resource<PagedList<MovieEntity>>>
    fun getFavoriteMovies(): LiveData<PagedList<MovieEntity>>
    fun getMovie(movieId: Int): LiveData<Resource<MovieEntity>>
    fun getAllTvShows(): LiveData<Resource<PagedList<TvShowEntity>>>
    fun getFavoriteTvShows(): LiveData<PagedList<TvShowEntity>>
    fun getTvShow(tvShowId: Int): LiveData<Resource<TvShowEntity>>
    fun setFavoriteMovie(movieId: Int, state: Boolean)
    fun setFavoriteTvShow(tvShowId: Int, state: Boolean)
}