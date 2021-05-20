package com.pandam.moviecatalog.ui.moviedetail

import androidx.lifecycle.ViewModel
import com.pandam.moviecatalog.data.MovieEntity
import com.pandam.moviecatalog.utils.DataDummy

class MovieDetailViewModel : ViewModel() {

    fun getMovieById(movieId: Int): MovieEntity {
        lateinit var movie: MovieEntity
        val movieEntities = DataDummy.generateDummyMovies()
        for (movieEntity in movieEntities) {
            if (movieEntity.id == movieId) {
                movie = movieEntity
            }
        }
        return movie
    }
}