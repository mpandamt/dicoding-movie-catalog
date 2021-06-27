package com.pandam.moviecatalog.data.source.remote

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.pandam.moviecatalog.api.ApiConfig
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

    fun getAllMovies(): LiveData<ApiResponse<List<MovieItem>>> {
        EspressoIdlingResource.increment()
        val resultMovies = MutableLiveData<ApiResponse<List<MovieItem>>>()
        val client = ApiConfig.getApiService().getMovies(1)
        client.enqueue(object : Callback<MovieResponse> {
            override fun onResponse(
                call: Call<MovieResponse>,
                response: Response<MovieResponse>
            ) {
                EspressoIdlingResource.decrement()
                if(response.isSuccessful){
                response.body()?.let {
                        resultMovies.value = ApiResponse.success(it.results)
                    }
                }
            }

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
//                resultMovies.value = ApiResponse.error(t.message.toString())
                EspressoIdlingResource.decrement()
            }
        });
        return resultMovies;
    }

    fun getAllTvShows(): LiveData<ApiResponse<List<TvShowItem>>>  {
        EspressoIdlingResource.increment()
        val resultTvShows = MutableLiveData<ApiResponse<List<TvShowItem>>>()
        val client = ApiConfig.getApiService().getTvShows(1)
        client.enqueue(object : Callback<TvShowResponse> {
            override fun onResponse(
                call: Call<TvShowResponse>,
                response: Response<TvShowResponse>
            ) {
                EspressoIdlingResource.decrement()
                if(response.isSuccessful) {
                    response.body()?.let {
                        resultTvShows.value = ApiResponse.success(it.results)
                    }
                }
            }

            override fun onFailure(call: Call<TvShowResponse>, t: Throwable) {
                EspressoIdlingResource.decrement()
            }
        })
        return resultTvShows;
    }

    fun getMovieById(movieId: Int): LiveData<ApiResponse<MovieItem>> {
        EspressoIdlingResource.increment()
        val movie = MutableLiveData<ApiResponse<MovieItem>>()
        val client = ApiConfig.getApiService().getMovieDetail(movieId)
        client.enqueue(object : Callback<MovieItem> {
            override fun onResponse(
                call: Call<MovieItem>,
                response: Response<MovieItem>
            ) {
                EspressoIdlingResource.decrement()
                if(response.isSuccessful) {
                    response.body()?.let {
                        movie.value = ApiResponse.success(it)
                    }
                }
            }

            override fun onFailure(call: Call<MovieItem>, t: Throwable) {
                EspressoIdlingResource.decrement()
            }
        })
        return movie
    }

    fun getTvShowById(tvShowId: Int): LiveData<ApiResponse<TvShowItem>>  {
        EspressoIdlingResource.increment()
        val tvShow = MutableLiveData<ApiResponse<TvShowItem>>()
        val client = ApiConfig.getApiService().getTvShowDetail(tvShowId)
        client.enqueue(object : Callback<TvShowItem> {
            override fun onResponse(
                call: Call<TvShowItem>,
                response: Response<TvShowItem>
            ) {
                EspressoIdlingResource.decrement()
                if(response.isSuccessful) {
                    response.body()?.let {
                        tvShow.value = ApiResponse.success(it)
                    }
                }
            }

            override fun onFailure(call: Call<TvShowItem>, t: Throwable) {
                EspressoIdlingResource.decrement()
            }


        })
        return tvShow
    }

    interface LoadMoviesCallback {
        fun onAllMoviesReceived(movieResponse: List<MovieItem>)
    }

    interface LoadTvShowsCallback {
        fun onAllTvShowsReceived(tvShowResponse: List<TvShowItem>)
    }

    interface LoadMovieDetailCallback {
        fun onMovieDetailReceived(movie: MovieItem)
    }

    interface LoadTvShowDetailCallback {
        fun onTvShowDetailReceived(tvShow: TvShowItem)
    }
}