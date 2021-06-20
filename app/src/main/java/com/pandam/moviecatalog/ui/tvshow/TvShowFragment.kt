package com.pandam.moviecatalog.ui.tvshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.pandam.moviecatalog.databinding.FragmentTvShowBinding
import com.pandam.moviecatalog.ui.movie.MovieAdapter
import com.versta.academy.viewmodel.ViewModelFactory

class TvShowFragment : Fragment() {
    private lateinit var fragmentTvShowBinding: FragmentTvShowBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentTvShowBinding = FragmentTvShowBinding.inflate(layoutInflater, container, false)
        return fragmentTvShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val factory = ViewModelFactory.getInstance(requireContext())

            val viewModel = ViewModelProvider(
                this,
                factory
            )[TvShowViewModel::class.java]

            val tvShowAdapter = TvShowAdapter()
            fragmentTvShowBinding.progressBar.visibility = View.VISIBLE
            viewModel.getTvShow().observe(viewLifecycleOwner,{tvShow ->
                fragmentTvShowBinding.progressBar.visibility = View.GONE
                tvShowAdapter.setMovies(tvShow)
                tvShowAdapter.notifyDataSetChanged()
            })
            with(fragmentTvShowBinding.rvTvShow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvShowAdapter
            }
        }
    }
}