package com.pandam.moviecatalog.data.source.local.room

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.pandam.moviecatalog.data.source.local.entity.MovieEntity
import com.pandam.moviecatalog.data.source.local.entity.TvShowEntity

@Dao
interface CatalogDao {
    @Query("SELECT * FROM movieentities")
    fun getMovies(): DataSource.Factory<Int, MovieEntity>

    @Query("SELECT * FROM tvshowentities")
    fun getTvShows(): DataSource.Factory<Int, TvShowEntity>

    @Query("SELECT * FROM movieentities WHERE is_favorite='1'")
    fun getFavoriteMovies(): DataSource.Factory<Int, MovieEntity>

    @Query("SELECT * FROM tvshowentities WHERE is_favorite='1'")
    fun getFavoriteTvShows(): DataSource.Factory<Int, TvShowEntity>

    @Query("SELECT * FROM movieentities WHERE id=:id")
    fun getMovieById(id: Int): LiveData<MovieEntity>

    @Query("SELECT * FROM tvshowentities WHERE id=:id")
    fun getTvShowById(id: Int): LiveData<TvShowEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovie(movie: MovieEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTvShow(tvShow: TvShowEntity)

    @Query("UPDATE movieentities SET is_favorite=:state WHERE id=:movieId")
    fun setFavoriteMovie(movieId: Int, state: Boolean)

    @Query("UPDATE tvshowentities SET is_favorite=:state WHERE id=:tvShowId")
    fun setFavoriteTvShow(tvShowId: Int, state: Boolean)

}