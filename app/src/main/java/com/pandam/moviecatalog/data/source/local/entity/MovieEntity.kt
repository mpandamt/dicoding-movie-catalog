package com.pandam.moviecatalog.data.source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movieentities")
data class MovieEntity(
    @PrimaryKey
    var id: Int,
    var title: String,
    var adult: Boolean,
    var overview: String,
    var poster_path: String?,
    var release_date: String,
    var vote_average: Double,
    var vote_count: Int,
    var is_favorite: Boolean = false
)
