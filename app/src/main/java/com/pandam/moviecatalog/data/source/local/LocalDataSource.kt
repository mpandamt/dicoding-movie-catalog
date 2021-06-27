package com.pandam.moviecatalog.data.source.local

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import com.pandam.moviecatalog.data.source.local.entity.MovieEntity
import com.pandam.moviecatalog.data.source.local.entity.TvShowEntity
import com.pandam.moviecatalog.data.source.local.room.CatalogDao

class LocalDataSource private constructor(private val catalogDao: CatalogDao) {

    companion object {
        private var INSTANCE: LocalDataSource? = null

        fun getInstance(catalogDao: CatalogDao): LocalDataSource =
            INSTANCE ?: LocalDataSource(catalogDao)
    }

    fun getAllMovies(): DataSource.Factory<Int, MovieEntity> =
        catalogDao.getMovies()

    fun getAllTvShows(): DataSource.Factory<Int, TvShowEntity> =
        catalogDao.getTvShows()

    fun getFavoriteMovies(): DataSource.Factory<Int, MovieEntity> = catalogDao.getFavoriteMovies()

    fun getFavoriteTvShows(): DataSource.Factory<Int, TvShowEntity> =
        catalogDao.getFavoriteTvShows()

    fun getMovieById(movieId: Int): LiveData<MovieEntity> = catalogDao.getMovieById(movieId)

    fun getTvShowById(tvShowId: Int): LiveData<TvShowEntity> = catalogDao.getTvShowById(tvShowId)

    fun insertMovie(movie: MovieEntity) = catalogDao.insertMovie(movie)

    fun insertTvShow(tvShow: TvShowEntity) = catalogDao.insertTvShow(tvShow)

    fun setFavoriteMovie(movieId: Int, state: Boolean) = catalogDao.setFavoriteMovie(movieId, state)

    fun setFavoriteTvShow(tvShowId: Int, state: Boolean) =
        catalogDao.setFavoriteTvShow(tvShowId, state)

}