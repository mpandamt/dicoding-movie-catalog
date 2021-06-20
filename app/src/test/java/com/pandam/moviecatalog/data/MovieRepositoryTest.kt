package com.pandam.moviecatalog.data

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.eq
import com.pandam.moviecatalog.data.source.remote.MovieResponse
import com.pandam.moviecatalog.data.source.remote.RemoteDataSource
import com.pandam.moviecatalog.utils.DataDummy
import com.pandam.moviecatalog.utils.LiveDataTestUtil
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify

class MovieRepositoryTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = Mockito.mock(RemoteDataSource::class.java)
    private val movieRepository = FakeMovieRepository(remote)

    private val movies = DataDummy.generateDummyMoviesResponse()
    private val movieId = movies[0].id
    private val tvShows = DataDummy.generateDummyTvShowsResponse()
    private val tvShowId = tvShows[0].id


    @Test
    fun getAllMovies() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMoviesCallback)
                .onAllMoviesReceived(movies)
            null
        }.`when`(remote).getAllMovies(any())
        val movieEntities = LiveDataTestUtil.getValue(movieRepository.getAllMovies())
        com.nhaarman.mockitokotlin2.verify(remote).getAllMovies(any())
        assertNotNull(movieEntities)
        assertEquals(movies.size.toLong(), movieEntities.size.toLong())
    }

    @Test
    fun getMovie() {
        doAnswer { invocation ->
            (invocation.arguments[1] as RemoteDataSource.LoadMovieDetailCallback)
                .onMovieDetailReceived(movies[0])
            null
        }.`when`(remote).getMovieById(eq(movieId),any())
        val movieEntity = LiveDataTestUtil.getValue(movieRepository.getMovie(movieId))
        com.nhaarman.mockitokotlin2.verify(remote).getMovieById(eq(movieId),any())
        assertNotNull(movieEntity)
        assertEquals(movies[0].id, movieEntity.id)
    }

    @Test
    fun getAllTvShows() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvShowsCallback)
                .onAllTvShowsReceived(tvShows)
            null
        }.`when`(remote).getAllTvShows(any())
        val tvShowEntities = LiveDataTestUtil.getValue(movieRepository.getAllTvShows())
        com.nhaarman.mockitokotlin2.verify(remote).getAllTvShows(any())
        assertNotNull(tvShowEntities)
        assertEquals(tvShows.size.toLong(), tvShowEntities.size.toLong())
    }

    @Test
    fun getTvShow() {
        doAnswer { invocation ->
            (invocation.arguments[1] as RemoteDataSource.LoadTvShowDetailCallback)
                .onTvShowDetailReceived(tvShows[0])
            null
        }.`when`(remote).getTvShowById(eq(tvShowId),any())
        val tvEntity = LiveDataTestUtil.getValue(movieRepository.getTvShow(tvShowId))
        com.nhaarman.mockitokotlin2.verify(remote).getTvShowById(eq(tvShowId),any())
        assertNotNull(tvEntity)
        assertEquals(tvShows[0].id, tvEntity.id)
    }
}