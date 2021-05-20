package com.pandam.moviecatalog.ui.moviedetail

import com.pandam.moviecatalog.utils.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class MovieDetailViewModelTest {
    private lateinit var viewModel: MovieDetailViewModel
    private val dummyMovie = DataDummy.generateDummyMovies()[0]
    private val movieId = dummyMovie.id

    @Before
    fun setUp() {
        viewModel = MovieDetailViewModel()
    }

    @Test
    fun getMovieById() {
        val movie = viewModel.getMovieById(movieId)
        assertNotNull(movie)
        assertEquals(dummyMovie.id,movie.id)
        assertEquals(dummyMovie.title,movie.title)
        assertEquals(dummyMovie.adult,movie.adult)
        assertEquals(dummyMovie.overview,movie.overview)
        assertEquals(dummyMovie.poster_path,movie.poster_path)
        assertEquals(dummyMovie.release_date,movie.release_date)
        assertEquals(dummyMovie.vote_average,movie.vote_average,1.0)
        assertEquals(dummyMovie.vote_count,movie.vote_count)
    }
}