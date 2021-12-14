package com.dicoding.submission.myapplication.view.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import com.dicoding.submission.myapplication.R
import com.dicoding.submission.myapplication.databinding.ActivityMainBinding
import com.dicoding.submission.myapplication.databinding.FragmentHomeBinding
import com.dicoding.submission.myapplication.view.movies.MoviesFragment
import com.dicoding.submission.myapplication.view.tvshow.TvShowsFragment

class HomeFragment : Fragment(), View.OnClickListener {
    private var bind : FragmentHomeBinding? = null
    private val binding get() = bind!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bind = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvMovies.setOnClickListener(this)
        binding.tvTvShows.setOnClickListener(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val moviesFragment = MoviesFragment()
        val supportFM = childFragmentManager.beginTransaction()
        supportFM.add(R.id.container,moviesFragment)
        supportFM.commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        bind = null
    }

    override fun onClick(v: View?) {
        val supportFM = childFragmentManager.beginTransaction()
        supportFM.setReorderingAllowed(true)
        val moviesFragment = MoviesFragment()
        val tvShowFragment = TvShowsFragment()
        when(v?.id) {
            R.id.tv_movies ->{
                binding.selected.animate().x(0f).duration = 100
                binding.tvMovies.setTextColor(resources.getColor(R.color.white));
                binding.tvTvShows.setTextColor(resources.getColor(R.color.white_25));
                supportFM.replace(R.id.container,moviesFragment)
                supportFM.commit()
            }
            R.id.tv_tv_shows ->{
                val size = binding.tvTvShows.width
                binding.selected.animate().x(size.toFloat()).duration = 100;
                binding.tvMovies.setTextColor(resources.getColor(R.color.white_25));
                binding.tvTvShows.setTextColor(resources.getColor(R.color.white));
                supportFM.replace(R.id.container,tvShowFragment)
                supportFM.commit()
            }
        }
    }
}