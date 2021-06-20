package com.pandam.moviecatalog.ui.tvshowdetail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
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
class TvShowDetailViewModelTest {
    private lateinit var viewModel: TvShowDetailViewModel
    private val dummyTvShow = DataDummy.generateDummyTvShow()[0]
    private val tvShowId = dummyTvShow.id

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Mock
    private lateinit var tvShowObserver: Observer<TvShowEntity>

    @Before
    fun setUp() {
        viewModel = TvShowDetailViewModel(movieRepository)
    }

    @Test
    fun getTvShowById() {
        val tvShow = MutableLiveData<TvShowEntity>()
        tvShow.value = dummyTvShow

        Mockito.`when`(movieRepository.getTvShow(tvShowId)).thenReturn(tvShow)
        val tvShowEntity = viewModel.getTvShowById(tvShowId).value
        Mockito.verify(movieRepository).getTvShow(tvShowId)
        assertNotNull(tvShowEntity)
        assertEquals(dummyTvShow.id, tvShowEntity?.id)
        assertEquals(dummyTvShow.name, tvShowEntity?.name)
        assertEquals(dummyTvShow.overview, tvShowEntity?.overview)
        assertEquals(dummyTvShow.poster_path, tvShowEntity?.poster_path)
        assertEquals(dummyTvShow.first_air_date, tvShowEntity?.first_air_date)
        assertEquals(dummyTvShow.vote_count, tvShowEntity?.vote_count)
        if (tvShowEntity != null) {
            assertEquals(dummyTvShow.vote_average,tvShowEntity?.vote_average,1.0)
        }

        viewModel.getTvShowById(tvShowId).observeForever(tvShowObserver)
        Mockito.verify(tvShowObserver).onChanged(dummyTvShow)

    }
}