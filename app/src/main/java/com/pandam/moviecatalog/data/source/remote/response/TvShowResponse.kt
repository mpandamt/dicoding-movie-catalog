package com.pandam.moviecatalog.data.source.remote

import com.google.gson.annotations.SerializedName

data class TvShowResponse(

	@field:SerializedName("page")
	val page: Int,

	@field:SerializedName("total_pages")
	val totalPages: Int,

	@field:SerializedName("results")
	val results: List<TvShowItem>,

	@field:SerializedName("total_results")
	val totalResults: Int
)

data class TvShowItem(
	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("poster_path")
	val posterPath: String,

	@field:SerializedName("overview")
	val overview: String,

	@field:SerializedName("first_air_date")
	val firstAirDate: String,

	@field:SerializedName("vote_average")
	val voteAverage: Double,

	@field:SerializedName("vote_count")
	val voteCount: Int
)
