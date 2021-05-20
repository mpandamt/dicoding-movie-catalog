package com.pandam.moviecatalog.ui.tvshow

import androidx.lifecycle.ViewModel
import com.pandam.moviecatalog.data.TvShowEntity
import com.pandam.moviecatalog.utils.DataDummy

class TvShowViewModel : ViewModel() {
    fun getTvShow(): List<TvShowEntity> = DataDummy.generateDummyTvShow()
}