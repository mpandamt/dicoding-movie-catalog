package com.pandam.moviecatalog.ui.tvshowdetail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.nhaarman.mockitokotlin2.verify
import com.pandam.moviecatalog.data.source.local.entity.TvShowEntity
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.data.source.local.entity.MovieEntity
import com.pandam.moviecatalog.utils.DataDummy
import com.pandam.moviecatalog.vo.Resource
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
class TvShowDetailViewModelTest {
    private lateinit var viewModel: TvShowDetailViewModel
    private val dummyTvShow = DataDummy.generateDummyTvShow()[0]
    private val tvShowId = dummyTvShow.id

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Mock
    private lateinit var tvShowObserver: Observer<Resource<TvShowEntity>>

    @Before
    fun setUp() {
        viewModel = TvShowDetailViewModel(movieRepository)
    }

    @Test
    fun `getTvShow should be success`() {
        val expected = MutableLiveData<Resource<TvShowEntity>>()
        expected.value = Resource.success(dummyTvShow)

        Mockito.`when`(movieRepository.getTvShow(tvShowId)).thenReturn(expected)

        viewModel.getTvShowById(tvShowId)
        verify(movieRepository).getTvShow(tvShowId)

        viewModel.getTvShowById(tvShowId).observeForever(tvShowObserver)

        Mockito.verify(tvShowObserver).onChanged(expected.value)

        val expectedValue = expected.value
        val actualValue = viewModel.getTvShowById(tvShowId).value

        assertEquals(expectedValue, actualValue)
    }
}