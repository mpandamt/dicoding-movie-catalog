package com.pandam.moviecatalog.ui.moviedetail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.pandam.moviecatalog.data.source.local.entity.MovieEntity
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.utils.DataDummy
import com.pandam.moviecatalog.vo.Resource
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MovieDetailViewModelTest {
    private lateinit var viewModel: MovieDetailViewModel
    private val dummyMovie = DataDummy.generateDummyMovies()[0]
    private val movieId = dummyMovie.id

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Mock
    private lateinit var movieObserver: Observer<Resource<MovieEntity>>

    @Before
    fun setUp() {
        viewModel = MovieDetailViewModel(movieRepository)
    }

    @Test
    fun `getMovie should be success`() {
        val expected = MutableLiveData<Resource<MovieEntity>>()
        expected.value = Resource.success(dummyMovie)

        `when`(movieRepository.getMovie(movieId)).thenReturn(expected)

        viewModel.getMovieById(movieId).observeForever(movieObserver)

        verify(movieObserver).onChanged(expected.value)

        val expectedValue = expected.value
        val actualValue = viewModel.getMovieById(movieId).value

        assertEquals(expectedValue, actualValue)
    }
}