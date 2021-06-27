package com.pandam.moviecatalog.ui.favoritemovie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.pandam.moviecatalog.databinding.FragmentMovieBinding
import com.pandam.moviecatalog.vo.Status
import com.versta.academy.viewmodel.ViewModelFactory

class FavoriteMovieFragment : Fragment() {
    private lateinit var fragmentMovieBinding: FragmentMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentMovieBinding = FragmentMovieBinding.inflate(layoutInflater, container, false)
        return fragmentMovieBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val factory = ViewModelFactory.getInstance(requireContext())
            val viewModel = ViewModelProvider(
                this,
                factory
            )[FavoriteMovieViewModel::class.java]
            val movieAdapter = FavoriteMovieAdapter()
            fragmentMovieBinding.progressBar.visibility = View.VISIBLE
            viewModel.getMovies().observe(viewLifecycleOwner,{movies ->
                fragmentMovieBinding.progressBar.visibility = View.GONE
                movieAdapter.submitList(movies)
                movieAdapter.notifyDataSetChanged()
            })
            with(fragmentMovieBinding.rvMovie) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }
    }
}