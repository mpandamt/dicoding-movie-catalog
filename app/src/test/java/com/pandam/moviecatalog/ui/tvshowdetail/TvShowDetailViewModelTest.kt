package com.pandam.moviecatalog.ui.tvshowdetail

import com.pandam.moviecatalog.utils.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class TvShowDetailViewModelTest {
    private lateinit var viewModel: TvShowDetailViewModel
    private val dummyTvShow = DataDummy.generateDummyTvShow()[0]
    private val tvShowId = dummyTvShow.id

    @Before
    fun setUp() {
        viewModel = TvShowDetailViewModel()
    }

    @Test
    fun getTvShowById() {
        val tvShow = viewModel.getTvShowById(tvShowId)
        assertNotNull(tvShow)
        assertEquals(dummyTvShow.id, tvShow.id)
        assertEquals(dummyTvShow.name, tvShow.name)
        assertEquals(dummyTvShow.overview, tvShow.overview)
        assertEquals(dummyTvShow.poster_path, tvShow.poster_path)
        assertEquals(dummyTvShow.first_air_date, tvShow.first_air_date)
        assertEquals(dummyTvShow.vote_average, tvShow.vote_average, 1.0)
        assertEquals(dummyTvShow.vote_count, tvShow.vote_count)
    }
}