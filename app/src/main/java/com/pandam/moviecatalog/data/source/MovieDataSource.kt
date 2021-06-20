package com.pandam.moviecatalog.data.source

import androidx.lifecycle.LiveData
import com.pandam.moviecatalog.data.MovieEntity
import com.pandam.moviecatalog.data.TvShowEntity

interface MovieDataSource {

    fun getAllMovies(): LiveData<List<MovieEntity>>
    fun getMovie(movieId: Int): LiveData<MovieEntity>
    fun getAllTvShows(): LiveData<List<TvShowEntity>>
    fun getTvShow(tvShowId: Int): LiveData<TvShowEntity>

}