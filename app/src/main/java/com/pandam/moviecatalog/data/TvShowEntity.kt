package com.pandam.moviecatalog.data

data class TvShowEntity(
    var id: Int,
    var name: String,
    var poster_path: String?,
    var overview: String,
    var first_air_date: String,
    var vote_average: Double,
    var vote_count: Int
)
