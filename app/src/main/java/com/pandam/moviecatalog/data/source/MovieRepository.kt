package com.pandam.moviecatalog.data.source

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.pandam.moviecatalog.data.source.local.LocalDataSource
import com.pandam.moviecatalog.data.source.local.entity.MovieEntity
import com.pandam.moviecatalog.data.source.local.entity.TvShowEntity
import com.pandam.moviecatalog.data.source.remote.ApiResponse
import com.pandam.moviecatalog.data.source.remote.MovieItem
import com.pandam.moviecatalog.data.source.remote.RemoteDataSource
import com.pandam.moviecatalog.data.source.remote.TvShowItem
import com.pandam.moviecatalog.utils.AppExecutors
import com.pandam.moviecatalog.vo.Resource

class MovieRepository private constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
) :
    MovieDataSource {

    companion object {
        @Volatile
        private var instance: MovieRepository? = null

        fun getInstance(
            remoteDataSource: RemoteDataSource,
            localDataSource: LocalDataSource,
            appExecutors: AppExecutors
        ): MovieRepository =
            instance ?: synchronized(this) {
                instance ?: MovieRepository(remoteDataSource, localDataSource, appExecutors)
            }
    }

    override fun getAllMovies(): LiveData<Resource<PagedList<MovieEntity>>> {
        return object :NetworkBoundResource<PagedList<MovieEntity>,List<MovieItem>>(appExecutors){
            override fun loadFromDB(): LiveData<PagedList<MovieEntity>> {
                val config = PagedList.Config.Builder()
                    .setEnablePlaceholders(false)
                    .setInitialLoadSizeHint(4)
                    .setPageSize(4)
                    .build()
                return LivePagedListBuilder(localDataSource.getAllMovies(), config).build()
            }

            override fun shouldFetch(data: PagedList<MovieEntity>?): Boolean = data == null || data.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<MovieItem>>> =
                remoteDataSource.getAllMovies()

            override fun saveCallResult(data: List<MovieItem>) {
                val movieList = ArrayList<MovieEntity>()
                for (item in data) {
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
                    localDataSource.insertMovie(movie)
                }
            }

        }.asLiveData()
    }

    override fun getFavoriteMovies(): LiveData<PagedList<MovieEntity>>{
        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setInitialLoadSizeHint(4)
            .setPageSize(4)
            .build()
        return LivePagedListBuilder(localDataSource.getFavoriteMovies(), config).build()
    }

    override fun getMovie(movieId: Int): LiveData<Resource<MovieEntity>> {
        return object : NetworkBoundResource<MovieEntity,MovieItem>(appExecutors){
            override fun loadFromDB(): LiveData<MovieEntity> =
                localDataSource.getMovieById(movieId)

            override fun shouldFetch(data: MovieEntity?): Boolean =
                data == null

            override fun createCall(): LiveData<ApiResponse<MovieItem>> =
                remoteDataSource.getMovieById(movieId)

            override fun saveCallResult(data: MovieItem) {
                val movieDetail = MovieEntity(
                    data.id,
                    data.title,
                    data.adult,
                    data.overview,
                    data.posterPath,
                    data.releaseDate,
                    data.voteAverage,
                    data.voteCount
                )
                localDataSource.insertMovie(movieDetail)
            }

        }.asLiveData()
    }

    override fun getAllTvShows(): LiveData<Resource<PagedList<TvShowEntity>>> {
        return object : NetworkBoundResource<PagedList<TvShowEntity>,List<TvShowItem>>(appExecutors){
            override fun loadFromDB(): LiveData<PagedList<TvShowEntity>> {
                val config = PagedList.Config.Builder()
                    .setEnablePlaceholders(false)
                    .setInitialLoadSizeHint(4)
                    .setPageSize(4)
                    .build()
                return LivePagedListBuilder(localDataSource.getAllTvShows(), config).build()
            }

            override fun shouldFetch(data: PagedList<TvShowEntity>?): Boolean =
                data==null || data.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<TvShowItem>>> =
                remoteDataSource.getAllTvShows()

            override fun saveCallResult(data: List<TvShowItem>) {
                for (item in data) {
                    val tvShow = TvShowEntity(
                        item.id,
                        item.name,
                        item.posterPath,
                        item.overview,
                        item.firstAirDate,
                        item.voteAverage,
                        item.voteCount
                    )
                    localDataSource.insertTvShow(tvShow)
                }
            }

        }.asLiveData()
    }

    override fun getFavoriteTvShows(): LiveData<PagedList<TvShowEntity>> {
        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setInitialLoadSizeHint(4)
            .setPageSize(4)
            .build()
        return LivePagedListBuilder(localDataSource.getFavoriteTvShows(), config).build()
    }

    override fun getTvShow(tvShowId: Int): LiveData<Resource<TvShowEntity>> {
        return object : NetworkBoundResource<TvShowEntity,TvShowItem>(appExecutors){
            override fun loadFromDB(): LiveData<TvShowEntity> =
                localDataSource.getTvShowById(tvShowId)

            override fun shouldFetch(data: TvShowEntity?): Boolean =
                data == null

            override fun createCall(): LiveData<ApiResponse<TvShowItem>> =
                remoteDataSource.getTvShowById(tvShowId)

            override fun saveCallResult(data: TvShowItem) {
                val tvShowDetail = TvShowEntity(
                        data.id,
                        data.name,
                        data.posterPath,
                        data.overview,
                        data.firstAirDate,
                        data.voteAverage,
                        data.voteCount
                    )
                localDataSource.insertTvShow(tvShowDetail)
            }

        }.asLiveData()
    }

    override fun setFavoriteMovie(movieId: Int, state: Boolean) =
        appExecutors.diskIO().execute{localDataSource.setFavoriteMovie(movieId,state)}

    override fun setFavoriteTvShow(tvShowId: Int, state: Boolean)=
        appExecutors.diskIO().execute{localDataSource.setFavoriteTvShow(tvShowId,state)}

}