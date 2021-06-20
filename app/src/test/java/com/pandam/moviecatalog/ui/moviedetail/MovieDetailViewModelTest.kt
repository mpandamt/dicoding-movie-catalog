package com.pandam.moviecatalog.ui.moviedetail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.pandam.moviecatalog.data.MovieEntity
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.utils.DataDummy
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
    private lateinit var movieObserver: Observer<MovieEntity>

    @Before
    fun setUp() {
        viewModel = MovieDetailViewModel(movieRepository)
    }

    @Test
    fun getMovieById() {
        val movie = MutableLiveData<MovieEntity>()
        movie.value = dummyMovie

        `when`(movieRepository.getMovie(movieId)).thenReturn(movie)
        val movieEntity = viewModel.getMovieById(movieId).value
        verify(movieRepository).getMovie(movieId)
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.id,movieEntity?.id)
        assertEquals(dummyMovie.title,movieEntity?.title)
        assertEquals(dummyMovie.adult,movieEntity?.adult)
        assertEquals(dummyMovie.overview,movieEntity?.overview)
        assertEquals(dummyMovie.poster_path,movieEntity?.poster_path)
        assertEquals(dummyMovie.release_date,movieEntity?.release_date)
        if (movieEntity != null) {
            assertEquals(dummyMovie.vote_average,movieEntity.vote_average,1.0)
        }
        assertEquals(dummyMovie.vote_count,movieEntity?.vote_count)

        viewModel.getMovieById(movieId).observeForever(movieObserver)
        verify(movieObserver).onChanged(dummyMovie)
    }
}