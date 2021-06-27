package com.pandam.moviecatalog.data

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.eq
import com.pandam.moviecatalog.data.source.local.LocalDataSource
import com.pandam.moviecatalog.data.source.local.entity.MovieEntity
import com.pandam.moviecatalog.data.source.local.entity.TvShowEntity
import com.pandam.moviecatalog.data.source.remote.MovieResponse
import com.pandam.moviecatalog.data.source.remote.RemoteDataSource
import com.pandam.moviecatalog.utils.AppExecutors
import com.pandam.moviecatalog.utils.DataDummy
import com.pandam.moviecatalog.utils.LiveDataTestUtil
import com.pandam.moviecatalog.utils.PagedListUtil
import com.pandam.moviecatalog.vo.Resource
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.mockito.Mockito
import org.mockito.Mockito.*
import retrofit2.Response

class MovieRepositoryTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = Mockito.mock(RemoteDataSource::class.java)
    private val local = Mockito.mock(LocalDataSource::class.java)
    private val appExecutors = Mockito.mock(AppExecutors::class.java)

    private val movieRepository = FakeMovieRepository(remote,local,appExecutors)

    private val movies = DataDummy.generateDummyMoviesResponse()
    private val movieId = movies[0].id
    private val tvShows = DataDummy.generateDummyTvShowsResponse()
    private val tvShowId = tvShows[0].id


    @Test
    fun getAllMovies() {
        val dataSourceFactory = mock(DataSource.Factory::class.java) as DataSource.Factory<Int, MovieEntity>
        `when`(local.getAllMovies()).thenReturn(dataSourceFactory)
        movieRepository.getAllMovies()

        val movieEntities = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyMovies()))
        verify(local).getAllMovies()
        assertNotNull(movieEntities.data)
        assertEquals(movies.size.toLong(),movieEntities.data?.size?.toLong())
    }

    @Test
    fun getMovie() {
        val movieData = MutableLiveData<MovieEntity>()
        val movieDummy = DataDummy.generateDummyMovies()[0]
        movieData.value = movieDummy
        `when`(local.getMovieById(movieDummy.id)).thenReturn(movieData)

        val movieEntity = Resource.success(LiveDataTestUtil.getValue(movieRepository.getMovie(movieDummy.id)))
        assertNotNull(movieEntity)
        assertEquals(movieDummy.id, movieEntity.data?.data?.id)
    }

    @Test
    fun getAllTvShows() {
        val dataSourceFactory = mock(DataSource.Factory::class.java) as DataSource.Factory<Int, TvShowEntity>
        `when`(local.getAllTvShows()).thenReturn(dataSourceFactory)
        movieRepository.getAllTvShows()

        val tvShowEntities = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyTvShow()))
        verify(local).getAllTvShows()
        assertNotNull(tvShowEntities.data)
        assertEquals(tvShows.size.toLong(),tvShowEntities.data?.size?.toLong())
    }

    @Test
    fun getTvShow() {
        val tvShowData = MutableLiveData<TvShowEntity>()
        val tvShowDummy = DataDummy.generateDummyTvShow()[0]
        tvShowData.value = tvShowDummy
        `when`(local.getTvShowById(tvShowDummy.id)).thenReturn(tvShowData)

        val tvShowEntity = Resource.success(LiveDataTestUtil.getValue(movieRepository.getTvShow(tvShowDummy.id)))
        assertNotNull(tvShowEntity)
        assertEquals(tvShowDummy.id, tvShowEntity.data?.data?.id)
    }

    @Test
    fun getFavMovies(){
        val dataSourceFactory = mock(DataSource.Factory::class.java) as DataSource.Factory<Int, MovieEntity>
        `when`(local.getFavoriteMovies()).thenReturn(dataSourceFactory)
        movieRepository.getFavoriteMovies()

        val movieEntities = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyMovies()))
        verify(local).getFavoriteMovies()
        assertNotNull(movieEntities.data)
        assertEquals(movies.size.toLong(),movieEntities.data?.size?.toLong())
    }

    @Test
    fun getFavTvShow(){
        val dataSourceFactory = mock(DataSource.Factory::class.java) as DataSource.Factory<Int, TvShowEntity>
        `when`(local.getFavoriteTvShows()).thenReturn(dataSourceFactory)
        movieRepository.getFavoriteTvShows()

        val tvShowEntities = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyTvShow()))
        verify(local).getFavoriteTvShows()
        assertNotNull(tvShowEntities.data)
        assertEquals(tvShows.size.toLong(),tvShowEntities.data?.size?.toLong())
    }
}