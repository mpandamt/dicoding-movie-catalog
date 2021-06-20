package com.pandam.moviecatalog.data.source.remote

import com.pandam.moviecatalog.api.ApiConfig
import com.pandam.moviecatalog.data.source.remote.response.MovieDetailResponse
import com.pandam.moviecatalog.data.source.remote.response.TvShowDetailResponse
import com.pandam.moviecatalog.utils.EspressoIdlingResource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteDataSource {

    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource().apply { instance = this }
            }
    }

    fun getAllMovies(callback: LoadMoviesCallback) {
        val client = ApiConfig.getApiService().getMovies(1)
        EspressoIdlingResource.increment()
        client.enqueue(object : Callback<MovieResponse> {
            override fun onResponse(
                call: Call<MovieResponse>,
                response: Response<MovieResponse>
            ) {
                EspressoIdlingResource.decrement()
                if(response.isSuccessful){
                response.body()?.let { callback.onAllMoviesReceived(it.results) }
                }
            }

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                EspressoIdlingResource.decrement()
            }
        })
    }

    fun getAllTvShows(callback: LoadTvShowsCallback) {
        val client = ApiConfig.getApiService().getTvShows(1)
        EspressoIdlingResource.increment()
        client.enqueue(object : Callback<TvShowResponse> {
            override fun onResponse(
                call: Call<TvShowResponse>,
                response: Response<TvShowResponse>
            ) {
                EspressoIdlingResource.decrement()
                if(response.isSuccessful) {
                    response.body()?.let { callback.onAllTvShowsReceived(it.results) }
                }
            }

            override fun onFailure(call: Call<TvShowResponse>, t: Throwable) {
                EspressoIdlingResource.decrement()
            }
        })
    }

    fun getMovieById(movieId: Int, callback: LoadMovieDetailCallback) {
        val client = ApiConfig.getApiService().getMovieDetail(movieId)
        EspressoIdlingResource.increment()
        client.enqueue(object : Callback<MovieDetailResponse> {
            override fun onResponse(
                call: Call<MovieDetailResponse>,
                response: Response<MovieDetailResponse>
            ) {
                EspressoIdlingResource.decrement()
                if(response.isSuccessful) {
                    response.body()?.let {
                        callback.onMovieDetailReceived(it)
                    }
                }
            }

            override fun onFailure(call: Call<MovieDetailResponse>, t: Throwable) {
                EspressoIdlingResource.decrement()
            }

        })
    }

    fun getTvShowById(tvShowId: Int, callback: LoadTvShowDetailCallback) {
        val client = ApiConfig.getApiService().getTvShowDetail(tvShowId)
        EspressoIdlingResource.increment()
        client.enqueue(object : Callback<TvShowDetailResponse> {
            override fun onResponse(
                call: Call<TvShowDetailResponse>,
                response: Response<TvShowDetailResponse>
            ) {
                EspressoIdlingResource.decrement()
                if(response.isSuccessful) {
                    response.body()?.let {
                        callback.onTvShowDetailReceived(it)
                    }
                }
            }

            override fun onFailure(call: Call<TvShowDetailResponse>, t: Throwable) {
                EspressoIdlingResource.decrement()
            }


        })
    }

    interface LoadMoviesCallback {
        fun onAllMoviesReceived(movieResponse: List<MovieItem>)
    }

    interface LoadTvShowsCallback {
        fun onAllTvShowsReceived(tvShowResponse: List<TvShowItem>)
    }

    interface LoadMovieDetailCallback {
        fun onMovieDetailReceived(movie: MovieDetailResponse)
    }

    interface LoadTvShowDetailCallback {
        fun onTvShowDetailReceived(tvShow: TvShowDetailResponse)
    }

    interface FailureCallback{
        fun onRequestFailed()
    }
}