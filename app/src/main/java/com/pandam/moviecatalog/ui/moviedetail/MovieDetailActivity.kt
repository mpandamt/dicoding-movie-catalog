package com.pandam.moviecatalog.ui.moviedetail

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.pandam.moviecatalog.R
import com.pandam.moviecatalog.databinding.ActivityMovieDetailBinding
import com.pandam.moviecatalog.utils.Utils
import com.pandam.moviecatalog.vo.Status
import com.versta.academy.viewmodel.ViewModelFactory

class MovieDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }

    private var menu: Menu? = null
    private lateinit var viewModel: MovieDetailViewModel
    private var movieId = 0
    private var state = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMovieDetailBinding = ActivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(activityMovieDetailBinding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val extras = intent.extras
        if (extras != null) {
            movieId = extras.getInt(EXTRA_MOVIE)
            val factory = ViewModelFactory.getInstance(this)

            viewModel = ViewModelProvider(
                this,
                factory
            )[MovieDetailViewModel::class.java]

            viewModel.getMovieById(movieId).observe(this, { movie ->
                when (movie.status) {
                    Status.SUCCESS -> {
                        activityMovieDetailBinding.apply {
                            textMovieTitle.text = movie.data?.title
                            textAdult.isVisible = movie.data?.adult == true
                            textOverview.text = movie.data?.overview
                            textRelease.text = movie.data?.release_date
                            textVote.text = movie.data?.vote_average.toString()
                            textVoteCount.text = movie.data?.vote_count.toString()
                            Glide.with(imgPoster)
                                .load(movie.data?.poster_path?.let { Utils().getImageUrl(it, 500) })
                                .into(imgPoster)
                        }
                    }
                    Status.ERROR -> {
//                        fragmentTvShowBinding.progressBar.visibility = View.GONE
                        Toast.makeText(this, "Terjadi kesalahan", Toast.LENGTH_SHORT).show()
                    }
                    Status.LOADING -> {
//                        fragmentTvShowBinding.progressBar.visibility = View.VISIBLE
                    }
                }

            })
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_detail, menu)
        this.menu = menu
        if (movieId != 0) {
            viewModel.getMovieById(movieId).observe(this, {
                when (it.status) {
                    Status.SUCCESS -> {
                        if (it.data != null) {
                            state = it.data.is_favorite
                            setFavorite(state)
                        }
                    }
                    Status.ERROR -> {
                    }
                    Status.LOADING -> {

                    }
                }
            })
        }
        return true
    }

    private fun setFavorite(state: Boolean) {
        if (menu == null) return
        val menuItem = menu?.findItem(R.id.action_favorite)
        if (state) {
            menuItem?.icon = ContextCompat.getDrawable(this, R.drawable.ic_favorite_white)
        } else {
            menuItem?.icon = ContextCompat.getDrawable(this, R.drawable.ic_favorite_border_white)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_favorite) {
            viewModel.setFavorite(movieId, !state)
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}