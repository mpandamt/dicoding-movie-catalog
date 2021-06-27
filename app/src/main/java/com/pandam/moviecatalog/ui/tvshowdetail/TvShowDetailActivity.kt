package com.pandam.moviecatalog.ui.tvshowdetail

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.pandam.moviecatalog.R
import com.pandam.moviecatalog.databinding.ActivityTvShowDetailBinding
import com.pandam.moviecatalog.databinding.FragmentMovieBinding
import com.pandam.moviecatalog.utils.Utils
import com.pandam.moviecatalog.vo.Status
import com.pandam.moviecatalog.vo.Status.SUCCESS
import com.versta.academy.viewmodel.ViewModelFactory

class TvShowDetailActivity : AppCompatActivity() {
    private lateinit var fragmentMovieBinding: FragmentMovieBinding

    companion object {
        const val EXTRA_TV = "extra_tv"
    }

    private var menu: Menu? = null
    private lateinit var viewModel: TvShowDetailViewModel
    private var tvShowId = 0
    private var state = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityTvShowDetailBinding = ActivityTvShowDetailBinding.inflate(layoutInflater)
        setContentView(activityTvShowDetailBinding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val extras = intent.extras
        if (extras != null) {
            tvShowId = extras.getInt(EXTRA_TV)
            val factory = ViewModelFactory.getInstance(this)

            viewModel = ViewModelProvider(
                this,
                factory
            )[TvShowDetailViewModel::class.java]

            viewModel.getTvShowById(tvShowId).observe(this, { tvShow ->
                when (tvShow.status) {
                    SUCCESS -> {
                        activityTvShowDetailBinding.apply {
                            textTvTitle.text = tvShow.data?.name
                            textOverview.text = tvShow.data?.overview
                            textFirstAir.text = tvShow.data?.first_air_date
                            textVote.text = tvShow.data?.vote_average.toString()
                            textVoteCount.text = tvShow.data?.vote_count.toString()
                            Glide.with(imgPoster)
                                .load(tvShow.data?.poster_path?.let {
                                    Utils().getImageUrl(
                                        it,
                                        500
                                    )
                                })
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
        if (tvShowId != 0) {
            viewModel.getTvShowById(tvShowId).observe(this, {
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
            viewModel.setFavorite(tvShowId, !state)
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}