package com.pandam.moviecatalog.ui.tvshowdetail

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.pandam.moviecatalog.databinding.ActivityTvShowDetailBinding
import com.pandam.moviecatalog.databinding.FragmentMovieBinding
import com.pandam.moviecatalog.ui.moviedetail.MovieDetailActivity
import com.pandam.moviecatalog.utils.Utils

class TvShowDetailActivity : AppCompatActivity() {
    private lateinit var fragmentMovieBinding: FragmentMovieBinding

    companion object {
        const val EXTRA_TV = "extra_tv"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityTvShowDetailBinding = ActivityTvShowDetailBinding.inflate(layoutInflater)
        setContentView(activityTvShowDetailBinding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val extras = intent.extras
        if (extras != null) {
            val tvShowId = extras.getInt(EXTRA_TV)
            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[TvShowDetailViewModel::class.java]

            activityTvShowDetailBinding.apply {
                val movie = viewModel.getTvShowById(tvShowId)
                textTvTitle.text = movie.name
                textOverview.text = movie.overview
                textFirstAir.text = movie.first_air_date
                textVote.text = movie.vote_average.toString()
                textVoteCount.text = movie.vote_count.toString()
                Glide.with(imgPoster)
                    .load(movie.poster_path?.let { Utils().getImageUrl(it, 500) })
                    .into(imgPoster)
            }
        }
    }
}