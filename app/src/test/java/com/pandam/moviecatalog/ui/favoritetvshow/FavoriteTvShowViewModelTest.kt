package com.pandam.moviecatalog.ui.favoritetvshow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import androidx.paging.PositionalDataSource
import com.nhaarman.mockitokotlin2.verify
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.data.source.local.entity.MovieEntity
import com.pandam.moviecatalog.data.source.local.entity.TvShowEntity
import com.pandam.moviecatalog.ui.favoritemovie.FavoriteMovieViewModelTest
import com.pandam.moviecatalog.ui.tvshow.TvShowViewModel
import com.pandam.moviecatalog.utils.DataDummy
import com.pandam.moviecatalog.vo.Resource
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner
import java.util.concurrent.Executors
@RunWith(MockitoJUnitRunner::class)
class FavoriteTvShowViewModelTest {
    private lateinit var viewModel: FavoriteTvShowViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Mock
    private lateinit var observer: Observer<PagedList<TvShowEntity>>

    @Before
    fun setUp() {
        viewModel = FavoriteTvShowViewModel(movieRepository)
    }

    @Test
    fun `getTvShow should be success`() {
        val expected = MutableLiveData<PagedList<TvShowEntity>>()
        expected.value = PagedTestDataSources.snapshot(DataDummy.generateDummyTvShow())

        Mockito.`when`(movieRepository.getFavoriteTvShows()).thenReturn(expected)

        viewModel.getTvShow()
        verify(movieRepository).getFavoriteTvShows()

        viewModel.getTvShow().observeForever(observer)
        Mockito.verify(observer).onChanged(expected.value)

        val expectedValue = expected.value
        val actualValue = viewModel.getTvShow().value
        assertEquals(expectedValue, actualValue)
        assertEquals(expectedValue?.snapshot(), actualValue?.snapshot())
        assertEquals(expectedValue?.size, actualValue?.size)
    }

    class PagedTestDataSources private constructor(private val items: List<TvShowEntity>) : PositionalDataSource<TvShowEntity>() {
        companion object {
            fun snapshot(items: List<TvShowEntity> = listOf()): PagedList<TvShowEntity> {
                return PagedList.Builder(PagedTestDataSources(items), 10)
                    .setNotifyExecutor(Executors.newSingleThreadExecutor())
                    .setFetchExecutor(Executors.newSingleThreadExecutor())
                    .build()
            }
        }

        override fun loadInitial(params: LoadInitialParams, callback: LoadInitialCallback<TvShowEntity>) {
            callback.onResult(items, 0, items.size)
        }

        override fun loadRange(params: LoadRangeParams, callback: LoadRangeCallback<TvShowEntity>) {
            val start = params.startPosition
            val end = params.startPosition + params.loadSize
            callback.onResult(items.subList(start, end))
        }
    }
}