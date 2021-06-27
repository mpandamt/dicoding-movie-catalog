package com.versta.academy.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.di.Injection
import com.pandam.moviecatalog.ui.favoritemovie.FavoriteMovieViewModel
import com.pandam.moviecatalog.ui.favoritetvshow.FavoriteTvShowViewModel
import com.pandam.moviecatalog.ui.movie.MovieViewModel
import com.pandam.moviecatalog.ui.moviedetail.MovieDetailViewModel
import com.pandam.moviecatalog.ui.tvshow.TvShowViewModel
import com.pandam.moviecatalog.ui.tvshowdetail.TvShowDetailViewModel

class ViewModelFactory private constructor(private val mMovieRepository: MovieRepository) :
    ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(Injection.provideRepository(context)).apply {
                    instance = this
                }
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        when {
            modelClass.isAssignableFrom(MovieViewModel::class.java) -> {
                return MovieViewModel(mMovieRepository) as T
            }
            modelClass.isAssignableFrom(TvShowViewModel::class.java) -> {
                return TvShowViewModel(mMovieRepository) as T
            }
            modelClass.isAssignableFrom(MovieDetailViewModel::class.java) -> {
                return MovieDetailViewModel(mMovieRepository) as T
            }
            modelClass.isAssignableFrom(TvShowDetailViewModel::class.java) -> {
                return TvShowDetailViewModel(mMovieRepository) as T
            }
            modelClass.isAssignableFrom(FavoriteMovieViewModel::class.java) -> {
                return FavoriteMovieViewModel(mMovieRepository) as T
            }
            modelClass.isAssignableFrom(FavoriteTvShowViewModel::class.java) -> {
                return FavoriteTvShowViewModel(mMovieRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }

    }
}