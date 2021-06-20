package com.pandam.moviecatalog.api
import com.pandam.moviecatalog.BuildConfig
import com.pandam.moviecatalog.data.source.remote.MovieResponse
import com.pandam.moviecatalog.data.source.remote.TvShowResponse
import com.pandam.moviecatalog.data.source.remote.response.MovieDetailResponse
import com.pandam.moviecatalog.data.source.remote.response.TvShowDetailResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("movie/top_rated")
    fun getMovies(
        @Query("page") page: Int,
        @Query("api_key") api_key: String = BuildConfig.API_KEY
    ): Call<MovieResponse>

    @GET("tv/top_rated")
    fun getTvShows(
        @Query("page") page: Int,
        @Query("api_key") api_key: String = BuildConfig.API_KEY
    ): Call<TvShowResponse>

    @GET("movie/{id}")
    fun getMovieDetail(
        @Path("id") id:Int,
        @Query("api_key") api_key: String = BuildConfig.API_KEY
    ): Call<MovieDetailResponse>

    @GET("tv/{id}")
    fun getTvShowDetail(
        @Path("id") id:Int,
        @Query("api_key") api_key: String = BuildConfig.API_KEY
    ): Call<TvShowDetailResponse>
}