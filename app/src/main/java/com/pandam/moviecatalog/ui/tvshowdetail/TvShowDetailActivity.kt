package com.pandam.moviecatalog.ui.tvshowdetail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.pandam.moviecatalog.databinding.ActivityTvShowDetailBinding
import com.pandam.moviecatalog.databinding.FragmentMovieBinding
import com.pandam.moviecatalog.utils.Utils
import com.versta.academy.viewmodel.ViewModelFactory

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
            val factory = ViewModelFactory.getInstance(this)

            val viewModel = ViewModelProvider(
                this,
                factory
            )[TvShowDetailViewModel::class.java]

            viewModel.getTvShowById(tvShowId).observe(this, { tvShow ->
                activityTvShowDetailBinding.apply {
                    textTvTitle.text = tvShow.name
                    textOverview.text = tvShow.overview
                    textFirstAir.text = tvShow.first_air_date
                    textVote.text = tvShow.vote_average.toString()
                    textVoteCount.text = tvShow.vote_count.toString()
                    Glide.with(imgPoster)
                        .load(tvShow.poster_path?.let { Utils().getImageUrl(it, 500) })
                        .into(imgPoster)
                }
            })
        }
    }
}