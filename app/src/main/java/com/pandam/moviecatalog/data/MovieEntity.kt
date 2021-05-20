package com.pandam.moviecatalog.data

data class MovieEntity(
        var id: Int,
        var title: String,
        var adult: Boolean,
        var overview: String,
        var poster_path: String?,
        var release_date: String,
        var vote_average: Double,
        var vote_count: Int
)
