package com.dicoding.submission.myapplication.view.movies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.submission.myapplication.databinding.FragmentMoviesBinding
import com.dicoding.submission.myapplication.model.ListFilmModel
import com.dicoding.submission.myapplication.utils.adapter.FilmAdapter
import com.dicoding.submission.myapplication.utils.adapter.FragmentCallback
import com.dicoding.submission.myapplication.view.home.HomeFragmentDirections
import com.dicoding.submission.myapplication.viewmodel.MoviesViewModel

class MoviesFragment : Fragment(), FragmentCallback {

    private var binding: FragmentMoviesBinding? = null
    private val bind get() = binding!!
    private lateinit var viewModel: MoviesViewModel

    private lateinit var adapterRv: FilmAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Inflate the layout for this fragment
        binding= FragmentMoviesBinding.inflate(LayoutInflater.from(requireActivity()))
        adapterRv = FilmAdapter(requireActivity(),"mov",this)
        viewModel = ViewModelProvider.NewInstanceFactory().create(MoviesViewModel::class.java)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapterRv.setList(viewModel.getListMovies())
        with(bind.rvMovies){
            layoutManager = LinearLayoutManager(requireActivity(), RecyclerView.VERTICAL, false)
            this.adapter = adapterRv
        }
    }

    override fun onClick(data: ListFilmModel) {
        val detailFragment = HomeFragmentDirections.actionHomeFragmentToDetailFragment(data)
        requireParentFragment().findNavController().navigate(detailFragment)
    }

}