package com.pandam.moviecatalog.ui.moviedetail

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.pandam.moviecatalog.databinding.ActivityMovieDetailBinding
import com.pandam.moviecatalog.utils.Utils
import com.versta.academy.viewmodel.ViewModelFactory

class MovieDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMovieDetailBinding = ActivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(activityMovieDetailBinding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getInt(EXTRA_MOVIE)
            val factory = ViewModelFactory.getInstance(this)

            val viewModel = ViewModelProvider(
                this,
                factory
            )[MovieDetailViewModel::class.java]

            viewModel.getMovieById(movieId).observe(this,{movie ->
                activityMovieDetailBinding.apply {
                    textMovieTitle.text = movie.title
                    textAdult.isVisible = movie.adult
                    textOverview.text = movie.overview
                    textRelease.text = movie.release_date
                    textVote.text = movie.vote_average.toString()
                    textVoteCount.text = movie.vote_count.toString()
                    Glide.with(imgPoster)
                        .load(movie.poster_path?.let { Utils().getImageUrl(it, 500) })
                        .into(imgPoster)
                }
            })
        }
    }
}