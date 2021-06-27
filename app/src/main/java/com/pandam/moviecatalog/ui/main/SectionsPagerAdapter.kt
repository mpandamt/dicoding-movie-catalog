package com.pandam.moviecatalog.ui.main

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.pandam.moviecatalog.R
import com.pandam.moviecatalog.ui.favoritemovie.FavoriteMovieFragment
import com.pandam.moviecatalog.ui.favoritetvshow.FavoriteTvShowFragment
import com.pandam.moviecatalog.ui.movie.MovieFragment
import com.pandam.moviecatalog.ui.tvshow.TvShowFragment

class SectionsPagerAdapter(private val mContext: Context, fm: FragmentManager) :
    FragmentPagerAdapter(
        fm,
        BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
    ) {

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(
            R.string.movie,
            R.string.tv_show,
            R.string.favorite_movie,
            R.string.favorite_tv_show
        )
    }

    override fun getCount(): Int = 4

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> MovieFragment()
            1 -> TvShowFragment()
            2 -> FavoriteMovieFragment()
            3 -> FavoriteTvShowFragment()
            else -> Fragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? =
        mContext.resources.getString(TAB_TITLES[position])

}