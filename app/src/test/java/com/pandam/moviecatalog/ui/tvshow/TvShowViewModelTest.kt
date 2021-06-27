package com.pandam.moviecatalog.ui.tvshow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import androidx.paging.PositionalDataSource
import com.nhaarman.mockitokotlin2.verify
import com.pandam.moviecatalog.data.source.local.entity.TvShowEntity
import com.pandam.moviecatalog.data.source.MovieRepository
import com.pandam.moviecatalog.data.source.local.entity.MovieEntity
import com.pandam.moviecatalog.ui.movie.MovieViewModelTest
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
import java.util.concurrent.Executors

@RunWith(MockitoJUnitRunner::class)
class TvShowViewModelTest {
    private lateinit var viewModel: TvShowViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Mock
    private lateinit var observer: Observer<Resource<PagedList<TvShowEntity>>>

    @Before
    fun setUp() {
        viewModel = TvShowViewModel(movieRepository)
    }

    @Test
    fun `getTvShow should be success`() {
        val movies = PagedTestDataSources.snapshot(DataDummy.generateDummyTvShow())
        val expected = MutableLiveData<Resource<PagedList<TvShowEntity>>>()
        expected.value = Resource.success(movies)

        Mockito.`when`(movieRepository.getAllTvShows()).thenReturn(expected)

        viewModel.getTvShow()
        verify(movieRepository).getAllTvShows()

        viewModel.getTvShow().observeForever(observer)
        Mockito.verify(observer).onChanged(expected.value)

        val expectedValue = expected.value
        val actualValue = viewModel.getTvShow().value
        assertEquals(expectedValue, actualValue)
        assertEquals(expectedValue?.data, actualValue?.data)
        assertEquals(expectedValue?.data?.size, actualValue?.data?.size)
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