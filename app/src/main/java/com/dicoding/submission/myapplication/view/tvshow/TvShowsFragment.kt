package com.dicoding.submission.myapplication.view.tvshow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.submission.myapplication.databinding.FragmentTvShowsBinding
import com.dicoding.submission.myapplication.model.ListFilmModel
import com.dicoding.submission.myapplication.utils.adapter.FilmAdapter
import com.dicoding.submission.myapplication.utils.adapter.FragmentCallback
import com.dicoding.submission.myapplication.view.home.HomeFragmentDirections
import com.dicoding.submission.myapplication.viewmodel.TvShowsViewModel

class TvShowsFragment : Fragment(), FragmentCallback {

    private var binding: FragmentTvShowsBinding? = null
    private val bind get() = binding!!
    private lateinit var viewModel: TvShowsViewModel

    private lateinit var adapterRv: FilmAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Inflate the layout for this fragment
        binding= FragmentTvShowsBinding.inflate(LayoutInflater.from(requireActivity()))
        adapterRv = FilmAdapter(requireActivity(),"tvs",this)
        viewModel = ViewModelProvider.NewInstanceFactory().create(TvShowsViewModel::class.java)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapterRv.setList(viewModel.getListTvShows())
        with(bind.rvTvShows){
            layoutManager = LinearLayoutManager(requireActivity(), RecyclerView.VERTICAL, false)
            this.adapter = adapterRv
        }
    }

    override fun onClick(data: ListFilmModel) {
        val detailFragment = HomeFragmentDirections.actionHomeFragmentToDetailFragment(data)
        requireParentFragment().findNavController().navigate(detailFragment)
    }

}