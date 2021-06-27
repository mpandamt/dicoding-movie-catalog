package com.pandam.moviecatalog.data.source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tvshowentities")
data class TvShowEntity(
    @PrimaryKey
    var id: Int,
    var name: String,
    var poster_path: String?,
    var overview: String,
    var first_air_date: String,
    var vote_average: Double,
    var vote_count: Int,
    var is_favorite: Boolean = false
)
