package com.pandam.moviecatalog.ui.tvshow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.pandam.moviecatalog.data.MovieEntity
import com.pandam.moviecatalog.data.TvShowEntity
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.utils.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TvShowViewModelTest {
    private lateinit var viewModel: TvShowViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Mock
    private lateinit var observer: Observer<List<TvShowEntity>>

    @Before
    fun setUp() {
        viewModel = TvShowViewModel(movieRepository)
    }

    @Test
    fun getTvShow() {
        val dummyTvShow = DataDummy.generateDummyTvShow()
        val tvShows = MutableLiveData<List<TvShowEntity>>()
        tvShows.value = dummyTvShow

        Mockito.`when`(movieRepository.getAllTvShows()).thenReturn(tvShows)
        val movieEntities = viewModel.getTvShow().value
        Mockito.verify(movieRepository).getAllTvShows()
        assertNotNull(movieEntities)
        assertEquals(20, movieEntities?.size)

        viewModel.getTvShow().observeForever(observer)
        Mockito.verify(observer).onChanged(dummyTvShow)
    }
}