package com.pandam.moviecatalog.ui.tvshowdetail

import androidx.lifecycle.ViewModel
import com.pandam.moviecatalog.data.TvShowEntity
import com.pandam.moviecatalog.utils.DataDummy

class TvShowDetailViewModel : ViewModel() {

    fun getTvShowById(tvShowId: Int): TvShowEntity {
        lateinit var tvShow: TvShowEntity
        val tvShowEntities = DataDummy.generateDummyTvShow()
        for (tvShowEntity in tvShowEntities) {
            if (tvShowEntity.id == tvShowId) {
                tvShow = tvShowEntity
            }
        }
        return tvShow
    }
}