package com.pandam.moviecatalog.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.pandam.moviecatalog.data.source.MovieDataSource
import com.pandam.moviecatalog.data.source.remote.MovieItem
import com.pandam.moviecatalog.data.source.remote.RemoteDataSource
import com.pandam.moviecatalog.data.source.remote.TvShowItem

class FakeMovieRepository (private val remoteDataSource: RemoteDataSource) : MovieDataSource {

    override fun getAllMovies(): LiveData<List<MovieEntity>> {
        val listMovie = MutableLiveData<List<MovieEntity>>()
        remoteDataSource.getAllMovies(object : RemoteDataSource.LoadMoviesCallback {
            override fun onAllMoviesReceived(movieResponse: List<MovieItem>) {
                val movieList = ArrayList<MovieEntity>()
                for (item in movieResponse) {
                    val movie = MovieEntity(
                        item.id,
                        item.title,
                        item.adult,
                        item.overview,
                        item.posterPath,
                        item.releaseDate,
                        item.voteAverage,
                        item.voteCount
                    )
                    movieList.add(movie)
                }
                listMovie.postValue(movieList)
            }
        })
        return listMovie
    }

    override fun getMovie(movieId: Int): LiveData<MovieEntity> {
        val movieData = MutableLiveData<MovieEntity>()
        remoteDataSource.getMovieById(movieId, object : RemoteDataSource.LoadMovieDetailCallback {
            override fun onMovieDetailReceived(movie: MovieItem) {
                val movieDetail = MovieEntity(
                    movie.id,
                    movie.title,
                    movie.adult,
                    movie.overview,
                    movie.posterPath,
                    movie.releaseDate,
                    movie.voteAverage,
                    movie.voteCount
                )
                movieData.postValue(movieDetail)
            }
        })
        return movieData
    }

    override fun getAllTvShows(): LiveData<List<TvShowEntity>> {
        val listTvShowEntity = MutableLiveData<List<TvShowEntity>>()
        remoteDataSource.getAllTvShows(object : RemoteDataSource.LoadTvShowsCallback {
            override fun onAllTvShowsReceived(tvShowResponse: List<TvShowItem>) {
                val tvShowList = ArrayList<TvShowEntity>()
                for (item in tvShowResponse) {
                    val tvShow = TvShowEntity(
                        item.id,
                        item.name,
                        item.posterPath,
                        item.overview,
                        item.firstAirDate,
                        item.voteAverage,
                        item.voteCount
                    )
                    tvShowList.add(tvShow)
                }
                listTvShowEntity.postValue(tvShowList)
            }
        })
        return listTvShowEntity
    }

    override fun getTvShow(tvShowId: Int): LiveData<TvShowEntity> {
        val tvData = MutableLiveData<TvShowEntity>()
        remoteDataSource.getTvShowById(tvShowId,
            object : RemoteDataSource.LoadTvShowDetailCallback {
                override fun onTvShowDetailReceived(tvShow: TvShowItem) {
                    val tvShowDetail = TvShowEntity(
                        tvShow.id,
                        tvShow.name,
                        tvShow.posterPath,
                        tvShow.overview,
                        tvShow.firstAirDate,
                        tvShow.voteAverage,
                        tvShow.voteCount
                    )
                    tvData.postValue(tvShowDetail)
                }
            })
        return tvData
    }

}